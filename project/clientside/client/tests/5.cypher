//pass
MATCH (a:Person {name: 'Alice'})-[:FRIEND_OF]->(b:Person {name: 'Bob'})
MATCH (a:Person {name: 'Alice'})-[:CHILD_OF]->(g:Person {name: 'Garfield'})
MATCH (a:Person {name: 'Alice'})-[:OWES {dollars: 25}]->(b:Person {name: 'Bob'})
MATCH (g:Person {name: 'Garfield'})-[:OWES {dollars: 30}]->(f:Person {name: 'Fred'})
MATCH (g:Person {name: 'Garfield'})-[:FRIEND_OF]->(f:Person {name: 'Fred'})
RETURN a, g