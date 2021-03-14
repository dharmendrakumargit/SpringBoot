create table person(
id integer not null,
name varchar(255) not null,
location varchar,
birthdate timestamp,
primary key(id)
);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDATE) VALUES(10001,'Dharmendra','Bangalore',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDATE) VALUES(10002,'Parasanna','Chennai',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTHDATE) VALUES(10003,'Nehra','Delhi',sysdate());
