INSERT INTO caja (idCaja, idEncargadoArea) VALUES (0, NULL);

INSERT INTO deposito (idDeposito, idEncargado) VALUES (0, NULL );

INSERT INTO carta (idCarta) VALUES (0);

INSERT INTO localRestaurante (idLocal) VALUES (0);
INSERT INTO localRestaurante (idLocal) VALUES (1);
INSERT INTO localRestaurante (idLocal) VALUES (2);


INSERT INTO mozo (idMozo, antiguedad, apellido, nombre, porcentajeComision, localRestaurante_idLocal) VALUES (0, 1, 'Hernandez', 'Jose', 25.0, 0);

INSERT INTO encargado (Encargado_type, idEncargado, Apellido, Nombre, localRestaurante_idLocal) VALUES ('areaProduccion', 0, 'Perez', 'Simon', 0);
INSERT INTO encargado (Encargado_type, idEncargado, Apellido, Nombre, localRestaurante_idLocal) VALUES ('areaProduccion', 1, 'Fernandez', 'Carla', 0);
INSERT INTO encargado (Encargado_type, idEncargado, Apellido, Nombre, localRestaurante_idLocal) VALUES ('areaProduccion', 2, 'Soler', 'Augusto', 0);

INSERT INTO areaProduccion (DTYPE, idAreaProduccion, idEncargado, localRestaurante_idLocal) VALUES ('COCINA', 0, 0, 0);
INSERT INTO areaProduccion (DTYPE, idAreaProduccion, idEncargado, localRestaurante_idLocal) VALUES ('CAFETERIA', 1, 1, 0);
INSERT INTO areaProduccion (DTYPE, idAreaProduccion, idEncargado, localRestaurante_idLocal) VALUES ('BARRA', 2, 2, 0);

INSERT INTO insumo (idInsumo, descripcion, fechaCaducidad, fechaCreacion, precio, unidad) VALUES (0 ,'papa', sysdatetime(), sysdatetime(), 14.5, 'kg');
INSERT INTO insumo (idInsumo, descripcion, fechaCaducidad, fechaCreacion, precio, unidad) VALUES (1 ,'Milanesa', sysdatetime(), sysdatetime(), 5, 'kg');


/*INSERT INTO productoComestible (cantidadPedido, puntoPedido, stock, idInsumo) VALUES (10, 5, 5, 0);
INSERT INTO productoComestible (cantidadPedido, puntoPedido, stock, idInsumo) VALUES (10, 9, 10, 1);
*/

INSERT INTO productoComestible (cantidadPedido, puntoPedido, idInsumo) VALUES (10, 5,  0);
INSERT INTO productoComestible (cantidadPedido, puntoPedido,  idInsumo) VALUES (10, 9,  1);

insert into stock (idInsumo, idLocal,  cantidad , tipoArea) VALUES (1,1,5,1);
insert into stock (idInsumo, idLocal,  cantidad , tipoArea) VALUES (1,1,5,0);
insert into stock (idInsumo, idLocal,  cantidad , tipoArea) VALUES (1,0,5,1);
insert into stock (idInsumo, idLocal,  cantidad , tipoArea) VALUES (1,0,5,0);
insert into stock (idInsumo, idLocal,  cantidad , tipoArea) VALUES (0,1,5,1);
insert into stock (idInsumo, idLocal,  cantidad , tipoArea) VALUES (0,1,5,0);
insert into stock (idInsumo, idLocal,  cantidad , tipoArea) VALUES (0,0,5,1);
insert into stock (idInsumo, idLocal,  cantidad , tipoArea) VALUES (0,0,5,0);


INSERT INTO productoSimple (idInsumo) VALUES (0);
INSERT INTO productoSimple (idInsumo) VALUES (1);

INSERT INTO plato (idPlato, comisionExtra, nombrePlato, precio, receta, area_idAreaProduccion) VALUES (0, 10.0, 'Milanesa con Papas Fritas', 100.0, 'Cocinar', 0);
INSERT INTO plato_productoComestible (idPlato, idInsumo) VALUES (0, 0);
INSERT INTO plato_productoComestible (idPlato, idInsumo) VALUES (0, 1);

INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 0, 4, 'LIBRE', sysdatetime(), sysdatetime(), 0);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 1, 4, 'LIBRE', sysdatetime(), sysdatetime(), 1);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 2, 4, 'LIBRE', sysdatetime(), sysdatetime(), 2);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 3, 4, 'LIBRE', sysdatetime(), sysdatetime(), 3);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 4, 4, 'LIBRE', sysdatetime(), sysdatetime(), 4);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 5, 4, 'LIBRE', sysdatetime(), sysdatetime(), 5);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 6, 4, 'LIBRE', sysdatetime(), sysdatetime(), 6);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 7, 6, 'LIBRE', sysdatetime(), sysdatetime(), 7);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 8, 6, 'LIBRE', sysdatetime(), sysdatetime(), 8);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 9, 6, 'LIBRE', sysdatetime(), sysdatetime(), 9);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 10, 6, 'LIBRE', sysdatetime(), sysdatetime(), 10);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple',11, 6, 'LIBRE', sysdatetime(), sysdatetime(), 11);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 12, 6, 'LIBRE', sysdatetime(), sysdatetime(), 12);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 13, 8, 'LIBRE', sysdatetime(), sysdatetime(), 13);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 14, 8, 'LIBRE', sysdatetime(), sysdatetime(), 14);
INSERT INTO mesa (DTYPE, idMesa, cantidadSillas, estadoMesa, horaLiberacion, horaOcupacion, numeroMesa) VALUES ('simple', 15, 8, 'LIBRE', sysdatetime(), sysdatetime(), 15);


