-- Eliminar tablas existentes si ya existen
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS rol;
DROP TABLE IF EXISTS tipo_pago;
DROP TABLE IF EXISTS item_factura;
DROP TABLE IF EXISTS factura;
DROP TABLE IF EXISTS producto;
DROP TABLE IF EXISTS proveedores;
DROP TABLE IF EXISTS persona;
DROP TABLE IF EXISTS competencia;
DROP TABLE IF EXISTS clasificacion;

-- Crear tabla Clasificacion
CREATE TABLE clasificacion (
                               id_clasificacion INT AUTO_INCREMENT PRIMARY KEY,
                               grupo VARCHAR(200)
);

-- Crear tabla Competencia
CREATE TABLE competencia (
                             id_competencia INT AUTO_INCREMENT PRIMARY KEY,
                             nombre VARCHAR(100),
                             descripcion VARCHAR(200)
);

-- Crear tabla Persona
CREATE TABLE persona (
                         id_persona INT AUTO_INCREMENT PRIMARY KEY,
                         nombre VARCHAR(100) NOT NULL,
                         apellido VARCHAR(50),
                         dni VARCHAR(20),
                         celular VARCHAR(10),
                         correo VARCHAR(255)
);

-- Crear tabla Proveedores
CREATE TABLE proveedores (
                             id_proveedor INT AUTO_INCREMENT PRIMARY KEY,
                             ruc VARCHAR(20),
                             telefono VARCHAR(10),
                             pais VARCHAR(255),
                             correo VARCHAR(100),
                             moneda VARCHAR(50)
);

-- Crear tabla Producto
CREATE TABLE producto (
                          id_producto INT AUTO_INCREMENT PRIMARY KEY,
                          stock INT,
                          precio_unitario DOUBLE,
                          unidad VARCHAR(50),
                          id_clasificacion INT,
                          id_proveedor INT,
                          iva BOOLEAN,
                          FOREIGN KEY (id_clasificacion) REFERENCES clasificacion(id_clasificacion),
                          FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedor)
);

-- Crear tabla tipo_pago
CREATE TABLE tipo_pago (
                           id_tipo_pago INT AUTO_INCREMENT PRIMARY KEY,
                           tipo VARCHAR(50) NOT NULL,
                           descripcion VARCHAR(255)
);

-- Crear tabla factura
CREATE TABLE factura (
                         id_factura INT AUTO_INCREMENT PRIMARY KEY,
                         id_persona INT NOT NULL,
                         fecha DATE NOT NULL,
                         id_tipo_pago INT NOT NULL,
                         descuento DECIMAL(10, 2),
                         total DECIMAL(10, 2),
                         CONSTRAINT fk_factura_tipo_pago FOREIGN KEY (id_tipo_pago) REFERENCES tipo_pago (id_tipo_pago)
);

-- Crear tabla ItemFactura
CREATE TABLE item_factura (
                              id_item_factura INT AUTO_INCREMENT PRIMARY KEY,
                              id_factura INT NOT NULL,
                              id_producto INT NOT NULL,
                              cantidad INT,
                              precio DOUBLE,
                              subtotal DOUBLE,
                              FOREIGN KEY (id_factura) REFERENCES factura(id_factura),
                              FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

-- Crear tabla Rol
CREATE TABLE rol (
                     id_rol INT AUTO_INCREMENT PRIMARY KEY,
                     rol VARCHAR(50),
                     estado BOOLEAN
);

-- Crear tabla Usuario
CREATE TABLE usuario (
                         id_usuario INT AUTO_INCREMENT PRIMARY KEY,
                         id_persona INT NOT NULL,
                         user VARCHAR(50),
                         password VARCHAR(255),
                         FOREIGN KEY (id_persona) REFERENCES persona(id_persona)
);
