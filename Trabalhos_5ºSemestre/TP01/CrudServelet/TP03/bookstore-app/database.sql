-- Script para criação do banco de dados da aplicação de Livros
CREATE DATABASE IF NOT EXISTS bookstore;
USE bookstore;

CREATE TABLE book (
  book_id int(11) NOT NULL AUTO_INCREMENT,
  title varchar(128) NOT NULL,
  author varchar(64) NOT NULL,
  price float NOT NULL,
  PRIMARY KEY (book_id),
  UNIQUE KEY book_id_UNIQUE (book_id)
);