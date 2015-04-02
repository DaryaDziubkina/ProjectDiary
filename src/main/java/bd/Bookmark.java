package bd;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/bookmark")
public class Bookmark extends HttpServlet {
    User user = null;

    private String theme;
    private String text;
;


    public String getTheme(){
        return theme;
    }

    public String getText() {
        return text;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user = new User();
        req.getRequestDispatcher("bookmark.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        user = new User();

        HttpSession session = req.getSession();
        session.getAttribute("user");
        req.getRequestDispatcher("bookmark.jsp").forward(req, resp);
    }
}
