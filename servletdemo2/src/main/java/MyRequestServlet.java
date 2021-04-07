import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author : Jaler
 * @Date : 2021/4/7 12:16
 * @describe :
 * @Version : 1.0
 */
public class MyRequestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        //获取请求方法类型
        String method = request.getMethod();
        //获取相对地址信息
        String uri = request.getRequestURI();

        String contentType = request.getContentType();

        PrintWriter printWriter = response.getWriter();
        printWriter.println(String.format("<h1>method:%s<h1><p></p>",method));
        printWriter.println(String.format("<h1>uri:%s</h1><p></p>",uri));
        printWriter.println(String.format("<h1>contentType:%s</h1><p></p>",contentType));

    }
}
