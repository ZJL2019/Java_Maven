import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author : Jaler
 * @Date : 2021/4/6 14:21
 * @describe :
 * @Version : 1.0
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获得一个写入流
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>Hello,Servlet~</h1>");
    }
}
