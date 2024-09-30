package com.ex03.ss09_ex03;

import com.ex03.model.ra.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userServlet", value = "/user-data")
public class UserServlet extends HttpServlet {
    private static User user = new User();
    @Override
    public void init() throws ServletException {
        user = new User(1, "Huan","huanrose@gmail.com",18);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user",user);
        req.getRequestDispatcher("user_data.jsp").forward(req,resp);
    }
}
