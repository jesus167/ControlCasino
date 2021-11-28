CREATE TABLE cliente (
    rut_cliente           VARCHAR2(10) NOT NULL,
    nombre                VARCHAR2(50) NOT NULL,
    apellido_pat_cliente  VARCHAR2(30) NOT NULL,
    apellido_mat_cliente  VARCHAR2(30) NOT NULL,
    area                  VARCHAR2(30) NOT NULL,
    desayuno              CHAR(1) NOT NULL,
    almuerzo              CHAR(1) NOT NULL,
    cena                  CHAR(1) NOT NULL,
    colacion_fria         CHAR(1) NOT NULL,
    colacion_noche        CHAR(1)
);

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( rut_cliente );

CREATE TABLE usuario (
    rut_usuario   VARCHAR2(10) NOT NULL,
    nombre        VARCHAR2(50) NOT NULL,
    apellido_pat  VARCHAR2(30) NOT NULL,
    apellido_mat  VARCHAR2(30) NOT NULL,
    roles         VARCHAR2(30) NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( rut_usuario );

COMMIT;
