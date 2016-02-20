package com.esginterns.mywebapp;

import sun.net.httpserver.HttpServerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class WebAppServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        CreateWebPageHTML.createWebPage(resp,req);
    }
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
        if(req.getParameter("first")!=null) {
            DbMethods.insertIntoUsers(req, resp);
        }else if(req.getParameter("second")!=null){
            DbMethods.showRegistratedInfoFromUsersTable(req,resp);
        }
        else if(req.getParameter("back")!=null){
            CreateWebPageHTML.createWebPage(resp,req);
        }


    }

}
