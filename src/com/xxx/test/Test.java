package com.xxx.test;

import com.xxx.entity.User;
import com.xxx.mapper.UserMapper;
import com.xxx.util.GetSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author 言云月
 * @data 2022/9/20 14:04
 */
public class Test {
    public static void main(String[] args) {
        SqlSession session = GetSqlSession.createSqlSession();
        UserMapper UserMapper = session.getMapper(com.xxx.mapper.UserMapper.class);
        User user = UserMapper.queryUserByName("admin");
        System.out.println(user);
    }
}
