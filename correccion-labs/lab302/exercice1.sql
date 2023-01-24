drop schema if exists ex1;
create schema ex1;
use ex1;

create table author(
id int auto_increment,
name varchar(25),
primary key (id));

create table books(
id int auto_increment,
author_id int,
title varchar (255),
word_count int,
views int,
primary key (id),
foreign key(author_id) references author (id));

insert into author(name) values
("Maria Charlotte"),
("Juan Perez"),
("Gemma Alcocer");


insert into books(author_id, title, word_count, views) values 
(1, "Best Paint Colors", 814, 14),
(2, "Small Space Decorating Tips", 1146, 221),
(1, "Hot Accessories", 986, 105),
(1, "Mixing Textures", 765, 22),
(2, "Kitchen Refresh", 1242, 307),
(1, "Homemade Art Hacks", 1002, 193),
(3, "Refinishing Wood Floors", 1571, 7542);
