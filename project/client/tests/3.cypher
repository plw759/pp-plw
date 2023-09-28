// error
MATCH (tom:Person {name:'Tom Hanks'})-[rel:D&IRECTED]-(movie:Movie)
RETURN tom.name AS name, tom.born AS `Year Born`, movie.title AS title, movie.released AS `Year Released`