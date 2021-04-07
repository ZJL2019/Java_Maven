import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @Author : Jaler
 * @Date : 2021/4/7 12:08
 * @describe :
 * @Version : 1.0
 */
public class RefreshServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        //每秒钟刷新一次
        response.setIntHeader("Refresh",1);
        PrintWriter printWriter = response.getWriter();
        printWriter.println(String.format("<h1>当前时间：%s</h1>",new Date()));

    }
}
