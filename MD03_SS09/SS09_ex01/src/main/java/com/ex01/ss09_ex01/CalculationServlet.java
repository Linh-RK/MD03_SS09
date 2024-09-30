package com.ex01.ss09_ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calculateServlet", value = "/display-discount")
public class CalculationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get inputted data  from in index.jsp file:
        String desc = req.getParameter("description");
        Double price = Double.parseDouble(req.getParameter("price"));
        Double discount = Double.parseDouble(req.getParameter("discount"));


        Double discountAmount = price * discount * 0.01;
        Double discountPrice = price - discountAmount;

        //send to result.jsp
        req.setAttribute("description", desc);
        req.setAttribute("price", price);
        req.setAttribute("discount", discount);
        req.setAttribute("discountAmount", discountAmount);
        req.setAttribute("discountPrice", discountPrice);

        // điều hướng sang trang jsp
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
