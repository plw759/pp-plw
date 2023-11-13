open Yojson.Basic
open Yojson.Basic.Util
type table = (string * Yojson.Basic.t) list list

(* Function to flatten a JSON record *)
let rec flatten_record (key_prefix : string) (json : Yojson.Basic.t) : (string * Yojson.Basic.t) list =
  match json with
  | `Assoc fields ->
    List.concat_map (fun (field_key, field_value) ->
      flatten_record (key_prefix ^ "_" ^ field_key) field_value
    ) fields
  | _ -> [ (key_prefix, json) ]

(* Function to flatten each record in a JSON array *)
let flatten_json_array (json_array : Yojson.Basic.t) : (string * Yojson.Basic.t) list list =
  match json_array with
  | `List records ->
    List.map (fun record ->
      match record with
      | `Assoc record_fields ->
        List.concat_map (fun (field_key, field_value) ->
          flatten_record field_key field_value
        ) record_fields
      | _ -> []
    ) records
  | _ -> []

(* Function to create a table from flattened records with average values *)
let create_table_with_average flattened_array : table =
  let all_keys =
    List.flatten (List.map (fun flattened_record -> List.map fst flattened_record) flattened_array)
  in
  let unique_keys = List.sort_uniq String.compare all_keys in

  (* Function to get the value for a specific key in a flattened record *)
  let get_value_for_key key flattened_record =
    match List.assoc_opt key flattened_record with
    | Some value -> value
    | None -> `Null  (* Use `Null for missing values *)
  in

  (* Function to calculate the average for a specific int column down to 2 decimals *)
  let calculate_average key =
    match List.filter_map (fun row -> match List.assoc_opt key row with Some (`Int n) -> Some n | _ -> None) flattened_array with
    | [] -> `Null
    | values -> `Float (float_of_string (Printf.sprintf "%.2f" (float_of_int (List.fold_left (+) 0 values) /. float_of_int (List.length values))))
  in

  (* Create a row for average values *)
  let average_row = List.map (fun key -> (key, calculate_average key)) unique_keys in

  (* Create the table by mapping the create_row function over the flattened array *)
  let table = List.map (fun flattened_record ->
    List.map (fun key -> (key, get_value_for_key key flattened_record)) unique_keys
  ) flattened_array in

  table @ [average_row] (* Append the average row to the table *)

(* Function to print a table *)
let print_table table =
  (* Get all unique keys from the table *)
  let all_keys = List.flatten (List.map (fun row -> List.map fst row) table) in
  let unique_keys = List.sort_uniq String.compare all_keys in

  (* Determine the maximum width for each column *)
  let max_widths =
    List.map (fun key ->
      let key_width = String.length key in
      let value_width =
        List.fold_left (fun acc row ->
          let value = match List.assoc_opt key row with
            | Some v -> Yojson.Basic.pretty_to_string v
            | None -> "" in
          max acc (String.length value)
        ) 0 table
      in
      max key_width value_width
    ) unique_keys
  in

  (* Function to pad a string to a specified width *)
  let pad_to_width width str =
    Printf.sprintf "%-*s" width str
  in

  (* Function to print a horizontal underscore line *)
  let print_horizontal_line width =
    if width > 0 then let width = width + 5 in 
    Printf.printf "%s\n" (String.make width '_')
  in

  print_horizontal_line (List.fold_left (+) 0 max_widths);

  (* Print header with unique keys *)
  List.iter2 (fun key width -> Printf.printf "%s | " (pad_to_width width key)) unique_keys max_widths;
  Printf.printf "\n";

  print_horizontal_line (List.fold_left (+) 0 max_widths);

  (* Print rows *)
  List.iter (fun row ->
    List.iter2 (fun key width ->
      let value = match List.assoc_opt key row with
        | Some v -> Yojson.Basic.pretty_to_string v
        | None -> "" in
      Printf.printf "%s | " (pad_to_width width value)
    ) unique_keys max_widths;
    Printf.printf "\n"
  ) table;

  print_horizontal_line (List.fold_left (+) 0 max_widths)

(* Main loop *)
let () =
  while true do
    print_string "Enter a command: ";
    flush stdout;
    let command = read_line () in
    if command = "show" then
      try
        let json = Yojson.Basic.from_file "/responses/current.response" in
        let flattened_records = flatten_json_array json in
        let table = create_table_with_average flattened_records in 
        print_table table;
      with
      | Sys_error msg ->
        Printf.printf "Error reading JSON from file: %s\n" msg;
    else
      print_endline "Unknown command."
  done
