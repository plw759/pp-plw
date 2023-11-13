//pass
MATCH (parent:Parent)<-[:CHILD_OF]-(child:Person)
RETURN parent.name, child.name