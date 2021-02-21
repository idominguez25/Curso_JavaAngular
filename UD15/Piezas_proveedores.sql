INSERT INTO piezas(nombre) VALUES
	("tornillo pequeño"),
    ("tornillo mediano"),
    ("tornillo grande"),
    ("tuerca pequeña"),
    ("tuerca mediana"),
    ("tuerca grande"),
    ("rueda dentada pequeña"),
    ("rueda dentada mediana"),
    ("rueda dentada grande"),
    ("correa pequeña");

INSERT INTO proveedores(id, nombre) VALUES
    ('0001', "Proveedor 1"),
    ('0002', "Proveedor 2"),
    ('0003', "Proveedor 3"),
    ('0004', "Proveedor 4"),
    ('0005', "Proveedor 5"),
    ('0006', "Proveedor 6"),
    ('0007', "Proveedor 7"),
    ('0008', "Proveedor 8"),
    ('0009', "Proveedor 9"),
    ('0010', "Proveedor 10");

INSERT INTO suministra(Codigo_pieza, ID_Proveedor, precio) VALUES
	(1,0001,10),
    (2,0001,20),
    (3,0001,30),
    (4,0001,10),
    (5,0001,20),
    (6,0001,30),
    (7,0002,50),
    (8,0002,75),
    (10,0009,100),
    (10,0010,115);