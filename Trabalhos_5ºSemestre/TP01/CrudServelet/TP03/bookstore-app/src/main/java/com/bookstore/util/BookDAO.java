// Nome: Matheus Penteado CB3031501

package com.bookstore.util;

import com.bookstore.model.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    // 1. LISTAR TODOS (Você já tem esse)
    public List<Book> listAllBooks() throws SQLException {
        List<Book> listBook = new ArrayList<>();
        String sql = "SELECT * FROM book";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("book_id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                float price = resultSet.getFloat("price");
                Book book = new Book(id, title, author, price);
                listBook.add(book);
            }
        }
        return listBook;
    }

    // 2. INSERIR (Você já tem esse)
    public boolean insertBook(Book book) throws SQLException {
        String sql = "INSERT INTO book (title, author, price) VALUES (?, ?, ?)";
        boolean rowInserted = false;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setFloat(3, book.getPrice());
            rowInserted = statement.executeUpdate() > 0;
        }
        return rowInserted;
    }

    // 3. NOVO: DELETAR UM LIVRO
    public boolean deleteBook(Book book) throws SQLException {
        String sql = "DELETE FROM book WHERE book_id = ?";
        boolean rowDeleted = false;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, book.getBookId());
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    // 4. NOVO: ATUALIZAR UM LIVRO (EDITAR)
    public boolean updateBook(Book book) throws SQLException {
        String sql = "UPDATE book SET title = ?, author = ?, price = ? WHERE book_id = ?";
        boolean rowUpdated = false;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setFloat(3, book.getPrice());
            statement.setInt(4, book.getBookId());
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    // 5. NOVO: BUSCAR UM LIVRO PELO ID (Necessário para carregar os dados na tela de edição)
    public Book getBook(int id) throws SQLException {
        Book book = null;
        String sql = "SELECT * FROM book WHERE book_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String title = resultSet.getString("title");
                    String author = resultSet.getString("author");
                    float price = resultSet.getFloat("price");
                    book = new Book(id, title, author, price);
                }
            }
        }
        return book;
    }
}