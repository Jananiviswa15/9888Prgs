select abs(-2);

select abs(90);

select pow(2,3);

select ceil(23.6);
select ceil(23.2);

/* cos(), tan() exp log */

select PI();

select Degrees(PI()/2);
select Degrees(PI());


select floor(23.6);
select floor(23.1);


select mod(12,3);
select mod(12,5);

select sqrt(36);

select round(12.5);
select round(12.1);

select round(22.3244242, 2);


select sign(90);

select sign(-90);

select sign(0);


select truncate(1.222223, 1);
select truncate(1.222223, 0);


select length("janani");

select repeat("hi",4);

select lcase("HIIII");

select ucase("kldfklfhhd");

select concat("hi ", "allllll" );

select concat(name," ", subject) from student;

select ltrim("    hi");

select rtrim("hi             ");


select substr("hi all", 2);
select substr("hi all", 2, 5);

select ascii("a");

select insert("hellooo" , 2, 3, "jjj kjkjkj");

select insert("hellooo" , 3, 3, "jjj kjkjkj");


select left("kalpes",2);

select right("kalpesh", 2);

select mid(name, 2, 3) from student;


select replace("janani" , "a", "oooo");


select reverse("hi");


select length(concat("hi", space(10), "hello"));
