package gr.aueb.cf.webappcf5.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get-coding-title")
public class CodingController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = "Coding Factory";

        request.setAttribute("codingTitle", title);
        request.getRequestDispatcher("/coding.jsp").forward(request, response);
    }
}
