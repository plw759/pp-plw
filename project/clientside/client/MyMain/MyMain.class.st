Class {
	#name : #MyMain,
	#superclass : #Object,
	#category : #MyMain
}

{ #category : #accessing }
MyMain class >> show [

	| dir stream node edge myArray n text tMorph columns |
	World submorphs
		select: [ :m |
			m class = GNode or: [ m class = GEdge or: [ m class = TextMorph ] ] ]
		thenDo: [ :m | m delete ].
	n := 0.
	columns := 4.
	dir := FileSystem disk workingDirectory.
	stream := (dir parent parent parent / 'pp-plw' / 'project'
	           / 'clientside' / 'client' / 'responses'
	           / 'current.response') readStream.
	myArray := NeoJSONReader fromString: stream.
	myArray do: [ :map |
		map do: [ :element |
			| keySize |
			keySize := element isDictionary
				           ifTrue: [ element keys size ]
				           ifFalse: [ 0 ].
			keySize = 4
				ifTrue: [
					n := element at: 'Id'.
					node := GNode new.
					node setId: (element at: 'Id').
					node setLabels: (element at: 'Labels').
					node setProps: (element at: 'Props').
					text := 'Id: ' , node getId asString
					        , (String with: Character cr) , 'Labels: '
					        , node getLabels asString , (String with: Character cr)
					        , 'Props: ' , node getProps asString.
					tMorph := TextMorph new centered
						          string: text
						          fontName: 'BitstreamVeraSans'
						          size: 25.
					tMorph extent: 256 @ 256.
					node addMorphFront: tMorph.
					node setPos:
						64 + ((n rem: columns) * 256) @ (64 + ((n quo: columns) * 256)).
					node openInWorld ]
				ifFalse: [
					keySize = 6
						ifTrue: [
							edge := GEdge new.
							edge
								setStart: (element at: 'StartId')
								End: (element at: 'EndId').
							edge setType: (element at: 'Type').
							edge setProps: (element at: 'Props').
							text := 'Type: ' , edge getType asString
							        , (String with: Character cr) , 'Start: '
							        , edge getStart asString , (String with: Character cr)
							        , 'End: ' , edge getEnd asString
							        , (String with: Character cr) , 'Props: '
							        , edge getProps asString.
							edge makeForwardArrow.
							edge setVertices: {
									(128 + ((edge getStart rem: columns) * 256)
									 @ (128 + ((edge getStart quo: columns) * 256))).
									(128 + ((edge getEnd rem: columns) * 256)
									 @ (128 + ((edge getEnd quo: columns) * 256))) }.
							tMorph := TextMorph new centered
								          string: text
								          fontName: 'BitstreamVeraSans'
								          size: 25.
							tMorph extent: 128 @ 128.
							tMorph center: edge center.
							edge addMorphFront: tMorph.
							edge openInWorld ]
						ifFalse: [
							Transcript
								show:
									'Not a full Node or Edge, cannot be displayed in graph form.';
								cr ] ] ] ].
	World submorphs
		select: [ :m | m class = GEdge ]
		thenDo: [ :m | m comeToFront ]
]
