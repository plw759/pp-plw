//pass
CREATE
 (a:Person:Child {name: 'Alice', age: 20}),
 (b:Person {name: 'Bob', age: 27}),
 (c:Person:Parent {name: 'Charlie', age: 65}),
 (d:Person {name: 'Dora', age: 30})
 CREATE (a)-[:FRIEND_OF]->(b)
 CREATE (a)-[:CHILD_OF]->(c)
 CREATE (a)-[:OWES {dollars: 20}]->(c)
 CREATE (a)-[:OWES {dollars: 25}]->(b)
 CREATE (b)-[:OWES {dollars: 35}]->(d)
 CREATE (d)-[:OWES {dollars: 15}]->(b)
 CREATE (d)-[:OWES {dollars: 30}]->(b)