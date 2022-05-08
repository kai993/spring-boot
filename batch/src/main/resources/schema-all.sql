drop table people if exists;

create table people (
  person_id bigint identity not null primary key,
  first_name varchar(20),
  last_name varchar(20)
);
