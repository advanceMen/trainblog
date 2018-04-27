package trainblog.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Beldon
 * @create 2018-04-27 下午5:43
 */
@WebServlet(name = "index", urlPatterns = {"/", "/index"}, loadOnStartup = 1)
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.write("hello trainblog");
        System.out.println(this);
    }
}
