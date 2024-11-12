1. Create Customer table with the columns customer_id, first_name and last_name. Create another table 'Order' with the columns order_id,order_date, total_amount and customer_id that is referred from customer_id of the Customer table.

– Create the Customer table

CREATE TABLE Customer (
    customer_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
);

-- Create the Order table with a foreign key referencing Customer table
CREATE TABLE `Order` (
    order_id INT PRIMARY KEY,
    order_date DATE,
    total_amount DECIMAL(10, 2),
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
);


2. Perform inner join to select first_name, last_name, order_date, total_amount.

--  Perform INNER JOIN to select first_name, last_name, order_date, total_amount
SELECT Customer.first_name, Customer.last_name, `Order`.order_date, `Order`.total_amount
FROM Customer
INNER JOIN `Order` ON Customer.customer_id = `Order`.customer_id;

3. Create table Department with the columns department_id and department_name. Create another table Employee with the columns employee_id, first_name, last_name and department_id that is referred from department_id of the Department table.

--: Create the Department table
CREATE TABLE Department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

-- Create the Employee table with a foreign key referencing Department table
CREATE TABLE Employee (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);

4.Perform left join to select department_name, first_name and last_name.

-- : Perform LEFT JOIN to select department_name, first_name, and last_name
SELECT Department.department_name, Employee.first_name, Employee.last_name
FROM Department
LEFT JOIN Employee ON Department.department_id = Employee.department_id;


