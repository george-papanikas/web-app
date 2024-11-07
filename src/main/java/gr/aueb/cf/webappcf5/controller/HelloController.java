package gr.aueb.cf.webappcf5.controller;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


//@WebServlet(name = "helloServlet", value = "/hello-servlet")
@WebServlet("/hello-servlet")
public class HelloController extends HttpServlet { //HelloServlet was the name before refactoring
    private String message;

    public void init() {
        message = "Καλημέρα World Hello Κόσμε";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //response.setContentType("text/html"); it's defined on HEADERS
        response.setContentType("text/html; charset=UTF-8"); // by adding charset=UTF-8 we can write in Greek
        // Hello
        PrintWriter out = response.getWriter(); //regards payload/data
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}