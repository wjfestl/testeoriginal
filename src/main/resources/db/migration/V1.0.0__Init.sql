CREATE TABLE TABLE_GRAPH (
id INT NOT NULL,
source VARCHAR(50) NOT NULL,
target VARCHAR(50) NOT NULL,
distance INT,
PRIMARY KEY(source, target, distance));
