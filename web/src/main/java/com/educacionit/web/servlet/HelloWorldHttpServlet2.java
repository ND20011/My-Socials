/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educacionit.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EducaciónIT
 */
@WebServlet("/hello3")
public class HelloWorldHttpServlet2 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        

        resp.setContentType ("text/html;charset=UTF-8");

        
        PrintWriter out = resp.getWriter ();
        
        
            out.println ("<h2>Hello World</h2>");
       
            out.println ("<h3>HttpServlet"+req+"</h3>");
        
            out.println ("<h4>GET</h4>");
       
            out.close();
    
        } 
    
}
