DROP TABLE IF EXISTS customer;

CREATE TABLE customer
(
  uid VARCHAR(50),
  uname VARCHAR(50) not null,
  upass VARCHAR(100) not null,
  uemail      VARCHAR(50),
  urole    VARCHAR(20)
);

alter table customer
  add primary key (uid);
  
  
