# SQL and Database – ISS Assignment

This assignment covers fundamental SQL operations, queries, constraints, joins, and stored procedures, along with key database concepts.

---

## 1. Need for a Database

- A **database** stores and manages structured data efficiently.
- Instead of storing information in files, a **Relational Database Management System (RDBMS)** helps organize data into tables, reduces redundancy, and ensures consistency.
- Databases are used in every domain like banking, healthcare, e-commerce, and education to:
  - Query data quickly
  - Ensure data integrity
  - Share data across applications
  - Backup and restore important records

---

## 2. & 3. SQL Queries and DBMS Operations

All SQL queries are included in `SQL.sql`. The key topics covered are:

### Database & Tables
- `CREATE DATABASE`, `USE`
- `CREATE TABLE` with constraints
- `DROP`, `ALTER`, `AUTO_INCREMENT`

### Constraints
- `PRIMARY KEY`, `FOREIGN KEY`, `UNIQUE`, `NOT NULL`, `DEFAULT`, `CHECK`

### Basic Queries
- `SELECT`, `DISTINCT`, `WHERE`, `AND`, `OR`, `ORDER BY`, `LIMIT`, `ALIASES`
- `LIKE`, `IN`, `BETWEEN`, `UPDATE`, `DELETE`

### Joins
- `INNER JOIN`, `LEFT JOIN`, `RIGHT JOIN`, `FULL JOIN (emulated via UNION)`

### Union and Data Copying
- `UNION`, `SELECT INTO`, `INSERT INTO SELECT`

### Indexing & Views
- `CREATE INDEX`, `CREATE VIEW`

### Null Handling
- `IS NULL`, `IFNULL`, `COALESCE`

### Grouping & Aggregates
- `GROUP BY`, `HAVING`, `AVG()`

### SQL Injection Demo 

---

## 4. Concept of Normalization

## Introduction

Normalization is the process of organizing data in a database to reduce redundancy and improve data integrity. The first three normal forms are the most commonly used normalization rules.

---

# First Normal Form (1NF)

## Rule

A table is in **First Normal Form (1NF)** if:

* Each column contains only atomic (single) values.
* No repeating groups or arrays are allowed.
* Each row is uniquely identifiable.

## Example: Not in 1NF

| StudentID | StudentName | Subjects         |
| --------- | ----------- | ---------------- |
| 1         | Alice       | Math, Science    |
| 2         | Bob         | English, History |

**Problem:** Multiple values are stored in the `Subjects` column.

## Convert to 1NF

| StudentID | StudentName | Subject |
| --------- | ----------- | ------- |
| 1         | Alice       | Math    |
| 1         | Alice       | Science |
| 2         | Bob         | English |
| 2         | Bob         | History |

**Result:** Every field now contains a single value.

---

# Second Normal Form (2NF)

## Rule

A table is in **Second Normal Form (2NF)** if:

* It is already in 1NF.
* All non-key attributes are fully dependent on the entire primary key.
* No partial dependency exists.

## Example: Not in 2NF

Assume the composite primary key is `(StudentID, CourseID)`.

| StudentID | CourseID | StudentName | CourseName        |
| --------- | -------- | ----------- | ----------------- |
| 1         | C101     | Alice       | Database Systems  |
| 2         | C102     | Bob         | Operating Systems |

### Problem

* `StudentName` depends only on `StudentID`.
* `CourseName` depends only on `CourseID`.

These attributes do not depend on the entire composite key.

## Convert to 2NF

### Students Table

| StudentID | StudentName |
| --------- | ----------- |
| 1         | Alice       |
| 2         | Bob         |

### Courses Table

| CourseID | CourseName        |
| -------- | ----------------- |
| C101     | Database Systems  |
| C102     | Operating Systems |

### Enrollments Table

| StudentID | CourseID |
| --------- | -------- |
| 1         | C101     |
| 2         | C102     |

**Result:** Every non-key attribute depends on the whole primary key.

---

# Third Normal Form (3NF)

## Rule

A table is in **Third Normal Form (3NF)** if:

* It is already in 2NF.
* No transitive dependency exists.
* Non-key attributes should not depend on other non-key attributes.

## Example: Not in 3NF

| EmployeeID | EmployeeName | DepartmentID | DepartmentName |
| ---------- | ------------ | ------------ | -------------- |
| 101        | John         | D01          | HR             |
| 102        | Sarah        | D02          | Finance        |

### Problem

`DepartmentName` depends on `DepartmentID`, not directly on `EmployeeID`.

```
EmployeeID
    ↓
DepartmentID
    ↓
DepartmentName
```

This is called a **transitive dependency**.

## Convert to 3NF

### Employees Table

| EmployeeID | EmployeeName | DepartmentID |
| ---------- | ------------ | ------------ |
| 101        | John         | D01          |
| 102        | Sarah        | D02          |

### Departments Table

| DepartmentID | DepartmentName |
| ------------ | -------------- |
| D01          | HR             |
| D02          | Finance        |

**Result:** All non-key attributes depend directly on the primary key.



---
