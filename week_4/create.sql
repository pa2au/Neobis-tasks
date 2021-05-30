CREATE DATABASE week4;
USE week4;

CREATE TABLE Kulikovsky(
id int ,
Name varchar(50) not null,
Type varchar(21),
Shape varchar(21),
price double,
DateOfManufacture date,
DateOfExpiration date);

CREATE TABLE Clients(
id int,
FirstName varchar(50) not null,
LastName varchar(50) not null,
Sex varchar(1) not null,
Phone_number varchar(10),
DateOfBirth date,
DateOfRegistration date not null,
Address varchar(100));

CREATE TABLE Sales(
id int,
Clients_FirstName varchar(50),
Clients_LastName varchar(50),
Kulikovsky_Name varchar(50),
DateOfSale int);

ALTER TABLE Kulikovsky 
MODIFY COLUMN id INT auto_increment primary key;

ALTER TABLE Clients 
MODIFY COLUMN id INT auto_increment primary key;

ALTER TABLE Sales 
MODIFY COLUMN id INT auto_increment primary key;

ALTER TABLE Sales
ADD ( CONSTRAINT fk_Clients_FirstName foreign key(Clients_FirstName) references Clients(FirstName),
 CONSTRAINT fk_Clients_LastName foreign key(Clients_LastName) references Clients(LastName),
 CONSTRAINT fk_Kulikovsky_Name foreign key(Kulikovsky_Name) references Kulikovsky(Name));


INSERT INTO Kulikovsky
VALUES
(1000, "chocolate", "pie", "square", 552,2, "2021-05-05", "2021-05-25"),
(2222, "cheesecake", "cake", "circle", 720.0, "2021-05-03", "2021-05-08"),
(3345, "homecake", "cake", "circle", 350.5, "2021-05-06", "2021-05-11"),
(4554, "Prague", "cake", "circle", 800, "2021-05-08", "2021-05-13"),
(5443, "currant", "ice cream", "cup", 55, "2021-05-05", "2021-06-05"),
(6666, "3chocolates", "pie", "square", 1200, "2021-05-01", "2021-05-16");

INSERT INTO Сlients
VALUES
(1, "Ermek", "Ashirov", "m", "0777123456", "2001-01-01", "2021-01-01", "Bishkek"),
(2, "Sultan", "Sokeev", "m", "0700123456", "2002-02-02", "2021-01-15", "Tokmok"),
(3, "Nurs", "Asanov", "m", "0555123456", "2003-03-03", "2021-02-01", "Kant"),
(4, "Alina", "Kybanychova", "f", "0543123456", "2004-04-04", "2021-02-15", "Kemin"),
(5, "Altynai", "Turdalieva", "f", "0999123456", "2005-05-05", "2020-03-01", "Sokuluk");

INSERT INTO Sales
VALUES
(111, "Ermek", "Ashirov","chocolate","2021-05-06"),
(222, "Sultan", "Sokeev","3chocolates","2021-05-10"),
(333, "Altynai", "Turdalieva","currant","2021-05-16"),
(444, "Alina","Kybanychova","homecake","2021-05-10"),
(555, "Nurs", "Asanov","Prague","2021-05-05-13");