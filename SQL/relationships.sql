create database relationship1;
CREATE TABLE Students (student_id INT PRIMARY KEY,name VARCHAR(100),usn VARCHAR(20) UNIQUE);

INSERT INTO Students (student_id, name, usn) VALUES (1, 'Alice', 'USN001');
INSERT INTO Students (student_id, name, usn) VALUES (2, 'Bob', 'USN002');
INSERT INTO Students (student_id, name, usn) VALUES (3, 'Charlie', 'USN003');
INSERT INTO Students (student_id, name, usn) VALUES (4, 'Diana', 'USN004');
INSERT INTO Students (student_id, name, usn) VALUES (5, 'Eve', 'USN005');