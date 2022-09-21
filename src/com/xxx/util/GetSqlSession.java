package com.xxx.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author 言云月
 * @data 2022/9/20 13:54
 */
public class GetSqlSession {

    public static SqlSession createSqlSession() {
        SqlSessionFactory SqlSessionFactory = null;
        InputStream input = null;
        SqlSession session = null;

        try {
            String resource = "mybatis-config.xml";
            input = Resources.getResourceAsStream(resource);
            SqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
            session = SqlSessionFactory.openSession();
            return session;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(createSqlSession());
    }
}
