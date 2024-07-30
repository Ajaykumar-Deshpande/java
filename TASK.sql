create database assignment;
use assignment;
create table movie(movie_id int, release_year int, director varchar(20), movie_rating int, movie_type varchar(20));
alter table movie add column title varchar(20);
alter table movie add column producer varchar(20);
alter table movie add column hero varchar(20);
alter table movie add column vial varchar(20);
alter table movie add column duration int;



drop table movie;
  
  
create table movie(release_year int, director varchar(20), movie_rating int, movie_type varchar(20),moviebudjet bigint);
alter table movie add column title varchar(20);
alter table movie add column producer varchar(20);
alter table movie add column hero varchar(20);
alter table movie add column vial varchar(20);
alter table movie add column attendingmovie boolean;

desc movie;
insert into movie values(2001, 'Kishor', 5, 'Action', 200000, 'Kalsipalaya', 'Kumar', 'Darshan', 'Rahul', true); 
select * from movie;
select count(*) from movie;
insert into movie values(2010, 'Rohit', 5, 'Action', 5000000, 'Baby', 'Rakesh', 'Akashy_kumar', 'Rohan', false);
insert into movie values(2020, 'Prashant_nil', 5,'Action', 6000000, 'KGF', 'Sanjay', 'Yash', 'Garuda', true);
insert into movie values(2022, 'Yogesh', 4, 'detective', 500000, 'Lost', 'Rahul', 'Yami_Gautam', 'Pakaj_Kpur', true);
insert into movie values(2022, 'R. Balki', 4, 'detective', 1000000, 'Chup', 'Hope production', 'Sunry_Deol', 'salmaan', false);
insert into movie values(2022, 'Jalmari Helander', 5, 'Action', 2000000, 'SISU', 'Joseph', 'Arnold', 'British_army', true);
insert into movie values(2024, 'Amit_Sharma', 4, 'Biopic', 3000000, 'Maidaan', 'Akash_Chawla', 'Ajay Devgan', '  ', true);
insert into movie values(2024, 'Raghav_Nayak', 3, 'Thriller', 3000000, 'O2', 'PRK_Productions', 'Ashika_Rangnath', 'Goplakrishna', false);
insert into movie values(2024, 'D_Suresh_Babu', 5, 'Biopic', 5000000, '10th_Fail', 'Vinod Chopra Films', 'Vikrant Massey', '   ', true);
insert into movie values(2024, 'Randeep_Hooda', 5, 'Petriyotic', 30000000, 'Veer_Savarkar', 'Yogesh Rahar', 'Randeep_Hooda', 'British_Forces', true);


update movie set moviebudjet = 40000000 where title = 'Veer_Savarkar';
update movie set movie_rating = 4 where title = 'Baby';
update movie set moviebudjet = 50000000 where title = 'Veer_Savarkar';
update movie set movie_rating = 3 where producer = 'Hope production';
update movie set release_year = 2024 where title = 'Lost';
update movie set hero = 'Akashy_Kumar' where title = 'Chup';
update movie set moviebudjet = 8000000 where producer = 'Vinod Chopra Films';
alter table movie rename column vial to vilan;
update movie set attendingmovie = false where movie_type = 'Thriller';
update movie set director = 'Yogesh' where movie_type = 'detective';

use assignment;

ALTER TABLE bank_details RENAME column noofemployees TO employeecount;
alter TABLE bank_details RENAME COLUMN managername to manager; 
alter table bank_details rename column accountholdername to customername;
alter table bank_details rename column noofaccountholders to accountholdercount;