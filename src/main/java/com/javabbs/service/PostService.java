package com.javabbs.service;

import com.javabbs.mapper.PostMapper;
import com.javabbs.mapper.UserMapper;
import com.javabbs.pojo.Post;
import com.javabbs.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PostService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public Post viewpost(Integer post_id){
        SqlSession sqlSession = factory.openSession();
        PostMapper postmapper = sqlSession.getMapper(PostMapper.class);
        Post post = postmapper.query_post(post_id);

        sqlSession.close();
        return post;
    }



}
