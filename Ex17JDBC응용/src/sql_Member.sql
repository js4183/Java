/*
 *table명 : memberInfo
 *문자(크기 30) id,
 *문자(크기 30) pw,
 *문자(크기 30) nick,
 *숫자(20) age
 *를 구성하는 테이블 생성!
 */
create table memberInfo(
id varchar2(30),
pw varchar2(30),
nick varchar2(30),
age number(20)
);

insert into memberInfo values('test1', '121', 'test1', 20);
insert into memberInfo values('test2', '122', 'test2', 24);
insert into memberInfo values('test3', '123', 'test3', 21);
insert into memberInfo values('test4', '124', 'test4', 29);

select * from memberInfo;

select id,nick from memberInfo;