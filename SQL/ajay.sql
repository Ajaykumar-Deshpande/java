create database Sachin;
use Sachin;
CREATE TABLE departments (dept_id INT PRIMARY KEY AUTO_INCREMENT,dept_name VARCHAR(50) NOT NULL UNIQUE,location VARCHAR(100) NOT NULL,budget DECIMAL(10, 2) NOT NULL CHECK (budget >= 0),established_date DATE NOT NULL);
CREATE TABLE employees (emp_id INT PRIMARY KEY AUTO_INCREMENT,emp_name VARCHAR(100) NOT NULL,dept_id INT NOT NULL,hire_date DATE NOT NULL,salary DECIMAL(10, 2) NOT NULL CHECK (salary >= 0),FOREIGN KEY (dept_id) REFERENCES departments(dept_id));
INSERT INTO departments (dept_name, location, budget, established_date) VALUES
('Human Resources', 'New York', 50000.00, '2010-03-15'),
('IT', 'San Francisco', 120000.00, '2015-06-01'),
('Finance', 'Chicago', 80000.00, '2012-09-10'),
('Marketing', 'Los Angeles', 75000.00, '2018-01-21'),
('Sales', 'Seattle', 60000.00, '2017-04-18'),
('Research', 'Boston', 90000.00, '2013-11-22'),
('Legal', 'Houston', 45000.00, '2016-05-30'),
('Customer Service', 'San Diego', 55000.00, '2020-07-07'),
('Engineering', 'Austin', 130000.00, '2014-10-05'),
('Logistics', 'Denver', 70000.00, '2019-02-12');

INSERT INTO employees (emp_name, dept_id, hire_date, salary) VALUES
('Alice Johnson', 1, '2020-01-15', 60000.00),
('Bob Smith', 2, '2018-03-22', 85000.00),
('Carol Davis', 3, '2019-07-19', 70000.00),
('David Wilson', 4, '2021-08-11', 72000.00),
('Eva Martinez', 5, '2022-05-13', 65000.00),
('Frank Harris', 6, '2017-12-01', 80000.00),
('Grace Lee', 7, '2016-09-08', 50000.00),
('Henry Clark', 8, '2019-11-25', 58000.00),
('Ivy Lewis', 9, '2015-04-20', 90000.00),
('Jack Walker', 10, '2021-10-30', 65000.00);

SELECT * FROM employees WHERE salary BETWEEN 60000 AND 80000;

SELECT * FROM employees WHERE emp_name LIKE 'A%';

SELECT * FROM departments WHERE location LIKE 'San%';

SELECT * FROM employees ORDER BY salary DESC;

SELECT * FROM departments ORDER BY established_date ASC;

SELECT emp_id, UPPER(emp_name) AS emp_name, dept_id, hire_date, salary FROM employees;

SELECT dept_id, LOWER(dept_name) AS dept_name, location, budget, established_date FROM departments;

SELECT dept_id, CONCAT(dept_name, ' - ', location) AS dept_info, budget, established_dateFROM departments;

SELECT * FROM employees WHERE LENGTH(emp_name) > 10;

CREATE INDEX idx_salary ON employees(salary);


SELECT * FROM employees WHERE salary > 70000;