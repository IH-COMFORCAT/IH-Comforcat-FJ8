create schema shop;
use shop;
create table products(
id INT AUTO_INCREMENT,
product VARCHAR(255),
price INT,
PRIMARY KEY(id));

create table customers(
id INT AUTO_INCREMENT,
customer_name VARCHAR(255),
address VARCHAR(255),
email VARCHAR(255) UNIQUE,
primary key(id));

create table orders(
id INT AUTO_INCREMENT,
customer_id INT,
product_purchased INT,
quantity_ordered INT,
seller VARCHAR(255),
primary key(id),
foreign key(customer_id) references customers(id),
foreign key(product_purchased) references products(id));

