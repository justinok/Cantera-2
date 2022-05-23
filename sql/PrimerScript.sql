-- -----------------------------------------------------
-- Schema Ecommerce
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS ecommerce DEFAULT CHARACTER SET utf8 ;
USE ecommerce ;

-- -----------------------------------------------------
-- Creamos Tabla supplier
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Supplier (
    supplier_id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (supplier_id));

-- -----------------------------------------------------
-- Creamos tabla Product
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Product (
    product_id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(80) NOT NULL,
    supply INT NOT NULL,
    price_to_customer VARCHAR(45) NOT NULL,
    PRIMARY KEY (product_id),
    Supplier_supplier_id INT NOT NULL,
    INDEX fk_Product_Supplier1_idx (Supplier_supplier_id ASC) VISIBLE,
    CONSTRAINT fk_Product_Supplier1
    FOREIGN KEY (Supplier_supplier_id)
    REFERENCES Supplier (supplier_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Creamos tavla Customer
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Customer (
    citizenship_id INT NOT NULL AUTO_INCREMENT,
    type_of_id VARCHAR(80) NOT NULL,
    Product_product_id INT NOT NULL,
    quantity_bougth INT NOT NULL,
    active_status VARCHAR(1) NOT NULL,
    PRIMARY KEY (citizenship_id),
    INDEX fk_Customer_Product1_idx (Product_product_id ASC) VISIBLE,
    UNIQUE INDEX citizenship_id_UNIQUE (citizenship_id ASC, type_of_id ASC) VISIBLE,
    CONSTRAINT fk_Customer_Product1
    FOREIGN KEY (Product_product_id)
    REFERENCES ecommerce.Product (product_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);

-- -----------------------------------------------------
-- Creacion de suppliers
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
INSERT INTO Supplier (name)
VALUES ('ali express EU');
INSERT INTO Supplier (name)
VALUES ('ali express');
INSERT INTO Supplier (name)
VALUES ('Mercado libre');
INSERT INTO Supplier (name)
VALUES ('Amazon');
INSERT INTO Supplier (name)
VALUES ('Amazon EU');

-- -----------------------------------------------------
-- Creacion de productos
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
INSERT INTO Product (name, supply, price_to_customer,Supplier_supplier_id)
VALUES ('Fidget Spinner', '1000', '24 USD','1');
INSERT INTO Product (name, supply, price_to_customer,Supplier_supplier_id)
VALUES ('Air frier', '1000', '100 USD','2');
INSERT INTO Product (name, supply, price_to_customer,Supplier_supplier_id)
VALUES ('TikTok Light ring', '600', '57 USD','4');
INSERT INTO Product (name, supply, price_to_customer,Supplier_supplier_id)
VALUES ('PC Gammer', '100', '1500 USD','2');
INSERT INTO Product (name, supply, price_to_customer,Supplier_supplier_id)
VALUES ('Cat toy', '1000', '16 USD','1');
INSERT INTO Product (name, supply, price_to_customer,Supplier_supplier_id)
VALUES ('running shoes', '1000', '27 USD','1');

-- -----------------------------------------------------
-- Creacion de clientes
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
INSERT INTO Customer (citizenship_id, type_of_id, Product_product_id,active_status,quantity_bougth)
VALUES ('1111111', 'C.C', '2','N','3');
INSERT INTO Customer (citizenship_id, type_of_id, Product_product_id,active_status,quantity_bougth)
VALUES ('1111112', 'T.I', '3','N','2');
INSERT INTO Customer (citizenship_id, type_of_id, Product_product_id,active_status,quantity_bougth)
VALUES ('1111113', 'C.C', '4','N','2');
INSERT INTO Customer (citizenship_id, type_of_id, Product_product_id,active_status,quantity_bougth)
VALUES ('1111114', 'C.C', '3','N','1');
INSERT INTO Customer (citizenship_id, type_of_id, Product_product_id,active_status,quantity_bougth)
VALUES ('1111115', 'C.C', '2','N','7');
INSERT INTO Customer (citizenship_id, type_of_id, Product_product_id,active_status,quantity_bougth)
VALUES ('1111116', 'C.C', '4','N','1');
INSERT INTO Customer (citizenship_id, type_of_id, Product_product_id,active_status,quantity_bougth)
VALUES ('1111117', 'C.C', '3','N','2');
INSERT INTO Customer (citizenship_id, type_of_id, Product_product_id,active_status,quantity_bougth)
VALUES ('1111118', 'C.C', '4','N','3');
INSERT INTO Customer (citizenship_id, type_of_id, Product_product_id,active_status,quantity_bougth)
VALUES ('1111119', 'C.C', '5','N','6');
INSERT INTO Customer (citizenship_id, type_of_id, Product_product_id,active_status,quantity_bougth)
VALUES ('1111110', 'C.C', '2','N','5');

-- Veamos que tenemos
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
SELECT Customer.citizenship_id, Customer.type_of_id, Customer.Product_product_id, Customer.active_status
FROM Customer;
-- -----------------------------------------------------
-- Borrado Fisico
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
DELETE FROM Customer
WHERE citizenship_id =1111119;
DELETE FROM Customer
WHERE citizenship_id =1111118;
-- Veamos que tenemos ahora
SELECT Customer.citizenship_id, Customer.type_of_id, Customer.Product_product_id, Customer.active_status
FROM Customer;
-- -----------------------------------------------------
-- Ahora usamos borrado logico para saber que customers recibieron el articulo
-- de forma que simulamos una lista de customers que ya fueron despachados satisfactoriamente
-- Borrado Logico R= Recibed , N= Not yet
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
UPDATE Customer
SET active_status = 'R'
WHERE citizenship_id=1111115;

UPDATE Customer
SET active_status = 'R'
WHERE citizenship_id=1111116;

-- Visualizacion de customers exceptuando los que ya recibieron
-- Vemos que los dos ya no aparecen
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
SELECT citizenship_id, type_of_id, Product_product_id, active_status
FROM Customer
WHERE active_status='N';

-- -----------------------------------------------------
-- Ahora Modificaremos a tres productos en su nombre y
-- en los proveedores
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
UPDATE Product
SET name = 'Fidget spiner version2', Supplier_supplier_id=3
WHERE name= 'Fidget Spinner';
UPDATE Product
SET name = 'PC Gammer version2', Supplier_supplier_id=3
WHERE name= 'PC Gammer';
UPDATE Product
SET name = 'TikTok Light ring version2', Supplier_supplier_id=3
WHERE name= 'TikTok Light ring';

-- Veamos que tenemos ahora
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
SELECT product_id, name, supply, price_to_customer, Supplier_supplier_id
FROM Product;

