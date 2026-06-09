CREATE DATABASE CompanyDB;
USE CompanyDB;

-- Create Employees table
CREATE TABLE Employees (
  emp_id     INT PRIMARY KEY AUTO_INCREMENT,
  name       VARCHAR(100) NOT NULL,
  dept       VARCHAR(50),
  salary     DECIMAL(10,2),
  hire_date  DATE
);

CREATE TABLE Orders (
  order_id  INT PRIMARY KEY AUTO_INCREMENT,
  emp_id    INT,
  product   VARCHAR(100),
  amount    DECIMAL(10,2),
);

-- Insert sample rows
INSERT INTO Employees (name, dept, salary, hire_date) VALUES
  ('Alice', 'Engineering', 90000, '2020-01-15'),
  ('Bob',   'Marketing',   60000, '2019-06-01'),
  ('Carol', 'Engineering', 95000, '2021-03-10'),
  ('Dave',  'HR',          55000, '2018-09-20'),
  ('Eve',   'Marketing',   65000, '2022-11-05'),
  ('Frank',   'Engineering', 105000, '2017-04-12'),
  ('Grace',   'Finance',      72000, '2020-08-25'),
  ('Henry',   'Sales',        58000, '2021-01-18'),
  ('Ivy',     'Engineering',  98000, '2019-12-03'),
  ('Jack',    'HR',           60000, '2022-05-14'),
  ('Karen',   'Marketing',    70000, '2018-07-09'),
  ('Leo',     'Finance',      85000, '2023-02-20'),
  ('Mia',     'Sales',        62000, '2020-10-30'),
  ('Nathan',  'Engineering', 110000, '2016-11-17'),
  ('Olivia',  'Marketing',    68000, '2021-06-22'),
  ('Peter',   'HR',           57000, '2019-03-15'),
  ('Quinn',   'Engineering',  92000, '2022-09-11'),
  ('Rachel',  'Finance',      78000, '2018-12-05'),
  ('Sam',     'Sales',        64000, '2023-04-01'),
  ('Tina',    'Engineering', 101000, '2017-08-28');
  
  -- SELECT, DISTINCT, WHERE, AND, OR
SELECT * FROM Employees;

SELECT name, dept, salary FROM Employees;

SELECT DISTINCT dept FROM Employees;

-- Single condition
SELECT * FROM Employees WHERE dept = 'Engineering';

-- AND — both must be true
SELECT * FROM Employees
WHERE dept = 'Engineering' AND salary > 90000;

-- OR — either can be true
SELECT * FROM Employees
WHERE dept = 'HR' OR dept = 'Marketing';

SELECT name, salary FROM Employees
ORDER BY salary DESC;  -- ASC is default


UPDATE Employees
SET salary = 70000
WHERE name = 'Bob';

select * from Employees WHERE name = 'Bob';

DELETE FROM Employees WHERE name = 'Frank';

SELECT * FROM Employees LIMIT 3;

-- % matches any sequence of characters
SELECT * FROM Employees WHERE name LIKE 'A%';   -- starts with A
SELECT * FROM Employees WHERE name LIKE '%e';   -- ends with e
SELECT * FROM Employees WHERE name LIKE '%ar%'; -- contains 'ar'

-- _ matches exactly one character
SELECT * FROM Employees WHERE name LIKE 'B_b'; -- Bob, Bab, Bcb…

SELECT * FROM Employees
WHERE dept IN ('Engineering', 'Marketing');

SELECT * FROM Employees
WHERE salary BETWEEN 60000 AND 95000;

INSERT INTO Orders (emp_id, product, amount) VALUES
  (21, 'Laptop',      1250.00),
  (22, 'Keyboard',      85.00),
  (23, 'Monitor',      320.00),
  (24, 'Mouse',         40.00),
  (25, 'Headphones',    60.00),
  (26, 'Laptop',      1350.00),
  (27, 'Webcam',       110.00),
  (28, 'Monitor',      400.00),
  (29, 'Keyboard',      95.00),
  (30, 'Printer',      220.00),
  (31, 'Desk Chair',   180.00),
  (32, 'Laptop',      1450.00),
  (33, 'Mouse',         35.00),
  (34, 'Headphones',    75.00),
  (35, 'Monitor',      380.00),
  (36, 'Keyboard',      90.00),
  (37, 'Webcam',       120.00),
  (38, 'Laptop',      1500.00),
  (39, 'Printer',      250.00),
  (40, 'Desk Chair',   210.00);

-- Aliases
SELECT name AS employee_name, salary AS monthly_pay
FROM Employees AS e
WHERE e.dept = 'Engineering';


-- JOINS
SELECT e.name, o.product, o.amount
FROM Employees e
INNER JOIN Orders o ON e.emp_id = o.emp_id;

SELECT e.name, o.product
FROM Employees e
LEFT JOIN Orders o ON e.emp_id = o.emp_id;
-- Employees with no orders show NULL for product

SELECT e.name, o.product
FROM Employees e
RIGHT JOIN Orders o ON e.emp_id = o.emp_id;
-- All orders shown; unmatched employee = NULL

INSERT INTO Employees_Backup (name, dept, salary, hire_date)
SELECT name, dept, salary, hire_date
FROM Employees
WHERE dept = 'Engineering';

CREATE TABLE Departments (
  dept_id   INT PRIMARY KEY AUTO_INCREMENT,
  dept_name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE Staff (
  staff_id  INT PRIMARY KEY AUTO_INCREMENT,
  name      VARCHAR(100),
  dept_id   INT,
  FOREIGN KEY (dept_id) REFERENCES Departments(dept_id)  -- Foreign key
);

-- CHECK & DEFAULT constraints
CREATE TABLE Salary_Grades (
  id      INT PRIMARY KEY AUTO_INCREMENT,
  grade   CHAR(1),
  min_sal INT CHECK (min_sal >= 0),   -- value must be positive
  status  VARCHAR(20) DEFAULT 'Active'  -- default value
);


-- CREATE INDEX
CREATE INDEX idx_dept
ON Employees(dept);

CREATE UNIQUE INDEX idx_emp_name
ON Employees(name);

-- DROP
DROP TABLE Employees_Backup;   

-- Add a column
ALTER TABLE Employees ADD email VARCHAR(150);

-- VIEW
CREATE VIEW EnggEmployees AS
SELECT name, salary FROM Employees
WHERE dept = 'Engineering';

-- Query the view like a table
SELECT * FROM EnggEmployees;


-- GROUP BY
SELECT dept, COUNT(*) AS total, AVG(salary) AS avg_sal
FROM Employees
GROUP BY dept;


SELECT dept, AVG(salary) AS avg_sal
FROM Employees
GROUP BY dept
HAVING AVG(salary) > 60000;
-- WHERE filters rows; HAVING filters groups

-- NULL functions
-- IFNULL — replace NULL with a default (MySQL)
SELECT name, IFNULL(dept, 'Unassigned') AS department
FROM Employees;

-- COALESCE — first non-null value (standard SQL)
SELECT name, COALESCE(dept, 'N/A') AS department
FROM Employees;

-- NULLIF — return NULL if two values are equal
SELECT NULLIF(salary, 0) FROM Employees;


-- MySQL Prepared Statement
PREPARE stmt FROM 'SELECT * FROM Employees WHERE dept = ?';
SET @dept = 'Engineering';
EXECUTE stmt USING @dept;
DEALLOCATE PREPARE stmt;



DELIMITER $$
CREATE PROCEDURE GetByDept(IN deptName VARCHAR(50))
BEGIN
  SELECT name, salary
  FROM Employees
  WHERE dept = deptName;
END $$
DELIMITER ;

-- Call the procedure
CALL GetByDept('Marketing');