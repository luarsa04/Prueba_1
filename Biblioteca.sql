CREATE DATABASE IF NOT EXISTS Biblioteca;
USE biblioteca;

CREATE TABLE Autor( 
    nombre VARCHAR(15) PRIMARY KEY,
    nacio VARCHAR(15),
    nacionalidad VARCHAR(15)
    );

CREATE TABLE Libro(
    Titulo VARCHAR(15) PRIMARY KEY,
    pagina INT,
    idioma VARCHAR(15)
);

CREATE TABLE edicion(
    ISBN INT,
    año INT
);

CREATE TABLE copia(
    numero char(9),
    precio DECIMAL(7,2)
);

CREATE TABLE usuario(
    ID_user INT PRIMARY KEY,
    nombre VARCHAR(15),
    apellido VARCHAR(15),
    domicilio VARCHAR(15)
);