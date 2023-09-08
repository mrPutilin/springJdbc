create table third_homework.CUSTOMERS (
    id serial primary key,
    name varchar(255) not null,
    surname varchar(255),
    age int,
    phone_number int
);

create table third_homework.ORDERS (
    id serial primary key ,
    date varchar(20),
    customer_id int references third_homework.CUSTOMERS(id),
    product_name varchar(200),
    amount int
);

insert into third_homework.CUSTOMERS (name, surname, age, phone_number)
VALUES ('Alexey', 'Popov', 32, 892555);
insert into third_homework.CUSTOMERS(name, surname, age, phone_number)
VALUES ('alexey', 'Ivanov', 22, 891444);
insert into third_homework.CUSTOMERS(name, surname, age, phone_number)
VALUES ('Genadiy', 'Pak', 83, 89143333);
insert into third_homework.CUSTOMERS(name, surname, age, phone_number)
VALUES ('Marina', 'Romanova', 35, 89166666);

insert into third_homework.ORDERS(date, customer_id, product_name, amount)
VALUES ('31/7/2023', 1, 'bread', 1 );
insert into third_homework.ORDERS(date, customer_id, product_name, amount)
VALUES ('30/04/2022', 2, 'milk', 3);
insert into third_homework.ORDERS(date, customer_id, product_name, amount)
VALUES ('01/08/2023', 3, 'gum', 5);
insert into third_homework.ORDERS(date, customer_id, product_name, amount)
VALUES ('22/01/2023', 4, 'onion', 2);
