// Matheus Penteado de Barros Pantojo CB3031501

package br.com.ifsp.modelo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ifsp.modelo.Banco;
import br.com.ifsp.modelo.Produto;

@WebServlet("/NovoProdutoServlet")
public class NovoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String unidadeCompraStr = request.getParameter("unidadeCompra");
		String descricao = request.getParameter("descricao");
		String qtdPrevistoMesStr = request.getParameter("qtdPrevistoMes");
		String precoMaxCompradoStr = request.getParameter("precoMaxComprado");
		
		Integer unidadeCompra = Integer.valueOf(unidadeCompraStr);
		Double qtdPrevistoMes = Double.valueOf(qtdPrevistoMesStr);
		Double precoMaxComprado = Double.valueOf(precoMaxCompradoStr);
		
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setDescricao(descricao);
		produto.setQtdPrevistoMes(qtdPrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);
		
		Banco banco = new Banco();
		banco.adiciona(produto);
		
		response.sendRedirect("ListaProdutos");		
	}
}
