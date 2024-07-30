create table productteam(product_id int primary key, 
product_name varchar(20) unique, brand varchar(20), product_reviews int,constraint chk_product_reviews check(product_reviews  <= 5), quality varchar(20));
desc productmanagment;
alter table productteam add column price bigint;
alter table productmanagment add constraint chk_price check (price between 10 and 1000);

/insert into productteam values(56, 'T-Shirt', 'Puma', 6, 'good', 999);/
insert into productteam values(56, 'T-shirt', 'Puma', 5, 'good', 999);
insert into productteam values(10, 'Formal-Shirt', 'Allen-Suly', 4, 'best', 500);
insert into productteam values(98, 'Pant', 'Lives', 5, 'better', 799);
insert into productteam values(100, 'Watch', 'Rolex', 5, 'best', 999);
insert into productteam values(152, 'Perfume', 'Wild-Stone', 4, null, 255);
alter table productteam add constraint chk_price check (price between 10 and 1000);

alter table productteam drop constraint chk_price;
select * from productteam;