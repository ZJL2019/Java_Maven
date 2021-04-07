import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author : Jaler
 * @Date : 2021/4/7 11:30
 * @describe :
 * @Version : 1.0
 */
public class CalcServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        String num1 = request.getParameter("number1");
        String num2 = request.getParameter("number2");

        int total = Integer.parseInt(num1)+Integer.parseInt(num2);

        PrintWriter writer = response.getWriter();
        writer.println(String.format("<h1>计算结果为：%d</h1>",total));

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
