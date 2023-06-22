SELECT * FROM kholapurdb.student;

/* not null*/

create table sample(
rollNum int(10) not null,
stdNmae varchar(10) not null
);
insert into sample(rollNum) values(56);
desc sample;

alter table fullproject.students_details
modify student_email varchar(10) not null;

create table sample1(
rollNum int(10) not null unique,
stdNmae varchar(10) not null,
email varchar(10) unique
);


insert into sample1 values(12, "janani" , "hi@gmai");


create table sample2(
rollNum int(10) not null unique,
stdNmae varchar(10) not null,
citizen varchar(10) default "indian"
);
select * from sample2;
insert into sample2 values(12, "student1", "usa");
insert into sample2(rollNum, stdNmae) values(11, "student1");

create table employeeTable(
name varchar(10) not null,
emplId int,
primary key(emplId));


insert into employeeTable values("hi", 12);
insert into employeeTable values("hi", 13);

select * from employeeTable;



Alter table sample2 
add primary key(rollNum);

create table drivingStudents(
age int check (age >= 18),
name varchar(10) not null);

insert into drivingStudents values (23, "hi");
insert into drivingStudents values (3, "hi");

alter table employeeTable
modify emplId int check( emplId >= 10); 

