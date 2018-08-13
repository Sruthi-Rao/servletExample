import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Welcome2Servlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("inside welcome");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();

        String username = req.getParameter("Username");
        String password = req.getParameter("Password");

        getServletContext().setAttribute("Username",username);
        getServletContext().setAttribute("password",password);


        if (username.equals("sruthi")) {
            if ("/index.jsp".equals(req.getRequestURI())) {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("Welcome.jsp");
                requestDispatcher.forward(req, resp);
            } //else if ("/welcome".equals(req.getRequestURI()))

                //printWriter.print("<html><body><h1> hai </h1></body></html>");


//        ServletConfig config = getServletConfig();
//        String greeting = config.getInitParameter("greeting");
//        System.out.println(greeting);
//        ServletContext servletContext=getServletConfig().getServletContext();
//        System.out.println(servletContext.getInitParameter("name"));
        }
        else{
            resp.getWriter().print("font color ='red '> <b> Incorrect username and password</b></font>");

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
          requestDispatcher .include(req, resp);
        }

    }

}
