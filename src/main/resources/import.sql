/* Populate tabla clientes */
INSERT INTO regiones(id, nombre) VALUES (1, 'Sudamerica');
INSERT INTO regiones(id, nombre) VALUES (2, 'Centro America');
INSERT INTO regiones(id, nombre) VALUES (3, 'Norteamerica');
INSERT INTO regiones(id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones(id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones(id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones(id, nombre) VALUES (7, 'Oceania');
INSERT INTO regiones(id, nombre) VALUES (8, 'Antartida');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'Andres', 'Guzmán', 'profesor@bolsadeideas.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, 'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, 'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(7, 'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');

INSERT INTO usuarios (username, password, enable, nombre, apellido, email) VALUES ('miguel', '$2a$10$j2idwqfNasMa6Uw65ahxzO8.YgKA2DkZKz2odvhfmbcPOvIQ4AqzW', 1, 'Miguel','Chinchay', 'miguel@tuna.pe');
INSERT INTO usuarios (username, password, enable, nombre, apellido, email) VALUES ('admin', '$2a$10$jIfPlHBgdmD99JAiWTYiLOzjjooXuVN2edwhVMoe0kpJ3aFm9cS7G', 1, 'Admin','Xinxay', 'admin@tuna.pe');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);

/* insert productos  */
INSERT INTO productos(nombre, precio, create_at) VALUES ('Panasonic Pantalla LED', 2156.23, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Sony camara digital', 156.23, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Apple Ipod Shuffle', 56.23, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Sony Notebook Z110', 223.23, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Hewlett Packard multifuncional', 876.23, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Bianchi bicicleta Aro 26', 517.23, NOW());
INSERT INTO productos(nombre, precio, create_at) VALUES ('Mica comoda 5 cajones', 983.23, NOW());

INSERT INTO facturas(descripcion, observacion, cliente_id, create_at) VALUES ('Factura equipos de oficina', null, 1, NOW());
INSERT INTO facturas_items(cantidad, factura_id, producto_id) VALUES (1, 1, 1);
INSERT INTO facturas_items(cantidad, factura_id, producto_id) VALUES (2, 1, 4);
INSERT INTO facturas_items(cantidad, factura_id, producto_id) VALUES (1, 1, 5);
INSERT INTO facturas_items(cantidad, factura_id, producto_id) VALUES (1, 1, 7);

INSERT INTO facturas(descripcion, observacion, cliente_id, create_at) VALUES ('Factura bicicleta', 'Alguna nota importante', 1, NOW());
INSERT INTO facturas_items(cantidad, factura_id, producto_id) VALUES (3, 2, 6);