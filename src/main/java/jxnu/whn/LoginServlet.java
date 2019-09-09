package jxnu.whn;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        resp.setContentType("text/html;charset=utf-8");
        //resp.setContentType("application/pdf");
        //resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        String username=req.getParameter("username");
        String userpwd=req.getParameter("userpwd");
        if ("admin".equals(username) &&"admin".equals(userpwd))
        {
            resp.sendRedirect("/refresh.html");
        }
        else {
            //resp.sendRedirect("fail.html");
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().print("<h2>登陆失败,2秒后返回登陆页面</h2>");
            resp.setHeader("refresh","2;url=login.html");
        }
    }
}

