package fr.isima.servlet;

import fr.isima.service.FizzBuzz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/fizzBuzz")
public class FizzBuzzServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        if (req.getParameter("num") != null) {
            resp.getWriter().write(fizzBuzz.fizzBuzz(Integer.parseInt(req.getParameter("num"))));
        } else {
            resp.getWriter().write(
                    fizzBuzz.fizzBuzzAll(
                            Integer.parseInt(req.getParameter("start")),
                            Integer.parseInt(req.getParameter("end")))
                            .toString());
        }
    }
}
