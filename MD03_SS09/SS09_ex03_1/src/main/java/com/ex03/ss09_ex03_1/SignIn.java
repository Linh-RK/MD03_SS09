package com.ex03.ss09_ex03_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SignInServlet", value = "/sign-in")
public class SignIn extends HttpServlet {
    private static final String USERNAME = "user123";
    private static final String PASSWORD = "123456";

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("sign-in.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user-name");
        String password = req.getParameter("password");
        if(username.equals(USERNAME) && password.equals(PASSWORD)) {
            resp.sendRedirect("success.jsp");
        }else {
            req.setAttribute("errorMessage", "Tài khoản hoặc mật khẩu không chính xác");
            req.getRequestDispatcher("sign-in.jsp").forward(req, resp);

        }
    }
}
