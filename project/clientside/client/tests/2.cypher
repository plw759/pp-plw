//pass
CALL db.labels() YIELD label
RETURN count(label) AS numLabels
