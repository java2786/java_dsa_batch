# CBSE Database Management - Part 1  
## Database Concepts, DBMS, and Keys  
  
**Prepared for CBSE Computer Science Students (Class 11/12)**  
  
---  
  
## What You'll Learn in Part 1  
  
- Database and DBMS basics  
- Why we need DBMS  
- Relational Data Model  
- All 5 types of Keys (Very Important!)  
- Real-world examples from Indian context  
  
**Study Time:** 60-90 minutes    
**Exam Weightage:** 4-6 marks from this section  
  
---  
  
## Quick Revision Checklist for Part 1  
  
- [ ] Database definition clear  
- [ ] DBMS advantages memorized (at least 3)  
- [ ] Relational model terms understood  
- [ ] All 5 keys mastered (Most Important!)  
- [ ] Difference between keys clear  
  
---  
  
## 9.1 Database  
  
**Definition:**  
A database is an organized collection of structured data stored electronically in a computer system that allows easy access, management, and updating.  
  
**Real-Life Example:**  
Think of your school library. Instead of keeping student records on paper, imagine all information stored digitally:  
- Student details (Name, Class, Roll No)  
- Book details (Title, Author, ISBN)  
- Issue/Return records  
  
**Simple Analogy:**  
Database = Digital Filing Cabinet where everything is organized and easy to find  
  
**Traditional System vs Database:**  
  
**Without Database (Paper Records):**  
- Student registers in different files  
- Difficult to search  
- Can get lost or damaged  
- Time-consuming updates  
  
**With Database:**  
- All data in one place  
- Quick search (find Suresh's marks in seconds)  
- Safe and secure  
- Easy updates  
  
**Real Example - Indian Railways:**  
Instead of maintaining passenger lists on paper at each station, Indian Railways uses a centralized database where:  
- All booking information stored digitally  
- Real-time seat availability  
- Instant ticket booking from anywhere  
- Easy cancellation and refund  
  
**CBSE Exam Tip:** 1-mark questions often ask for definition. Remember: "organized collection of data"  
  
---  
  
## 9.2 Database Management System (DBMS)  
  
**Definition:**  
A Database Management System is software that allows users to create, manage, and manipulate databases efficiently.  
  
**Popular DBMS Software:**  
- MySQL (We'll use this in Class 12)  
- Oracle  
- PostgreSQL  
- MS SQL Server  
- MongoDB  
  
**Simple Explanation:**  
DBMS is like a manager who:  
- Organizes all data properly  
- Retrieves data when you ask  
- Keeps data safe  
- Ensures no duplicate or wrong data  
  
### 9.2.1 Role of DBMS  
  
The DBMS acts as an interface between the database and users/applications. It performs:  
  
**1. Data Storage**  
- Stores data efficiently on disk  
- Organizes data in tables  
- Manages storage space  
  
**2. Data Retrieval**  
- Fetches data when needed  
- Searches quickly  
- Provides requested information  
  
**3. Data Update**  
- Modifies existing data  
- Adds new data  
- Removes unwanted data  
  
**4. Data Security**  
- Protects data from unauthorized access  
- User authentication (username/password)  
- Access control (who can see what)  
  
**Real Example:**  
When Suresh logs into his school portal to check marks, the DBMS:  
1. Verifies his login credentials  
2. Retrieves his marks from the database  
3. Shows only his data (not Ramesh's or Dinesh's data)  
4. Ensures data is accurate and up-to-date  
  
### 9.2.2 Need for DBMS  
  
**Problems with File-Based System (Before DBMS):**  
  
**1. Data Redundancy**  
- Same data stored multiple times  
- Wastes storage space  
  
**Example:**  
```  
Student File 1: Mukesh, 12A, Mumbai  
Student File 2: Mukesh, 12A, Mumbai (Duplicate!)  
```  
  
**2. Data Inconsistency**  
- Different copies have different values  
- Creates confusion  
  
**Example:**  
```  
Mumbai Office: Kamlesh's address - Pune  
Delhi Office: Kamlesh's address - Chennai  
Which one is correct?  
```  
  
**3. Difficulty in Accessing Data**  
- Need to write new programs for each query  
- Not flexible  
  
**4. Data Isolation**  
- Data scattered in different files  
- Hard to relate information  
  
**5. Security Problems**  
- Hard to enforce access control  
- Anyone can access any file  
  
**6. Concurrent Access Problems**  
- Multiple users can't work simultaneously  
- Data may get corrupted  
  
**Real Scenario - Indian Railways Before DBMS:**  
  
**Problem:**  
- Mumbai office has passenger list (File 1)  
- Delhi office has the same passenger list (File 2)  
- Mukesh cancels his ticket in Mumbai  
- Delhi office still shows him as booked  
- Result: Double booking and passenger confusion  
  
**Solution with DBMS:**  
- One central database  
- Real-time updates across all offices  
- No duplication  
- Consistent information everywhere  
- No double booking  
  
**Another Example - School Management:**  
  
**Without DBMS:**  
```  
Office File: Nitesh - Class 12A  
Library File: Nitesh - Class 11B (Old data)  
Sports File: Nitesh - Class 12A  
```  
Confusion! Which class is Nitesh really in?  
  
**With DBMS:**  
```  
Single Database: Nitesh - Class 12A  
All departments see the same correct data  
Update once, reflected everywhere  
```  
  
### 9.2.3 Advantages of Database Management System  
  
**1. Data Sharing**  
- Multiple users can access data simultaneously  
- No waiting time  
  
**Example:** Principal, teachers, and office staff can all access student records at the same time.  
  
**2. Data Integrity**  
- Ensures data accuracy and consistency  
- Validation rules prevent wrong data  
  
**Example:** Age field only accepts numbers between 10-20 for school students.  
  
**3. Data Security**  
- Unauthorized access prevention  
- User-based permissions  
  
**Example:** Students can only view their own marks, but teachers can view all marks.  
  
**4. Reduced Data Redundancy**  
- Minimum duplication  
- Saves storage space  
  
**Example:** Student's address stored once, not in every record.  
  
**5. Backup and Recovery**  
- Automatic data backup  
- Can restore if system crashes  
  
**Example:** If power goes off, all data is safe and can be recovered.  
  
**6. Data Independence**  
- Changes in structure don't affect programs  
- Flexibility in modifications  
  
**Example:** Adding a new column "Email" doesn't break existing programs.  
  
**7. Reduced Application Development Time**  
- Built-in functions for common tasks  
- Faster to build applications  
  
**CBSE Pattern Question (2 Marks):**  
Q. Write two advantages of DBMS over file-based system.  
  
**Answer:**  
- Reduces data redundancy by storing data at one place  
- Provides data security through user authentication and access control  
  
---  
  
## 9.3 Data Model  
  
**Definition:**  
A data model is a conceptual representation of how data is organized and the relationships between different data elements.  
  
**Think of it as:** Blueprint of how data will be stored  
  
**Types of Data Models:**  
1. Record-Based Data Model  
2. Object-Based Data Model  
3. Physical Data Model  
  
**CBSE Focus:** We mainly study Record-Based Data Model  
  
### 9.3.1 Record Based Data Model  
  
**Definition:**  
In a record-based model, data is organized in fixed-format records. The database consists of multiple records of different types.  
  
**Components:**  
- **Record** - Collection of related data fields  
- **Field** - Single piece of information  
  
**Example - Student Record:**  
```  
Record 1:  
  Roll No: 101  
  Name: Suresh  
  Class: 12A  
  Marks: 85  
    
Record 2:  
  Roll No: 102  
  Name: Ramesh  
  Class: 12B  
  Marks: 90  
```  
  
Each student is one record with multiple fields (Roll No, Name, Class, Marks).  
  
---  
  
## 9.4 Relational Data Model  
  
**Definition:**  
In the relational model, data is organized in tables (also called relations). Each table consists of rows and columns.  
  
**Why Called "Relational"?**  
Because tables can be related to each other through common columns.  
  
**Important Terms You Must Know:**  
  
**1. Table / Relation**  
- Collection of related data  
- Example: STUDENT table stores all student information  
  
**2. Row / Tuple / Record**  
- Single entry in a table  
- Horizontal line of data  
  
**3. Column / Attribute / Field**  
- Property or characteristic  
- Vertical line of data  
  
**4. Degree**  
- Number of columns in a table  
  
**5. Cardinality**  
- Number of rows in a table  
  
**6. Domain**  
- Set of allowed values for a column  
  
**Visual Example: STUDENT Table**  
  
```  
Table Name: STUDENT  
Degree: 4 (four columns)  
Cardinality: 3 (three rows)  
  
+--------+---------+-------+-------+  
| RollNo | Name    | Class | Marks |  ← Column/Attribute/Field  
+--------+---------+-------+-------+  
| 101    | Suresh  | 12A   | 85    |  ← Row/Tuple/Record  
| 102    | Ramesh  | 12B   | 90    |  
| 103    | Dinesh  | 12A   | 78    |  
+--------+---------+-------+-------+  
   ↑  
  This is a Table/Relation  
```  
  
**Another Example: EMPLOYEE Table**  
  
```  
Table Name: EMPLOYEE  
Degree: 5  
Cardinality: 4  
  
+-------+---------+------------+-----------+--------+  
| EmpID | Name    | Department | Salary    | City   |  
+-------+---------+------------+-----------+--------+  
| E101  | Mukesh  | IT         | 45000.00  | Pune   |  
| E102  | Kamlesh | HR         | 38000.00  | Mumbai |  
| E103  | Nitesh  | IT         | 52000.00  | Chennai|  
| E104  | Hitesh  | Sales      | 35000.00  | Delhi  |  
+-------+---------+------------+-----------+--------+  
```  
  
### 9.4.1 Features of Relational Data Model  
  
**1. Data stored in tables**  
- Easy to understand  
- Visual representation  
- Like Excel spreadsheet  
  
**2. Each row is unique**  
- No two rows are exactly the same  
- Achieved through Primary Key  
  
**3. Column values are atomic**  
- Single value per cell  
- No multiple values in one cell  
  
**Example:**  
```  
WRONG:  
+--------+---------+-------------------+  
| RollNo | Name    | Subjects          |  
+--------+---------+-------------------+  
| 101    | Suresh  | Math, Physics     | ← Multiple values  
+--------+---------+-------------------+  
  
CORRECT:  
+--------+---------+---------+  
| RollNo | Name    | Subject |  
+--------+---------+---------+  
| 101    | Suresh  | Math    |  
| 101    | Suresh  | Physics |  
+--------+---------+---------+  
```  
  
**4. Column order doesn't matter**  
- Can rearrange columns  
- Data remains same  
  
**5. Row order doesn't matter**  
- Can rearrange rows  
- Data remains same  
  
### 9.4.2 Key Concepts of Relational Models  
  
**1. Domain**  
Set of allowed values for an attribute.  
  
**Examples:**  
  
**Domain of Class:**  
```  
Allowed values: 11A, 11B, 11C, 12A, 12B, 12C  
Not allowed: 13A, Class1, ABC  
```  
  
**Domain of Gender:**  
```  
Allowed values: M, F  
Not allowed: Male, Female, X  
```  
  
**Domain of Marks:**  
```  
Allowed values: 0 to 100  
Not allowed: -5, 150, ABC  
```  
  
**Domain of City:**  
```  
Allowed values: Pune, Mumbai, Chennai, Delhi, etc.  
(Any valid city name)  
```  
  
**2. Null Value**  
- Means "unknown" or "not applicable"  
- Different from zero or blank space  
  
**Example:**  
```  
+-------+---------+-------+  
| RollNo| Name    | Email |  
+-------+---------+-------+  
| 101   | Suresh  | NULL  | ← Email not provided yet  
| 102   | Ramesh  | r@g.c |  
+-------+---------+-------+  
```  
  
**CBSE Pattern Question (2 Marks):**  
Q. Define the following terms:  
(a) Degree  
(b) Cardinality  
  
**Answer:**  
(a) Degree - Number of columns/attributes in a table  
(b) Cardinality - Number of rows/tuples in a table  
  
---  
  
## 9.5 Keys in a Relational Database  
  
**Most Important Section for CBSE Exams!**  
  
**What is a Key?**  
A key is a column (or combination of columns) used to identify rows uniquely or establish relationships between tables.  
  
**Why Keys are Important?**  
1. Uniquely identify each record  
2. Link tables together  
3. Ensure data integrity  
4. Speed up data retrieval  
  
**5 Types of Keys You Must Know:**  
1. Primary Key  
2. Super Key  
3. Candidate Key  
4. Alternate Key  
5. Foreign Key  
  
---  
  
### 9.5.1 Primary Key  
  
**Definition:**  
A column (or combination of columns) that uniquely identifies each row in a table. It cannot contain NULL values.  
  
**Rules for Primary Key:**  
1. Must be unique  
2. Cannot be NULL  
3. Only ONE primary key per table  
4. Value should not change  
  
**Example 1: STUDENT Table**  
  
```  
+--------+---------+-------+-------+  
| RollNo | Name    | Class | Marks |  
+--------+---------+-------+-------+  
| 101    | Mukesh  | 12A   | 85    |  
| 102    | Kamlesh | 12B   | 90    |  
| 103    | Nitesh  | 12A   | 78    |  
+--------+---------+-------+-------+  
  
Primary Key: RollNo (unique for each student)  
```  
  
**Why RollNo is Primary Key?**  
- Every student has different RollNo  
- Never NULL (every student must have RollNo)  
- Never changes  
  
**Why Name is NOT Primary Key?**  
- Two students can have same name  
- Example: Two students named "Rahul"  
  
**Example 2: EMPLOYEE Table**  
  
```  
+---------+---------+--------------+--------+  
| EmpID   | Name    | Phone        | Salary |  
+---------+---------+--------------+--------+  
| E101    | Mukesh  | 9876543210   | 45000  |  
| E102    | Kamlesh | 9876543211   | 50000  |  
| E103    | Nitesh  | 9876543210   | 48000  |  
+---------+---------+--------------+--------+  
  
Primary Key: EmpID (unique for each employee)  
Not Primary Key: Phone (Mukesh and Nitesh have same number)  
```  
  
**Real-World Examples:**  
  
**LIC Policy:**  
- Primary Key: PolicyNo  
- Every policy has unique number  
  
**Indian Railways:**  
- Primary Key: PNR (Passenger Name Record)  
- Every ticket has unique PNR  
  
**Aadhaar:**  
- Primary Key: Aadhaar Number  
- Every person has unique Aadhaar  
  
**CBSE Tip:** Primary Key questions appear in almost every board exam. Practice identifying Primary Keys!  
  
---  
  
### 9.5.2 Super Key  
  
**Definition:**  
Any combination of columns that can uniquely identify rows in a table.  
  
**Simple Explanation:**  
Super Key = Any key that makes each row unique  
  
**Example: EMPLOYEE Table**  
  
```  
+---------+---------+--------------+  
| EmpID   | Name    | Email        |  
+---------+---------+--------------+  
| E101    | Mukesh  | m@gmail.com  |  
| E102    | Kamlesh | k@gmail.com  |  
| E103    | Nitesh  | n@gmail.com  |  
+---------+---------+--------------+  
```  
  
**All Super Keys:**  
1. EmpID (alone)  
2. Email (alone)  
3. EmpID + Name  
4. EmpID + Email  
5. EmpID + Name + Email  
6. Email + Name  
7. And many more combinations...  
  
**Important Points:**  
- Every table has multiple Super Keys  
- Primary Key is also a Super Key  
- Super Key may contain unnecessary columns  
  
**Memory Trick:**  
Super Key = Super powerful! Can identify rows even with extra columns.  
  
---  
  
### 9.5.3 Candidate Key  
  
**Definition:**  
A minimal super key. It's a super key with no unnecessary attributes.  
  
**Simple Explanation:**  
Candidate Key = Super Key with minimum columns needed  
  
**Example: STUDENT Table**  
  
```  
+--------+-----------+---------+-------+  
| RollNo | AdmNo     | Name    | Class |  
+--------+-----------+---------+-------+  
| 101    | A2023001  | Hitesh  | 12A   |  
| 102    | A2023002  | Jitesh  | 12B   |  
| 103    | A2023003  | Ratnesh | 12A   |  
+--------+-----------+---------+-------+  
```  
  
**Candidate Keys:**  
1. RollNo (unique)  
2. AdmNo (unique)  
  
**NOT Candidate Keys:**  
1. RollNo + Name (Name is unnecessary)  
2. AdmNo + Class (Class is unnecessary)  
3. Name (not unique - two Rahuls possible)  
  
**Why "Candidate"?**  
Because these are candidates (options) to become Primary Key!  
  
**Difference from Super Key:**  
  
```  
Super Key: EmpID + Name + Email  
(Extra columns Name and Email not needed)  
  
Candidate Key: EmpID  
(Only essential column)  
```  
  
**Real Example - Pan Card System:**  
  
```  
PANCARD Table  
+----------+---------+-------------+  
| PanNo    | Name    | AadhaarNo   |  
+----------+---------+-------------+  
| ABCD1234 | Himesh  | 123456789   |  
| EFGH5678 | Gukesh  | 987654321   |  
+----------+---------+-------------+  
  
Candidate Keys:  
- PanNo (unique)  
- AadhaarNo (unique)  
  
We can choose either as Primary Key  
```  
  
**CBSE Important:** A table can have multiple Candidate Keys but only ONE Primary Key.  
  
---  
  
### 9.5.4 Alternate Key  
  
**Definition:**  
Candidate keys that are not selected as Primary Key are called Alternate Keys.  
  
**Simple Explanation:**  
Alternate Key = Backup option for Primary Key  
  
**Formula:**  
```  
Alternate Key = Candidate Key - Primary Key  
```  
  
**Example:**  
  
```  
STUDENT Table  
+--------+-----------+---------+  
| RollNo | AdmNo     | Name    |  
+--------+-----------+---------+  
| 101    | A2023001  | Ratnesh |  
| 102    | A2023002  | Himesh  |  
+--------+-----------+---------+  
  
Candidate Keys: RollNo, AdmNo  
  
If RollNo is Primary Key  
Then AdmNo is Alternate Key  
  
If AdmNo is Primary Key  
Then RollNo is Alternate Key  
```  
  
**Real-World Example - Employee System:**  
  
```  
EMPLOYEE Table  
+-------+---------+------------------+  
| EmpID | Email   | Phone            |  
+-------+---------+------------------+  
| E101  | m@g.com | 9876543210       |  
| E102  | k@g.com | 9876543211       |  
+-------+---------+------------------+  
  
Candidate Keys: EmpID, Email, Phone  
  
Primary Key: EmpID (chosen)  
Alternate Keys: Email, Phone (not chosen)  
```  
  
**Why Have Alternate Keys?**  
- Provides alternative unique identifiers  
- Useful for searching  
- Can be upgraded to Primary Key if needed  
  
**Memory Trick:**  
- Primary Key = The chosen one (Like captain of team)  
- Alternate Key = Vice-captain (Ready to replace if needed)  
  
**CBSE Pattern Question (2 Marks):**  
Q. If a table has three Candidate Keys and one is chosen as Primary Key, how many Alternate Keys will there be?  
  
**Answer:** 2 Alternate Keys (Total Candidate Keys - Primary Key = 3 - 1 = 2)  
  
---  
  
### 9.5.5 Foreign Key  
  
**Definition:**  
A column in one table that refers to the Primary Key in another table. It creates a relationship between tables.  
  
**Simple Explanation:**  
Foreign Key = A column that links two tables together  
  
**Why Called "Foreign"?**  
Because it refers to Primary Key of "another" (foreign) table.  
  
**Important Rules:**  
1. Must refer to Primary Key of another table  
2. CAN have NULL values  
3. CAN have duplicate values  
4. Creates Parent-Child relationship  
  
**Example 1: Library Management System**  
  
```  
STUDENT Table (Parent Table)  
+--------+---------+-------+  
| RollNo | Name    | Class |  
+--------+---------+-------+  
| 101    | Ratnesh | 12A   | ← This is Primary Key  
| 102    | Himesh  | 12B   |  
| 103    | Gukesh  | 12A   |  
+--------+---------+-------+  
  
BOOK_ISSUE Table (Child Table)  
+---------+--------+-----------+------------+  
| IssueID | RollNo | BookName  | IssueDate  |  
+---------+--------+-----------+------------+  
| 1001    | 101    | Java Book | 2024-01-15 | ← 101 refers to STUDENT  
| 1002    | 102    | Python    | 2024-01-16 | ← 102 refers to STUDENT  
| 1003    | 101    | C++ Book  | 2024-01-17 | ← Same RollNo again (OK!)  
+---------+--------+-----------+------------+  
        ↑  
   Foreign Key (refers to STUDENT.RollNo)  
```  
  
**Relationship:**  
- STUDENT is Parent Table  
- BOOK_ISSUE is Child Table  
- A student can issue multiple books (duplicate RollNo in BOOK_ISSUE is allowed)  
  
**Example 2: Customer Orders**  
  
```  
CUSTOMER Table (Parent)  
+------------+---------+--------+  
| CustomerID | Name    | City   |  
+------------+---------+--------+  
| C101       | Mukesh  | Pune   | ← Primary Key  
| C102       | Kamlesh | Mumbai |  
+------------+---------+--------+  
  
ORDERS Table (Child)  
+---------+------------+-------------+--------+  
| OrderID | CustomerID | ProductName | Amount |  
+---------+------------+-------------+--------+  
| 5001    | C101       | Laptop      | 45000  | ← C101 from CUSTOMER  
| 5002    | C102       | Mobile      | 15000  | ← C102 from CUSTOMER  
| 5003    | C101       | Mouse       | 500    | ← C101 again (OK!)  
+---------+------------+-------------+--------+  
           ↑  
      Foreign Key  
```  
  
**Why Foreign Key is Important?**  
  
**Without Foreign Key:**  
```  
BOOK_ISSUE  
+---------+--------+-----------+  
| IssueID | RollNo | BookName  |  
+---------+--------+-----------+  
| 1001    | 999    | Java Book | ← RollNo 999 doesn't exist!  
+---------+--------+-----------+  
Problem: Invalid data entered!  
```  
  
**With Foreign Key:**  
```  
Error: Cannot insert RollNo 999  
Reason: This RollNo doesn't exist in STUDENT table  
Solution: Only existing RollNos can be entered  
```  
  
**Real Example - Flipkart Orders:**  
  
```  
CUSTOMER Table  
+------------+---------+  
| CustomerID | Name    |  
+------------+---------+  
| 1001       | Nitesh  |  
| 1002       | Hitesh  |  
+------------+---------+  
    ↑  
  Primary Key  
  
ORDERS Table  
+---------+------------+----------+  
| OrderID | CustomerID | Product  |  
+---------+------------+----------+  
| 5001    | 1001       | Book     |  
| 5002    | 1001       | Pen      |  
| 5003    | 1002       | Laptop   |  
+---------+------------+----------+  
           ↑  
      Foreign Key (refers to CUSTOMER.CustomerID)  
```  
  
**Foreign Key Can Be NULL:**  
  
```  
ORDERS Table  
+---------+------------+----------+  
| OrderID | CustomerID | Product  |  
+---------+------------+----------+  
| 5001    | 1001       | Book     |  
| 5002    | NULL       | Gift     | ← Guest order (no customer ID)  
+---------+------------+----------+  
```  
  
**Foreign Key Can Repeat:**  
  
```  
ORDERS Table  
+---------+------------+----------+  
| OrderID | CustomerID | Product  |  
+---------+------------+----------+  
| 5001    | 1001       | Book     |  
| 5002    | 1001       | Pen      | ← Same customer, different order  
| 5003    | 1001       | Copy     | ← Same customer again  
+---------+------------+----------+  
```  
  
**CBSE Pattern Question (3 Marks):**  
Q. Identify Primary Key and Foreign Key from the following tables:  
  
```  
ORDER (OrderID, CustomerID, ProductName, Amount)  
CUSTOMER (CustomerID, Name, City, Phone)  
```  
  
**Answer:**  
- ORDER table: Primary Key = OrderID, Foreign Key = CustomerID  
- CUSTOMER table: Primary Key = CustomerID, Foreign Key = None  
  
---  
  
## Comparison of All Keys  
  
**Quick Summary Table:**  
  
| Key Type       | Can be NULL? | Can Repeat? | How Many per Table? | Purpose                    |  
|----------------|--------------|-------------|---------------------|----------------------------|  
| Primary Key    | NO           | NO          | Only ONE            | Uniquely identify row      |  
| Super Key      | NO           | NO          | Multiple            | Any unique combination     |  
| Candidate Key  | NO           | NO          | Multiple            | Minimal unique combination |  
| Alternate Key  | NO           | NO          | Multiple            | Backup Primary Key         |  
| Foreign Key    | YES          | YES         | Multiple            | Link tables                |  
  
**Visual Memory Aid:**  
  
```  
      All Keys  
         |  
    Super Keys  
    (Everything that can uniquely identify)  
         |  
    Candidate Keys  
    (Minimal Super Keys)  
         |  
    /         \  
Primary Key   Alternate Keys  
(The chosen)  (Not chosen)  
  
Separate Family:  
Foreign Key (Links to other tables)  
```  
  
---  
  
## Practice Questions - Part 1  
  
### 1 Mark Questions  
  
**Q1.** What is a database?  
  
**Answer:** An organized collection of structured data stored electronically.  
  
---  
  
**Q2.** Which key cannot have NULL values?  
  
**Answer:** Primary Key  
  
---  
  
**Q3.** What does DBMS stand for?  
  
**Answer:** Database Management System  
  
---  
  
**Q4.** What is the degree of a table with 5 columns?  
  
**Answer:** 5  
  
---  
  
**Q5.** Which key is used to link two tables?  
  
**Answer:** Foreign Key  
  
---  
  
### 2 Mark Questions  
  
**Q6.** Differentiate between Primary Key and Foreign Key.  
  
**Answer:**  
- Primary Key uniquely identifies records in a table and cannot be NULL  
- Foreign Key refers to Primary Key of another table and can have NULL values  
  
---  
  
**Q7.** What is data redundancy? How does DBMS reduce it?  
  
**Answer:**  
- Data redundancy means storing same data multiple times  
- DBMS reduces it by storing data at one central location and eliminating duplicates  
  
---  
  
**Q8.** Define Candidate Key and Alternate Key.  
  
**Answer:**  
- Candidate Key is a minimal super key that can uniquely identify records  
- Alternate Key is a Candidate Key that is not chosen as Primary Key  
  
---  
  
### 3 Mark Questions  
  
**Q9.** Consider the table EMPLOYEE (EmpID, Name, Email, Phone, Department).   
Identify:  
(a) Candidate Keys  
(b) If EmpID is Primary Key, what are Alternate Keys?  
  
**Answer:**  
(a) Candidate Keys: EmpID, Email (assuming both are unique)  
(b) Alternate Key: Email  
  
---  
  
**Q10.** Explain three advantages of DBMS over file-based system.  
  
**Answer:**  
- Data Sharing: Multiple users can access data simultaneously  
- Data Security: Provides user authentication and access control  
- Data Integrity: Ensures accuracy and consistency through validation rules  
  
---  
  
**Q11.** Consider two tables:  
```  
STUDENT (RollNo, Name, Class)  
MARKS (ExamID, RollNo, Subject, Marks)  
```  
Identify Primary Key and Foreign Key in both tables.  
  
**Answer:**  
- STUDENT: Primary Key = RollNo, Foreign Key = None  
- MARKS: Primary Key = ExamID, Foreign Key = RollNo (refers to STUDENT.RollNo)  
  
---  
  
## Quick Revision Points  
  
**Must Remember for Exam:**  
  
1. **Database** - Organized collection of data  
2. **DBMS** - Software to manage databases  
3. **Table** - Collection of rows and columns  
4. **Degree** - Number of columns  
5. **Cardinality** - Number of rows  
  
**5 Keys in Order:**  
1. Primary Key - Unique + Not NULL + Only One  
2. Super Key - Any unique combination  
3. Candidate Key - Minimal Super Key  
4. Alternate Key - Not chosen Candidate Keys  
5. Foreign Key - Links to other table's Primary Key  
  
**Common Mistakes to Avoid:**  
- Confusing Candidate Key with Primary Key  
- Thinking Foreign Key must be unique  
- Forgetting that Alternate Key cannot be NULL  
  
---  
  
## What's Next?  
  
In **Part 2**, you'll learn:  
- SQL basics and commands  
- Data types and constraints  
- DDL commands (CREATE, ALTER, DROP)  
- DML commands (INSERT, UPDATE, DELETE, SELECT)  
- Operators and WHERE clause  
  
**Study Tip:** Master the keys concept before moving to Part 2. It's the foundation!  
  
---  
  
## Mini Assignment for Part 1  
  
**Task:** Create on paper (no computer needed):  
  
1. Design a table for **Library Books** with appropriate columns  
2. Identify Primary Key  
3. Design another table for **Book Issue Records**  
4. Identify Primary Key and Foreign Key  
5. Show sample data (3 rows in each table)  
  
**Example Solution Format:**  
```  
BOOKS Table:  
Columns: BookID, Title, Author, Price  
Primary Key: BookID  
  
ISSUE Table:  
Columns: IssueID, BookID, StudentName, IssueDate  
Primary Key: IssueID  
Foreign Key: BookID (refers to BOOKS.BookID)  
```  
  
---  
  
**End of Part 1**  
  
**Continue to Part 2 for SQL Commands and Query Writing!**  
  
---  
  
**Prepared with care for CBSE Students**