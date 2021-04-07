import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

/**
 * @Author : Jaler
 * @Date : 2021/4/7 10:49
 * @describe :
 * @Version : 1.0
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //在方法的开头设置编码和数据类型
        //设置编码
        response.setCharacterEncoding("utf-8");
        //设置数据类型
        response.setContentType("text/html");
        //必须设置响应编码，以防止乱码
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>你好，Servlet</h1>");
    }
}
