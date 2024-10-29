import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcularMedia")
public class CalculaMediaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nota1Str = request.getParameter("nota1");
        String nota2Str = request.getParameter("nota2");

        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double media = (nota1 + nota2) / 2;

        request.setAttribute("nota1", nota1);
        request.setAttribute("nota2", nota2);
        request.setAttribute("media", media);

        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }
}
