package crud;

//Dupla: Matheus Penteado
//Prontuário: CB3031501 

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Link para voltar ao formulário de cadastro
        out.println("<a href='index.html'>Add New Employee</a>");
        out.println("<h1>Employees List</h1>");
        
        // Busca a lista de funcionários do banco de dados
        List<Emp> list = EmpDao.getAllEmployees();
        
        // Inicia a construção da tabela HTML
        out.print("<table border='1' width='100%'>");
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
        
        // Percorre a lista e cria uma linha (tr) para cada funcionário
        for (Emp e : list) {
            out.print("<tr>"
                + "<td>" + e.getId() + "</td>"
                + "<td>" + e.getName() + "</td>"
                + "<td>" + e.getPassword() + "</td>"
                + "<td>" + e.getEmail() + "</td>"
                + "<td>" + e.getCountry() + "</td>"
                + "<td><a href='EditServlet?id=" + e.getId() + "'>edit</a></td>"
                + "<td><a href='DeleteServlet?id=" + e.getId() + "'>delete</a></td>"
                + "</tr>");
        }
        
        out.print("</table>");
        out.close();
    }
}