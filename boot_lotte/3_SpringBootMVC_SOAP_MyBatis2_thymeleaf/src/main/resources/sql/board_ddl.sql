drop table if exists board;
drop sequence if exists board_seq;

create table board 
(
    num numeric(4) primary key,
    title varchar(40),
    author  varchar(20),
    content varchar(100),
    write_day  date  default  current_date,
    readcnt   numeric(4) default   0
);

create sequence board_seq;