<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="br.com.ifsp.modelo.Produto" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Editar Produto</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f8f9fa; padding-top: 50px; }
        .container { max-width: 600px; background: white; padding: 30px; border-radius: 10px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); }
    </style>
</head>
<body>
    <div class="container">
        <%
            // Pegando o produto que o Servlet enviou
            Produto produto = (Produto) request.getAttribute("produto");
        %>
        
        <h2 class="text-center mb-3">Editar Produto</h2>
        <p class="text-center text-muted small mb-4">Ajustando os detalhes de: <strong><%= produto.getNome() %></strong> (ID: <%= produto.getId() %>)</p>
        
        <form action="AlteraProdutoServlet" method="POST">
            <input type="hidden" name="id" value="<%= produto.getId() %>">
            
            <div class="mb-3">
                <label class="form-label">Nome do Produto</label>
                <input type="text" class="form-control" name="nome" value="<%= produto.getNome() %>" required>
            </div>
            
            <div class="mb-3">
                <label class="form-label">Descrição</label>
                <textarea class="form-control" name="descricao" rows="2" required><%= produto.getDescricao() %></textarea>
            </div>
            
            <div class="row">
                <div class="col-md-6 mb-3">
                    <label class="form-label">Unidade de Compra</label>
                    <input type="number" class="form-control" name="unidadeCompra" value="<%= produto.getUnidadeCompra() %>" required>
                </div>
                <div class="col-md-6 mb-3">
                    <label class="form-label">Qtd. Prevista Mês</label>
                    <input type="number" step="0.01" class="form-control" name="qtdPrevistoMes" value="<%= produto.getQtdPrevistoMes() %>" required>
                </div>
            </div>
            
            <div class="mb-4">
                <label class="form-label">Preço Máximo</label>
                <div class="input-group">
                    <span class="input-group-text">R$</span>
                    <input type="number" step="0.01" class="form-control" name="precoMaxComprado" value="<%= produto.getPrecoMaxComprado() %>" required>
                </div>
            </div>
            
            <div class="d-grid gap-2">
                <button type="submit" class="btn btn-warning btn-lg">Confirmar Alteração</button>
                <a href="ListaProdutos" class="btn btn-outline-secondary">Cancelar</a>
            </div>
        </form>
        
        <hr class="mt-5">
        <p class="text-center text-secondary small">Desenvolvido por: Matheus Penteado de Barros Pantojo</p>
    </div>
</body>
</html>