package com.xxx.service;

import com.xxx.entity.User;
import com.xxx.entity.vo.MessageModel;
import com.xxx.mapper.UserMapper;
import com.xxx.util.GetSqlSession;
import com.xxx.util.StringUtil;
import org.apache.ibatis.session.SqlSession;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 言云月
 * @data 2022/9/20 14:12
 */

public class UserService extends HttpServlet {


    public MessageModel userLogin(String uname, String upwd) {
        MessageModel messageModel = new MessageModel();
        User u = new User();
        u.setUsername(uname);
        u.setUserPwd(upwd);
        messageModel.setObject(u);

        if (StringUtil.isEmpty(uname) || StringUtil.isEmpty(upwd)) {
            messageModel.setCode(0);
            messageModel.setMsg("用户密码姓名不能为空");
            return messageModel;
        }

        SqlSession session = GetSqlSession.createSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.queryUserByName(uname);

        if (user == null) {
            messageModel.setCode(0);
            messageModel.setMsg("用户不存在");
            return messageModel;
        }

        if (!upwd.equals(user.getUserPwd())){
            messageModel.setCode(0);
            messageModel.setMsg("密码不准确");
            return messageModel;
        }

        messageModel.setObject(user);

        return messageModel;
    }

}
