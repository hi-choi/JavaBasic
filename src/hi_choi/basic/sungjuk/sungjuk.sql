create table sungjuk(
    sjno int auto_increment,
    name varchar(10) not null,
    kor int default 0,
    eng int default 0,
    mat int default 0,
    tot int ,
    mean decimal(5,1),
    grd char(2),
    regdate datetime default current_timestamp,
    primary key(sjno)
);