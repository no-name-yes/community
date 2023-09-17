package com.javabbs.web.res;


import com.javabbs.pojo.Post;
import com.javabbs.pojo.User;
import com.javabbs.service.PostService;
import com.javabbs.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet {
    private UserService userService = new UserService();
    private PostService postService = new PostService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Post_title = req.getParameter("title");
        String Post_text = req.getParameter("description");
        String Post_tag = req.getParameter("tag");

        User user = null;
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("token")){
                String token = cookie.getValue();
                user = userService.findbytoken(token);
                if(user!=null){
                    req.getSession().setAttribute("user",user);
                }
                break;
            }
        }

        if(user == null){
            //用户未登录
        }


        Post post = new Post();
        post.setTag(Post_tag);
        //post.setPost_id();
        post.setAuthor_id(user.getUser_id());//前面处理user==null的状况
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
        postService.createpost(post);

    }
}
