package com.javabbs.web.res;

import com.javabbs.mapper.UserMapper;
import com.javabbs.pojo.User;
import com.javabbs.service.UserService;
import com.javabbs.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = userService.serach_one(username,password);

        PrintWriter writer = resp.getWriter();
        if(user != null){
            //登录成功;
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("user",user);
        }else{
            //失败重新跳转
            req.getRequestDispatcher("/login.html");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
