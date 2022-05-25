package br.com.escola.view;

import java.io.IOException;

import br.com.escola.controller.AlunoController;
import br.com.escola.model.entidade.Aluno;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastroAlunoServlet
 */
public class CadastroAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroAlunoServlet() {
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
		//doGet(request, response);
		String nome = request.getParameter("txtAlunoNome");
		String strNota1 = request.getParameter("txtNotaUm");
		String strNota2 = request.getParameter("txtNotaDois");
		String strNota3 = request.getParameter("txtNotaTres");
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		try {
			nota1 = Double.parseDouble(strNota1);
			
			nota2 = Double.parseDouble(strNota2);
			
			nota3 = Double.parseDouble(strNota3);
			
					
					
			
		}catch(Exception e) {}
		
		Aluno a = new Aluno();
		a.setNome(nome);
		a.setNota1(nota1);
		a.setNota2(nota2);
		a.setNota3(nota3);
		
		AlunoController controller = new AlunoController();
		
		controller.incluir(a);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request,response);
	}

}
