// Nome: Matheus Penteado CB3031501
package com.bookstore.model;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private float price;

    // Construtor Padrão
    public Book() {
    }

    // Construtor Completo
    public Book(int bookId, String title, String author, float price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Construtor sem o ID (útil para quando formos cadastrar um livro novo e o banco gerar o ID automático)
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // --- GETTERS E SETTERS ---

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}