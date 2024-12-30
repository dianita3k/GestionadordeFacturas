-- Insertar datos en la tabla Clasificacion
INSERT INTO clasificacion (grupo) VALUES
                                      ('Tecnología'),
                                      ('Muebles'),
                                      ('Deportes');

-- Insertar datos en la tabla Competencia
INSERT INTO competencia (nombre, descripcion) VALUES
                                                  ('Marketing', 'Competencia en estrategias de marketing'),
                                                  ('Gestión', 'Competencia en administración de recursos');

-- Insertar datos en la tabla Persona
INSERT INTO persona (nombre, apellido, dni, celular, correo) VALUES
                                                                 ('Carlos', 'Ramírez', '98765432', '9876543210', 'carlos.ramirez@example.com'),
                                                                 ('Ana', 'López', '12349876', '0987123456', 'ana.lopez@example.com');

-- Insertar datos en la tabla Proveedores
INSERT INTO proveedores (ruc, telefono, pais, correo, moneda) VALUES
                                                                  ('54321098765', '987651234', 'Argentina', 'proveedor3@example.com', 'ARS'),
                                                                  ('65432109876', '123459876', 'Colombia', 'proveedor4@example.com', 'COP');

-- Insertar datos en la tabla Producto
INSERT INTO producto (stock, precio_unitario, unidad, id_clasificacion, id_proveedor, iva) VALUES
                                                                                               (100, 150.0, 'Unidad', 1, 1, TRUE),
                                                                                               (25, 500.0, 'Unidad', 3, 2, FALSE);

-- Insertar datos en tipo_pago
INSERT INTO tipo_pago (id_tipo_pago, tipo, descripcion) VALUES
                                                            (1, 'Cheque', 'Pago mediante cheque bancario'),
                                                            (2, 'Crédito', 'Pago con financiamiento'),
                                                            (3, 'Débito', 'Pago con tarjeta de débito');

-- Insertar datos en factura
INSERT INTO factura (id_factura, id_persona, fecha, id_tipo_pago, descuento, total) VALUES
                                                                                        (1, 2, '2024-12-28', 3, 0.05, 750.0),
                                                                                        (2, 1, '2024-12-29', 1, 0.10, 1350.0);

-- Insertar datos en la tabla ItemFactura
INSERT INTO item_factura (id_factura, id_producto, cantidad, precio, subtotal) VALUES
                                                                                   (1, 1, 4, 150.0, 600.0),
                                                                                   (1, 2, 1, 500.0, 500.0),
                                                                                   (2, 1, 6, 150.0, 900.0);

-- Insertar datos en la tabla Rol
INSERT INTO rol (rol, estado) VALUES
                                  ('User', TRUE),
                                  ('Admin Core', TRUE);

-- Insertar datos en la tabla Usuario
INSERT INTO usuario (id_persona, user, password) VALUES
                                                     (1, 'carlosramirez', 'pass12345'),
                                                     (2, 'analopez', 'mypassword');
