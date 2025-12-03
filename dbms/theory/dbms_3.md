# CBSE Database Management - Part 3  
## DML Commands, Aggregate Functions, and Python-MySQL  
  
**Prepared for CBSE Computer Science Students (Class 11/12)**  
  
---  
  
## What You'll Learn in Part 3  
  
- DML Commands (INSERT, UPDATE, DELETE, SELECT)  
- Operators and WHERE clause  
- Aggregate Functions (COUNT, SUM, AVG, MAX, MIN)  
- GROUP BY and HAVING  
- Joins (Cartesian, Equi, Natural)  
- Python-MySQL Connectivity (Complete 7-Step Process)  
- Real exam pattern questions  
  
**Study Time:** 120-150 minutes    
**Exam Weightage:** 10-15 marks from this section  
  
---  
  
## Quick Revision Checklist for Part 3  
  
- [ ] INSERT syntax mastered  
- [ ] SELECT with WHERE clause practiced  
- [ ] UPDATE and DELETE with conditions clear  
- [ ] All operators memorized  
- [ ] Aggregate functions understood  
- [ ] Join concept clear  
- [ ] Python-MySQL 7 steps memorized  
  
---  
  
## 9.11 SQL Commands for Data Manipulation (DML)  
  
DML commands are used to manipulate data inside tables.  
  
**Four Main Commands:**  
1. INSERT - Add new records  
2. SELECT - Retrieve records  
3. UPDATE - Modify existing records  
4. DELETE - Remove records  
  
**Memory Trick:** ISUD - I Study Daily :)  
  
---  
  
### 9.11.1 Inserting Records in a Table  
  
**Syntax 1: Insert all column values**  
```sql  
INSERT INTO table_name VALUES (value1, value2, value3, ...);  
```  
  
**Syntax 2: Insert specific column values**  
```sql  
INSERT INTO table_name (column1, column2, ...) VALUES (value1, value2, ...);  
```  
  
**Example Setup:**  
```sql  
-- First create the table  
CREATE TABLE STUDENT (  
    RollNo INT PRIMARY KEY,  
    Name VARCHAR(50) NOT NULL,  
    Class VARCHAR(5),  
    Marks INT  
);  
```  
  
**Example 1: Insert all columns**  
```sql  
INSERT INTO STUDENT VALUES (101, 'Suresh', '12A', 85);  
INSERT INTO STUDENT VALUES (102, 'Ramesh', '12B', 90);  
INSERT INTO STUDENT VALUES (103, 'Mahesh', '12A', 78);  
```  
  
**Result:**  
```  
+--------+---------+-------+-------+  
| RollNo | Name    | Class | Marks |  
+--------+---------+-------+-------+  
| 101    | Suresh  | 12A   | 85    |  
| 102    | Ramesh  | 12B   | 90    |  
| 103    | Mahesh  | 12A   | 78    |  
+--------+---------+-------+-------+  
```  
  
**Example 2: Insert specific columns**  
```sql  
-- Marks will be NULL  
INSERT INTO STUDENT (RollNo, Name, Class) VALUES (104, 'Dinesh', '12B');  
```  
  
**Result:**  
```  
+--------+---------+-------+-------+  
| RollNo | Name    | Class | Marks |  
+--------+---------+-------+-------+  
| 104    | Dinesh  | 12B   | NULL  |  
+--------+---------+-------+-------+  
```  
  
**Example 3: Multiple rows at once**  
```sql  
INSERT INTO STUDENT VALUES   
    (105, 'Mukesh', '12A', 88),  
    (106, 'Kamlesh', '12B', 92),  
    (107, 'Nitesh', '12A', 76);  
```  
  
**Real Scenario - LIC Policy Records:**  
```sql  
CREATE TABLE POLICY (  
    PolicyNo INT PRIMARY KEY,  
    HolderName VARCHAR(50),  
    Premium DECIMAL(10,2),  
    City VARCHAR(30)  
);  
  
INSERT INTO POLICY VALUES   
    (1001, 'Hitesh Kumar', 5000.00, 'Chennai'),  
    (1002, 'Ratnesh Singh', 7500.00, 'Mumbai'),  
    (1003, 'Himesh Patel', 6000.00, 'Pune');  
```  
  
**Common Mistakes:**  
  
```sql  
-- WRONG: Wrong number of values  
INSERT INTO STUDENT VALUES (108, 'Jitesh');  
-- Error: 4 columns expected, only 2 values provided  
  
-- WRONG: Duplicate primary key  
INSERT INTO STUDENT VALUES (101, 'Gukesh', '12A', 95);  
-- Error: RollNo 101 already exists  
  
-- CORRECT: Use different RollNo  
INSERT INTO STUDENT VALUES (108, 'Gukesh', '12A', 95);  
```  
  
**CBSE Pattern Question (2 Marks):**  
Q. Write SQL command to insert a record in EMPLOYEE table with EmpID=201, Name='Ratnesh', Salary=45000.  
  
**Answer:**  
```sql  
INSERT INTO EMPLOYEE VALUES (201, 'Ratnesh', 45000);  
```  
  
---  
  
### 9.11.2 Retrieving Records (SELECT Statement)  
  
**Most Important Command for CBSE Exams!**  
  
**Basic Syntax:**  
```sql  
SELECT column1, column2, ... FROM table_name;  
```  
  
**Select all columns:**  
```sql  
SELECT * FROM table_name;  
```  
  
**Example Data:**  
```sql  
STUDENT Table:  
+--------+---------+-------+-------+  
| RollNo | Name    | Class | Marks |  
+--------+---------+-------+-------+  
| 101    | Suresh  | 12A   | 85    |  
| 102    | Ramesh  | 12B   | 90    |  
| 103    | Mahesh  | 12A   | 78    |  
| 104    | Dinesh  | 12B   | 82    |  
| 105    | Mukesh  | 12A   | 88    |  
+--------+---------+-------+-------+  
```  
  
**Example 1: Select all students**  
```sql  
SELECT * FROM STUDENT;  
```  
Shows all 5 students with all columns.  
  
**Example 2: Select specific columns**  
```sql  
SELECT Name, Marks FROM STUDENT;  
```  
  
**Output:**  
```  
+---------+-------+  
| Name    | Marks |  
+---------+-------+  
| Suresh  | 85    |  
| Ramesh  | 90    |  
| Mahesh  | 78    |  
| Dinesh  | 82    |  
| Mukesh  | 88    |  
+---------+-------+  
```  
  
**Example 3: SELECT with WHERE clause**  
```sql  
SELECT * FROM STUDENT WHERE Class = '12A';  
```  
  
**Output:**  
```  
+--------+---------+-------+-------+  
| RollNo | Name    | Class | Marks |  
+--------+---------+-------+-------+  
| 101    | Suresh  | 12A   | 85    |  
| 103    | Mahesh  | 12A   | 78    |  
| 105    | Mukesh  | 12A   | 88    |  
+--------+---------+-------+-------+  
```  
  
**Example 4: DISTINCT keyword (remove duplicates)**  
```sql  
SELECT DISTINCT Class FROM STUDENT;  
```  
  
**Output:**  
```  
+-------+  
| Class |  
+-------+  
| 12A   |  
| 12B   |  
+-------+  
```  
  
**Example 5: Column Alias (rename column in output)**  
```sql  
SELECT Name, Marks AS Score FROM STUDENT;  
```  
  
**Output:**  
```  
+---------+-------+  
| Name    | Score |  
+---------+-------+  
| Suresh  | 85    |  
| Ramesh  | 90    |  
+---------+-------+  
```  
  
**Example 6: Calculations in SELECT**  
```sql  
-- Show marks with 5% grace  
SELECT Name, Marks, Marks + 5 AS FinalMarks FROM STUDENT;  
```  
  
**Output:**  
```  
+---------+-------+------------+  
| Name    | Marks | FinalMarks |  
+---------+-------+------------+  
| Suresh  | 85    | 90         |  
| Ramesh  | 90    | 95         |  
+---------+-------+------------+  
```  
  
---  
  
### 9.11.3 Operators  
  
Operators are used in WHERE clause to filter records.  
  
**1. Arithmetic Operators**  
- `+` (Addition)  
- `-` (Subtraction)  
- `*` (Multiplication)  
- `/` (Division)  
- `%` (Modulus - remainder)  
  
**2. Comparison Operators**  
- `=` (Equal to)  
- `!=` or `<>` (Not equal to)  
- `>` (Greater than)  
- `<` (Less than)  
- `>=` (Greater than or equal to)  
- `<=` (Less than or equal to)  
  
**3. Logical Operators**  
- `AND` - Both conditions must be true  
- `OR` - At least one condition must be true  
- `NOT` - Negates the condition  
  
**4. Special Operators**  
- `BETWEEN` - Range check  
- `IN` - Multiple values  
- `LIKE` - Pattern matching  
- `IS NULL` - Check for NULL values  
  
---  
  
### 9.11.4 Using Operators  
  
**Example Table: EMPLOYEE**  
```sql  
CREATE TABLE EMPLOYEE (  
    EmpID INT PRIMARY KEY,  
    Name VARCHAR(50),  
    Department VARCHAR(30),  
    Salary DECIMAL(10,2),  
    City VARCHAR(30)  
);  
  
INSERT INTO EMPLOYEE VALUES  
    (101, 'Suresh', 'IT', 45000.00, 'Pune'),  
    (102, 'Ramesh', 'HR', 38000.00, 'Mumbai'),  
    (103, 'Dinesh', 'IT', 52000.00, 'Chennai'),  
    (104, 'Mukesh', 'Sales', 35000.00, 'Pune'),  
    (105, 'Kamlesh', 'IT', 48000.00, 'Delhi');  
```  
  
**1. Comparison Operators**  
  
```sql  
-- Employees with salary greater than 40000  
SELECT * FROM EMPLOYEE WHERE Salary > 40000;  
```  
  
**Output:**  
```  
+-------+---------+------------+-----------+---------+  
| EmpID | Name    | Department | Salary    | City    |  
+-------+---------+------------+-----------+---------+  
| 101   | Suresh  | IT         | 45000.00  | Pune    |  
| 103   | Dinesh  | IT         | 52000.00  | Chennai |  
| 105   | Kamlesh | IT         | 48000.00  | Delhi   |  
+-------+---------+------------+-----------+---------+  
```  
  
```sql  
-- Employees from IT department  
SELECT * FROM EMPLOYEE WHERE Department = 'IT';  
  
-- Employees NOT from IT  
SELECT * FROM EMPLOYEE WHERE Department != 'IT';  
```  
  
**2. Logical Operators (AND)**  
  
```sql  
-- IT department employees in Pune  
SELECT * FROM EMPLOYEE WHERE Department = 'IT' AND City = 'Pune';  
```  
  
**Output:**  
```  
+-------+--------+------------+-----------+------+  
| EmpID | Name   | Department | Salary    | City |  
+-------+--------+------------+-----------+------+  
| 101   | Suresh | IT         | 45000.00  | Pune |  
+-------+--------+------------+-----------+------+  
```  
  
```sql  
-- Employees with salary > 40000 AND from IT  
SELECT Name, Salary FROM EMPLOYEE   
WHERE Salary > 40000 AND Department = 'IT';  
```  
  
**3. Logical Operators (OR)**  
  
```sql  
-- Employees from Pune OR Mumbai  
SELECT * FROM EMPLOYEE WHERE City = 'Pune' OR City = 'Mumbai';  
```  
  
**Output:**  
```  
+-------+--------+------------+-----------+--------+  
| EmpID | Name   | Department | Salary    | City   |  
+-------+--------+------------+-----------+--------+  
| 101   | Suresh | IT         | 45000.00  | Pune   |  
| 102   | Ramesh | HR         | 38000.00  | Mumbai |  
| 104   | Mukesh | Sales      | 35000.00  | Pune   |  
+-------+--------+------------+-----------+--------+  
```  
  
```sql  
-- IT OR HR department  
SELECT * FROM EMPLOYEE WHERE Department = 'IT' OR Department = 'HR';  
```  
  
**4. BETWEEN Operator**  
  
```sql  
-- Salary between 40000 and 50000  
SELECT * FROM EMPLOYEE WHERE Salary BETWEEN 40000 AND 50000;  
```  
  
**Output:**  
```  
+-------+---------+------------+-----------+-------+  
| EmpID | Name    | Department | Salary    | City  |  
+-------+---------+------------+-----------+-------+  
| 101   | Suresh  | IT         | 45000.00  | Pune  |  
| 105   | Kamlesh | IT         | 48000.00  | Delhi |  
+-------+---------+------------+-----------+-------+  
```  
  
**5. IN Operator**  
  
```sql  
-- Employees from specific cities  
SELECT * FROM EMPLOYEE WHERE City IN ('Pune', 'Chennai', 'Delhi');  
```  
  
**Output:**  
```  
+-------+---------+------------+-----------+---------+  
| EmpID | Name    | Department | Salary    | City    |  
+-------+---------+------------+-----------+---------+  
| 101   | Suresh  | IT         | 45000.00  | Pune    |  
| 103   | Dinesh  | IT         | 52000.00  | Chennai |  
| 104   | Mukesh  | Sales      | 35000.00  | Pune    |  
| 105   | Kamlesh | IT         | 48000.00  | Delhi   |  
+-------+---------+------------+-----------+---------+  
```  
  
**6. LIKE Operator (Pattern Matching)**  
  
**Wildcards:**  
- `%` = Any number of characters (0 or more)  
- `_` = Exactly one character  
  
```sql  
-- Names starting with 'D'  
SELECT * FROM EMPLOYEE WHERE Name LIKE 'D%';  
```  
  
**Output:**  
```  
+-------+--------+------------+-----------+---------+  
| EmpID | Name   | Department | Salary    | City    |  
+-------+--------+------------+-----------+---------+  
| 103   | Dinesh | IT         | 52000.00  | Chennai |  
+-------+--------+------------+-----------+---------+  
```  
  
**More LIKE Examples:**  
  
```sql  
-- Names ending with 'esh'  
SELECT * FROM EMPLOYEE WHERE Name LIKE '%esh';  
  
-- Names with 'a' as second character  
SELECT * FROM EMPLOYEE WHERE Name LIKE '_a%';  
  
-- Names containing 'esh' anywhere  
SELECT * FROM EMPLOYEE WHERE Name LIKE '%esh%';  
  
-- Names with exactly 6 characters  
SELECT * FROM EMPLOYEE WHERE Name LIKE '______';  
```  
  
**7. IS NULL Operator**  
  
```sql  
-- Find employees with no city assigned  
SELECT * FROM EMPLOYEE WHERE City IS NULL;  
  
-- Find employees with city assigned  
SELECT * FROM EMPLOYEE WHERE City IS NOT NULL;  
```  
  
**8. NOT Operator**  
  
```sql  
-- Employees NOT in IT department  
SELECT * FROM EMPLOYEE WHERE NOT Department = 'IT';  
-- OR  
SELECT * FROM EMPLOYEE WHERE Department != 'IT';  
```  
  
**9. ORDER BY (Sorting)**  
  
```sql  
-- Sort by salary (ascending - low to high)  
SELECT * FROM EMPLOYEE ORDER BY Salary;  
  
-- Sort by salary (descending - high to low)  
SELECT * FROM EMPLOYEE ORDER BY Salary DESC;  
  
-- Sort by department, then by salary  
SELECT * FROM EMPLOYEE ORDER BY Department, Salary DESC;  
```  
  
**10. LIMIT (Restrict number of rows)**  
  
```sql  
-- Show first 3 records  
SELECT * FROM EMPLOYEE LIMIT 3;  
  
-- Top 3 highest paid employees  
SELECT * FROM EMPLOYEE ORDER BY Salary DESC LIMIT 3;  
```  
  
**Combining Multiple Conditions:**  
  
```sql  
-- IT department, salary > 45000, from Pune or Delhi  
SELECT * FROM EMPLOYEE   
WHERE Department = 'IT'   
AND Salary > 45000   
AND (City = 'Pune' OR City = 'Delhi');  
```  
  
**CBSE Pattern Question (3 Marks):**  
Q. Write SQL query to display Name and Salary of employees working in IT department and earning more than 45000.  
  
**Answer:**  
```sql  
SELECT Name, Salary FROM EMPLOYEE   
WHERE Department = 'IT' AND Salary > 45000;  
```  
  
---  
  
### 9.11.5 Updating Records in a Table  
  
**Syntax:**  
```sql  
UPDATE table_name   
SET column1 = value1, column2 = value2, ...  
WHERE condition;  
```  
  
**WARNING:** Always use WHERE clause! Otherwise ALL rows will be updated.  
  
**Example 1: Update single record**  
```sql  
-- Increase Suresh's salary to 50000  
UPDATE EMPLOYEE SET Salary = 50000 WHERE Name = 'Suresh';  
```  
  
**Example 2: Update multiple columns**  
```sql  
-- Transfer Ramesh to IT department with new salary  
UPDATE EMPLOYEE   
SET Department = 'IT', Salary = 42000   
WHERE Name = 'Ramesh';  
```  
  
**Example 3: Update using arithmetic**  
```sql  
-- Give 10% increment to IT department employees  
UPDATE EMPLOYEE SET Salary = Salary * 1.10 WHERE Department = 'IT';  
```  
  
**Example 4: Update multiple records**  
```sql  
-- Change city to 'Bangalore' for all Sales employees  
UPDATE EMPLOYEE SET City = 'Bangalore' WHERE Department = 'Sales';  
```  
  
**Real Scenario - Flipkart Order Status:**  
```sql  
CREATE TABLE ORDERS (  
    OrderID INT PRIMARY KEY,  
    CustomerName VARCHAR(50),  
    Product VARCHAR(50),  
    Status VARCHAR(20)  
);  
  
INSERT INTO ORDERS VALUES  
    (5001, 'Nitesh', 'Laptop', 'Processing'),  
    (5002, 'Hitesh', 'Mobile', 'Processing');  
  
-- Update status when order is shipped  
UPDATE ORDERS SET Status = 'Shipped' WHERE OrderID = 5001;  
  
-- Deliver all processing orders  
UPDATE ORDERS SET Status = 'Delivered' WHERE Status = 'Processing';  
```  
  
**Common Mistakes:**  
  
```sql  
-- WRONG: Updates ALL rows (no WHERE)  
UPDATE EMPLOYEE SET Salary = 50000;  
  
-- CORRECT: Updates only matching row  
UPDATE EMPLOYEE SET Salary = 50000 WHERE EmpID = 101;  
```  
  
**CBSE Pattern Question (2 Marks):**  
Q. Write SQL command to increase marks by 5 for all students of class 12A.  
  
**Answer:**  
```sql  
UPDATE STUDENT SET Marks = Marks + 5 WHERE Class = '12A';  
```  
  
---  
  
### 9.11.6 Deleting Records from a Table  
  
**Syntax:**  
```sql  
DELETE FROM table_name WHERE condition;  
```  
  
**WARNING:** Without WHERE clause, ALL rows will be deleted!  
  
**Example 1: Delete single record**  
```sql  
-- Delete employee with EmpID 105  
DELETE FROM EMPLOYEE WHERE EmpID = 105;  
```  
  
**Example 2: Delete based on condition**  
```sql  
-- Delete employees with salary less than 40000  
DELETE FROM EMPLOYEE WHERE Salary < 40000;  
```  
  
**Example 3: Delete with multiple conditions**  
```sql  
-- Delete Sales employees from Pune  
DELETE FROM EMPLOYEE WHERE Department = 'Sales' AND City = 'Pune';  
```  
  
**Example 4: Delete all records (use carefully!)**  
```sql  
-- Delete all records but keep table structure  
DELETE FROM EMPLOYEE;  
```  
  
**Real Scenario - Library Book Return:**  
```sql  
CREATE TABLE BOOK_ISSUE (  
    IssueID INT PRIMARY KEY,  
    RollNo INT,  
    BookName VARCHAR(50),  
    IssueDate DATE  
);  
  
-- When student returns book, delete the issue record  
DELETE FROM BOOK_ISSUE WHERE IssueID = 1001;  
  
-- Delete all issues older than 30 days  
DELETE FROM BOOK_ISSUE WHERE IssueDate < DATE_SUB(CURDATE(), INTERVAL 30 DAY);  
```  
  
**Important Differences:**  
  
```sql  
-- DELETE: Removes rows, keeps table  
DELETE FROM EMPLOYEE;  
-- Table still exists, structure intact, can insert new data  
  
-- DROP: Removes entire table  
DROP TABLE EMPLOYEE;  
-- Table doesn't exist anymore, need to recreate  
  
-- TRUNCATE: Removes all rows, faster than DELETE  
TRUNCATE TABLE EMPLOYEE;  
-- Table exists, all data removed, auto-increment resets  
```  
  
**CBSE Pattern Question (2 Marks):**  
Q. Write SQL command to delete records of students who scored less than 35 marks.  
  
**Answer:**  
```sql  
DELETE FROM STUDENT WHERE Marks < 35;  
```  
  
---  
  
## 9.12 Aggregate Functions  
  
**Definition:**  
Aggregate functions perform calculations on multiple rows and return a single value.  
  
**5 Important Functions:**  
1. COUNT() - Count rows  
2. SUM() - Calculate total  
3. AVG() - Calculate average  
4. MAX() - Find maximum  
5. MIN() - Find minimum  
  
**Example Data:**  
```sql  
STUDENT Table:  
+--------+---------+-------+-------+  
| RollNo | Name    | Class | Marks |  
+--------+---------+-------+-------+  
| 101    | Suresh  | 12A   | 85    |  
| 102    | Ramesh  | 12B   | 90    |  
| 103    | Mahesh  | 12A   | 78    |  
| 104    | Dinesh  | 12B   | 82    |  
| 105    | Mukesh  | 12A   | 88    |  
+--------+---------+-------+-------+  
```  
  
### 1. COUNT() Function  
  
```sql  
-- Count total students  
SELECT COUNT(*) FROM STUDENT;  
```  
**Output:** 5  
  
```sql  
-- Count students in 12A  
SELECT COUNT(*) FROM STUDENT WHERE Class = '12A';  
```  
**Output:** 3  
  
```sql  
-- Count non-NULL marks  
SELECT COUNT(Marks) FROM STUDENT;  
```  
**Output:** 5  
  
```sql  
-- Count with alias  
SELECT COUNT(*) AS TotalStudents FROM STUDENT;  
```  
**Output:**  
```  
+---------------+  
| TotalStudents |  
+---------------+  
| 5             |  
+---------------+  
```  
  
### 2. SUM() Function  
  
```sql  
-- Total marks of all students  
SELECT SUM(Marks) FROM STUDENT;  
```  
**Output:** 423  
  
```sql  
-- Total marks in class 12A  
SELECT SUM(Marks) FROM STUDENT WHERE Class = '12A';  
```  
**Output:** 251  
  
```sql  
-- With alias  
SELECT SUM(Marks) AS TotalMarks FROM STUDENT;  
```  
  
### 3. AVG() Function  
  
```sql  
-- Average marks of all students  
SELECT AVG(Marks) FROM STUDENT;  
```  
**Output:** 84.6  
  
```sql  
-- Average marks in class 12B  
SELECT AVG(Marks) FROM STUDENT WHERE Class = '12B';  
```  
**Output:** 86  
  
```sql  
-- Rounded average  
SELECT ROUND(AVG(Marks), 2) AS AvgMarks FROM STUDENT;  
```  
  
### 4. MAX() Function  
  
```sql  
-- Highest marks  
SELECT MAX(Marks) FROM STUDENT;  
```  
**Output:** 90  
  
```sql  
-- Highest marks in 12A  
SELECT MAX(Marks) FROM STUDENT WHERE Class = '12A';  
```  
**Output:** 88  
  
### 5. MIN() Function  
  
```sql  
-- Lowest marks  
SELECT MIN(Marks) FROM STUDENT;  
```  
**Output:** 78  
  
```sql  
-- Lowest marks in 12B  
SELECT MIN(Marks) FROM STUDENT WHERE Class = '12B';  
```  
**Output:** 82  
  
**Using Multiple Functions Together:**  
  
```sql  
SELECT   
    COUNT(*) AS TotalStudents,  
    SUM(Marks) AS TotalMarks,  
    AVG(Marks) AS AvgMarks,  
    MAX(Marks) AS HighestMarks,  
    MIN(Marks) AS LowestMarks  
FROM STUDENT;  
```  
  
**Output:**  
```  
+---------------+------------+----------+--------------+-------------+  
| TotalStudents | TotalMarks | AvgMarks | HighestMarks | LowestMarks |  
+---------------+------------+----------+--------------+-------------+  
| 5             | 423        | 84.60    | 90           | 78          |  
+---------------+------------+----------+--------------+-------------+  
```  
  
---  
  
### GROUP BY Clause  
  
**Purpose:** Group rows based on column values and apply aggregate functions to each group.  
  
**Syntax:**  
```sql  
SELECT column, aggregate_function(column)  
FROM table_name  
GROUP BY column;  
```  
  
**Example 1: Count students per class**  
```sql  
SELECT Class, COUNT(*) AS StudentCount   
FROM STUDENT   
GROUP BY Class;  
```  
  
**Output:**  
```  
+-------+--------------+  
| Class | StudentCount |  
+-------+--------------+  
| 12A   | 3            |  
| 12B   | 2            |  
+-------+--------------+  
```  
  
**Example 2: Average marks per class**  
```sql  
SELECT Class, AVG(Marks) AS AvgMarks   
FROM STUDENT   
GROUP BY Class;  
```  
  
**Output:**  
```  
+-------+----------+  
| Class | AvgMarks |  
+-------+----------+  
| 12A   | 83.67    |  
| 12B   | 86.00    |  
+-------+----------+  
```  
  
**Example 3: Department-wise employee count**  
```sql  
SELECT Department, COUNT(*) AS EmpCount, AVG(Salary) AS AvgSalary  
FROM EMPLOYEE   
GROUP BY Department;  
```  
  
**Example 4: City-wise statistics**  
```sql  
SELECT City,   
       COUNT(*) AS TotalEmp,  
       MAX(Salary) AS MaxSalary,  
       MIN(Salary) AS MinSalary  
FROM EMPLOYEE   
GROUP BY City;  
```  
  
---  
  
### HAVING Clause  
  
**Purpose:** Filter groups after GROUP BY (WHERE filters rows, HAVING filters groups)  
  
**Syntax:**  
```sql  
SELECT column, aggregate_function(column)  
FROM table_name  
GROUP BY column  
HAVING condition;  
```  
  
**Example 1: Classes with more than 2 students**  
```sql  
SELECT Class, COUNT(*) AS StudentCount   
FROM STUDENT   
GROUP BY Class   
HAVING COUNT(*) > 2;  
```  
  
**Output:**  
```  
+-------+--------------+  
| Class | StudentCount |  
+-------+--------------+  
| 12A   | 3            |  
+-------+--------------+  
```  
  
**Example 2: Departments with average salary > 40000**  
```sql  
SELECT Department, AVG(Salary) AS AvgSalary   
FROM EMPLOYEE   
GROUP BY Department   
HAVING AVG(Salary) > 40000;  
```  
  
**WHERE vs HAVING:**  
  
```sql  
-- WHERE: Filters rows BEFORE grouping  
SELECT Class, AVG(Marks)   
FROM STUDENT   
WHERE Marks > 80  -- Filter individual students  
GROUP BY Class;  
  
-- HAVING: Filters groups AFTER grouping  
SELECT Class, AVG(Marks)   
FROM STUDENT   
GROUP BY Class   
HAVING AVG(Marks) > 80;  -- Filter class groups  
```  
  
**Real Scenario - Indian Railways:**  
  
```sql  
CREATE TABLE TRAIN_BOOKINGS (  
    BookingID INT,  
    TrainNo VARCHAR(10),  
    PassengerName VARCHAR(50),  
    Class VARCHAR(10),  
    Fare DECIMAL(8,2)  
);  
  
INSERT INTO TRAIN_BOOKINGS VALUES  
    (1, '12345', 'Jitesh', 'AC', 1500.00),  
    (2, '12345', 'Ratnesh', 'Sleeper', 500.00),  
    (3, '12346', 'Himesh', 'AC', 1800.00),  
    (4, '12345', 'Gukesh', 'AC', 1500.00),  
    (5, '12346', 'Nitesh', 'Sleeper', 600.00);  
  
-- Total bookings per train  
SELECT TrainNo, COUNT(*) AS TotalBookings   
FROM TRAIN_BOOKINGS   
GROUP BY TrainNo;  
  
-- Average fare per class  
SELECT Class, AVG(Fare) AS AvgFare   
FROM TRAIN_BOOKINGS   
GROUP BY Class;  
  
-- Trains with more than 2 bookings  
SELECT TrainNo, COUNT(*) AS Bookings  
FROM TRAIN_BOOKINGS   
GROUP BY TrainNo  
HAVING COUNT(*) > 2;  
  
-- Total revenue per train  
SELECT TrainNo, SUM(Fare) AS TotalRevenue   
FROM TRAIN_BOOKINGS   
GROUP BY TrainNo;  
```  
  
**CBSE Pattern Question (3 Marks):**  
Q. Consider table SALES(ProductID, Product, Quantity, Price). Write SQL query to display Product and total quantity sold for each product.  
  
**Answer:**  
```sql  
SELECT Product, SUM(Quantity) AS TotalQuantity   
FROM SALES   
GROUP BY Product;  
```  
  
---  
  
## 9.13 Joins in SQL  
  
**Definition:**  
Join is used to combine rows from two or more tables based on a related column.  
  
**Why Joins?**  
In real databases, data is stored in multiple related tables. Joins help us retrieve combined information.  
  
**Types of Joins (CBSE Syllabus):**  
1. Cartesian Product  
2. Equi Join  
3. Natural Join  
  
**Setup for Join Examples:**  
  
```sql  
CREATE TABLE STUDENT (  
    RollNo INT PRIMARY KEY,  
    Name VARCHAR(50),  
    Class VARCHAR(5)  
);  
  
CREATE TABLE MARKS (  
    RollNo INT,  
    Subject VARCHAR(30),  
    Marks INT  
);  
  
INSERT INTO STUDENT VALUES  
    (101, 'Suresh', '12A'),  
    (102, 'Ramesh', '12B'),  
    (103, 'Dinesh', '12A'),  
    (104, 'Mukesh', '12B');  
  
INSERT INTO MARKS VALUES  
    (101, 'Mathematics', 85),  
    (101, 'Physics', 78),  
    (102, 'Mathematics', 90),  
    (103, 'Physics', 88),  
    (105, 'Chemistry', 75);  -- Note: RollNo 105 not in STUDENT  
```  
  
---  
  
### 9.13.1 Cartesian Product (Cross Join)  
  
**Definition:**  
Combines each row from first table with EVERY row from second table.  
  
**Syntax:**  
```sql  
SELECT * FROM table1, table2;  
-- OR  
SELECT * FROM table1 CROSS JOIN table2;  
```  
  
**Example:**  
```sql  
SELECT * FROM STUDENT, MARKS;  
```  
  
**Result:** If STUDENT has 4 rows and MARKS has 5 rows:  
Total rows in output = 4 × 5 = 20 rows  
  
**Partial Output:**  
```  
+--------+---------+-------+--------+-------------+-------+  
| RollNo | Name    | Class | RollNo | Subject     | Marks |  
+--------+---------+-------+--------+-------------+-------+  
| 101    | Suresh  | 12A   | 101    | Mathematics | 85    |  
| 101    | Suresh  | 12A   | 101    | Physics     | 78    |  
| 101    | Suresh  | 12A   | 102    | Mathematics | 90    |  
| 101    | Suresh  | 12A   | 103    | Physics     | 88    |  
| 101    | Suresh  | 12A   | 105    | Chemistry   | 75    |  
| 102    | Ramesh  | 12B   | 101    | Mathematics | 85    |  
... (15 more rows)  
```  
  
**Important:** Cartesian product is rarely useful and should be avoided. It creates meaningless combinations.  
  
---  
  
### 9.13.2 Equi Join (Inner Join)  
  
**Definition:**  
Returns rows when there is a match in both tables based on a condition.  
  
**Syntax:**  
```sql  
SELECT columns   
FROM table1, table2   
WHERE table1.column = table2.column;  
  
-- OR using JOIN keyword  
SELECT columns   
FROM table1 JOIN table2   
ON table1.column = table2.column;  
```  
  
**Example 1: Simple Equi Join**  
```sql  
SELECT STUDENT.Name, MARKS.Subject, MARKS.Marks  
FROM STUDENT, MARKS  
WHERE STUDENT.RollNo = MARKS.RollNo;  
  
-- OR  
SELECT STUDENT.Name, MARKS.Subject, MARKS.Marks  
FROM STUDENT JOIN MARKS  
ON STUDENT.RollNo = MARKS.RollNo;  
```  
  
**Output:**  
```  
+---------+-------------+-------+  
| Name    | Subject     | Marks |  
+---------+-------------+-------+  
| Suresh  | Mathematics | 85    |  
| Suresh  | Physics     | 78    |  
| Ramesh  | Mathematics | 90    |  
| Dinesh  | Physics     | 88    |  
+---------+-------------+-------+  
```  
  
**Note:**  
- RollNo 104 (Mukesh) not in output because no marks entry  
- RollNo 105 in MARKS not in output because no student entry  
  
**Example 2: Join with WHERE condition**  
```sql  
SELECT STUDENT.Name, MARKS.Subject, MARKS.Marks  
FROM STUDENT, MARKS  
WHERE STUDENT.RollNo = MARKS.RollNo   
AND MARKS.Marks > 80;  
```  
  
**Output:**  
```  
+---------+-------------+-------+  
| Name    | Subject     | Marks |  
+---------+-------------+-------+  
| Suresh  | Mathematics | 85    |  
| Ramesh  | Mathematics | 90    |  
| Dinesh  | Physics     | 88    |  
+---------+-------------+-------+  
```  
  
**Real Scenario - LIC Policy and Premium:**  
  
```sql  
CREATE TABLE POLICYHOLDER (  
    PolicyNo INT PRIMARY KEY,  
    Name VARCHAR(50),  
    City VARCHAR(30)  
);  
  
CREATE TABLE PREMIUM (  
    PolicyNo INT,  
    Amount DECIMAL(10,2),  
    PaymentDate DATE  
);  
  
INSERT INTO POLICYHOLDER VALUES  
    (1001, 'Hitesh', 'Chennai'),  
    (1002, 'Jitesh', 'Mumbai');  
  
INSERT INTO PREMIUM VALUES  
    (1001, 5000.00, '2024-01-15'),  
    (1001, 5000.00, '2024-02-15'),  
    (1002, 7500.00, '2024-01-20');  
  
-- Show all premium payments with policyholder details  
SELECT POLICYHOLDER.Name, POLICYHOLDER.City,   
       PREMIUM.Amount, PREMIUM.PaymentDate  
FROM POLICYHOLDER, PREMIUM  
WHERE POLICYHOLDER.PolicyNo = PREMIUM.PolicyNo;  
```  
  
**Output:**  
```  
+--------+---------+----------+-------------+  
| Name   | City    | Amount   | PaymentDate |  
+--------+---------+----------+-------------+  
| Hitesh | Chennai | 5000.00  | 2024-01-15  |  
| Hitesh | Chennai | 5000.00  | 2024-02-15  |  
| Jitesh | Mumbai  | 7500.00  | 2024-01-20  |  
+--------+---------+----------+-------------+  
```  
  
---  
  
### 9.13.3 Natural Join  
  
**Definition:**  
Automatically joins tables based on columns with the same name and datatype.  
  
**Syntax:**  
```sql  
SELECT columns   
FROM table1 NATURAL JOIN table2;  
```  
  
**Example:**  
```sql  
SELECT Name, Subject, Marks  
FROM STUDENT NATURAL JOIN MARKS;  
```  
  
**How it Works:**  
1. Finds common column (RollNo)  
2. Automatically joins on that column  
3. Removes duplicate column from output  
  
**Output:** (Same as Equi Join)  
```  
+---------+-------------+-------+  
| Name    | Subject     | Marks |  
+---------+-------------+-------+  
| Suresh  | Mathematics | 85    |  
| Suresh  | Physics     | 78    |  
| Ramesh  | Mathematics | 90    |  
| Dinesh  | Physics     | 88    |  
+---------+-------------+-------+  
```  
  
**Advantages:**  
- Less code to write  
- Automatic matching  
- Cleaner syntax  
  
**Disadvantages:**  
- Less control over join condition  
- Can cause issues if multiple columns have same name  
  
**CBSE Pattern Question (3 Marks):**  
Q. Consider tables:  
```  
ITEM (ItemCode, ItemName, Price)  
SALES (SalesID, ItemCode, Quantity, SalesDate)  
```  
Write SQL query to display ItemName, Quantity, and SalesDate for all sales.  
  
**Answer:**  
```sql  
SELECT ITEM.ItemName, SALES.Quantity, SALES.SalesDate  
FROM ITEM, SALES  
WHERE ITEM.ItemCode = SALES.ItemCode;  
```  
  
---  
  
## Unit 10: Interface of Python with SQL Database  
  
**Why Connect Python with MySQL?**  
- Create dynamic applications  
- Automate database operations  
- Build real-world projects  
- Process data efficiently  
  
---  
  
### 10.1 Installing MySQL Connector  
  
**Step 1: Open Command Prompt/Terminal**  
  
**Step 2: Install connector using pip**  
```  
pip install mysql-connector-python  
```  
  
**Verification:**  
```python  
import mysql.connector  
print("MySQL Connector installed successfully!")  
```  
  
**Common Error Solution:**  
If error occurs, try:  
```  
pip install mysql-connector-python --user  
```  
  
---  
  
### 10.2 Creating Database Connectivity  
  
**The 7-Step Process (Very Important for CBSE!)**  
  
**Step 1:** Import mysql.connector    
**Step 2:** Create connection    
**Step 3:** Create cursor    
**Step 4:** Execute SQL query    
**Step 5:** Fetch results (for SELECT)    
**Step 6:** Commit changes (for INSERT/UPDATE/DELETE)    
**Step 7:** Close connection    
  
**Memory Trick:** I Create Cursors Every Friday, Cool!  
  
---  
  
#### Step 1 & 2: Import and Connect  
  
```python  
import mysql.connector  
  
# Create connection  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="admin123",  
    database="SchoolDB"  
)  
  
if mydb.is_connected():  
    print("Successfully connected to database!")  
```  
  
**Parameters:**  
- **host** - Server address (localhost for local)  
- **user** - MySQL username (default: root)  
- **password** - Your MySQL password  
- **database** - Database name  
  
---  
  
#### Step 3 & 4: Create Cursor and Execute  
  
**Example 1: CREATE TABLE**  
```python  
import mysql.connector  
  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="admin123",  
    database="SchoolDB"  
)  
  
# Create cursor  
mycursor = mydb.cursor()  
  
# Execute CREATE TABLE  
mycursor.execute("""  
    CREATE TABLE STUDENT (  
        RollNo INT PRIMARY KEY,  
        Name VARCHAR(50),  
        Class VARCHAR(5),  
        Marks INT  
    )  
""")  
  
print("Table created successfully!")  
```  
  
---  
  
**Example 2: INSERT Single Record**  
```python  
import mysql.connector  
  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="admin123",  
    database="SchoolDB"  
)  
  
mycursor = mydb.cursor()  
  
# Insert data using placeholders  
sql = "INSERT INTO STUDENT VALUES (%s, %s, %s, %s)"  
values = (101, "Suresh", "12A", 85)  
  
mycursor.execute(sql, values)  
  
# IMPORTANT: Commit to save changes  
mydb.commit()  
  
print("Record inserted successfully!")  
print("Rows affected:", mycursor.rowcount)  
```  
  
---  
  
**Example 3: INSERT Multiple Records**  
```python  
import mysql.connector  
  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="admin123",  
    database="SchoolDB"  
)  
  
mycursor = mydb.cursor()  
  
# Multiple records  
sql = "INSERT INTO STUDENT VALUES (%s, %s, %s, %s)"  
values = [  
    (102, "Ramesh", "12B", 90),  
    (103, "Dinesh", "12A", 78),  
    (104, "Mukesh", "12B", 82)  
]  
  
mycursor.executemany(sql, values)  
mydb.commit()  
  
print(mycursor.rowcount, "records inserted!")  
```  
  
---  
  
#### Step 5: Fetch Results (SELECT)  
  
**Method 1: fetchone() - One row at a time**  
```python  
import mysql.connector  
  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="admin123",  
    database="SchoolDB"  
)  
  
mycursor = mydb.cursor()  
  
# Execute SELECT  
mycursor.execute("SELECT * FROM STUDENT")  
  
# Fetch one row  
result = mycursor.fetchone()  
print(result)  
```  
  
**Output:**  
```  
(101, 'Suresh', '12A', 85)  
```  
  
---  
  
**Method 2: fetchall() - All rows**  
```python  
import mysql.connector  
  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="admin123",  
    database="SchoolDB"  
)  
  
mycursor = mydb.cursor()  
  
mycursor.execute("SELECT * FROM STUDENT")  
  
# Fetch all rows  
results = mycursor.fetchall()  
  
for row in results:  
    print(row)  
```  
  
**Output:**  
```  
(101, 'Suresh', '12A', 85)  
(102, 'Ramesh', '12B', 90)  
(103, 'Dinesh', '12A', 78)  
(104, 'Mukesh', '12B', 82)  
```  
  
---  
  
**Method 3: Formatted Display**  
```python  
import mysql.connector  
  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="admin123",  
    database="SchoolDB"  
)  
  
mycursor = mydb.cursor()  
  
mycursor.execute("SELECT * FROM STUDENT")  
results = mycursor.fetchall()  
  
print("RollNo\tName\t\tClass\tMarks")  
print("-" * 40)  
for row in results:  
    print(f"{row[0]}\t{row[1]}\t\t{row[2]}\t{row[3]}")  
```  
  
**Output:**  
```  
RollNo  Name            Class   Marks  
----------------------------------------  
101     Suresh          12A     85  
102     Ramesh          12B     90  
103     Dinesh          12A     78  
104     Mukesh          12B     82  
```  
  
---  
  
**Example with WHERE Clause:**  
```python  
import mysql.connector  
  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="admin123",  
    database="SchoolDB"  
)  
  
mycursor = mydb.cursor()  
  
# Select with condition  
mycursor.execute("SELECT Name, Marks FROM STUDENT WHERE Marks > 80")  
results = mycursor.fetchall()  
  
print("Students with marks > 80:")  
for row in results:  
    print(f"Name: {row[0]}, Marks: {row[1]}")  
```  
  
---  
  
#### Step 7: Close Connection  
  
```python  
# Always close when done  
mycursor.close()  
mydb.close()  
print("Connection closed!")  
```  
  
---  
  
### Complete Example with Error Handling  
  
```python  
import mysql.connector  
  
try:  
    # Connect  
    mydb = mysql.connector.connect(  
        host="localhost",  
        user="root",  
        password="admin123",  
        database="SchoolDB"  
    )  
      
    mycursor = mydb.cursor()  
      
    # Execute query  
    mycursor.execute("SELECT * FROM STUDENT")  
    results = mycursor.fetchall()  
      
    # Display results  
    for row in results:  
        print(row)  
      
except mysql.connector.Error as err:  
    print(f"Error: {err}")  
      
finally:  
    # Always close  
    if mydb.is_connected():  
        mycursor.close()  
        mydb.close()  
        print("Connection closed!")  
```  
  
---  
  
### 10.2.7 Advantages of Connecting SQL with Python  
  
1. **Automation** - Automate repetitive tasks  
2. **Dynamic Queries** - Build queries based on user input  
3. **Data Processing** - Combine SQL with Python libraries  
4. **Real Applications** - Create GUI applications  
5. **Error Handling** - Better error management  
6. **Efficiency** - Process large data quickly  
7. **Integration** - Connect with other systems  
  
---  
  
### Real-World Example: Student Management  
  
```python  
import mysql.connector  
  
def connect_db():  
    return mysql.connector.connect(  
        host="localhost",  
        user="root",  
        password="admin123",  
        database="SchoolDB"  
    )  
  
def add_student(rollno, name, cls, marks):  
    mydb = connect_db()  
    mycursor = mydb.cursor()  
      
    sql = "INSERT INTO STUDENT VALUES (%s, %s, %s, %s)"  
    values = (rollno, name, cls, marks)  
      
    mycursor.execute(sql, values)  
    mydb.commit()  
      
    print("Student added successfully!")  
    mycursor.close()  
    mydb.close()  
  
def search_student(rollno):  
    mydb = connect_db()  
    mycursor = mydb.cursor()  
      
    sql = "SELECT * FROM STUDENT WHERE RollNo = %s"  
    mycursor.execute(sql, (rollno,))  
      
    result = mycursor.fetchone()  
      
    if result:  
        print(f"Roll No: {result[0]}")  
        print(f"Name: {result[1]}")  
        print(f"Class: {result[2]}")  
        print(f"Marks: {result[3]}")  
    else:  
        print("Student not found!")  
      
    mycursor.close()  
    mydb.close()  
  
def display_all():  
    mydb = connect_db()  
    mycursor = mydb.cursor()  
      
    mycursor.execute("SELECT * FROM STUDENT")  
    results = mycursor.fetchall()  
      
    print("All Students:")  
    print("-" * 50)  
    for row in results:  
        print(f"{row[0]}\t{row[1]}\t{row[2]}\t{row[3]}")  
      
    mycursor.close()  
    mydb.close()  
  
# Menu  
while True:  
    print("\n--- Student Management ---")  
    print("1. Add Student")  
    print("2. Search Student")  
    print("3. Display All")  
    print("4. Exit")  
      
    choice = input("Enter choice: ")  
      
    if choice == '1':  
        rollno = int(input("Roll No: "))  
        name = input("Name: ")  
        cls = input("Class: ")  
        marks = int(input("Marks: "))  
        add_student(rollno, name, cls, marks)  
    elif choice == '2':  
        rollno = int(input("Enter Roll No: "))  
        search_student(rollno)  
    elif choice == '3':  
        display_all()  
    elif choice == '4':  
        print("Thank you!")  
        break  
```  
  
---  
  
## CBSE Exam Practice Questions  
  
### 1 Mark Questions  
  
**Q1.** Which function is used to execute SQL query in Python?  
**Answer:** execute()  
  
**Q2.** What does fetchall() return?  
**Answer:** All rows from the result set as a list of tuples  
  
**Q3.** Which method saves changes in database?  
**Answer:** commit()  
  
---  
  
### 2 Mark Questions  
  
**Q4.** Write Python code to connect to database 'TestDB'.  
  
**Answer:**  
```python  
import mysql.connector  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="password",  
    database="TestDB"  
)  
```  
  
**Q5.** What is the difference between fetchone() and fetchall()?  
  
**Answer:**  
- fetchone() returns single row as tuple  
- fetchall() returns all rows as list of tuples  
  
---  
  
### 3 Mark Questions  
  
**Q6.** Write Python program to insert a record in EMPLOYEE table.  
  
**Answer:**  
```python  
import mysql.connector  
  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="admin123",  
    database="CompanyDB"  
)  
  
mycursor = mydb.cursor()  
  
sql = "INSERT INTO EMPLOYEE VALUES (%s, %s, %s)"  
values = (101, "Suresh", 45000)  
  
mycursor.execute(sql, values)  
mydb.commit()  
  
print("Record inserted!")  
  
mycursor.close()  
mydb.close()  
```  
  
---  
  
### 4 Mark Questions  
  
**Q7.** Write Python program to display all students with marks > 80.  
  
**Answer:**  
```python  
import mysql.connector  
  
mydb = mysql.connector.connect(  
    host="localhost",  
    user="root",  
    password="admin123",  
    database="SchoolDB"  
)  
  
mycursor = mydb.cursor()  
  
mycursor.execute("SELECT * FROM STUDENT WHERE Marks > 80")  
results = mycursor.fetchall()  
  
print("Students with marks > 80:")  
for row in results:  
    print(f"Roll: {row[0]}, Name: {row[1]}, Marks: {row[3]}")  
  
mycursor.close()  
mydb.close()  
```  
  
---  
  
## Quick Revision - Part 3  
  
**DML Commands:**  
- INSERT - Add records  
- SELECT - Retrieve records  
- UPDATE - Modify records  
- DELETE - Remove records  
  
**Aggregate Functions:**  
- COUNT() - Count rows  
- SUM() - Total  
- AVG() - Average  
- MAX() - Maximum  
- MIN() - Minimum  
  
**Joins:**  
- Cartesian Product - All combinations  
- Equi Join - Match on condition  
- Natural Join - Automatic matching  
  
**Python-MySQL 7 Steps:**  
1. Import  
2. Connect  
3. Create Cursor  
4. Execute  
5. Fetch (SELECT)  
6. Commit (INSERT/UPDATE/DELETE)  
7. Close  
  
---  
  
## Final Assignment  
  
**Create Complete School Management System:**  
  
**Tasks:**  
1. Create database SchoolDB  
2. Create STUDENT table  
3. Write Python functions for:  
   - Add student  
   - Update marks  
   - Delete student  
   - Search by name  
   - Display all  
   - Show class-wise average  
4. Create menu-driven program  
  
---  
  
**End of Part 3**  
  
**All 3 Parts Complete!**  
  
You now have all the knowledge needed for CBSE Database Management exam. Practice regularly and you'll excel!  
  
**Good Luck for Your Exams!**  
  
---  
  
**Prepared with care for CBSE Students**