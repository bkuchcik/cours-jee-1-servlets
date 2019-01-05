package fr.isima.servlet;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzServletTest {

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Mock
    private PrintWriter printWriter;

    private FizzBuzzServlet fizzBuzzServlet;

    @Before
    public void setUp() throws Exception {
        this.fizzBuzzServlet = new FizzBuzzServlet();
        when(response.getWriter()).thenReturn(this.printWriter);
    }

    @Test
    public void doGet_requestWithNumParameterValue3_WriteBuzz() throws ServletException, IOException {
        when(this.request.getParameter("num")).thenReturn("3");
        this.fizzBuzzServlet.doGet(this.request, this.response);
        verify(this.printWriter).write("Fizz");
    }

    @Test
    public void doGet_requestWithStart1AndEnd3_WriteValueList() throws ServletException, IOException {
        when(this.request.getParameter("start")).thenReturn("1");
        when(this.request.getParameter("end")).thenReturn("3");
        this.fizzBuzzServlet.doGet(this.request, this.response);
        verify(this.printWriter).write("FizzBuzz all !!!! :\n" +
                "1 : 1\n" +
                "2 : 2\n" +
                "3 : Fizz");
    }


}