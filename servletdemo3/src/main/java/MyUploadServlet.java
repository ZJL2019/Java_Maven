import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

/**
 * @Author : Jaler
 * @Date : 2021/4/9 12:15
 * @describe :
 * @Version : 1.0
 */
@MultipartConfig
public class MyUploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        //全球唯一ID
        UUID uuid =UUID.randomUUID();

        //保存图片
        Part part = request.getPart("myfile");

        part.write(String.format("E:\\Pictures\\Camera Roll\\%s%s",uuid,part.getSubmittedFileName()));

        PrintWriter printWriter=response.getWriter();
        printWriter.println("<h1>图片保存成功！</h1>");
    }
}
