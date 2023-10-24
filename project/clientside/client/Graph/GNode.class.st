Class {
	#name : #GNode,
	#superclass : #CircleMorph,
	#instVars : [
		'id',
		'labels',
		'properties'
	],
	#category : #Graph
}

{ #category : #'as yet unclassified' }
GNode >> getId [
	^id
]

{ #category : #'as yet unclassified' }
GNode >> getLabels [
	| result |
	result := ''.
	labels do: [ :element |
		 result := result, element asString, ' '].
	^result  
]

{ #category : #'as yet unclassified' }
GNode >> getProps [
	| result |
	result := ''.
	properties associationsDo: [ :pair |
		 result := result, pair key asString, ' : ', pair value asString, ' '].
	^result  
]

{ #category : #initialization }
GNode >> setId: anId [ 
	id := anId.

	
]

{ #category : #initialization }
GNode >> setLabels: someLabels [
	labels := someLabels 
]

{ #category : #initialization }
GNode >> setPos: aPoint [
		self position: aPoint.
		self extent: 128@128.

		
]

{ #category : #initialization }
GNode >> setProps: someProperties [
	properties := someProperties.
]
