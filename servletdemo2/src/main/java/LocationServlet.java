import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author : Jaler
 * @Date : 2021/4/7 12:26
 * @describe :
 * @Version : 1.0
 */
public class LocationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        //实现跳转方式1
        response.setStatus(302);
        response.setHeader("location","http://www.sogou.com");

        //response.sendRedirect("http://www.sogou.com");
    }
}
