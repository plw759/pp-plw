//pass
MATCH (p:Person)-[o:OWES]->()
RETURN p.name, o.dollars