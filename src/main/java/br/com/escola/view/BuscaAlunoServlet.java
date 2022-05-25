package br.com.escola.view;

import java.io.IOException;
import java.util.ArrayList;

import br.com.escola.controller.AlunoController;
import br.com.escola.model.entidade.Aluno;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuscaAlunoServlet
 */
public class BuscaAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscaAlunoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("txtNomeBusca");
		
		AlunoController controller = new AlunoController();
		ArrayList<Aluno> lista = controller.listar(nome);
		request.setAttribute("nomeBusca",nome);
		request.setAttribute("alunos", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request,response);
		
		
		
	}

}
