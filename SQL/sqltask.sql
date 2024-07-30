create database sqltask2;
create table bank_informatio(id int not null, bank_id int, bank_name varchar(20), 
ifsc varchar(20), primary key(bank_id));

select * from bank_informatio;
alter table bank_informatio add column noofaccount_holders int unique;

insert into bank_informatio values(1, 102, 'Canara', 'CAN2002', 200);
/* error - insert into bank_details values(2, 102, 'SBI', 'SBI2003', 800);*/
insert into bank_informatio values(1, 103, 'SBI', 'SBI4085', 800);
update bank_informatio set id = 2 where bank_id = 103;
insert into bank_informatio values(3, 201, 'ICIC', 'ICIC4085', 700);
insert into bank_informatio values(4, 402, 'Muthur', 'Mut5007', 550);
insert into bank_informatio values(5, 802, 'BankofBaroda', 'BB3585', 400);
alter table bank_informatio add column noofbranch int;
update bank_informatio set noofbranch = 4 where bank_id = 102;
update bank_informatio set noofbranch = 3 where bank_id = 802;

alter table bank_informatio add constraint chk_noofbranches check(noofbranch <= 10);
update bank_informatio set noofbranch = 5 where bank_id = 201;
alter table bank_informatio drop constraint chk_noofbranches;
insert into bank_informatio values(6, 807, 'GraminaBnak','GB708', 100, 9);
desc bank_informatio;


create table Amzon(item_id int, item_name varchar(20) unique, order_id int, cus_id int not null, noofitems int, constraint chk_noofitems check(noofitems < 15), primary key(order_id));
select * from Amzon;
alter table Amzon add column noofnotification int;
alter table Amzon add constraint chk_notification check(noofnotification < 5);
insert into Amzon values(10, 'Watch', 12, 15, 14, 4);
insert into Amzon values(45, 'TV remote', 89, 45, 13, 1);
insert into Amzon values(89, 'Perfume', 102, 65, 1, 4);
insert into Amzon values(79, 'TV', 75, 106, 10, 2);
insert into Amzon values(80, 'CoffeewendingMachine', 906, 702, 18, 9);
insert into Amzon values(85, 'WAshingmachine', 907, 710, 14, 1);

alter table Amzon drop constraint chk_notification;

create table productteam1(product_id int, product_name varchar(20) unique, brand varchar(20), product_reviews int,constraint chk_product_reviews check(product_reviews  <= 5), quality varchar(20));
desc productteam1;
alter table productteam1 add column price bigint;
alter table productteam1 add constraint chk_price check (price between 10 and 1000);

insert into productteam1 values(56, 'T-Shirt', 'Puma', 6, 'good', 999);/
insert into productteam1 values(56, 'T-shirt', 'Puma', 5, 'good', 999);
insert into productteam1 values(10, 'Formal-Shirt', 'Allen-Suly', 4, 'best', 500);
insert into productteam1 values(98, 'Pant', 'Lives', 5, 'better', 799);
insert into productteam1 values(100, 'Watch', 'Rolex', 5, 'best', 999);
insert into productteam1 values(152, 'Perfume', 'Wild-Stone', 4, null, 255);
alter table productteam1 add constraint chk_price check (price between 10 and 1000);

alter table productteam1 drop constraint chk_price;
