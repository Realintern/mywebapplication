package com.esginterns.mywebapp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class DbMethods {
    public static void insertIntoUsers(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
     //geta anum bolor parametrer@
        Enumeration paramNames=req.getParameterNames();
        String param;//parametri anun@
        List<String> list=new ArrayList<String>();
        while(paramNames.hasMoreElements()){
            param=(String)paramNames.nextElement();
            if(!req.getParameter(param).equalsIgnoreCase("")){
                list.add(req.getParameter(param));
            }
        }
        list.remove(list.size()-1);//verin element@ submit buttoni anunn e ,,nayeq do post metodi araijn if paynamn@
        if (list.size()!=3){
            CreateWebPageHTML.createWebPageWarning(resp,req);
        }else{

            ConnectDb connectDb=new ConnectDb();
            String query="insert into users (firstName,lastName,email) values(?,?,?)";
            //id will be automatically incremented
            try {

                PreparedStatement ps=connectDb.getConnection().prepareStatement(query);
                Iterator<String> iter=list.iterator();

                int valueNumber=0;
                while(iter.hasNext()){
                    valueNumber++;
                    String columValue=iter.next();
                    ps.setString(valueNumber,columValue);

                }
                ps.executeUpdate();//insert values in the table
                list.clear();//delete all items from the list

            } catch (SQLException e) {
                e.printStackTrace();
            }
            CreateWebPageHTML.createWebPageSubmit(resp, req);
        }
    }
    public static void showRegistratedInfoFromUsersTable(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();

        ConnectDb connectDb=new ConnectDb();
        Connection connection=connectDb.getConnection();
        String query="Select firstName,lastName,email from users";
        try {
            PreparedStatement ps=connection.prepareStatement(query);
            ResultSet resultSet=ps.executeQuery();
            pw.println("<html><head>");
            pw.println("<title>The registrated person's page</title></head><body>");
            pw.println("<h2>All Information Form Users's Table</h2>");
            Users user = new Users();
            while(resultSet.next()) {
                String firstName=resultSet.getString("firstName");
                String lastName=resultSet.getString("lastName");
                String email=resultSet.getString("email");
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setEmail(email);
                pw.println("<strong>"+user.toString()+"</strong>");
                pw.println("<br />");
            }
            pw.println("<form method=\"post\" action=\""+req.getContextPath()+
                    "/mailregisterapp\">");
            pw.println("<table border=\"0\"><tr><td valign=\"top\">");
            pw.println("<input type=\"submit\" name=\"back\" value=\"Back\"></td></tr>");
            pw.println("</table></form>");
            pw.println("</body></html>");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
