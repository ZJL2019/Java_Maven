import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author : Jaler
 * Date : 2021/4/9 10:16
 * describe :
 * Version : 1.0
 */
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Cookie代码
        //通用属性
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        //创建Cookie
        Cookie usernameCookie = new Cookie("username","java");
        //设置Cookie的最大存活时间
        //最大存活时间60s
        usernameCookie.setMaxAge(60);
        //用来告诉客户端存储Cookie信息
        response.addCookie(usernameCookie);

        //创建第二个Cookie
        Cookie pwdCookie = new Cookie("pwd","pwd");
        pwdCookie.setMaxAge(-1);
        response.addCookie(pwdCookie);

        PrintWriter printWriter = response.getWriter();

        printWriter.println("<h1>Cookie 存储成功~</h1>");

    }
}
