//pass
MATCH ()-[o:OWES]->()
WHERE o.dollars > 25
RETURN *