package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/registration")
public class RegistrationServlet extends HttpServlet {
    /*
         0 1 2
        [1,2,3]

        [0, 1], [1,2], [2,3]

        [3,1] [7,3] [5,2]

        Session

        as sd we we as
        [as, 2]
        [sd, 1]
        [we, 2]
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getSession().setAttribute("login", "1");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        Map<String, String> users = new HashMap<>();
        users.put("1", "11");
        users.put("2", "22");
        users.put("3", "33");

        if(users.containsKey(login) && password.equals(users.get(login))){
            request.setAttribute("login", login);
            request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
        }
        else {
            request.setAttribute("error", "login or password is incorrect");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}
