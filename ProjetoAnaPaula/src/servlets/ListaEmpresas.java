package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Cliente;
import models.Empresa;


@WebServlet("/ListaEmpresas.do")
public class ListaEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		        // Ínicio do Código
		
		        // Pega sessão do usuário

				HttpSession sessao = request.getSession();

				// Lendo os valores da sessão
				ArrayList<Empresa> empresas = (ArrayList) sessao.getAttribute("lista_empresas");
		
		
				// Instanciar objeto de saida
				
				PrintWriter saidaDados = response.getWriter();

				
				// Listar os contatos dentro da lista de contatos
				
				for (Empresa empresa : empresas) {

					saidaDados.println("Nome: " + empresa.getNome() +
							     " E-mail: " + empresa.getEmail() +
							     " Telefone:" +empresa.getTelefone() +
							     " Cnpj:" + empresa.getCnpj() +
							     " Endereço:" + empresa.getEndereco() +
							     " Cep:" + empresa.getCep());
							   
					saidaDados.println("<br>");
					saidaDados.println("<br>");
				}
				
				saidaDados.println("<br>");
				saidaDados.println("<br>");
							
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
