drop table if exists contact;
drop table if exists aim;
drop table if exists expenses;
drop table if exists goods_category;
drop table if exists users;
drop table if exists role;
drop table if exists aim_category;

create table role (
    id int not null auto_increment,
    role_name varchar (255) not null unique,
    constraint pk_role primary key (id)
);

create table users (
    id int not null auto_increment,
    username varchar (255) not null unique,
    password varchar (255) not null,
    fk_role_id int not null,
    constraint pk_user primary key (id),
    foreign key (fk_role_id) references role (id)
);

create table goods_category (
    id int not null auto_increment,
    goods_category_name varchar (255) not null unique,
    constraint pk_goods_category primary key (id)
);

create table expenses (
    id int not null auto_increment,
    expenses_article varchar (255) not null,
    payment_date varchar (11) not null,
    fk_goods_category_id int not null,
    fk_user_id int not null,
    constraint pk_expenses primary key (id),
    foreign key (fk_goods_category_id) references goods_category (id),
    foreign key (fk_user_id) references users (id)
);

create table contact (
    id int not null auto_increment,
    firstname varchar (255) not null,
    lastname varchar (255) not null,
    middlename varchar (255),
    email varchar (255) not null,
    mobile_number varchar (55),
    work_phone_number varchar (55),
    birthdate varchar (13),
    comments text,
    contact_type int not null,
    fk_user_id int not null,
    constraint pk_contact primary key (id),
    foreign key (fk_user_id) references users (id)
);

create table aim_category (
    id int not null auto_increment,
    important boolean not null,
    urgently boolean not null,
    long_term boolean not null,
    constraint pk_aim_category primary key (id)
);

create table aim (
    id int not null auto_increment,
    aim_name varchar (255) not null,
    short_descr varchar (255) not null,
    long_descr varchar (1024) not null,
    plane_date varchar (11) not null,
    red_line varchar (11) not null,
    fk_aim_category_id int not null ,
    fk_user_id int not null,
    constraint pk_aim primary key (id),
    foreign key (fk_aim_category_id) references aim_category (id),
    foreign key (fk_user_id) references users (id)
);

INSERT INTO role(id, role_name) VALUES (1, 'ROLE_USER');
INSERT INTO users(username, password, fk_role_id) VALUES ('foo', 'bar', 1);