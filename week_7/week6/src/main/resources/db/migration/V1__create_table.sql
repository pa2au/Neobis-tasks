drop table if exists products;

CREATE TABLE products(
    id int ,
    name varchar(50) not null,
    type varchar(21),
    shape varchar(21),
    price double,
    date_of_manufacture date,
    date_of_expiration date,
    primary key (id));