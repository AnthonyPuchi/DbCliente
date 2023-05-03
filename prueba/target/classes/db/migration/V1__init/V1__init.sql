CREATE TABLE client(
	id SERIAL,
	fullname VARCHAR(100) NOT NULL,
	lastname VARCHAR(100) NOT NULL,
	age INT NOT NULL,
	occupation VARCHAR(100) NOT NULL,
	PRIMARY KEY (id)
);