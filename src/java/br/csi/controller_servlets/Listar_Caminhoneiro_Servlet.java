package br.csi.controller_servlets;

import br.csi.dao.CaminhoneiroDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/listar_caminhoneiro"})
public class Listar_Caminhoneiro_Servlet extends HttpServlet {

    public Listar_Caminhoneiro_Servlet() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Chamou doGet do Servlet ....");
        request.setAttribute("caminhoneiros", new CaminhoneiroDAO().getCaminhoneiros());

        RequestDispatcher disp
                = request.getRequestDispatcher("/WEB-INF/views/listar_caminhoneiro.jsp");
        disp.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
