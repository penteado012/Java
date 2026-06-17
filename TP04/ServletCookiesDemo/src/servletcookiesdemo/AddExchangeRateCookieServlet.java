package servletcookiesdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save-exchange-rates-pair")
public class AddExchangeRateCookieServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String pair =
                request.getParameter(ExchangeRatesServlet.CURRENCY_KEY);

        if (pair != null) {

            Cookie cookie =
                    new Cookie(ExchangeRatesServlet.CURRENCY_KEY, pair);

            cookie.setMaxAge(30 * 24 * 60 * 60);

            response.addCookie(cookie);

            response.sendRedirect("exchange-rate");
        }
    }
}