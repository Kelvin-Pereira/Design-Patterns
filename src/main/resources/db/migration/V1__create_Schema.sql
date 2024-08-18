CREATE SEQUENCE SEQ_USER START WITH 1 INCREMENT BY 1 MINVALUE 1;

CREATE TABLE design_patterns._USER
(
    ID_USER BIGINT NOT NULL,
    CPF     CHARACTER VARYING(11) UNIQUE,
    EMAIL   CHARACTER VARYING(60),
    NOME    CHARACTER VARYING(255),
    ROLE    CHARACTER VARYING(20),
    CONSTRAINT PRK_ID_USER PRIMARY KEY (ID_USER)
);


INSERT INTO design_patterns._USER (ID_USER, CPF, EMAIL, NOME, ROLE)
VALUES (1, '12345678901', 'johndoe@example.com', 'John Doe', 'ADMIN'),
       (2, '23456789012', 'janesmith@example.com', 'Jane Smith', 'USER'),
       (3, '34567890123', 'robertbrown@example.com', 'Robert Brown', 'MODERATOR'),
       (4, '45678901234', 'emilyjones@example.com', 'Emily Jones', 'USER'),
       (5, '56789012345', 'williamwilliams@example.com', 'William Williams', 'ADMIN');