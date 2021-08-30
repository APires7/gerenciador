package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// doPost - variacao do metodo service para somente post
	// doGet - variacao do metodo service para somente get
	// service - aceita post e get
	
	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa.");

		String nomeEmpresa = request.getParameter("nome");

		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);

		Banco banco = new Banco();
		banco.adiciona(empresa);

		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
	}

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Recuperando a empresa.");

		Banco banco = new Banco();
		List<Empresa> listaEmpresas = banco.getEmpresas();

		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa ");

		for (Empresa empresa : listaEmpresas) {
			out.println(empresa.getNome());
		}

		out.println(" recuperada com sucesso!</body></html>");

	}

}
