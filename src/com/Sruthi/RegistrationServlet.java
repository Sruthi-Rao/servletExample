package com.Sruthi;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWrite = resp.getWriter();

//        String username = req.getParameter("Username"); // query strings
//        String password = req.getParameter("Password");
//
//        getServletContext().setAttribute("Username",username);
//        getServletContext().setAttribute("Password",password);
        printWrite.print("<html><body>");
        printWrite.print("<h1>welcome</h1>");
        printWrite.print("</html></body>");


//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Login.jsp");
//        requestDispatcher.forward(req,resp);
//
//    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        PrintWriter printWriter = resp.getWriter();
//
//        String username = req.getParameter("Username"); // query strings
//        String password = req.getParameter("Password");
//
//        getServletContext().setAttribute("Username",username);
//        getServletContext().setAttribute("Password",password);
//
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Login.jsp");
//        requestDispatcher.forward(req,resp);
//
//
//        if (username.equals("sruthi") && (password.equals("admin"))) {
//
//            if ("/Login".equals(req.getRequestURI())) {
//
//                RequestDispatcher requestDispatcher = req.getRequestDispatcher("Welcome.jsp");
//
//                requestDispatcher.forward(req, resp);
//
//            }
//        }else {
//            resp.getWriter().print("Invalid Username and password");
//
//        }

    }
}

