create database transport;

use transport;

create table users
(
user_id int primary key,name varchar(20),
 mobile_number varchar(10) not null,
 password varchar(50), 
 user_status varchar(10), 
 otp int
 );

desc users;

create table products
(
uid int,
product_name varchar(20),
weight int,
product_type varchar(10),
due_date date,
from_place varchar(20),
to_place varchar(20) 
);

ALTER TABLE products MODIFY COLUMN uid INT NOT NULL,
 ADD CONSTRAINT user_id_fk
 FOREIGN KEY(uid)
 REFERENCES users(user_id);
 
desc products;