// pass, match any 
MATCH (n)-[r]->(m)
RETURN DISTINCT n,r,m;