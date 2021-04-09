import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author : Jaler
 * Date : 2021/4/9 10:50
 * describe :
 * Version : 1.0
 */
public class MySessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        //1.验权(验证用户名和密码是否正确)
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");

        PrintWriter printWriter = response.getWriter();

        if ("root".equals(name) && "root".equals(pwd)) {
            //2.用户校验成功，创建会话信息
            //一定会有一个会话信息
            HttpSession session = request.getSession(true);
            String sessionId = session.getId();
            printWriter.println("<h1>欢迎访问</h1>");
            printWriter.println(String.format("<h3>SessionId:%s</h3>", sessionId));

            //session 存储访问数量的key
            String countKey = "countKey";
            if (session.isNew() || session.getAttribute(countKey) == null) {
                //存储用户的访问数据
                session.setAttribute(countKey, 1);
                printWriter.println("<h4>访问次数:1</h4>");
            } else {
                //拿到当前用户的访问数据
                int count = (int) session.getAttribute(countKey);
                count++;
                //重新将数据变更到Session
                session.setAttribute(countKey,count);
                printWriter.println(String.format("<h4>访问次数:%d</h4>", count));
            }
        } else {
            printWriter.println("<h1>用户名或密码错误！</h1>");
        }
    }
}
