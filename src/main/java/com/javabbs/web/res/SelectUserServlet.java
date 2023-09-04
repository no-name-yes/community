package com.javabbs.web.res;

import com.javabbs.pojo.User;
import com.javabbs.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectuserservlet")
public class SelectUserServlet extends HttpServlet {
    private UserService us = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");

        User user = us.serach_name(username);

        if(user != null){
            resp.getWriter().write("1");
        }else{
            resp.getWriter().write("0");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
