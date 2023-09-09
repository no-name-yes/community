package com.javabbs.mapper;

import com.javabbs.pojo.Post;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface PostMapper {

    @Select("select * from posts")
    List<Post> Select_ALL();

    @Select("select * from posts where post_id=#{postid}}")
    Post query_post(Integer postid);

    //新增一个帖子
    @Insert("insert into (post_title,create_time,update_time,author_id,post_text,tag) value (#{title},#{description},#{create_time},#{update_time},#{author},#{tag}) )")
    void post_post(Post post);

    //void delete_post(Integer postid);


}
