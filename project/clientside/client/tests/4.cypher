//pass
CREATE
 (a:Person:Child {name: 'Alice', age: 20}),
 (b:Person {name: 'Bob', age: 27}),
 (c:Person:Parent:Child {name: 'Charlie', age: 65}),
 (d:Person {name: 'Dora', age: 30}),
 (e:Person:Parent{name: 'Ed Sr.', age: 90}),
 (f:Person {name: 'Fred', age: 15}),
 (g:Person:Child {name: 'Garfield', age: 2})
 CREATE (a)-[:FRIEND_OF]->(b)
 CREATE (g)-[:FRIEND_OF]->(f)
 CREATE (a)-[:CHILD_OF]->(g)
 CREATE (c)-[:CHILD_OF]->(e)
 CREATE (b)-[:OWES {dollars: 20}]->(c)
 CREATE (a)-[:OWES {dollars: 25}]->(b)
 CREATE (e)-[:OWES {dollars: 70}]->(d)
 CREATE (g)-[:OWES {dollars: 30}]->(f)