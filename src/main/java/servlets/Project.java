package servlets;


import bd.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/")
public class Project extends HttpServlet {

    User user = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user = new User();
        req.getRequestDispatcher("user.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if ("getUID".equals(action)) {
            user = new User();
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            if ((!"".equals(name)) && (!"".equals(email)) && (!"".equals(password))) {
                user.saveResult(name, email, password);
                //information.printResults(1);
//                req.setAttribute("name1", "servlet");
//                req.setAttribute("id_user", information.getId());
//                req.setAttribute("name", information.getName());
//                req.setAttribute("email", information.getEmail());
//                req.setAttribute("password", information.getPassword());
            }
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            req.getRequestDispatcher("bookmark.jsp").forward(req, resp);
        }
    }
}