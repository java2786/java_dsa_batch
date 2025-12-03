# MySQL Query Practice Guide  
## Hands-On Database Practice for Exams & Interviews  
  
**Zero Theory | 100% Practice | Real Exam Questions**  
  
---  
  
## Quick Setup Guide  
  
### Step 1: Start MySQL  
```bash  
mysql -u root -p  
# Enter your password  
```  
  
### Step 2: Create Practice Database  
```sql  
CREATE DATABASE practice_db;  
USE practice_db;  
```  
  
---  
  
## Setup 1: School Database  
  
### Create Tables  
  
```sql  
-- Students Table  
CREATE TABLE STUDENT (  
    RollNo INT PRIMARY KEY,  
    Name VARCHAR(50) NOT NULL,  
    Class VARCHAR(5),  
    Marks INT,  
    City VARCHAR(30)  
);  
  
-- Books Table  
CREATE TABLE BOOKS (  
    BookID INT PRIMARY KEY,  
    Title VARCHAR(100) NOT NULL,  
    Author VARCHAR(50),  
    Price DECIMAL(8,2),  
    Quantity INT DEFAULT 0  
);  
  
-- Issue Table  
CREATE TABLE BOOK_ISSUE (  
    IssueID INT PRIMARY KEY,  
    RollNo INT,  
    BookID INT,  
    IssueDate DATE,  
    ReturnDate DATE,  
    FOREIGN KEY (RollNo) REFERENCES STUDENT(RollNo),  
    FOREIGN KEY (BookID) REFERENCES BOOKS(BookID)  
);  
```  
  
### Insert Sample Data  
  
```sql  
-- Insert Students  
INSERT INTO STUDENT VALUES  
(101, 'Suresh Kumar', '12A', 85, 'Pune'),  
(102, 'Ramesh Singh', '12B', 90, 'Mumbai'),  
(103, 'Mahesh Patil', '12A', 78, 'Pune'),  
(104, 'Dinesh Sharma', '12B', 82, 'Delhi'),  
(105, 'Mukesh Gupta', '12A', 88, 'Mumbai'),  
(106, 'Kamlesh Verma', '12C', 92, 'Pune'),  
(107, 'Nitesh Joshi', '12B', 76, 'Delhi'),  
(108, 'Hitesh Reddy', '12A', 95, 'Chennai'),  
(109, 'Ratnesh Rao', '12C', 80, 'Bangalore'),  
(110, 'Himesh Desai', '12B', 87, 'Mumbai');  
  
-- Insert Books  
INSERT INTO BOOKS VALUES  
(1, 'Python Programming', 'Guido Van Rossum', 450.00, 10),  
(2, 'Data Structures', 'Seymour Lipschutz', 550.00, 8),  
(3, 'Database Systems', 'Elmasri Navathe', 650.00, 5),  
(4, 'Computer Networks', 'Tanenbaum', 700.00, 6),  
(5, 'Operating Systems', 'Galvin', 600.00, 7),  
(6, 'Java Complete Reference', 'Herbert Schildt', 500.00, 12),  
(7, 'Web Technologies', 'Black Book', 400.00, 9),  
(8, 'Artificial Intelligence', 'Russell Norvig', 800.00, 4);  
  
-- Insert Book Issues  
INSERT INTO BOOK_ISSUE VALUES  
(1, 101, 1, '2024-01-15', '2024-01-30'),  
(2, 102, 3, '2024-01-18', NULL),  
(3, 103, 2, '2024-01-20', '2024-02-05'),  
(4, 105, 4, '2024-01-22', NULL),  
(5, 106, 1, '2024-01-25', '2024-02-10'),  
(6, 108, 6, '2024-01-28', NULL),  
(7, 101, 5, '2024-02-01', NULL),  
(8, 109, 7, '2024-02-03', '2024-02-18');  
```  
  
---  
  
## Practice Set 1: Basic SELECT Queries  
  
### Query 1: Select all students  
```sql  
SELECT * FROM STUDENT;  
```  
  
### Query 2: Select specific columns  
```sql  
SELECT Name, Class, Marks FROM STUDENT;  
```  
  
### Query 3: Select with WHERE clause  
```sql  
SELECT * FROM STUDENT WHERE Class = '12A';  
```  
  
### Query 4: Students with marks > 85  
```sql  
SELECT Name, Marks FROM STUDENT WHERE Marks > 85;  
```  
  
### Query 5: Students from Pune  
```sql  
SELECT * FROM STUDENT WHERE City = 'Pune';  
```  
  
### Query 6: Students from Pune OR Mumbai  
```sql  
SELECT Name, City FROM STUDENT WHERE City = 'Pune' OR City = 'Mumbai';  
```  
  
### Query 7: Students in 12A AND marks > 80  
```sql  
SELECT * FROM STUDENT WHERE Class = '12A' AND Marks > 80;  
```  
  
### Query 8: Books with price between 400 and 600  
```sql  
SELECT Title, Price FROM BOOKS WHERE Price BETWEEN 400 AND 600;  
```  
  
### Query 9: Students from specific cities  
```sql  
SELECT * FROM STUDENT WHERE City IN ('Pune', 'Mumbai', 'Delhi');  
```  
  
### Query 10: Books NOT in price range  
```sql  
SELECT Title, Price FROM BOOKS WHERE Price NOT BETWEEN 500 AND 700;  
```  
  
---  
  
## Practice Set 2: Pattern Matching (LIKE)  
  
### Query 11: Names starting with 'M'  
```sql  
SELECT Name FROM STUDENT WHERE Name LIKE 'M%';  
```  
  
### Query 12: Names ending with 'esh'  
```sql  
SELECT Name FROM STUDENT WHERE Name LIKE '%esh';  
```  
  
### Query 13: Names containing 'esh'  
```sql  
SELECT Name FROM STUDENT WHERE Name LIKE '%esh%';  
```  
  
### Query 14: Names with 'a' as second character  
```sql  
SELECT Name FROM STUDENT WHERE Name LIKE '_a%';  
```  
  
### Query 15: Books with 'System' in title  
```sql  
SELECT Title FROM BOOKS WHERE Title LIKE '%System%';  
```  
  
### Query 16: 5-letter city names  
```sql  
SELECT DISTINCT City FROM STUDENT WHERE City LIKE '_____';  
```  
  
---  
  
## Practice Set 3: Sorting and Limiting  
  
### Query 17: Students sorted by marks (ascending)  
```sql  
SELECT Name, Marks FROM STUDENT ORDER BY Marks;  
```  
  
### Query 18: Students sorted by marks (descending)  
```sql  
SELECT Name, Marks FROM STUDENT ORDER BY Marks DESC;  
```  
  
### Query 19: Sort by class, then marks  
```sql  
SELECT Name, Class, Marks FROM STUDENT ORDER BY Class, Marks DESC;  
```  
  
### Query 20: Top 3 students by marks  
```sql  
SELECT Name, Marks FROM STUDENT ORDER BY Marks DESC LIMIT 3;  
```  
  
### Query 21: Top 5 expensive books  
```sql  
SELECT Title, Price FROM BOOKS ORDER BY Price DESC LIMIT 5;  
```  
  
### Query 22: Students with 3rd to 5th highest marks  
```sql  
SELECT Name, Marks FROM STUDENT ORDER BY Marks DESC LIMIT 2, 3;  
```  
  
---  
  
## Practice Set 4: Aggregate Functions  
  
### Query 23: Count total students  
```sql  
SELECT COUNT(*) AS TotalStudents FROM STUDENT;  
```  
  
### Query 24: Count students in 12A  
```sql  
SELECT COUNT(*) AS Count12A FROM STUDENT WHERE Class = '12A';  
```  
  
### Query 25: Total marks of all students  
```sql  
SELECT SUM(Marks) AS TotalMarks FROM STUDENT;  
```  
  
### Query 26: Average marks of all students  
```sql  
SELECT AVG(Marks) AS AverageMarks FROM STUDENT;  
```  
  
### Query 27: Highest marks  
```sql  
SELECT MAX(Marks) AS HighestMarks FROM STUDENT;  
```  
  
### Query 28: Lowest marks  
```sql  
SELECT MIN(Marks) AS LowestMarks FROM STUDENT;  
```  
  
### Query 29: All aggregate functions together  
```sql  
SELECT   
    COUNT(*) AS Total,  
    SUM(Marks) AS TotalMarks,  
    AVG(Marks) AS AvgMarks,  
    MAX(Marks) AS MaxMarks,  
    MIN(Marks) AS MinMarks  
FROM STUDENT;  
```  
  
### Query 30: Average price of books  
```sql  
SELECT AVG(Price) AS AvgPrice FROM BOOKS;  
```  
  
---  
  
## Practice Set 5: GROUP BY  
  
### Query 31: Count students per class  
```sql  
SELECT Class, COUNT(*) AS StudentCount   
FROM STUDENT   
GROUP BY Class;  
```  
  
### Query 32: Average marks per class  
```sql  
SELECT Class, AVG(Marks) AS AvgMarks   
FROM STUDENT   
GROUP BY Class;  
```  
  
### Query 33: Highest marks in each class  
```sql  
SELECT Class, MAX(Marks) AS HighestMarks   
FROM STUDENT   
GROUP BY Class;  
```  
  
### Query 34: Count students per city  
```sql  
SELECT City, COUNT(*) AS StudentCount   
FROM STUDENT   
GROUP BY City;  
```  
  
### Query 35: Total book quantity by price range  
```sql  
SELECT   
    CASE   
        WHEN Price < 500 THEN 'Cheap'  
        WHEN Price BETWEEN 500 AND 600 THEN 'Medium'  
        ELSE 'Expensive'  
    END AS PriceRange,  
    SUM(Quantity) AS TotalBooks  
FROM BOOKS  
GROUP BY PriceRange;  
```  
  
### Query 36: Class-wise total and average marks  
```sql  
SELECT   
    Class,  
    COUNT(*) AS Students,  
    SUM(Marks) AS TotalMarks,  
    AVG(Marks) AS AvgMarks  
FROM STUDENT  
GROUP BY Class;  
```  
  
---  
  
## Practice Set 6: HAVING Clause  
  
### Query 37: Classes with more than 3 students  
```sql  
SELECT Class, COUNT(*) AS StudentCount   
FROM STUDENT   
GROUP BY Class   
HAVING COUNT(*) > 3;  
```  
  
### Query 38: Classes with average marks > 85  
```sql  
SELECT Class, AVG(Marks) AS AvgMarks   
FROM STUDENT   
GROUP BY Class   
HAVING AVG(Marks) > 85;  
```  
  
### Query 39: Cities with at least 2 students  
```sql  
SELECT City, COUNT(*) AS StudentCount   
FROM STUDENT   
GROUP BY City   
HAVING COUNT(*) >= 2;  
```  
  
### Query 40: Classes where total marks > 250  
```sql  
SELECT Class, SUM(Marks) AS TotalMarks   
FROM STUDENT   
GROUP BY Class   
HAVING SUM(Marks) > 250;  
```  
  
---  
  
## Practice Set 7: UPDATE Queries  
  
### Query 41: Increase marks by 5 for all students  
```sql  
UPDATE STUDENT SET Marks = Marks + 5;  
```  
  
### Query 42: Update marks for specific student  
```sql  
UPDATE STUDENT SET Marks = 95 WHERE RollNo = 107;  
```  
  
### Query 43: Give 10% grace to students with marks < 80  
```sql  
UPDATE STUDENT SET Marks = Marks * 1.10 WHERE Marks < 80;  
```  
  
### Query 44: Change city for a student  
```sql  
UPDATE STUDENT SET City = 'Bangalore' WHERE RollNo = 104;  
```  
  
### Query 45: Increase price of books by 10%  
```sql  
UPDATE BOOKS SET Price = Price * 1.10;  
```  
  
### Query 46: Update multiple columns  
```sql  
UPDATE STUDENT   
SET Marks = 90, City = 'Chennai'   
WHERE RollNo = 103;  
```  
  
---  
  
## Practice Set 8: DELETE Queries  
  
### Query 47: Delete a specific student  
```sql  
DELETE FROM STUDENT WHERE RollNo = 110;  
```  
  
### Query 48: Delete students with marks < 75  
```sql  
DELETE FROM STUDENT WHERE Marks < 75;  
```  
  
### Query 49: Delete students from specific city  
```sql  
DELETE FROM STUDENT WHERE City = 'Delhi';  
```  
  
### Query 50: Delete books with quantity 0  
```sql  
DELETE FROM BOOKS WHERE Quantity = 0;  
```  
  
---  
  
## Practice Set 9: ALTER TABLE  
  
### Query 51: Add column  
```sql  
ALTER TABLE STUDENT ADD Email VARCHAR(50);  
```  
  
### Query 52: Add column with default  
```sql  
ALTER TABLE STUDENT ADD Age INT DEFAULT 17;  
```  
  
### Query 53: Modify column  
```sql  
ALTER TABLE STUDENT MODIFY Name VARCHAR(100);  
```  
  
### Query 54: Drop column  
```sql  
ALTER TABLE STUDENT DROP COLUMN Email;  
```  
  
### Query 55: Add primary key  
```sql  
ALTER TABLE BOOKS ADD PRIMARY KEY (BookID);  
```  
  
### Query 56: Add foreign key  
```sql  
ALTER TABLE BOOK_ISSUE   
ADD FOREIGN KEY (RollNo) REFERENCES STUDENT(RollNo);  
```  
  
---  
  
## Practice Set 10: JOINS  
  
### Query 57: Student names and their issued books  
```sql  
SELECT STUDENT.Name, BOOKS.Title, BOOK_ISSUE.IssueDate  
FROM STUDENT  
JOIN BOOK_ISSUE ON STUDENT.RollNo = BOOK_ISSUE.RollNo  
JOIN BOOKS ON BOOK_ISSUE.BookID = BOOKS.BookID;  
```  
  
### Query 58: Books issued to students from Pune  
```sql  
SELECT STUDENT.Name, BOOKS.Title, STUDENT.City  
FROM STUDENT  
JOIN BOOK_ISSUE ON STUDENT.RollNo = BOOK_ISSUE.RollNo  
JOIN BOOKS ON BOOK_ISSUE.BookID = BOOKS.BookID  
WHERE STUDENT.City = 'Pune';  
```  
  
### Query 59: Students with unreturned books  
```sql  
SELECT STUDENT.Name, BOOKS.Title  
FROM STUDENT  
JOIN BOOK_ISSUE ON STUDENT.RollNo = BOOK_ISSUE.RollNo  
JOIN BOOKS ON BOOK_ISSUE.BookID = BOOKS.BookID  
WHERE BOOK_ISSUE.ReturnDate IS NULL;  
```  
  
### Query 60: Count books issued per student  
```sql  
SELECT STUDENT.Name, COUNT(*) AS BooksIssued  
FROM STUDENT  
JOIN BOOK_ISSUE ON STUDENT.RollNo = BOOK_ISSUE.RollNo  
GROUP BY STUDENT.Name;  
```  
  
---  
  
## Setup 2: Company Database (For More Practice)  
  
```sql  
-- Create Employee Table  
CREATE TABLE EMPLOYEE (  
    EmpID INT PRIMARY KEY,  
    Name VARCHAR(50) NOT NULL,  
    Department VARCHAR(30),  
    Salary DECIMAL(10,2),  
    JoinDate DATE,  
    City VARCHAR(30)  
);  
  
-- Create Department Table  
CREATE TABLE DEPARTMENT (  
    DeptID INT PRIMARY KEY,  
    DeptName VARCHAR(30),  
    Location VARCHAR(30)  
);  
  
-- Insert Employees  
INSERT INTO EMPLOYEE VALUES  
(101, 'Suresh Mehta', 'IT', 45000.00, '2020-01-15', 'Pune'),  
(102, 'Ramesh Iyer', 'HR', 38000.00, '2019-05-20', 'Mumbai'),  
(103, 'Dinesh Patel', 'IT', 52000.00, '2021-03-10', 'Pune'),  
(104, 'Mukesh Reddy', 'Sales', 35000.00, '2020-08-25', 'Chennai'),  
(105, 'Kamlesh Jain', 'IT', 48000.00, '2021-06-18', 'Delhi'),  
(106, 'Nitesh Kumar', 'Finance', 42000.00, '2019-11-30', 'Mumbai'),  
(107, 'Hitesh Shah', 'HR', 40000.00, '2020-02-14', 'Pune'),  
(108, 'Ratnesh Gupta', 'Sales', 36000.00, '2021-09-05', 'Bangalore'),  
(109, 'Himesh Desai', 'Finance', 44000.00, '2020-04-22', 'Chennai'),  
(110, 'Gukesh Rao', 'IT', 50000.00, '2021-01-08', 'Pune');  
  
-- Insert Departments  
INSERT INTO DEPARTMENT VALUES  
(1, 'IT', 'Pune'),  
(2, 'HR', 'Mumbai'),  
(3, 'Sales', 'Bangalore'),  
(4, 'Finance', 'Chennai');  
```  
  
---  
  
## Practice Set 11: Employee Queries  
  
### Query 61: All IT department employees  
```sql  
SELECT * FROM EMPLOYEE WHERE Department = 'IT';  
```  
  
### Query 62: Employees earning > 40000  
```sql  
SELECT Name, Salary FROM EMPLOYEE WHERE Salary > 40000;  
```  
  
### Query 63: Employees in Pune or Mumbai  
```sql  
SELECT Name, City FROM EMPLOYEE WHERE City IN ('Pune', 'Mumbai');  
```  
  
### Query 64: IT employees in Pune earning > 45000  
```sql  
SELECT Name, Salary   
FROM EMPLOYEE   
WHERE Department = 'IT' AND City = 'Pune' AND Salary > 45000;  
```  
  
### Query 65: Employees joined after 2020  
```sql  
SELECT Name, JoinDate   
FROM EMPLOYEE   
WHERE JoinDate > '2020-12-31';  
```  
  
### Query 66: Department-wise average salary  
```sql  
SELECT Department, AVG(Salary) AS AvgSalary   
FROM EMPLOYEE   
GROUP BY Department;  
```  
  
### Query 67: Count employees per department  
```sql  
SELECT Department, COUNT(*) AS EmpCount   
FROM EMPLOYEE   
GROUP BY Department;  
```  
  
### Query 68: Departments with avg salary > 42000  
```sql  
SELECT Department, AVG(Salary) AS AvgSalary   
FROM EMPLOYEE   
GROUP BY Department   
HAVING AVG(Salary) > 42000;  
```  
  
### Query 69: Top 3 highest paid employees  
```sql  
SELECT Name, Salary   
FROM EMPLOYEE   
ORDER BY Salary DESC   
LIMIT 3;  
```  
  
### Query 70: Employees sorted by join date  
```sql  
SELECT Name, JoinDate   
FROM EMPLOYEE   
ORDER BY JoinDate;  
```  
  
---  
  
## Practice Set 12: Advanced Queries  
  
### Query 71: Second highest salary  
```sql  
SELECT MAX(Salary) AS SecondHighest   
FROM EMPLOYEE   
WHERE Salary < (SELECT MAX(Salary) FROM EMPLOYEE);  
```  
  
### Query 72: Employees earning more than average  
```sql  
SELECT Name, Salary   
FROM EMPLOYEE   
WHERE Salary > (SELECT AVG(Salary) FROM EMPLOYEE);  
```  
  
### Query 73: Department with most employees  
```sql  
SELECT Department, COUNT(*) AS EmpCount   
FROM EMPLOYEE   
GROUP BY Department   
ORDER BY EmpCount DESC   
LIMIT 1;  
```  
  
### Query 74: City-wise total salary  
```sql  
SELECT City, SUM(Salary) AS TotalSalary   
FROM EMPLOYEE   
GROUP BY City   
ORDER BY TotalSalary DESC;  
```  
  
### Query 75: Employees with names containing 'esh'  
```sql  
SELECT Name FROM EMPLOYEE WHERE Name LIKE '%esh%';  
```  
  
### Query 76: Give 15% hike to IT department  
```sql  
UPDATE EMPLOYEE   
SET Salary = Salary * 1.15   
WHERE Department = 'IT';  
```  
  
### Query 77: Oldest employee (by join date)  
```sql  
SELECT Name, JoinDate   
FROM EMPLOYEE   
ORDER BY JoinDate   
LIMIT 1;  
```  
  
### Query 78: Salary range analysis  
```sql  
SELECT   
    CASE   
        WHEN Salary < 40000 THEN 'Low'  
        WHEN Salary BETWEEN 40000 AND 50000 THEN 'Medium'  
        ELSE 'High'  
    END AS SalaryRange,  
    COUNT(*) AS EmpCount  
FROM EMPLOYEE  
GROUP BY SalaryRange;  
```  
  
---  
  
## Setup 3: E-Commerce Database  
  
```sql  
-- Products Table  
CREATE TABLE PRODUCTS (  
    ProductID INT PRIMARY KEY,  
    ProductName VARCHAR(100),  
    Category VARCHAR(30),  
    Price DECIMAL(10,2),  
    Stock INT  
);  
  
-- Customers Table  
CREATE TABLE CUSTOMERS (  
    CustomerID INT PRIMARY KEY,  
    CustomerName VARCHAR(50),  
    City VARCHAR(30),  
    Phone VARCHAR(15)  
);  
  
-- Orders Table  
CREATE TABLE ORDERS (  
    OrderID INT PRIMARY KEY,  
    CustomerID INT,  
    ProductID INT,  
    Quantity INT,  
    OrderDate DATE,  
    FOREIGN KEY (CustomerID) REFERENCES CUSTOMERS(CustomerID),  
    FOREIGN KEY (ProductID) REFERENCES PRODUCTS(ProductID)  
);  
  
-- Insert Products  
INSERT INTO PRODUCTS VALUES  
(1, 'Samsung Galaxy S23', 'Mobile', 74999.00, 50),  
(2, 'iPhone 15', 'Mobile', 79999.00, 30),  
(3, 'Dell Laptop', 'Laptop', 55000.00, 25),  
(4, 'HP Laptop', 'Laptop', 45000.00, 40),  
(5, 'Sony Headphones', 'Audio', 2999.00, 100),  
(6, 'boAt Earbuds', 'Audio', 1499.00, 150),  
(7, 'LG TV 43"', 'TV', 32000.00, 20),  
(8, 'Samsung TV 55"', 'TV', 52000.00, 15);  
  
-- Insert Customers  
INSERT INTO CUSTOMERS VALUES  
(1, 'Suresh Kumar', 'Pune', '9876543210'),  
(2, 'Ramesh Patel', 'Mumbai', '9876543211'),  
(3, 'Mahesh Singh', 'Delhi', '9876543212'),  
(4, 'Dinesh Reddy', 'Bangalore', '9876543213'),  
(5, 'Mukesh Jain', 'Chennai', '9876543214');  
  
-- Insert Orders  
INSERT INTO ORDERS VALUES  
(1, 1, 1, 1, '2024-01-15'),  
(2, 2, 3, 2, '2024-01-18'),  
(3, 3, 5, 3, '2024-01-20'),  
(4, 1, 6, 2, '2024-01-22'),  
(5, 4, 2, 1, '2024-01-25'),  
(6, 5, 7, 1, '2024-01-28'),  
(7, 2, 4, 1, '2024-02-01'),  
(8, 3, 8, 1, '2024-02-03');  
```  
  
---  
  
## Practice Set 13: E-Commerce Queries  
  
### Query 79: Products under 50000  
```sql  
SELECT ProductName, Price   
FROM PRODUCTS   
WHERE Price < 50000;  
```  
  
### Query 80: Mobile phones only  
```sql  
SELECT * FROM PRODUCTS WHERE Category = 'Mobile';  
```  
  
### Query 81: Products sorted by price  
```sql  
SELECT ProductName, Price   
FROM PRODUCTS   
ORDER BY Price DESC;  
```  
  
### Query 82: Average product price  
```sql  
SELECT AVG(Price) AS AvgPrice FROM PRODUCTS;  
```  
  
### Query 83: Category-wise product count  
```sql  
SELECT Category, COUNT(*) AS ProductCount   
FROM PRODUCTS   
GROUP BY Category;  
```  
  
### Query 84: Total stock value  
```sql  
SELECT SUM(Price * Stock) AS TotalValue FROM PRODUCTS;  
```  
  
### Query 85: Customer names and their orders  
```sql  
SELECT CUSTOMERS.CustomerName, PRODUCTS.ProductName, ORDERS.Quantity  
FROM CUSTOMERS  
JOIN ORDERS ON CUSTOMERS.CustomerID = ORDERS.CustomerID  
JOIN PRODUCTS ON ORDERS.ProductID = PRODUCTS.ProductID;  
```  
  
### Query 86: Total orders per customer  
```sql  
SELECT CUSTOMERS.CustomerName, COUNT(*) AS TotalOrders  
FROM CUSTOMERS  
JOIN ORDERS ON CUSTOMERS.CustomerID = ORDERS.CustomerID  
GROUP BY CUSTOMERS.CustomerName;  
```  
  
### Query 87: Total revenue per product  
```sql  
SELECT PRODUCTS.ProductName, SUM(PRODUCTS.Price * ORDERS.Quantity) AS Revenue  
FROM PRODUCTS  
JOIN ORDERS ON PRODUCTS.ProductID = ORDERS.ProductID  
GROUP BY PRODUCTS.ProductName;  
```  
  
### Query 88: Customers from Pune or Mumbai  
```sql  
SELECT * FROM CUSTOMERS WHERE City IN ('Pune', 'Mumbai');  
```  
  
---  
  
## CBSE Exam Pattern Questions  
  
### Question 1 (2 Marks)  
Write SQL query to display Name and Marks of students scoring more than 80.  
  
**Answer:**  
```sql  
SELECT Name, Marks FROM STUDENT WHERE Marks > 80;  
```  
  
---  
  
### Question 2 (2 Marks)  
Write SQL query to display all books with price between 400 and 600.  
  
**Answer:**  
```sql  
SELECT * FROM BOOKS WHERE Price BETWEEN 400 AND 600;  
```  
  
---  
  
### Question 3 (3 Marks)  
Write SQL query to display class-wise average marks, sorted by average in descending order.  
  
**Answer:**  
```sql  
SELECT Class, AVG(Marks) AS AvgMarks   
FROM STUDENT   
GROUP BY Class   
ORDER BY AvgMarks DESC;  
```  
  
---  
  
### Question 4 (3 Marks)  
Write SQL query to display names of students from Pune who scored more than 85.  
  
**Answer:**  
```sql  
SELECT Name FROM STUDENT   
WHERE City = 'Pune' AND Marks > 85;  
```  
  
---  
  
### Question 5 (4 Marks)  
Write SQL queries to:  
(a) Display top 3 students by marks  
(b) Count students in each city  
(c) Display cities having more than 2 students  
  
**Answer:**  
```sql  
(a) SELECT Name, Marks FROM STUDENT ORDER BY Marks DESC LIMIT 3;  
  
(b) SELECT City, COUNT(*) AS StudentCount FROM STUDENT GROUP BY City;  
  
(c) SELECT City, COUNT(*) AS StudentCount FROM STUDENT   
    GROUP BY City HAVING COUNT(*) > 2;  
```  
  
---  
  
### Question 6 (4 Marks)  
Given tables EMPLOYEE and DEPARTMENT, write SQL query to display employee names, their department and location.  
  
**Answer:**  
```sql  
SELECT EMPLOYEE.Name, DEPARTMENT.DeptName, DEPARTMENT.Location  
FROM EMPLOYEE  
JOIN DEPARTMENT ON EMPLOYEE.Department = DEPARTMENT.DeptName;  
```  
  
---  
  
## Interview Pattern Questions  
  
### Interview Q1: Find nth highest salary  
```sql  
-- 2nd highest  
SELECT DISTINCT Salary   
FROM EMPLOYEE   
ORDER BY Salary DESC   
LIMIT 1 OFFSET 1;  
  
-- 3rd highest  
SELECT DISTINCT Salary   
FROM EMPLOYEE   
ORDER BY Salary DESC   
LIMIT 1 OFFSET 2;  
```  
  
---  
  
### Interview Q2: Employees with same salary  
```sql  
SELECT Salary, COUNT(*) AS EmpCount  
FROM EMPLOYEE  
GROUP BY Salary  
HAVING COUNT(*) > 1;  
```  
  
---  
  
### Interview Q3: Delete duplicate records (keep one)  
```sql  
DELETE e1 FROM EMPLOYEE e1  
INNER JOIN EMPLOYEE e2   
WHERE e1.EmpID > e2.EmpID   
AND e1.Name = e2.Name;  
```  
  
---  
  
### Interview Q4: Display employee name with their manager name  
```sql  
-- First add manager column  
ALTER TABLE EMPLOYEE ADD ManagerID INT;  
  
-- Query  
SELECT e.Name AS Employee, m.Name AS Manager  
FROM EMPLOYEE e  
LEFT JOIN EMPLOYEE m ON e.ManagerID = m.EmpID;  
```  
  
---  
  
### Interview Q5: Departments with no employees  
```sql  
SELECT DeptName   
FROM DEPARTMENT   
WHERE DeptName NOT IN (SELECT DISTINCT Department FROM EMPLOYEE);  
```  
  
---  
  
## Practice Set 14: Complex Queries  
  
### Query 89: Students who haven't issued any book  
```sql  
SELECT Name FROM STUDENT  
WHERE RollNo NOT IN (SELECT DISTINCT RollNo FROM BOOK_ISSUE);  
```  
  
### Query 90: Books never issued  
```sql  
SELECT Title FROM BOOKS  
WHERE BookID NOT IN (SELECT DISTINCT BookID FROM BOOK_ISSUE);  
```  
  
### Query 91: Students with more than one book  
```sql  
SELECT STUDENT.Name, COUNT(*) AS BooksIssued  
FROM STUDENT  
JOIN BOOK_ISSUE ON STUDENT.RollNo = BOOK_ISSUE.RollNo  
GROUP BY STUDENT.Name  
HAVING COUNT(*) > 1;  
```  
  
### Query 92: Most issued book  
```sql  
SELECT BOOKS.Title, COUNT(*) AS IssueCount  
FROM BOOKS  
JOIN BOOK_ISSUE ON BOOKS.BookID = BOOK_ISSUE.BookID  
GROUP BY BOOKS.Title  
ORDER BY IssueCount DESC  
LIMIT 1;  
```  
  
### Query 93: Department with highest average salary  
```sql  
SELECT Department, AVG(Salary) AS AvgSalary  
FROM EMPLOYEE  
GROUP BY Department  
ORDER BY AvgSalary DESC  
LIMIT 1;  
```  
  
### Query 94: Products with stock less than 30  
```sql  
SELECT ProductName, Stock   
FROM PRODUCTS   
WHERE Stock < 30;  
```  
  
### Query 95: Customer with most orders  
```sql  
SELECT CUSTOMERS.CustomerName, COUNT(*) AS OrderCount  
FROM CUSTOMERS  
JOIN ORDERS ON CUSTOMERS.CustomerID = ORDERS.CustomerID  
GROUP BY CUSTOMERS.CustomerName  
ORDER BY OrderCount DESC  
LIMIT 1;  
```  
  
---  
  
## Practice Set 15: Date Functions  
  
### Query 96: Books issued in January 2024  
```sql  
SELECT * FROM BOOK_ISSUE   
WHERE MONTH(IssueDate) = 1 AND YEAR(IssueDate) = 2024;  
```  
  
### Query 97: Books issued in last 30 days  
```sql  
SELECT * FROM BOOK_ISSUE   
WHERE IssueDate >= DATE_SUB(CURDATE(), INTERVAL 30 DAY);  
```  
  
### Query 98: Employees joined this year  
```sql  
SELECT Name, JoinDate   
FROM EMPLOYEE   
WHERE YEAR(JoinDate) = YEAR(CURDATE());  
```  
  
### Query 99: Calculate days since issue  
```sql  
SELECT STUDENT.Name, BOOKS.Title,   
       DATEDIFF(CURDATE(), BOOK_ISSUE.IssueDate) AS DaysSinceIssue  
FROM BOOK_ISSUE  
JOIN STUDENT ON BOOK_ISSUE.RollNo = STUDENT.RollNo  
JOIN BOOKS ON BOOK_ISSUE.BookID = BOOKS.BookID  
WHERE BOOK_ISSUE.ReturnDate IS NULL;  
```  
  
### Query 100: Orders this month  
```sql  
SELECT * FROM ORDERS   
WHERE MONTH(OrderDate) = MONTH(CURDATE())   
AND YEAR(OrderDate) = YEAR(CURDATE());  
```  
  
---  
  
## Quick Command Reference  
  
### Database Operations  
```sql  
CREATE DATABASE dbname;  
DROP DATABASE dbname;  
USE dbname;  
SHOW DATABASES;  
```  
  
### Table Operations  
```sql  
CREATE TABLE tablename (...);  
DROP TABLE tablename;  
ALTER TABLE tablename ADD column datatype;  
ALTER TABLE tablename DROP COLUMN column;  
DESC tablename;  
SHOW TABLES;  
```  
  
### Data Operations  
```sql  
INSERT INTO table VALUES (...);  
UPDATE table SET col=val WHERE condition;  
DELETE FROM table WHERE condition;  
SELECT * FROM table WHERE condition;  
```  
  
### Aggregate Functions  
```sql  
COUNT(*), SUM(col), AVG(col), MAX(col), MIN(col)  
```  
  
### Grouping  
```sql  
SELECT col, COUNT(*) FROM table GROUP BY col;  
SELECT col, COUNT(*) FROM table GROUP BY col HAVING COUNT(*) > n;  
```  
  
### Sorting  
```sql  
ORDER BY col ASC;  
ORDER BY col DESC;  
LIMIT n;  
```  
  
### Joins  
```sql  
SELECT * FROM t1 JOIN t2 ON t1.col = t2.col;  
SELECT * FROM t1, t2 WHERE t1.col = t2.col;  
```  
  
---  
  
## Common Mistakes to Avoid  
  
### Mistake 1: UPDATE/DELETE without WHERE  
```sql  
-- WRONG (updates all rows!)  
UPDATE STUDENT SET Marks = 90;  
  
-- CORRECT  
UPDATE STUDENT SET Marks = 90 WHERE RollNo = 101;  
```  
  
### Mistake 2: Forgetting COMMIT in transactions  
```sql  
START TRANSACTION;  
DELETE FROM STUDENT WHERE RollNo = 101;  
COMMIT; -- Don't forget this!  
```  
  
### Mistake 3: GROUP BY with wrong columns  
```sql  
-- WRONG  
SELECT Name, Class, AVG(Marks) FROM STUDENT GROUP BY Class;  
  
-- CORRECT  
SELECT Class, AVG(Marks) FROM STUDENT GROUP BY Class;  
```  
  
### Mistake 4: HAVING without GROUP BY  
```sql  
-- WRONG  
SELECT * FROM STUDENT HAVING Marks > 80;  
  
-- CORRECT  
SELECT * FROM STUDENT WHERE Marks > 80;  
```  
  
---  
  
## Practice Challenge: Build Your Own Database  
  
**Task:** Create a database for Indian Railways Ticket Booking  
  
**Requirements:**  
1. TRAINS table (TrainNo, TrainName, Source, Destination)  
2. PASSENGERS table (PNR, Name, Age, Gender)  
3. BOOKINGS table (PNR, TrainNo, Date, Seat)  
  
**Write 10 queries:**  
1. List all trains from Mumbai to Delhi  
2. Count total bookings  
3. Find passenger with specific PNR  
4. Most booked train  
5. Bookings on specific date  
6. Average age of passengers  
7. Gender-wise passenger count  
8. Trains with more than 10 bookings  
9. Cancel booking (delete)  
10. Update passenger details  
  
---  
  
## Final Exam Practice Set  
  
### Solve These 20 Questions  
  
1. Display all students with marks between 80 and 90  
2. Count books by each author  
3. Display 5 most expensive books  
4. Students whose names start with 'R' or 'M'  
5. Department-wise maximum salary  
6. Employees who joined before 2020  
7. Products with stock less than average stock  
8. Customer names who ordered mobiles  
9. Total revenue from each category  
10. Books issued but not returned  
11. Update salary: 20% hike for IT dept  
12. Delete products with 0 stock  
13. Display employees earning more than dept average  
14. Find duplicate phone numbers in customers  
15. List cities with more than 3 employees  
16. Books issued in last 60 days  
17. Second highest priced product  
18. Employees with 'Kumar' in name  
19. Total orders per city  
20. Products never ordered  
  
**Solutions at end of document**  
  
---  
  
## Performance Tips  
  
1. Use **indexes** on frequently searched columns  
2. Use **LIMIT** when you need only few rows  
3. Avoid **SELECT *** - specify columns  
4. Use **WHERE** before **GROUP BY** when possible  
5. Use **EXPLAIN** to analyze queries  
  
```sql  
-- Create index  
CREATE INDEX idx_marks ON STUDENT(Marks);  
  
-- Analyze query  
EXPLAIN SELECT * FROM STUDENT WHERE Marks > 80;  
```  
  
---  
  
## Quick Practice Test (Time: 30 mins)  
  
**Setup:**  
```sql  
CREATE TABLE TEST_STUDENT (  
    ID INT PRIMARY KEY,  
    Name VARCHAR(50),  
    Subject VARCHAR(30),  
    Marks INT  
);  
  
INSERT INTO TEST_STUDENT VALUES  
(1, 'Amit', 'Math', 85),  
(2, 'Priya', 'Science', 90),  
(3, 'Amit', 'Science', 78),  
(4, 'Raj', 'Math', 92),  
(5, 'Priya', 'Math', 88);  
```  
  
**Questions:**  
1. Display all students  
2. Amit's marks in all subjects  
3. Average marks per subject  
4. Highest marks in Math  
5. Students scoring > 85  
6. Subject-wise topper  
7. Students who took both subjects  
8. Total marks per student  
  
---  
  
## Solutions to Final Exam Practice Set  
  
```sql  
-- 1  
SELECT * FROM STUDENT WHERE Marks BETWEEN 80 AND 90;  
  
-- 2  
SELECT Author, COUNT(*) FROM BOOKS GROUP BY Author;  
  
-- 3  
SELECT Title, Price FROM BOOKS ORDER BY Price DESC LIMIT 5;  
  
-- 4  
SELECT * FROM STUDENT WHERE Name LIKE 'R%' OR Name LIKE 'M%';  
  
-- 5  
SELECT Department, MAX(Salary) FROM EMPLOYEE GROUP BY Department;  
  
-- 6  
SELECT * FROM EMPLOYEE WHERE JoinDate < '2020-01-01';  
  
-- 7  
SELECT * FROM PRODUCTS WHERE Stock < (SELECT AVG(Stock) FROM PRODUCTS);  
  
-- 8  
SELECT DISTINCT CustomerName FROM CUSTOMERS   
JOIN ORDERS ON CUSTOMERS.CustomerID = ORDERS.CustomerID  
JOIN PRODUCTS ON ORDERS.ProductID = PRODUCTS.ProductID  
WHERE Category = 'Mobile';  
  
-- 9  
SELECT Category, SUM(Price * Stock) FROM PRODUCTS GROUP BY Category;  
  
-- 10  
SELECT Title FROM BOOKS  
JOIN BOOK_ISSUE ON BOOKS.BookID = BOOK_ISSUE.BookID  
WHERE ReturnDate IS NULL;  
  
-- 11  
UPDATE EMPLOYEE SET Salary = Salary * 1.20 WHERE Department = 'IT';  
  
-- 12  
DELETE FROM PRODUCTS WHERE Stock = 0;  
  
-- 13  
SELECT Name, Salary FROM EMPLOYEE e1  
WHERE Salary > (SELECT AVG(Salary) FROM EMPLOYEE e2 WHERE e1.Department = e2.Department);  
  
-- 14  
SELECT Phone, COUNT(*) FROM CUSTOMERS GROUP BY Phone HAVING COUNT(*) > 1;  
  
-- 15  
SELECT City, COUNT(*) FROM EMPLOYEE GROUP BY City HAVING COUNT(*) > 3;  
  
-- 16  
SELECT * FROM BOOK_ISSUE   
WHERE IssueDate >= DATE_SUB(CURDATE(), INTERVAL 60 DAY);  
  
-- 17  
SELECT ProductName, Price FROM PRODUCTS   
ORDER BY Price DESC LIMIT 1 OFFSET 1;  
  
-- 18  
SELECT * FROM EMPLOYEE WHERE Name LIKE '%Kumar%';  
  
-- 19  
SELECT City, COUNT(*) FROM CUSTOMERS   
JOIN ORDERS ON CUSTOMERS.CustomerID = ORDERS.CustomerID  
GROUP BY City;  
  
-- 20  
SELECT ProductName FROM PRODUCTS  
WHERE ProductID NOT IN (SELECT DISTINCT ProductID FROM ORDERS);  
```  
  
---  
  
## Done! 🎯  
  
**You now have 100+ queries to practice!**  
  
**Next Steps:**  
1. Run all queries yourself  
2. Modify data and re-run  
3. Create your own scenarios  
4. Time yourself (interview prep)  
5. Try without looking at solutions  
  
**Remember:**  
- Practice daily  
- Type queries (don't copy-paste)  
- Understand output  
- Try variations  
  
**Good luck with your exams and interviews!** 💪  
  
---  
  
**Pro Tip:** Keep this document open while practicing. Try each query, understand the output, then move to next!