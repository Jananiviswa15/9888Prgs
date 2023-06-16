/* create a table , craete a db*/

create database kholapurDb;

show databases;

use kholapurDb;
create table dummy(
col int);


create table student(
id int(5),
name varchar(10),
subject varchar(15));

Alter table student
add phnumber int(10);


Alter table student
drop column phnumber;

Alter table student
modify column name  varchar(20);
desc student;
show tables;



Insert into student values (24, "janani", "maths");
Insert into student(name, id) values ("snehal mathure", 89);


set sql_safe_updates = 0;
select  * from student;

update student
set name = "minal";

update student
set name = "snehal" where id = 22;

select name from student;

select name, id from student;


delete from student where name = "janani";


truncate table student;
update student
set id = 100, name = "achal" where subject = null;

drop table dummy;
drop database dummy;

alter table dummy
rename to newTableName;


alter table employee
rename column id to newId;


desc employee;