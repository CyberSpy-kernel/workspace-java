create database Artist;
use Artist;
create table users1 (
	aid int,
    aname varchar(50),
    color varchar(20)
);
create table users2 (
	aid int,
    fname varchar(50),
    mname varchar(50),
    lname varchar(50),
    color varchar(20)
);
select * from users1;
select * from users2;

drop database neon;


show tables;

drop table student;
drop table laptop;

create table student (
	rollno int,
    marks int,
    name varchar(50),
    laptop_lid int
);

create table laptop (
	lid int,
    lname varchar(20)
);

select * from student;
select * from laptop;

create table artist (
	aid int,
    aname varchar(20)
);


create table laptop (
	lid int,
    brand varchar(40),
    price int,
    artist_aid int
);
drop table laptop;

-- Insert data into artist table
INSERT INTO artist (aid, aname) VALUES
(1, 'Artist1'),
(2, 'Artist2'),
(3, 'Artist3'),
(4, 'Artist4'),
(5, 'Artist5'),
(6, 'Artist6'),
(7, 'Artist7'),
(8, 'Artist8'),
(9, 'Artist9'),
(10, 'Artist10');

-- Insert data into laptop table
INSERT INTO laptop (lid, brand, price, artist_aid) VALUES
(1, 'Brand1', 1000, 1),
(2, 'Brand2', 1200, 2),
(3, 'Brand3', 1500, 3),
(4, 'Brand4', 1300, 4),
(5, 'Brand5', 1100, 5),
(6, 'Brand6', 1400, 6),
(7, 'Brand7', 1700, 7),
(8, 'Brand8', 1600, 8),
(9, 'Brand9', 1800, 9),
(10, 'Brand10', 2000, 10);

select * from artist;
select * from laptop;
