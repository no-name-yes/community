package com.javabbs.mapper;

import com.javabbs.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> selectALL();

    @Select("select * from user where user_name=#{name}")
    public User slect_one_from_name(String name);

    @Select("select * from user where user_name = #{name} and user_password = #{password}")
    public User select_one(@Param("name") String name, @Param("password")String password);

//    @Insert("insert into user value(null,#{name},#{password})")
//    void add(@Param("name") String name, @Param("password")String password);

    //添加账户
    @Insert("insert into user (user_id, user_name, user_password) value(null,#{user_name},#{user_password})")
    void add(User user);

    //删除账户

    //修改账户
}
