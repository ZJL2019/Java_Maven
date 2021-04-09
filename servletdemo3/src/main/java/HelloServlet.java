import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author : Jaler
 * Date : 2021/4/9 10:13
 * describe :
 * Version : 1.0
 */
public class HelloServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doGet(request,response);
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>123</h1>");
    }
}
