Class {
	#name : #GEdge,
	#superclass : #LineMorph,
	#instVars : [
		'startId',
		'endId',
		'type',
		'properties'
	],
	#category : #Graph
}

{ #category : #initialization }
GEdge >> getEnd [
	^endId.
]

{ #category : #initialization }
GEdge >> getProps [
	| result |
	result := ''.
	properties associationsDo: [ :pair |
		 result := result, pair key asString, ' : ', pair value asString, ' '].
	^result  
]

{ #category : #initialization }
GEdge >> getStart [
	^startId.
]

{ #category : #initialization }
GEdge >> getType [
	 ^type.
]

{ #category : #initialization }
GEdge >> setProps: someProperties [
	properties := someProperties.
	
	
]

{ #category : #initialization }
GEdge >> setStart: startingId End: endingId [ 
	startId := startingId.
	endId := endingId.
	
	
]

{ #category : #initialization }
GEdge >> setType: aType [
	type := aType.
	
	
]
