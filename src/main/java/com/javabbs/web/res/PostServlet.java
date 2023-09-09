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


        post.setPost_text(Post_text);
        post.setPost_title(Post_title);
        post.setPost_if_visible(true);
        //post.setCategory_id();
        post.setCount_of_browsers(1);
        post.setCount_of_comments(0);
        post.setCount_of_likes(0);
        post.setCount_of_private(0);
        post.setCreate_time(String.valueOf(System.currentTimeMillis()));
        post.setUpdate_time(post.getCreate_time());

    }
}
