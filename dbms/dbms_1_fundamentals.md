## start mysql server / database server - server/host

## connection -> terminal/cmd -> 
```bash
	mysql -u root -proot
```

## Structure
```plaintext
Mysql server -> 
	Databases / schemas
		table
			row / tuple / record / object
				columns / cell / data
```


# Queries

## Create database
```sql
create database db_name;

create database tutorial;
create database if not exists tutorial;

```

## delete database
```sql
drop database tutorial_1;
drop database if exists tutorial;
drop database if exists demo_db;

```
## list database
```sql
show databases;
```

## Sequence to use
```sql
drop database if exists tutorial;
create database if not exists tutorial;
use tutorial;
```

## Create table
```sql
create table students(
    name varchar(5),
    roll int,
    email varchar(20),
    subject varchar(20)
);


create table students(
    name varchar(25),
    roll int primary key auto_increment,
    email varchar(20),
    subject varchar(20)
);

```

## Delete table
```sql
drop table students;
```

## Modify table
```sql
alter table students modify column name varchar(20);
```

## list tables
```sql
show tables;
```

## CRUD on table - Read
```sql
select * from students;
select roll, email, name, subject from students;
select name, subject from students;
```

## CRUD on table - Insert
```sql
insert into students values('Ramesh', 123, 'ram@gmail.com', 'physics');

-- insert into students values(561, 'maheshg@rediff.com', 'Mahesh', 'java');
insert into students values('maheshg@rediff.com', 561, 'Mahesh', 'java'); -- not recommended

insert into students(email, roll, name, subject)
values('maheshg@rediff.com', 561, 'Mahesh', 'java');
 
insert into students(subject, name, email, roll)
values('math', 'Suresh', 'suresh@ymail.com', 432);

insert into students(subject, name, email) values
('java', 'Ramesh', 'ram@ymail.com'),
('python', 'Mukesh', 'mukesh@ymail.com'),
('dsa', 'Dinesh', 'din@ymail.com');

insert into students(subject, name, email, roll)
values('eng', 'Himesh', 'him@ymail.com', 91);


```

## CRUD on table - modify
```sql
update students set roll=214, email = 'mahesh@rediff.com' where name = 'Mahesh';
```

## CRUD on table - delete single record
```sql
delete from students where name = 'Mahesh';

delete from students where name = 'Mukesh';

delete from students where roll>90;


```