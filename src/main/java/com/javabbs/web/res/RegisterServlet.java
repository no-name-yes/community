package com.javabbs.web.res;

import com.javabbs.mapper.UserMapper;
import com.javabbs.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

import com.javabbs.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.doPost(req, resp);//有点问题（一般登录注册比较敏感用post方法参数在请求体里面，用Get方法在请求行里面，应该不能直接调用)
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User();
        user.setUser_name(username);
        user.setUser_password(password);

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        //       获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User u = userMapper.slect_one_from_name(username);

        if(u == null){
            userMapper.add(user);

            sqlSession.commit();

            sqlSession.close();
        }else{
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("用户名已被注册");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //先以get方法来写
        //String username = request
        this.doGet(req,resp);
    }
}
