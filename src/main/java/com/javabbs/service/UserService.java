package com.javabbs.service;

import com.javabbs.mapper.UserMapper;
import com.javabbs.pojo.User;
import com.javabbs.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.List;

public class UserService {

    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<User> selectALL(){

        SqlSession sqlsession = factory.openSession();

        UserMapper usermapper = sqlsession.getMapper(UserMapper.class);

        List<User> users = usermapper.selectALL();

        sqlsession.close();

        return users;

    }

    //查找验证
    public User serach_one(String username, String password) throws IOException{
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        User user = usermapper.select_one(username,password);

        sqlSession.close();
        return user;
    }

    public User serach_name(String username) throws IOException{
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        User user = usermapper.slect_one_from_name(username);

        sqlSession.close();
        return user;
    }

    //public


}
