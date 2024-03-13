-- liquibase formatted sql

-- changeset create-employee:1
create table customer(
    id int,
    name varchar(100),
    email varchar(100),
    primary key (id)
)