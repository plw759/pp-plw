//parse error
MATCH (tom:Person {name:'Tom Hanks'})-[rel:DIRECTED]-(movie:Movie {foo})
RETURN tom.name AS name, tom.born AS `Year Born`, movie.title AS title, movie.released AS `Year Released`