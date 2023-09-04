package com.javabbs.mapper;

import com.javabbs.pojo.Post;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PostMapper {

    @Select("select * from posts")
    List<Post> Select_ALL();

    @Select("select * from posts where post_id=#{postid}}")
    Post query_post(Integer postid);

    //新增一个帖子
    void post_post(Post post);

    //void delete_post(Integer postid);


}
