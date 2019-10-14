-- Generado por Oracle SQL Developer Data Modeler 19.2.0.182.1216
--   en:        2019-10-11 20:55:47 CST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE alumno (
    alumno_id          VARCHAR2(25)
        CONSTRAINT nnc_alumno_carne NOT NULL,
    nombre             VARCHAR2(100),
    correo             VARCHAR2(50),
    telefono           VARCHAR2(12),
    direccion          VARCHAR2(125),
    genero_genero_id   INTEGER NOT NULL,
    ciudad_codigo      VARCHAR2(10 CHAR) NOT NULL
)
LOGGING;

ALTER TABLE alumno ADD CONSTRAINT alumno_pk PRIMARY KEY ( alumno_id );

CREATE TABLE ciudad (
    codigo               VARCHAR2(10 CHAR) NOT NULL,
    descripcion_ciudad   VARCHAR2(50 CHAR)
)
LOGGING;

ALTER TABLE ciudad ADD CONSTRAINT ciudad_pk PRIMARY KEY ( codigo );

CREATE TABLE genero (
    genero_id     INTEGER
        CONSTRAINT nnc_genero_codigo NOT NULL,
    descripcion   VARCHAR2(25)
        CONSTRAINT nnc_genero_descripcion NOT NULL
)
LOGGING;

ALTER TABLE genero ADD CONSTRAINT genero_pk PRIMARY KEY ( genero_id );

ALTER TABLE alumno
    ADD CONSTRAINT alumno_ciudad_fk FOREIGN KEY ( ciudad_codigo )
        REFERENCES ciudad ( codigo )
    NOT DEFERRABLE;

ALTER TABLE alumno
    ADD CONSTRAINT alumno_genero_fk FOREIGN KEY ( genero_genero_id )
        REFERENCES genero ( genero_id )
    NOT DEFERRABLE;



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             3
-- CREATE INDEX                             0
-- ALTER TABLE                              5
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
