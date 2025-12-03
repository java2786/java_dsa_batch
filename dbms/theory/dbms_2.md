# CBSE Database Management - Part 2  
## SQL Basics and DDL Commands  
  
**Prepared for CBSE Computer Science Students (Class 11/12)**  
  
---  
  
## What You'll Learn in Part 2  
  
- Introduction to SQL  
- MySQL DBMS  
- Data Types and Constraints  
- DDL Commands (CREATE, ALTER, DROP)  
- Creating and modifying tables  
- Practical examples  
  
**Study Time:** 90-120 minutes    
**Exam Weightage:** 6-8 marks from this section  
  
---  
  
## Quick Revision Checklist for Part 2  
  
- [ ] SQL full form and purpose clear  
- [ ] Common data types memorized  
- [ ] All constraints understood  
- [ ] CREATE TABLE syntax mastered  
- [ ] ALTER TABLE commands practiced  
- [ ] Difference between DROP and DELETE clear  
  
---  
  
## 9.6 Structured Query Language (SQL)  
  
**Definition:**  
SQL is a standard language used to communicate with relational databases. It allows users to create, retrieve, update, and delete data.  
  
**Full Form:** Structured Query Language  
  
**Pronunciation:** "S-Q-L" or "Sequel" (both are correct)  
  
**Simple Explanation:**  
SQL is like English commands to talk to databases.  
  
**Example:**  
```  
English: "Show me all students from class 12A"  
SQL: SELECT * FROM STUDENT WHERE Class = '12A';  
```  
  
**History Fun Fact:**  
- Developed by IBM in the 1970s  
- Originally called SEQUEL (Structured English Query Language)  
- Later shortened to SQL  
  
**Why Learn SQL?**  
1. Universal language for databases  
2. Used by all major companies  
3. Required for data analysis jobs  
4. Easy to learn and powerful  
  
### 9.6.1 Characteristics of SQL  
  
**1. Easy to Learn**  
- English-like syntax  
- Simple commands  
- Logical structure  
  
**Example:**  
```sql  
SELECT Name FROM STUDENT;  
-- Reads like: "Select name from student table"  
```  
  
**2. Non-Procedural**  
- You specify WHAT to do, not HOW to do  
- Database decides the best way  
  
**Example:**  
```sql  
-- You write:  
SELECT * FROM STUDENT WHERE Marks > 80;  
  
-- Database automatically:  
-- 1. Searches through all records  
-- 2. Filters based on condition  
-- 3. Returns matching results  
-- You don't need to write the steps!  
```  
  
**3. Case Insensitive**  
- SQL keywords can be in any case  
- All these are same:  
  
```sql  
SELECT * FROM STUDENT;  
select * from student;  
SeLeCt * FrOm StUdEnT;  -- This also works!  
```  
  
**CBSE Note:** In exams, you can write in any case, but uppercase for keywords is preferred for readability.  
  
**4. Portable**  
- Works across different DBMS  
- Same SQL commands in MySQL, Oracle, PostgreSQL  
  
**5. Interactive**  
- Get immediate results  
- Type command, see output instantly  
  
### 9.6.2 SQL Commands  
  
SQL commands are divided into different categories based on their purpose:  
  
**1. DDL (Data Definition Language)**  
  
**Purpose:** Define structure of database  
  
Commands:  
- **CREATE** - Create database/table  
- **ALTER** - Modify table structure  
- **DROP** - Delete database/table  
  
**Example:**  
```sql  
CREATE TABLE STUDENT (...);  -- Define structure  
ALTER TABLE STUDENT ...;     -- Modify structure  
DROP TABLE STUDENT;          -- Remove table  
```  
  
**Memory Trick:** DDL = Define, Design, Delete structure  
  
---  
  
**2. DML (Data Manipulation Language)**  
  
**Purpose:** Manipulate data in tables  
  
Commands:  
- **INSERT** - Add new records  
- **UPDATE** - Modify existing records  
- **DELETE** - Remove records  
- **SELECT** - Retrieve records  
  
**Example:**  
```sql  
INSERT INTO STUDENT VALUES (...);  -- Add data  
UPDATE STUDENT SET ...;            -- Modify data  
DELETE FROM STUDENT WHERE ...;     -- Remove data  
SELECT * FROM STUDENT;             -- View data  
```  
  
**Memory Trick:** DML = Deal with Data  
  
---  
  
**3. DCL (Data Control Language)** - Not in CBSE detailed syllabus  
  
**Purpose:** Control access to data  
  
Commands:  
- **GRANT** - Give permissions  
- **REVOKE** - Remove permissions  
  
---  
  
**4. TCL (Transaction Control Language)** - Not in CBSE detailed syllabus  
  
**Purpose:** Manage transactions  
  
Commands:  
- **COMMIT** - Save changes  
- **ROLLBACK** - Undo changes  
  
---  
  
**CBSE Focus Areas:**  
  
**Most Important:** DDL and DML commands  
  
**In Exams, You'll See:**  
- CREATE TABLE questions (3-4 marks)  
- INSERT, UPDATE, DELETE queries (2-3 marks)  
- SELECT queries with conditions (3-5 marks)  
  
---  
  
## 9.7 MySQL DBMS  
  
**What is MySQL?**  
MySQL is a popular open-source Relational Database Management System that uses SQL.  
  
**Key Features:**  
- Free and open-source  
- Fast and reliable  
- Easy to use  
- Cross-platform (Windows, Linux, Mac)  
  
**Who Uses MySQL?**  
- Facebook  
- Twitter  
- YouTube  
- Flipkart  
- Wikipedia  
- Netflix  
  
**MySQL in Class 12:**  
You'll use MySQL to practice SQL commands and connect with Python.  
  
**Starting MySQL:**  
  
**Windows:**  
```  
Start Menu → MySQL → MySQL Command Line Client  
Enter password when prompted  
```  
  
**Command Line:**  
```  
mysql -u root -p  
Enter password: ****  
```  
  
**Success Message:**  
```  
Welcome to the MySQL monitor.  
mysql>  
```  
  
**Basic MySQL Commands:**  
  
```sql  
-- Show version  
SELECT VERSION();  
  
-- Show current date  
SELECT CURDATE();  
  
-- Show current time  
SELECT CURTIME();  
  
-- Exit MySQL  
EXIT;  
```  
  
**CBSE Note:** You don't need to know MySQL installation or configuration for exams. Focus on SQL commands only.  
  
---  
  
## 9.8 Data Types in MySQL  
  
**What are Data Types?**  
Data types specify what kind of data can be stored in a column.  
  
**Why Important?**  
- Ensures data validity  
- Saves storage space  
- Improves performance  
  
**Think of it as:** Data type is like a container - you choose the right container for the right item.  
  
### Categories of Data Types  
  
**1. Numeric Data Types**  
**2. String Data Types**  
**3. Date and Time Data Types**  
  
---  
  
### 1. Numeric Data Types  
  
**INT / INTEGER**  
- **Purpose:** Store whole numbers  
- **Range:** -2,147,483,648 to 2,147,483,647  
- **Size:** 4 bytes  
  
**Example:**  
```sql  
Age INT           -- Can store: 15, 20, 25  
RollNo INT        -- Can store: 101, 102, 103  
```  
  
**Use Cases:**  
- Student roll numbers  
- Employee IDs  
- Quantities  
- Ages  
  
---  
  
**FLOAT**  
- **Purpose:** Decimal numbers (approximate)  
- **Precision:** Up to 7 decimal places  
- **Size:** 4 bytes  
  
**Example:**  
```sql  
Height FLOAT      -- Can store: 5.8, 6.2  
Percentage FLOAT  -- Can store: 85.75, 92.5  
```  
  
---  
  
**DECIMAL(m, d) / NUMERIC(m, d)**  
- **Purpose:** Exact decimal numbers  
- **m:** Total digits  
- **d:** Digits after decimal point  
  
**Example:**  
```sql  
Salary DECIMAL(10,2)   -- Can store: 45000.50, 123456.75  
Price DECIMAL(8,2)     -- Can store: 1999.99, 50000.00  
```  
  
**Breakdown:**  
```  
DECIMAL(10,2)  
   ↑    ↑  
   |    └─ 2 digits after decimal  
   └────── 10 total digits (8 before, 2 after)  
  
Example: 12345678.90  
         ^^^^^^^^  ^^  
         8 digits  2 digits  
```  
  
**Use Cases:**  
- Money/Salary (must be exact)  
- Product prices  
- Bank balances  
  
**FLOAT vs DECIMAL:**  
```sql  
-- Use FLOAT for approximate values  
Height FLOAT        -- 5.8 feet is approximate  
  
-- Use DECIMAL for exact values  
Salary DECIMAL(10,2)  -- 45000.50 must be exact  
```  
  
---  
  
### 2. String Data Types  
  
**CHAR(size)**  
- **Purpose:** Fixed-length string  
- **Size:** 1 to 255 characters  
- **Storage:** Always uses specified size  
  
**Example:**  
```sql  
Gender CHAR(1)      -- Always 1 character: 'M' or 'F'  
Grade CHAR(2)       -- Always 2 characters: 'A+', 'B', 'C'  
```  
  
**How it Works:**  
```sql  
Name CHAR(10)  
  
Storing 'Ram':  
Actual: 'Ram       '  -- Padded with spaces to make 10  
        ^^^-------  
        3  7 spaces  
```  
  
---  
  
**VARCHAR(size)**  
- **Purpose:** Variable-length string  
- **Size:** 1 to 65,535 characters  
- **Storage:** Uses only needed space  
  
**Example:**  
```sql  
Name VARCHAR(50)     -- Can store 5 to 50 characters  
Email VARCHAR(100)   -- Flexible length  
Address VARCHAR(200)  
```  
  
**How it Works:**  
```sql  
Name VARCHAR(50)  
  
Storing 'Ram':  
Actual: 'Ram'  -- Uses only 3 characters + 1 byte for length  
        ^^^  
  
Storing 'Ramesh':  
Actual: 'Ramesh'  -- Uses 6 characters + 1 byte  
        ^^^^^^  
```  
  
**CHAR vs VARCHAR:**  
  
| Aspect    | CHAR(10)        | VARCHAR(10)     |  
|-----------|-----------------|-----------------|  
| 'Ram'     | 'Ram       ' (10 bytes) | 'Ram' (4 bytes) |  
| 'Suresh'  | 'Suresh    ' (10 bytes) | 'Suresh' (7 bytes) |  
| Speed     | Faster          | Slightly slower |  
| Use When  | Fixed length    | Variable length |  
  
**Examples:**  
```sql  
-- Use CHAR for fixed length  
PinCode CHAR(6)         -- Always 6 digits: 411001  
StateCode CHAR(2)       -- Always 2 letters: MH, DL  
  
-- Use VARCHAR for variable length  
Name VARCHAR(50)        -- Can be Ram, Suresh, Mahendra  
Email VARCHAR(100)      -- Can be short or long  
```  
  
---  
  
**TEXT**  
- **Purpose:** Large text data  
- **Size:** Up to 65,535 characters  
- **Use:** Articles, descriptions, comments  
  
**Example:**  
```sql  
Description TEXT  
Essay TEXT  
Comments TEXT  
```  
  
---  
  
### 3. Date and Time Data Types  
  
**DATE**  
- **Format:** YYYY-MM-DD  
- **Range:** '1000-01-01' to '9999-12-31'  
  
**Example:**  
```sql  
BirthDate DATE      -- '2005-03-15'  
JoinDate DATE       -- '2024-01-20'  
```  
  
**Example Values:**  
```sql  
'2024-01-15'  -- January 15, 2024  
'2005-12-25'  -- December 25, 2005  
```  
  
---  
  
**TIME**  
- **Format:** HH:MM:SS  
- **Range:** '-838:59:59' to '838:59:59'  
  
**Example:**  
```sql  
ArrivalTime TIME    -- '09:30:00'  
DepartureTime TIME  -- '17:45:30'  
```  
  
---  
  
**DATETIME**  
- **Format:** YYYY-MM-DD HH:MM:SS  
- **Combines:** Date and Time  
  
**Example:**  
```sql  
OrderDateTime DATETIME    -- '2024-01-15 14:30:00'  
```  
  
---  
  
### Complete Data Type Example  
  
```sql  
CREATE TABLE STUDENT (  
    RollNo INT,                    -- Whole number  
    Name VARCHAR(50),              -- Variable text  
    Class CHAR(3),                 -- Fixed text  
    Marks DECIMAL(5,2),            -- Exact decimal  
    Percentage FLOAT,              -- Approximate decimal  
    BirthDate DATE,                -- Date only  
    AdmissionTime TIME,            -- Time only  
    RegistrationDateTime DATETIME, -- Both date and time  
    Address TEXT                   -- Large text  
);  
```  
  
**CBSE Pattern Question (2 Marks):**  
Q. Suggest appropriate data type for:  
(a) Student phone number  
(b) Product price  
(c) Date of birth  
  
**Answer:**  
```  
(a) VARCHAR(15) or CHAR(10)  
(b) DECIMAL(10,2)  
(c) DATE  
```  
  
**Common Mistake:**  
```sql  
-- WRONG: Using INT for phone numbers  
Phone INT  -- Problem: Cannot store numbers starting with 0  
  
-- CORRECT: Using VARCHAR  
Phone VARCHAR(15)  -- Can store: 0987654321  
```  
  
---  
  
## 9.9 Constraints in MySQL  
  
**What are Constraints?**  
Rules applied to columns to ensure data accuracy, integrity, and consistency.  
  
**Why Use Constraints?**  
- Prevent invalid data  
- Maintain data quality  
- Enforce business rules  
  
**Think of it as:** Traffic rules for data - everyone must follow them!  
  
### Important Constraints for CBSE  
  
**1. NOT NULL**  
**2. UNIQUE**  
**3. PRIMARY KEY**  
**4. FOREIGN KEY**  
**5. DEFAULT**  
**6. CHECK**  
  
---  
  
### 1. NOT NULL Constraint  
  
**Purpose:** Column cannot have NULL value (must have data)  
  
**Syntax:**  
```sql  
column_name datatype NOT NULL  
```  
  
**Example:**  
```sql  
CREATE TABLE STUDENT (  
    RollNo INT NOT NULL,        -- Must provide RollNo  
    Name VARCHAR(50) NOT NULL,  -- Must provide Name  
    Email VARCHAR(50)           -- Email can be NULL  
);  
```  
  
**Inserting Data:**  
```sql  
-- VALID  
INSERT INTO STUDENT VALUES (101, 'Suresh', 's@gmail.com');  
INSERT INTO STUDENT VALUES (102, 'Ramesh', NULL);  -- Email can be NULL  
  
-- INVALID (will give error)  
INSERT INTO STUDENT VALUES (NULL, 'Dinesh', 'd@gmail.com');    
-- Error: RollNo cannot be NULL  
  
INSERT INTO STUDENT VALUES (103, NULL, 'm@gmail.com');  
-- Error: Name cannot be NULL  
```  
  
**Real Example - Employee:**  
```sql  
CREATE TABLE EMPLOYEE (  
    EmpID INT NOT NULL,         -- Must have ID  
    Name VARCHAR(50) NOT NULL,  -- Must have name  
    Email VARCHAR(50),          -- Optional  
    Phone VARCHAR(15)           -- Optional  
);  
```  
  
---  
  
### 2. UNIQUE Constraint  
  
**Purpose:** All values in column must be different (no duplicates)  
  
**Syntax:**  
```sql  
column_name datatype UNIQUE  
```  
  
**Example:**  
```sql  
CREATE TABLE STUDENT (  
    RollNo INT UNIQUE,      -- Each student has different RollNo  
    Email VARCHAR(50) UNIQUE,  -- Each email is different  
    Name VARCHAR(50)        -- Names can be same  
);  
```  
  
**Inserting Data:**  
```sql  
-- VALID  
INSERT INTO STUDENT VALUES (101, 's@gmail.com', 'Suresh');  
INSERT INTO STUDENT VALUES (102, 'r@gmail.com', 'Ramesh');  
INSERT INTO STUDENT VALUES (103, 'd@gmail.com', 'Suresh');  -- Same name OK  
  
-- INVALID (will give error)  
INSERT INTO STUDENT VALUES (101, 'm@gmail.com', 'Mukesh');  
-- Error: RollNo 101 already exists  
  
INSERT INTO STUDENT VALUES (104, 's@gmail.com', 'Kamlesh');  
-- Error: Email s@gmail.com already exists  
```  
  
**UNIQUE vs NOT NULL:**  
```sql  
Email VARCHAR(50) UNIQUE  -- Can have NULL, but no duplicates  
  
-- One NULL is allowed  
Row 1: Email = 's@gmail.com'  
Row 2: Email = 'r@gmail.com'  
Row 3: Email = NULL  -- OK  
```  
  
---  
  
### 3. PRIMARY KEY Constraint  
  
**Purpose:** Uniquely identifies each row (NOT NULL + UNIQUE combined)  
  
**Syntax:**  
```sql  
column_name datatype PRIMARY KEY  
```  
  
**Example:**  
```sql  
CREATE TABLE STUDENT (  
    RollNo INT PRIMARY KEY,     -- Unique + Not NULL  
    Name VARCHAR(50),  
    Class VARCHAR(5)  
);  
```  
  
**Rules:**  
1. Only ONE Primary Key per table  
2. Cannot be NULL  
3. Cannot have duplicates  
4. Best practice: Use it on ID columns  
  
**Inserting Data:**  
```sql  
-- VALID  
INSERT INTO STUDENT VALUES (101, 'Suresh', '12A');  
INSERT INTO STUDENT VALUES (102, 'Ramesh', '12B');  
  
-- INVALID  
INSERT INTO STUDENT VALUES (101, 'Dinesh', '12A');  
-- Error: Duplicate Primary Key  
  
INSERT INTO STUDENT VALUES (NULL, 'Mukesh', '12B');  
-- Error: Primary Key cannot be NULL  
```  
  
**Multiple Columns as Primary Key (Composite Key):**  
```sql  
CREATE TABLE MARKS (  
    RollNo INT,  
    Subject VARCHAR(30),  
    Marks INT,  
    PRIMARY KEY (RollNo, Subject)  -- Combination is unique  
);  
```  
  
**Example:**  
```sql  
-- VALID (Different combinations)  
(101, 'Math', 85)  
(101, 'Physics', 90)  -- Same RollNo, different Subject OK  
(102, 'Math', 88)     -- Same Subject, different RollNo OK  
  
-- INVALID  
(101, 'Math', 95)  -- Error: (101, Math) already exists  
```  
  
---  
  
### 4. FOREIGN KEY Constraint  
  
**Purpose:** Links two tables together, maintains referential integrity  
  
**Syntax:**  
```sql  
column_name datatype,  
FOREIGN KEY (column_name) REFERENCES parent_table(parent_column)  
```  
  
**Example:**  
```sql  
-- Parent Table  
CREATE TABLE STUDENT (  
    RollNo INT PRIMARY KEY,  
    Name VARCHAR(50)  
);  
  
-- Child Table  
CREATE TABLE MARKS (  
    ExamID INT PRIMARY KEY,  
    RollNo INT,  
    Subject VARCHAR(30),  
    Marks INT,  
    FOREIGN KEY (RollNo) REFERENCES STUDENT(RollNo)  
);  
```  
  
**How it Works:**  
```sql  
-- First insert in STUDENT (parent)  
INSERT INTO STUDENT VALUES (101, 'Suresh');  
INSERT INTO STUDENT VALUES (102, 'Ramesh');  
  
-- Then insert in MARKS (child)  
INSERT INTO MARKS VALUES (1, 101, 'Math', 85);  -- OK (101 exists)  
INSERT INTO MARKS VALUES (2, 102, 'Physics', 90);  -- OK (102 exists)  
  
-- INVALID  
INSERT INTO MARKS VALUES (3, 999, 'Math', 85);  
-- Error: RollNo 999 doesn't exist in STUDENT table  
```  
  
**Real Example - Library:**  
```sql  
CREATE TABLE STUDENT (  
    RollNo INT PRIMARY KEY,  
    Name VARCHAR(50)  
);  
  
CREATE TABLE BOOK_ISSUE (  
    IssueID INT PRIMARY KEY,  
    RollNo INT,  
    BookName VARCHAR(100),  
    IssueDate DATE,  
    FOREIGN KEY (RollNo) REFERENCES STUDENT(RollNo)  
);  
```  
  
**Benefits:**  
- Prevents invalid data  
- Only existing students can issue books  
- Maintains data integrity  
  
---  
  
### 5. DEFAULT Constraint  
  
**Purpose:** Sets default value if no value is provided  
  
**Syntax:**  
```sql  
column_name datatype DEFAULT default_value  
```  
  
**Example:**  
```sql  
CREATE TABLE STUDENT (  
    RollNo INT PRIMARY KEY,  
    Name VARCHAR(50),  
    City VARCHAR(30) DEFAULT 'Pune',  
    Status VARCHAR(10) DEFAULT 'Active'  
);  
```  
  
**Inserting Data:**  
```sql  
-- Providing all values  
INSERT INTO STUDENT VALUES (101, 'Suresh', 'Mumbai', 'Active');  
  
-- Not providing City and Status (will use defaults)  
INSERT INTO STUDENT (RollNo, Name) VALUES (102, 'Ramesh');  
-- Result: RollNo=102, Name='Ramesh', City='Pune', Status='Active'  
  
-- Providing City but not Status  
INSERT INTO STUDENT (RollNo, Name, City) VALUES (103, 'Dinesh', 'Chennai');  
-- Result: RollNo=103, Name='Dinesh', City='Chennai', Status='Active'  
```  
  
**Real Example - Order Status:**  
```sql  
CREATE TABLE ORDERS (  
    OrderID INT PRIMARY KEY,  
    CustomerName VARCHAR(50),  
    Status VARCHAR(20) DEFAULT 'Processing',  
    OrderDate DATE DEFAULT CURDATE()  -- Current date  
);  
  
-- Insert without status  
INSERT INTO ORDERS (OrderID, CustomerName) VALUES (5001, 'Mukesh');  
-- Status automatically set to 'Processing'  
-- OrderDate automatically set to today's date  
```  
  
---  
  
### 6. CHECK Constraint  
  
**Purpose:** Ensures values meet specific condition  
  
**Syntax:**  
```sql  
column_name datatype CHECK (condition)  
```  
  
**Example:**  
```sql  
CREATE TABLE STUDENT (  
    RollNo INT PRIMARY KEY,  
    Name VARCHAR(50),  
    Age INT CHECK (Age >= 15 AND Age <= 20),  
    Marks INT CHECK (Marks >= 0 AND Marks <= 100),  
    Gender CHAR(1) CHECK (Gender IN ('M', 'F'))  
);  
```  
  
**Inserting Data:**  
```sql  
-- VALID  
INSERT INTO STUDENT VALUES (101, 'Suresh', 17, 85, 'M');  
INSERT INTO STUDENT VALUES (102, 'Ramesh', 18, 90, 'M');  
  
-- INVALID  
INSERT INTO STUDENT VALUES (103, 'Dinesh', 12, 85, 'M');  
-- Error: Age 12 fails CHECK (Age >= 15)  
  
INSERT INTO STUDENT VALUES (104, 'Mukesh', 17, 105, 'M');  
-- Error: Marks 105 fails CHECK (Marks <= 100)  
  
INSERT INTO STUDENT VALUES (105, 'Kamlesh', 17, 85, 'X');  
-- Error: Gender 'X' fails CHECK (Gender IN ('M', 'F'))  
```  
  
**More Examples:**  
```sql  
-- Salary must be positive  
Salary DECIMAL(10,2) CHECK (Salary > 0)  
  
-- Discount between 0 and 100  
Discount INT CHECK (Discount >= 0 AND Discount <= 100)  
  
-- Valid email format (contains @)  
Email VARCHAR(50) CHECK (Email LIKE '%@%')  
```  
  
---  
  
### Multiple Constraints on One Column  
  
```sql  
CREATE TABLE EMPLOYEE (  
    EmpID INT PRIMARY KEY,  
    Name VARCHAR(50) NOT NULL,  
    Email VARCHAR(50) NOT NULL UNIQUE,  
    Salary DECIMAL(10,2) CHECK (Salary >= 15000) DEFAULT 20000,  
    Age INT CHECK (Age >= 18) NOT NULL  
);  
```  
  
**Breakdown:**  
- **EmpID:** Primary Key (Unique + Not NULL)  
- **Name:** Must provide (Not NULL)  
- **Email:** Must provide + Must be unique  
- **Salary:** Must be >= 15000, Default is 20000  
- **Age:** Must provide + Must be >= 18  
  
---  
  
## 9.10 SQL Commands for Data Definition (DDL)  
  
DDL commands define the structure of database objects.  
  
### 9.10.1 Creating a Database  
  
**Syntax:**  
```sql  
CREATE DATABASE database_name;  
```  
  
**Example:**  
```sql  
CREATE DATABASE SchoolDB;  
```  
  
**Real Examples:**  
```sql  
CREATE DATABASE LibrarySystem;  
CREATE DATABASE EmployeeManagement;  
CREATE DATABASE RailwayReservation;  
```  
  
**CBSE Note:** Simple, straightforward command. Just remember the syntax.  
  
---  
  
### 9.10.2 Showing Databases  
  
**Syntax:**  
```sql  
SHOW DATABASES;  
```  
  
**Example Output:**  
```  
+--------------------+  
| Database           |  
+--------------------+  
| SchoolDB           |  
| LibrarySystem      |  
| EmployeeManagement |  
| mysql              |  
| information_schema |  
+--------------------+  
```  
  
---  
  
### 9.10.3 Dropping a Database  
  
**Syntax:**  
```sql  
DROP DATABASE database_name;  
```  
  
**Example:**  
```sql  
DROP DATABASE SchoolDB;  
```  
  
**WARNING:** This permanently deletes the entire database and all its tables. Use with extreme caution!  
  
**Real Scenario:**  
```sql  
-- Delete old test database  
DROP DATABASE TestDB;  
```  
  
---  
  
### 9.10.4 Using a Database  
  
**Syntax:**  
```sql  
USE database_name;  
```  
  
**Example:**  
```sql  
USE SchoolDB;  
```  
  
**Why Important?**  
You must select a database before creating tables in it.  
  
**Complete Flow:**  
```sql  
-- Step 1: Create database  
CREATE DATABASE SchoolDB;  
  
-- Step 2: Select database  
USE SchoolDB;  
  
-- Step 3: Now create tables  
CREATE TABLE STUDENT (...);  
```  
  
---  
  
### 9.10.5 Creating a Table  
  
**Basic Syntax:**  
```sql  
CREATE TABLE table_name (  
    column1 datatype constraints,  
    column2 datatype constraints,  
    column3 datatype constraints,  
    ...  
);  
```  
  
**Example 1: Simple Student Table**  
```sql  
CREATE TABLE STUDENT (  
    RollNo INT PRIMARY KEY,  
    Name VARCHAR(50) NOT NULL,  
    Class VARCHAR(5),  
    Marks INT  
);  
```  
  
**Example 2: Employee Table with Multiple Constraints**  
```sql  
CREATE TABLE EMPLOYEE (  
    EmpID INT PRIMARY KEY,  
    Name VARCHAR(50) NOT NULL,  
    Email VARCHAR(50) UNIQUE NOT NULL,  
    Department VARCHAR(30) DEFAULT 'IT',  
    Salary DECIMAL(10,2) CHECK (Salary >= 15000),  
    JoinDate DATE  
);  
```  
  
**Example 3: Books Table (Library System)**  
```sql  
CREATE TABLE BOOKS (  
    BookID INT PRIMARY KEY,  
    Title VARCHAR(100) NOT NULL,  
    Author VARCHAR(50) NOT NULL,  
    Price DECIMAL(8,2) CHECK (Price > 0),  
    Publisher VARCHAR(50),  
    Quantity INT DEFAULT 1  
);  
```  
  
**Example 4: Table with Foreign Key**  
```sql  
-- Parent table  
CREATE TABLE CUSTOMER (  
    CustomerID INT PRIMARY KEY,  
    Name VARCHAR(50) NOT NULL,  
    City VARCHAR(30),  
    Phone VARCHAR(15) UNIQUE  
);  
  
-- Child table with foreign key  
CREATE TABLE ORDERS (  
    OrderID INT PRIMARY KEY,  
    CustomerID INT,  
    ProductName VARCHAR(50),  
    Amount DECIMAL(10,2),  
    OrderDate DATE DEFAULT CURDATE(),  
    FOREIGN KEY (CustomerID) REFERENCES CUSTOMER(CustomerID)  
);  
```  
  
**CBSE Pattern Question (4 Marks):**  
Q. Write SQL command to create table PRODUCT with following structure:  
```  
ProductID - Integer, Primary Key  
ProductName - String of 50 characters, Not Null  
Price - Decimal (8,2), greater than 0  
Quantity - Integer, default 10  
Category - String of 20 characters  
```  
  
**Answer:**  
```sql  
CREATE TABLE PRODUCT (  
    ProductID INT PRIMARY KEY,  
    ProductName VARCHAR(50) NOT NULL,  
    Price DECIMAL(8,2) CHECK (Price > 0),  
    Quantity INT DEFAULT 10,  
    Category VARCHAR(20)  
);  
```  
  
---  
  
### 9.10.6 Viewing a Table Structure  
  
**Syntax:**  
```sql  
DESC table_name;  
-- OR  
DESCRIBE table_name;  
```  
  
**Example:**  
```sql  
DESC STUDENT;  
```  
  
**Output:**  
```  
+--------+-------------+------+-----+---------+-------+  
| Field  | Type        | Null | Key | Default | Extra |  
+--------+-------------+------+-----+---------+-------+  
| RollNo | int         | NO   | PRI | NULL    |       |  
| Name   | varchar(50) | NO   |     | NULL    |       |  
| Class  | varchar(5)  | YES  |     | NULL    |       |  
| Marks  | int         | YES  |     | NULL    |       |  
+--------+-------------+------+-----+---------+-------+  
```  
  
**Understanding Output:**  
- **Field:** Column name  
- **Type:** Data type  
- **Null:** YES = can be NULL, NO = cannot be NULL  
- **Key:** PRI = Primary Key, UNI = Unique  
- **Default:** Default value if any  
  
---  
  
### 9.10.7 Showing Tables  
  
**Syntax:**  
```sql  
SHOW TABLES;  
```  
  
**Example Output:**  
```  
+---------------------+  
| Tables_in_SchoolDB  |  
+---------------------+  
| STUDENT             |  
| EMPLOYEE            |  
| BOOKS               |  
+---------------------+  
```  
  
---  
  
### 9.10.8 Altering Tables  
  
ALTER command is used to modify existing table structure.  
  
**1. Add a New Column**  
  
**Syntax:**  
```sql  
ALTER TABLE table_name ADD column_name datatype;  
```  
  
**Example:**  
```sql  
ALTER TABLE STUDENT ADD Email VARCHAR(50);  
ALTER TABLE STUDENT ADD Phone VARCHAR(15);  
ALTER TABLE STUDENT ADD Address TEXT;  
```  
  
**Result:**  
```  
Before:  
RollNo, Name, Class, Marks  
  
After:  
RollNo, Name, Class, Marks, Email, Phone, Address  
```  
  
---  
  
**2. Modify Existing Column**  
  
**Syntax:**  
```sql  
ALTER TABLE table_name MODIFY column_name new_datatype;  
```  
  
**Example:**  
```sql  
-- Change Marks from INT to DECIMAL  
ALTER TABLE STUDENT MODIFY Marks DECIMAL(5,2);  
  
-- Increase Name size  
ALTER TABLE STUDENT MODIFY Name VARCHAR(100);  
  
-- Make Email NOT NULL  
ALTER TABLE STUDENT MODIFY Email VARCHAR(50) NOT NULL;  
```  
  
---  
  
**3. Drop a Column**  
  
**Syntax:**  
```sql  
ALTER TABLE table_name DROP column_name;  
```  
  
**Example:**  
```sql  
ALTER TABLE STUDENT DROP Email;  
ALTER TABLE STUDENT DROP Phone;  
```  
  
**Result:**  
```  
Before:  
RollNo, Name, Class, Marks, Email, Phone  
  
After:  
RollNo, Name, Class, Marks  
```  
  
---  
  
**4. Add Primary Key**  
  
**Syntax:**  
```sql  
ALTER TABLE table_name ADD PRIMARY KEY (column_name);  
```  
  
**Example:**  
```sql  
ALTER TABLE STUDENT ADD PRIMARY KEY (RollNo);  
```  
  
---  
  
**5. Add Foreign Key**  
  
**Syntax:**  
```sql  
ALTER TABLE table_name   
ADD FOREIGN KEY (column_name) REFERENCES parent_table(parent_column);  
```  
  
**Example:**  
```sql  
ALTER TABLE ORDERS   
ADD FOREIGN KEY (CustomerID) REFERENCES CUSTOMER(CustomerID);  
```  
  
---  
  
**6. Rename Column (MySQL 8.0+)**  
  
**Syntax:**  
```sql  
ALTER TABLE table_name RENAME COLUMN old_name TO new_name;  
```  
  
**Example:**  
```sql  
ALTER TABLE STUDENT RENAME COLUMN Marks TO TotalMarks;  
```  
  
---  
  
**Real Scenario Examples:**  
  
**Scenario 1:** School decides to track student email  
```sql  
ALTER TABLE STUDENT ADD Email VARCHAR(50);  
```  
  
**Scenario 2:** Phone number length too short  
```sql  
ALTER TABLE EMPLOYEE MODIFY Phone VARCHAR(15);  
```  
  
**Scenario 3:** No longer need Fax column  
```sql  
ALTER TABLE EMPLOYEE DROP Fax;  
```  
  
**CBSE Pattern Question (2 Marks):**  
Q. Write SQL command to add a column 'DOB' of type DATE in STUDENT table.  
  
**Answer:**  
```sql  
ALTER TABLE STUDENT ADD DOB DATE;  
```  
  
---  
  
### 9.10.9 Dropping a Table  
  
**Syntax:**  
```sql  
DROP TABLE table_name;  
```  
  
**Example:**  
```sql  
DROP TABLE STUDENT;  
DROP TABLE EMPLOYEE;  
```  
  
**WARNING:** This permanently deletes:  
- Table structure  
- All data in the table  
- Cannot be undone!  
  
**When to Use:**  
- Remove temporary tables  
- Delete old unused tables  
- Start fresh with new structure  
  
**Important Difference:**  
  
```sql  
-- DELETE: Removes data, keeps structure  
DELETE FROM STUDENT;  
-- Table still exists, can insert new data  
  
-- DROP: Removes everything  
DROP TABLE STUDENT;  
-- Table doesn't exist anymore  
```  
  
---  
  
## Practice Questions - Part 2  
  
### 1 Mark Questions  
  
**Q1.** What does DDL stand for?  
  
**Answer:** Data Definition Language  
  
---  
  
**Q2.** Which command is used to add a new column to existing table?  
  
**Answer:** ALTER TABLE ... ADD  
  
---  
  
**Q3.** What is the default value constraint used for?  
  
**Answer:** To set a default value if no value is provided  
  
---  
  
### 2 Mark Questions  
  
**Q4.** Differentiate between CHAR and VARCHAR data types.  
  
**Answer:**  
- CHAR is fixed length, always uses specified size  
- VARCHAR is variable length, uses only needed space  
  
---  
  
**Q5.** Write SQL command to create database named 'CompanyDB'.  
  
**Answer:**  
```sql  
CREATE DATABASE CompanyDB;  
```  
  
---  
  
**Q6.** What is the difference between DROP and DELETE?  
  
**Answer:**  
- DROP removes entire table including structure  
- DELETE removes rows but keeps table structure  
  
---  
  
### 3 Mark Questions  
  
**Q7.** Write SQL commands to:  
(a) Create database SchoolDB  
(b) Use SchoolDB  
(c) Show all databases  
  
**Answer:**  
```sql  
(a) CREATE DATABASE SchoolDB;  
(b) USE SchoolDB;  
(c) SHOW DATABASES;  
```  
  
---  
  
**Q8.** Write SQL command to create table EMPLOYEE with columns:  
EmpID (Primary Key), Name (Not Null), Salary (Decimal with default 20000)  
  
**Answer:**  
```sql  
CREATE TABLE EMPLOYEE (  
    EmpID INT PRIMARY KEY,  
    Name VARCHAR(50) NOT NULL,  
    Salary DECIMAL(10,2) DEFAULT 20000  
);  
```  
  
---  
  
### 4 Mark Questions  
  
**Q9.** Create table PRODUCT with:  
- ProductID (Primary Key, Integer)  
- ProductName (String 50, Not Null)  
- Price (Decimal 8,2, must be positive)  
- Quantity (Integer, default 1)  
  
**Answer:**  
```sql  
CREATE TABLE PRODUCT (  
    ProductID INT PRIMARY KEY,  
    ProductName VARCHAR(50) NOT NULL,  
    Price DECIMAL(8,2) CHECK (Price > 0),  
    Quantity INT DEFAULT 1  
);  
```  
  
---  
  
**Q10.** Consider tables:  
```  
STUDENT (RollNo, Name, Class)  
MARKS (ExamID, RollNo, Subject, Marks)  
```  
Write SQL commands to:  
(a) Create STUDENT table with RollNo as Primary Key  
(b) Create MARKS table with RollNo as Foreign Key  
  
**Answer:**  
```sql  
(a) CREATE TABLE STUDENT (  
    RollNo INT PRIMARY KEY,  
    Name VARCHAR(50),  
    Class VARCHAR(5)  
);  
  
(b) CREATE TABLE MARKS (  
    ExamID INT PRIMARY KEY,  
    RollNo INT,  
    Subject VARCHAR(30),  
    Marks INT,  
    FOREIGN KEY (RollNo) REFERENCES STUDENT(RollNo)  
);  
```  
  
---  
  
## Quick Revision Points  
  
**Data Types to Remember:**  
- INT - Whole numbers  
- DECIMAL(m,d) - Exact decimal  
- VARCHAR(size) - Variable text  
- CHAR(size) - Fixed text  
- DATE - Date only  
- TEXT - Large text  
  
**Constraints to Remember:**  
- NOT NULL - Must have value  
- UNIQUE - No duplicates  
- PRIMARY KEY - Unique + Not NULL  
- FOREIGN KEY - Links tables  
- DEFAULT - Default value  
- CHECK - Condition check  
  
**DDL Commands:**  
- CREATE DATABASE/TABLE  
- ALTER TABLE  
- DROP DATABASE/TABLE  
- DESC/DESCRIBE  
- SHOW DATABASES/TABLES  
- USE DATABASE  
  
---  
  
## Mini Assignment for Part 2  
  
**Create Database Structure for School Library:**  
  
1. Create database 'LibraryDB'  
2. Create table BOOKS with:  
   - BookID (Primary Key)  
   - Title (Not Null)  
   - Author  
   - Price (must be positive)  
   - Quantity (default 5)  
  
3. Create table MEMBERS with:  
   - MemberID (Primary Key)  
   - Name (Not Null)  
   - Class  
   - Phone (Unique)  
  
4. Create table ISSUE with:  
   - IssueID (Primary Key)  
   - BookID (Foreign Key)  
   - MemberID (Foreign Key)  
   - IssueDate (default current date)  
   - ReturnDate  
  
5. Add Email column to MEMBERS table  
6. Display structure of all tables  
  
---  
  
## What's Next?  
  
In **Part 3**, you'll learn:  
- DML Commands (INSERT, UPDATE, DELETE, SELECT)  
- WHERE clause and Operators  
- Aggregate Functions  
- GROUP BY and HAVING  
- Joins  
- Python-MySQL Connectivity  
  
**Practice Before Moving Ahead:**  
- Write 5 CREATE TABLE commands  
- Practice ALTER TABLE with different modifications  
- Understand each constraint clearly  
  
---  
  
**End of Part 2**  
  
**Continue to Part 3 for DML Commands and Query Writing!**  
  
---  
  
**Prepared with care for CBSE Students**