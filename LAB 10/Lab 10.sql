-- Create a database named test if it does not exist
CREATE DATABASE IF NOT EXISTS test;

-- Use the test database
USE test;

-- Create a table named Client_Master if it does not exist with columns ClientNo, Name, Address1, Address2, City, Pincode, State, and BalDue
CREATE TABLE IF NOT EXISTS Client_Master (
	ClientNo VARCHAR (6) PRIMARY KEY,
    Name VARCHAR (20) NOT NULL,
    Address1 VARCHAR (30) NOT NULL,
    Address2 VARCHAR (30) NOT NULL,
    City VARCHAR (30) NOT NULL,
    Pincode INT (8) NOT NULL,
    State VARCHAR (30) NOT NULL,
    BalDue INT (20) NOT NULL
);

-- Describe the Client_Master table
DESC Client_Master;

-- Insert data into the Client_Master table
INSERT INTO Client_Master (ClientNo, Name, Address1, Address2, City, Pincode, State, BalDue) VALUES ('1','Vishal','Solan','India','Solan',174023,'Himanchal Pradesh',70000),
																									('2','Vivek','Solan','India','Solan',174023,'Himanchal Pradesh',70000),
                                                                                                    ('3','Shivam','Solan','India','Solan',174023,'Himanchal Pradesh',70000),
                                                                                                    ('4','Pankaj','Solan','India','Solan',174023,'Himanchal Pradesh',70000),
                                                                                                    ('5','Akash','Solan','India','Solan',174023,'Himanchal Pradesh',70000);

--  Find out the names of all clients.
SELECT Name FROM Client_Master;

--  Retrieve the entire contents of the client_master table;
SELECT * FROM Client_Master;

-- Retrieve the list of names, city and the state of all the clients.
SELECT NAME, City, State FROM Client_Master;

-- Destroy the table client_master along with its data
DROP TABLE IF EXISTS Client_Master;