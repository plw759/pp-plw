//pass
MATCH (a:Person {name: 'Alice'})-[:FRIEND_OF]->(b:Person {name: 'Bob'})
MATCH (a:Person {name: 'Alice'})-[:CHILD_OF]->(c:Person {name: 'Charlie'})
MATCH (a:Person {name: 'Alice'})-[:OWES {dollars: 20}]->(c:Person {name: 'Charlie'})
MATCH (a:Person {name: 'Alice'})-[:OWES {dollars: 25}]->(b:Person {name: 'Bob'})
MATCH (b:Person {name: 'Bob'})-[:OWES {dollars: 35}]->(d:Person {name: 'Dora'})
MATCH (d:Person {name: 'Dora'})-[:OWES {dollars: 15}]->(b:Person {name: 'Bob'})
MATCH (d:Person {name: 'Dora'})-[:OWES {dollars: 30}]->(b:Person {name: 'Bob'})
RETURN a, b, c, d