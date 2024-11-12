1. Create table Client_Master with the columns ClientNo,Name,Address1,Address2,City,Pincode,State,BalDue.

CREATE TABLE Client_Master (
    ClientNo INT PRIMARY KEY,
    Name VARCHAR(50),
    Address1 VARCHAR(100),
    Address2 VARCHAR(100),
    City VARCHAR(50),
    Pincode INT,
    State VARCHAR(50),
    BalDue DECIMAL(10, 2)
);


2. Insert some records to the Client_Master table.

INSERT INTO Client_Master (ClientNo, Name, Address1, Address2, City, Pincode, State, BalDue) VALUES
(1, 'John Doe', '123 Elm St', 'Apt 4B', 'New York', 10001, 'NY', 500.00),
(2, 'Jane Smith', '456 Maple Ave', 'Suite 101', 'Los Angeles', 90001, 'CA', 750.50),
(3, 'Sam Wilson', '789 Oak Dr', NULL, 'Chicago', 60601, 'IL', 300.25);


3. Select all the records from Client_Master table.

SELECT * FROM Client_Master;


4. Select name,city and city from the Client_Master table.

SELECT Name, City, State FROM Client_Master;



