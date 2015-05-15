create table userinfo_table
(
       u_id int primary key auto_increment,
       u_username varchar(10),
       u_password varchar(10),
       u_sex varchar(10),
       u_birthday varchar(20),
       u_tel varchar(10),
       u_createtime varchar(20),
       u_isdel int,
       r_id int 
       
);

create table role_info
(
       r_id int primary key auto_increment,
       r_name varchar(10)
);

create table addressbookinfo_table
(
       ab_id int primary key AUTO_INCREMENT,
       ab_name varchar(20),
       ab_address varchar(20),
       ab_tel varchar(10),
       u_id int
);

create table remindinfo_table  
(
       rem_id int primary key auto_increment,
       rem_content varchar(100),
       rem_remintime date,
       rem_createtime date,
       u_id int
);


create table inputnameinfo_table 
(
       in_id int primary key auto_increment ,
       in_name varchar(10)
);

create table outputinfo_table
(
       o_id int primary key auto_increment ,
       o_num double,
       o_year varchar(10) , 
       o_month varchar(10),
       o_day varchar(10),
       o_isdel int,
       u_id int,
       on_id int
);


create table incomeinfo_table 
(
       i_id int primary key auto_increment ,
       i_num double ,
       i_year varchar(10),
       i_month varchar(10),
       i_day varchar(10),
       i_isdel int,
       i_createtime date,
       u_id int ,
       in_id int
);

create table outputnameinfo_table
(
       on_id int primary key auto_increment ,
       on_name varchar(20)
);

create table debt_table(
	d_id int primary key auto_increment,
	u_id int ,
	d_num double ,
	d_year varchar(10),
	d_month varchar(10),
	d_day varchar(10),
	d_isdel int,
	d_content text,
	d_formname varchar(20)
);
alter table outputinfo_table 
add CONSTRAINT fk1 
foreign key(on_id) references outputnameinfo_table(on_id);


alter table remindinfo_table 
add CONSTRAINT fk2 
foreign key(u_id) references userinfo_table(u_id);


alter table addressbookinfo_table 
add CONSTRAINT fk3 
foreign key(u_id) references userinfo_table(u_id);

alter table userinfo_table 
add CONSTRAINT fk4 
foreign key(r_id) references role_info(r_id);

alter table incomeinfo_table 
add CONSTRAINT fk5
foreign key(u_id) references userinfo_table(u_id);

alter table incomeinfo_table 
add CONSTRAINT fk6
foreign key(in_id) references inputnameinfo_table(in_id);

alter table debt_table 
add CONSTRAINT fk7
foreign key(u_id) references userinfo_table(u_id);

insert into inputnameinfo_table value(1,'医药');
insert into inputnameinfo_table value(2,'交通');
insert into inputnameinfo_table value(3,'投资');


insert into role_info value(1,'admin')
insert into role_table value(2,'user')