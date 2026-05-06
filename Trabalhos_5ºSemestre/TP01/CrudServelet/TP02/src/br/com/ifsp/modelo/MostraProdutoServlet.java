// Matheus Penteado de Barros Pantojo CB3031501

package br.com.ifsp.modelo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostraProdutoServlet
 */
@WebServlet("/MostraProdutoServlet")
public class MostraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idPram = request.getParameter("id");
		Integer id = Integer.valueOf(idPram);
		
		Banco banco = new Banco();
		Produto produto = banco.buscaProdutoPeloId(id);
		
		request.setAttribute("produto", produto);
		
		request.getRequestDispatcher("/formAlteraProduto.jsp").forward(request, response);;
	}
}
