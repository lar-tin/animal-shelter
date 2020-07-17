CREATE TABLE animal(
                        id SERIAL PRIMARY KEY,
                        type VARCHAR (20) NOT NULL,
                        name VARCHAR (50) NOT NULL,
                        gender VARCHAR (20)
);

insert into animal (type, name, gender) values ('CAT', 'Jori', 'MALE');
insert into animal (type, name, gender) values ('CAT', 'Aras', 'MALE');
insert into animal (type, name, gender) values ('CAT', 'Fahri', 'MALE');
