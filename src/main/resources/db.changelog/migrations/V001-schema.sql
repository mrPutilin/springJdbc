--liquibase formatted sql

--changeset putilin:1

CREATE SCHEMA third_homework

CREATE TABLE third_homework.CUSTOMERS (
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