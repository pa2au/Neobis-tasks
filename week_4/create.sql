CREATE DATABASE week4;
USE week4;

CREATE TABLE kulikovsky(
id int ,
name varchar(50) not null,
type varchar(21),
shape varchar(21),
price double,
date_of_manufacture date,
date_of_expiration date);

CREATE TABLE clients(
id int,
firstName varchar(50) not null,
lastName varchar(50) not null,
sex varchar(1) not null,
phone_number varchar(10),
date_of_birth date,
date_of_registration date not null,
address varchar(100));

CREATE TABLE sales(
id int,
clients_id int,
kulikovsky_id int,
date_of_sale date);

ALTER TABLE kulikovsky 
MODIFY COLUMN id INT auto_increment primary key;

ALTER TABLE clients 
MODIFY COLUMN id INT auto_increment primary key;

ALTER TABLE sales 
MODIFY COLUMN id INT auto_increment primary key;

ALTER TABLE sales
ADD ( CONSTRAINT fk_clients_id foreign key(clients_id) references clients(id),
 CONSTRAINT fk_kulikovsky_id foreign key(kulikovsky_id) references kulikovsky(id));


INSERT INTO kulikovsky
VALUES
(1000, "chocolate", "pie", "square", 552.2, "2021-05-05", "2021-05-25"),
(2222, "cheesecake", "cake", "circle", 720.0, "2021-05-03", "2021-05-08"),
(3345, "homecake", "cake", "circle", 350.5, "2021-05-06", "2021-05-11"),
(4554, "Prague", "cake", "circle", 800, "2021-05-08", "2021-05-13"),
(5443, "currant", "ice cream", "cup", 55, "2021-05-05", "2021-06-05"),
(6666, "3chocolates", "pie", "square", 1200, "2021-05-01", "2021-05-16");

INSERT INTO clients
VALUES
(1, "Ermek", "Ashirov", "m", "0777123456", "2001-01-01", "2021-01-01", "Bishkek"),
(2, "Sultan", "Sokeev", "m", "0700123456", "2002-02-02", "2021-01-15", "Tokmok"),
(3, "Nurs", "Asanov", "m", "0555123456", "2003-03-03", "2021-02-01", "Kant"),
(4, "Alina", "Kybanychova", "f", "0543123456", "2004-04-04", "2021-02-15", "Kemin"),
(5, "Altynai", "Turdalieva", "f", "0999123456", "2005-05-05", "2020-03-01", "Sokuluk");

INSERT INTO sales
VALUES
(111, "1", "1000", "2021-05-06"),
(222, "2", "6666", "2021-05-10"),
(333, "5", "5443", "2021-05-16"),
(444, "4", "3345", "2021-05-10"),
(555, "3", "4554", "2021-05-13");