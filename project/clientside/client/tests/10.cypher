//pass
MATCH (a:Person {name: 'Alice'})-[:FRIEND_OF]->(friend)<-[o:OWES]-(a)
RETURN friend.name, o.dollars