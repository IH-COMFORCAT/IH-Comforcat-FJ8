drop schema if exists courses;
create schema courses;
use courses;
create table course(
course_code VARCHAR(255),
course_name VARCHAR(255),
primary key(course_code));

create table section(
id VARCHAR(255),
course_code VARCHAR(255),
room_num INT,
instructor VARCHAR(255),
primary key(id),
foreign key (course_code) references course(course_code));

create table grade(
id INT AUTO_INCREMENT,
student_name VARCHAR(255),
section_id VARCHAR(255),
score INT,
primary key(id),
foreign key(section_id) references section(id));

INSERT INTO course (course_code, course_name) VALUES
('CS101', 'Intro to Java'),
('CS103',  'Databases');

INSERT INTO section (id, course_code, room_num, instructor) VALUES
('CS101-A', 'CS101', 1802, 'Balderez'),
('CS101-B', 'CS101',  1650, 'Su'),
('CS103-A', 'CS103',  1200, 'Rojas'),
('CS103-B', 'CS103',  1208, 'Tonno');

INSERT INTO grade (student_name, section_id, score) VALUES
('Maya Charlotte', 'CS101-A', 98),
('James Fields', 'CS101-A', 82),
('Michael Alcocer', 'CS101-B', 65),
('Maya Charlotte', 'CS103-A', 89),
('Tomas Lacroix', 'CS101-A', 99),
('Sara Bisat', 'CS101-A', 87),
('James Fields', 'CS101-B', 46),
('Helena Sepulvida', 'CS103-A', 72);

SELECT * FROM grade;
SELECT student_name, score FROM grade;

-- Display the count of grades for each section
SELECT section_id, COUNT(*) as "Number of students" from grade group by section_id;

-- Show average score by section

SELECT section_id, AVG(score) as "AVG score" from grade group by section_id;

-- Show sum of scores, average of scores and number of students by section id
SELECT section_id, SUM(score), AVG(score), COUNT(*) from grade group by section_id;

-- Show average of score from CS101-A
SELECT section_id, AVG(score) from grade where section_id="CS101-A" group by section_id;

-- Show all students in section CS101-A
SELECT * from grade where section_id="CS101-A";

select * from grade where score < 80;

select student_name, MAX(score) from grade group by student_name order by MAX(score) desc limit 1;

select * from grade where section_id = "CS101-A" OR section_id = "CS101-B";

select * from grade where section_id LIKE "%-A";

select * from grade where section_id LIKE "CS101%" AND score > 70;

select * from grade where section_id LIKE "CS101%" AND score BETWEEN 70 and 85;

select * from grade where student_name between "A" AND "I";

select * from grade ORDER BY score DESC;

select distinct student_name from grade order by student_name;





select * from grade;