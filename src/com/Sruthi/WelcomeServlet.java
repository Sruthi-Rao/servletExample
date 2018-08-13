package com.Sruthi;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("inside init");
    }

    @Override
    public ServletConfig getServletConfig() {

        System.out.println("inside getServlet");
        return  null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("inside service method");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.print("<html><body>");
        printWriter.print("<h1> welcome to servlet program </h1>");
        ServletConfig config = getServletConfig();
        String greeting = config.getInitParameter("greeting");
        System.out.println(greeting);
        ServletContext servletContext=getServletConfig().getServletContext();
        System.out.println(servletContext.getInitParameter("name"));
    }

    @Override
    public String getServletInfo() {
        System.out.println("inside getServlet info method");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("inside destroy");
    }
}
