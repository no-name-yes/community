package com.javabbs.web.res;


import com.javabbs.pojo.Post;
import com.javabbs.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Post_title = req.getParameter("title");
        String Post_text = req.getParameter("description");
        String Post_tag = req.getParameter("tag");

        Post post = new Post();
        post.setTag(Post_tag);
        //post.setPost_id();

        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");


        post.setPost_text();
        post.setPost_title();
        post.setPost_if_visible();
        post.setCategory_id();
        post.setCount_of_browsers();
        post.setCount_of_comments();
        post.setCount_of_likes();
        post.setCount_of_private();
        post.setCreate_time();
        post.setUpdate_time();

    }
}
