// Matheus Penteado de Barros Pantojo CB3031501

package br.com.ifsp.modelo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AlteraProdutoServlet")
public class AlteraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		String nome = request.getParameter("nome");
		Integer unidadeCompra = Integer.valueOf(request.getParameter("unidadeCompra"));
		String descricao = request.getParameter("descricao");
		Double qtdPrevistoMes = Double.valueOf(request.getParameter("qtdPrevistoMes"));
		Double precoMaxComprado = Double.valueOf(request.getParameter("precoMaxComprado"));
		
		Banco banco = new Banco();
		Produto produto = banco.buscaProdutoPeloId(id);
		
		produto.setNome(nome);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setDescricao(descricao);
		produto.setQtdPrevistoMes(qtdPrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);
		
		response.sendRedirect("ListaProdutos");
	
	}

}
