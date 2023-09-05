grammar Simple;

parse
  : stmt EOF
  ;

stmt
  : assignment ';'
  | print ';'
  ;

assignment
  : ID '=' NUM
  ;

print
  : 'print' id_string
  ;

id_string
  : ID
  | STRING
  ;

NUM
  : [0-9]+
  ;

ID
  : [a-zA-Z_] [a-zA-Z_0-9]*
  ;

STRING
  : '"'[a-z]*'"'
  ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
  : .
  ;
