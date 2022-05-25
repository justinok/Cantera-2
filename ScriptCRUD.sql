CREATE DATABASE DBCrudHomework ;
USE DBCrudHomework;
CREATE TABLE Tb_tarea
(
Id INTEGER AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(200),
number VARCHAR(20),
e_mail VARCHAR(200) UNIQUE,
born_date date,
Finalizado bool
);

INSERT INTO Tb_tarea(name,number,e_mail,born_date,Finalizado) VALUES('Justin','3209878970','melo@invento.com', '2022-05-09',False);
INSERT INTO Tb_tarea(name,number,e_mail,born_date,Finalizado) VALUES('juansito','3209878942','melo@invento2.com', '2022-03-09',False);

