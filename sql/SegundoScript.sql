-- -----------------------------------------------------
-- Consulta SQL donde pueda obtener los productos vendidos digitando
-- tipo de documento y número de documento.
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
SELECT Product_product_id,quantity_bougth
FROM Customer
WHERE citizenship_id = 1111110
AND type_of_id='C.C';
-- -----------------------------------------------------
-- Consultar productos por medio del nombre, el cual debe
-- mostrar quien o quienes han sido sus proveedores.
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------
SELECT product_id, name, supply, price_to_customer, Supplier_supplier_id
FROM Product
WHERE name='Cat toy';
-- -----------------------------------------------------
-- [PLUS no obligatorio] Crear una consulta que me permita
-- ver qué producto ha sido el más vendido y en qué cantidades de mayor a menor.
-- @version 1.0.0 2022-05-20
-- @author justin alejandro diaz - jusadiazjim@unal.edu.co
-- @since 1.0.0
-- -----------------------------------------------------

SELECT Product_product_id, SUM(quantity_bougth) AS total_products_sold
FROM Customer
GROUP BY Product_product_id;
