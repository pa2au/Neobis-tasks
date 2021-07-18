create table client
(
    id                   bigint not null auto_increment,
    address              varchar(255),
    date_of_birth        datetime,
    date_of_registration datetime,
    first_name           varchar(255),
    last_name            varchar(255),
    phone_number         varchar(255),
    sex                  varchar(255),
    primary key (id)
);
create table client_seq
(
    next_val bigint
);
insert into client_seq
values (1);
create table product
(
    id                  bigint not null auto_increment,
    date_of_expiration  datetime,
    date_of_manufacture datetime,
    name                varchar(255),
    price               double precision,
    shape               varchar(255),
    type                varchar(255),
    primary key (id)
);
create table product_seq
(
    next_val bigint
);
insert into product_seq
values (1);
create table sale
(
    id           bigint not null auto_increment,
    date_of_sale datetime,
    client_id    bigint not null,
    product_id   bigint not null,
    primary key (id)
);
create table sale_seq
(
    next_val bigint
);
insert into sale_seq
values (1);
alter table sale
    add constraint FKon0o9ba5ajsnwivekhl1tfjiy foreign key (client_id) references client (id);
alter table sale
    add constraint FKonrcqwf09u6spb6ty6sh11jh5 foreign key (product_id) references product (id);