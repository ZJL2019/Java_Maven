import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author : Jaler
 * Date : 2021/4/9 10:29
 * describe :
 * Version : 1.0
 */
public class GetCookieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        //读取所有Cookie
        Cookie[] cookies=request.getCookies();

        PrintWriter printWriter = response.getWriter();

        for (Cookie cookie:cookies){
            printWriter.println(String.format("<h1>Cookie name:%s,Cookie value:%s</h1>",
                    cookie.getName(),cookie.getValue()));
        }
    }
}
