Class {
	#name : #GEdge,
	#superclass : #LineMorph,
	#instVars : [
		'fromId',
		'toId',
		'label',
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
GEdge >> setStart: anId End: anotherId [ 
	startId := anId.
	endId := anotherId.
	
	
]

{ #category : #initialization }
GEdge >> setType: aType [
	type := aType.
	
	
]
