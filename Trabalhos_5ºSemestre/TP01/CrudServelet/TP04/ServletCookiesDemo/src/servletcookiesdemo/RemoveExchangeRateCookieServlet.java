package servletcookiesdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/remove-currency-pair")
public class RemoveExchangeRateCookieServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {

            for (Cookie c : cookies) {

                if (ExchangeRatesServlet.CURRENCY_KEY
                        .equals(c.getName())) {

                    c.setMaxAge(0);

                    response.addCookie(c);

                    response.sendRedirect("currencySelection.html");
                    return;
                }
            }
        }

        response.getWriter().println("Cookie não encontrado.");
    }
}