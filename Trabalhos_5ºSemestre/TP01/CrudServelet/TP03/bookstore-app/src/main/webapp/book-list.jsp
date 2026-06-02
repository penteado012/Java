<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.bookstore.model.Book" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Livraria - Painel de Controle</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f7f6;
            color: #333;
            margin: 0;
            padding: 40px;
        }
        .container {
            max-width: 1000px;
            margin: 0 auto;
            background: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0,0,0,0.05);
        }
        h2 {
            color: #2c3e50;
            border-bottom: 2px solid #ecf0f1;
            padding-bottom: 10px;
            margin-top: 0;
        }
        form {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
            gap: 15px;
            background: #f8f9fa;
            padding: 20px;
            border-radius: 6px;
            margin-bottom: 30px;
            align-items: end;
        }
        .form-group {
            display: flex;
            flex-direction: column;
        }
        label {
            font-size: 14px;
            font-weight: 600;
            margin-bottom: 5px;
            color: #34495e;
        }
        input {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
        }
        button {
            padding: 11px 20px;
            background-color: #2ecc71;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
            transition: background 0.2s;
        }
        button:hover { background-color: #27ae60; }
        .btn-cancelar {
            padding: 11px 20px;
            background-color: #95a5a6;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            text-align: center;
            font-size: 14px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 10px;
        }
        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #e2e8f0;
        }
        th {
            background-color: #f8f9fa;
            color: #4a5568;
            font-weight: 600;
        }
        tr:hover { background-color: #f7fafc; }
        .btn-edit {
            color: #3498db;
            text-decoration: none;
            font-weight: 600;
            margin-right: 15px;
        }
        .btn-del {
            color: #e74c3c;
            text-decoration: none;
            font-weight: 600;
        }
        .footer {
            margin-top: 40px;
            text-align: center;
            font-size: 14px;
        }
        .footer a {
            color: #3498db;
            text-decoration: none;
            font-weight: bold;
        }
    </style>
</head>
<body>

<div class="container">
    <%
        Book bookForm = (Book) request.getAttribute("book");
    %>

    <h2><%= (bookForm != null) ? "📝 Editar Detalhes do Livro" : "📚 Cadastrar Novo Livro" %></h2>
    
    <form action="<%= (bookForm != null) ? "update" : "insert" %>" method="post">
        
        <% if (bookForm != null) { %>
            <input type="hidden" name="id" value="<%= bookForm.getBookId() %>" />
        <% } %>

        <div class="form-group">
            <label>Título:</label>
            <input type="text" name="title" value="<%= (bookForm != null) ? bookForm.getTitle() : "" %>" required />
        </div>
        
        <div class="form-group">
            <label>Autor:</label>
            <input type="text" name="author" value="<%= (bookForm != null) ? bookForm.getAuthor() : "" %>" required />
        </div>
        
        <div class="form-group">
            <label>Preço (R$):</label>
            <input type="number" step="0.01" name="price" value="<%= (bookForm != null) ? bookForm.getPrice() : "" %>" required />
        </div>
        
        <div class="form-group" style="flex-direction: row; gap: 10px;">
            <button type="submit">
                <%= (bookForm != null) ? "Atualizar" : "Salvar" %>
            </button>
            <% if (bookForm != null) { %>
                <a href="books" class="btn-cancelar">Cancelar</a>
            <% } %>
        </div>
    </form>

    <h2>📋 Livros Disponíveis no Acervo</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Título</th>
                <th>Autor</th>
                <th>Preço</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Book> listBook = (List<Book>) request.getAttribute("listBook");
                if (listBook != null && !listBook.isEmpty()) {
                    for (Book book : listBook) {
            %>
            <tr>
                <td><%= book.getBookId() %></td>
                <td><strong><%= book.getTitle() %></strong></td>
                <td><%= book.getAuthor() %></td>
                <td>R$ <%= String.format("%.2f", book.getPrice()) %></td>
                <td>
                    <a class="btn-edit" href="edit?id=<%= book.getBookId() %>">Editar</a>
                    <a class="btn-del" href="delete?id=<%= book.getBookId() %>" onclick="return confirm('Deseja mesmo remover este livro permanentemente?');">Excluir</a>
                </td>
            </tr>
            <% 
                    }
                } else {
            %>
            <tr>
                <td colspan="5" style="text-align: center; color: #95a5a6; padding: 30px;">Nenhum livro cadastrado no banco de dados.</td>
            </tr>
            <% } %>
        </tbody>
    </table>

    <div class="footer">
        <p>Sistema desenvolvido por <a href="creditos.jsp">Matheus Penteado</a></p>
    </div>
</div>

</body>
</html>