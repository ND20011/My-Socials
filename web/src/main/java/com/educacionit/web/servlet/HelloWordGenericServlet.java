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
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author EducaciónIT
 */
public class HelloWordGenericServlet extends GenericServlet{

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
    

        sr1.setContentType("text/html");
        
        
        PrintWriter out =sr1.getWriter();
        
        out.println("<h2>Helow world</h2>");        
           out.println("<h3>genericeServlet</h2>");       
           out.close();

    }
    
    
    
}
