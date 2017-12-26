package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yavuz
 */
public class Controller extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String username=request.getParameter("txtUserName");
            String password=request.getParameter("txtPassword");
            try
            {
                if (username!=null)
                {
                    if(username.equals("yavuz") && password.equals("1"))
                    {
                        response.sendRedirect("welcome.jsp");
                    }
                    else{
                        out.println("Login Failed");
                    }
                }
                         
            }
            catch(Exception e){
                out.println("Error :" + e.getMessage());
            }
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }


}
