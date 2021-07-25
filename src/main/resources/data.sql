CREATE TABLE students.student (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    student_group VARCHAR(255),
    PRIMARY KEY (id)
);
INSERT INTO students.student (name,student_group) VALUES('Temirlan', 'CSSE');
INSERT INTO students.student (name,student_group) VALUES('Askar', 'CSSE');