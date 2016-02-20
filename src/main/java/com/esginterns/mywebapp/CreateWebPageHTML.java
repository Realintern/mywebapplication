package com.esginterns.mywebapp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by User on 2/19/2016.
 */
public class CreateWebPageHTML {
    CreateWebPageHTML(){};
    public static void createWebPage(HttpServletResponse resp,HttpServletRequest req) throws IOException,ServletException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("<html><head>");
        pw.println("<title>Register Page</title></head><body>");
        pw.println("<h2>Please submit your information</h2>");
        pw.println("<form method=\"post\" action=\""+req.getContextPath()+
                "/mailregisterapp\">");
        pw.println("<table border=\"0\"><tr><td valign=\"top\">");
        pw.println("Your first name:</td> <td valign=\"top\">");
        pw.println("<input type=\"text\" name=\"firstname\" size=\"20\">");
        pw.println("</td></tr><tr><td valign=\"top\">");

        pw.println("Your last name:</td> <td valign=\"top\">");
        pw.println("<input type=\"text\" name=\"lastname\" size=\"20\">");
        pw.println("</td></tr><tr><td valign=\"top\">");

        pw.println("Your E-mail:</td> <td valign=\"top\">");
        pw.println("<input type=\"text\" name=\"email\" size=\"20\">");
        pw.println("</td></tr><tr><td valign=\"top\">");

        pw.println("<input type=\"submit\" name=\"first\" value=\"Register\"></td></tr><tr><td valign=\"top\">");
        pw.println("<input type=\"submit\" name=\"second\" value=\"Show Info\"></td></tr>");
        pw.println("</table></form>");
        pw.println("</body></html>");
    }
    public static void createWebPageWarning(HttpServletResponse resp,HttpServletRequest req) throws IOException,ServletException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("<html><head>");
        pw.println("<title>Warning Page</title></head><body>");
        pw.println("<h2>WARNING:Please submit your right information!!</h2>");
        pw.println("<form method=\"post\" action=\""+req.getContextPath()+
                "/mailregisterapp\">");
        pw.println("<table border=\"0\"><tr><td valign=\"top\">");
        pw.println("Your first name:</td> <td valign=\"top\">");
        pw.println("<input type=\"text\" name=\"firstname\" size=\"20\">");
        pw.println("</td></tr><tr><td valign=\"top\">");

        pw.println("Your last name:</td> <td valign=\"top\">");
        pw.println("<input type=\"text\" name=\"lastname\" size=\"20\">");
        pw.println("</td></tr><tr><td valign=\"top\">");

        pw.println("Your E-mail:</td> <td valign=\"top\">");
        pw.println("<input type=\"text\" name=\"email\" size=\"20\">");
        pw.println("</td></tr><tr><td valign=\"top\">");

        pw.println("<input type=\"submit\" name=\"first\" value=\"Register\"></td></tr><tr><td valign=\"top\">");
        pw.println("<input type=\"submit\" name=\"second\" value=\"Show Info\"></td></tr>");
        pw.println("</table></form>");
        pw.println("</body></html>");
    }
    public static void createWebPageSubmit(HttpServletResponse resp,HttpServletRequest req) throws IOException,ServletException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("<html><head>");
        pw.println("<title>Sumbmitted information</title></head><body>");
        pw.println("<h2>Good!Your information has registerated.You can submit new information</h2>");
        pw.println("<form method=\"post\" action=\""+req.getContextPath()+
                "/mailregisterapp\">");
        pw.println("<table border=\"0\"><tr><td valign=\"top\">");
        pw.println("Your first name:</td> <td valign=\"top\">");
        pw.println("<input type=\"text\" name=\"firstname\" size=\"20\">");
        pw.println("</td></tr><tr><td valign=\"top\">");

        pw.println("Your last name:</td> <td valign=\"top\">");
        pw.println("<input type=\"text\" name=\"lastname\" size=\"20\">");
        pw.println("</td></tr><tr><td valign=\"top\">");

        pw.println("Your E-mail:</td> <td valign=\"top\">");
        pw.println("<input type=\"text\" name=\"email\" size=\"20\">");
        pw.println("</td></tr><tr><td valign=\"top\">");

        pw.println("<input type=\"submit\" name=\"first\" value=\"Register\"></td></tr><tr><td valign=\"top\">");
        pw.println("<input type=\"submit\" name=\"second\" value=\"Show Info\"></td></tr>");
        pw.println("</table></form>");
        pw.println("</body></html>");
    }

}
