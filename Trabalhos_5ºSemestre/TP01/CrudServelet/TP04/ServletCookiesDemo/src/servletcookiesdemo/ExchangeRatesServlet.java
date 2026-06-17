package servletcookiesdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exchange-rate")
public class ExchangeRatesServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public static final String CURRENCY_KEY = "currencyPair";

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        String currencyPair = null;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (CURRENCY_KEY.equals(c.getName())) {
                    currencyPair = c.getValue();
                    break;
                }
            }
        }

        if (currencyPair != null) {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            int rate = (int) ((Math.random() + 1) * 100);

            out.println("<h2>Taxa de câmbio</h2>");
            out.println("<p>" + currencyPair + " = " + rate + "</p>");
            out.println("<a href='remove-currency-pair'>Remover seleção</a>");

        } else {

            RequestDispatcher rd =
                    request.getRequestDispatcher("/currencySelection.html");

            rd.forward(request, response);
        }
        
    }
    
    
}