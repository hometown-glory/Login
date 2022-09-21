package com.xxx.controller;

import com.xxx.entity.vo.MessageModel;
import com.xxx.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 言云月
 * @data 2022/9/20 14:19
 */
@WebServlet("/login")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");
        MessageModel messageModel = userService.userLogin(uname, upwd);

        if (messageModel.getCode() == 1) {
            req.getSession().setAttribute("user", messageModel.getObject());
            resp.sendRedirect("index.jsp");
        } else {
            req.setAttribute("MessageModel", messageModel);
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}
