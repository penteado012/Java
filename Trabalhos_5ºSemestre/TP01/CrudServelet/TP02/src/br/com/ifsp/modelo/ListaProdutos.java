// Matheus Penteado de Barros Pantojo CB3031501

package br.com.ifsp.modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ifsp.modelo.Banco;
import br.com.ifsp.modelo.Produto;

@WebServlet("/ListaProdutos")
public class ListaProdutos extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Banco banco = new Banco();
        List<Produto> lista = banco.getProdutos();
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Início do HTML com Bootstrap
        out.println("<html><head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Lista de Produtos</title>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">");
        out.println("</head>");
        out.println("<body class=\"container mt-5\">");
        
        out.println("<div class=\"d-flex justify-content-between align-items-center mb-4\">");
        out.println("  <h2>Produtos Cadastrados</h2>");
        out.println("  <a href=\"novoProduto.html\" class=\"btn btn-success\">+ Novo Produto</a>");
        out.println("</div>");
        
        // Criando a Tabela
        out.println("<table class=\"table table-striped table-hover shadow-sm\">");
        out.println("  <thead class=\"table-dark\">");
        out.println("    <tr><th>ID</th><th>Nome</th><th>Descrição</th><th>Ações</th></tr>");
        out.println("  </thead>");
        out.println("  <tbody>");
        
        for (Produto p : lista) {
            out.println("    <tr>");
            out.println("      <td>" + p.getId() + "</td>");
            out.println("      <td>" + p.getNome() + "</td>");
            out.println("      <td>" + p.getDescricao() + "</td>");
            out.println("      <td>");
            out.println("        <a class=\"btn btn-sm btn-warning me-2\" href=\"MostraProdutoServlet?id=" + p.getId() + "\">Editar</a>");
            out.println("        <a class=\"btn btn-sm btn-danger\" href=\"RemoveProdutoServlet?id=" + p.getId() + "\">Remover</a>");
            out.println("      </td>");
            out.println("    </tr>");
        }
        
        out.println("  </tbody>");
        out.println("</table>");
        
        // Rodapé com links
        out.println("<div class=\"mt-4\">");
        out.println("  <a href=\"creditos.jsp\" class=\"text-decoration-none text-secondary small\">Ver Créditos</a>");
        out.println("</div>");
        
        out.println("</body></html>");
    }
}