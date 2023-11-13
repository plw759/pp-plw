| myMorph |

"Create a new morph"
myMorph := Morph new.
myMorph color: Color blue.  "Set the color to blue (optional)"

"Set the position and extent of the morph"
myMorph position: 100@100.  "Set the position (x: 100, y: 100)"
myMorph extent: 200@100.    "Set the size (width: 200, height: 100)"

"Open the morph in the world (make it visible)"
myMorph openInWorld.

"

|str dir stream node edge myArray n text tMorph columns|
Metacello new
  repository: 'github://svenvc/NeoJSON/repository';
  baseline: 'NeoJSON';
  load.

LineMorph subclass: GEdge [
    | startId endId type properties |

    GEdge >> getEnd [
        ^ endId.
    ]

    GEdge >> getProps [
        | result |
        result := ''.
        properties associationsDo: [ :pair |
             result := result, pair key asString, ' : ', pair value asString, ' '].
        ^ result  
    ]

    GEdge >> getStart [
        ^ startId.
    ]

    GEdge >> getType [
         ^ type.
    ]

    GEdge >> setProps: someProperties [
        properties := someProperties.
    ]

    GEdge >> setStart: startingId End: endingId [ 
        startId := startingId.
        endId := endingId.
    ]

    GEdge >> setType: aType [
        type := aType.
    ]
]

CircleMorph subclass: GNode [
    | id labels properties |

    GNode >> getId [
        ^ id
    ]

    GNode >> getLabels [
        | result |
        result := ''.
        labels do: [ :element |
             result := result, element asString, ' '].
        ^ result
    ]

    GNode >> getProps [
        | result |
        result := ''.
        properties associationsDo: [ :pair |
             result := result, pair key asString, ' : ', pair value asString, ' '].
        ^ result
    ]

    GNode >> setId: anId [ 
        id := anId.
    ]

    GNode >> setLabels: someLabels [
        labels := someLabels.
    ]

    GNode >> setPos: aPoint [
        self position: aPoint.
        self extent: 128@128.
    ]

    GNode >> setProps: someProperties [
        properties := someProperties.
    ]
]


Transcript clear.
World submorphs select: [ :m | 
    m class = GNode or: [ 
    m class = GEdge or: [m class = TextMorph] ]]
thenDo: [ :m | m delete ].
n := 0.
columns := 3.
dir := FileSystem disk workingDirectory.
stream := (dir / 'responses/current.response') readStream.
myArray := NeoJSONReader fromString: stream.
myArray do: [ :map |
	map do: [ :element |
		((element keys size) == 4 )
	 ifTrue: [ 	
		n := element at: 'Id'.
		node := GNode new.
		node setId: (element at: 'Id').
		node setLabels: (element at: 'Labels').
		node setProps: (element at: 'Props').
		
		text := 'Id: ', node getId asString, (String with: Character cr), 'Labels: ', node getLabels asString, (String with: Character cr), 'Props: ', node getProps asString.  		
		tMorph := TextMorph new centered string: text fontName: 'BitstreamVeraSans' size: 25.
		tMorph extent: 256@256.
		node addMorphFront: tMorph.
		
		node setPos: (64+((n rem: columns)*256))@(64+((n quo: columns)*256)).
		node openInWorld. ] 
	ifFalse: [ 
		edge := GEdge new.
		edge setStart: (element at: 'StartId') End: (element at: 'EndId'). 
		edge setType: (element at: 'Type').
		edge setProps: (element at: 'Props').
		text := 'Type: ', edge getType asString, (String with: Character cr), 'Start: ', edge getStart asString, (String with: Character cr), 'End: ', edge getEnd asString, (String with: Character cr), 'Props: ', edge getProps asString.
	
		edge makeForwardArrow.
		edge setVertices: { (128+((edge getStart rem: columns)*256))@(128+((edge getStart quo: columns)*256)). (128+((edge getEnd rem: columns)*256))@(128+((edge getEnd quo: columns )*256)) }.
		tMorph := TextMorph new centered string: text fontName: 'BitstreamVeraSans' size: 25.
		tMorph extent: 128@128.
		tMorph center: edge center.
		edge addMorphFront: tMorph.

		edge openInWorld.
		 ]
		]
].
World submorphs select: [ :m | 
    m class = GEdge]
thenDo: [ :m | m comeToFront  ].








"