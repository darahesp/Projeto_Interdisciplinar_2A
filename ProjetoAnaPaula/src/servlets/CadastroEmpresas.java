package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Cliente;
import models.Empresa;

@WebServlet("/CadastroEmpresas.do")
public class CadastroEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		     // �nicio do C�digo
		
		    // Capturando os par�metros
		
		    String nome = request.getParameter("nome_empresa");
	        String email = request.getParameter("email_empresa");
	        String telefone = request.getParameter("telefone_empresa");
	        String cnpj = request.getParameter("cnpj_empresa");
	        String endereco = request.getParameter("endereco_empresa");
	        String cep = request.getParameter("cep_empresa");
	        
		
	        //Criando um objeto de sa�da de dados
			
			PrintWriter saidaDados = response.getWriter();
			
			//Criando um Objeto de sess�o
			
			HttpSession sessao = request.getSession();
			
			
			//Instanciando a classe Cliente para criar um novo cliente
			
			Empresa novoEmpresa =  new Empresa(nome, email, telefone,
					cnpj, endereco, cep);
					
			
			//Adicionando o objeto novoEmpresa dentro de um ArrayList	
			
			List<Empresa> empresas ;
			
			if(sessao.getAttribute("lista_empresas") ==  null) {
			
				empresas =  new ArrayList();
				
			}else {
				
				empresas =  (List<Empresa>) sessao.getAttribute("lista_empresas");
			}
					
			
			//Adicionando um novo contato
			
			empresas.add(novoEmpresa);
			
			
			// Adicionando a lista de contatos a� sess�o�o do usu�rio
			sessao.setAttribute("lista_empresas", empresas);
			
			// Redirecionar o usu�rio para a lista
			response.sendRedirect("ListaEmpresas.do");
			
			
			//FIM    FIM    FIM    FIM   FIM    FIM   FIM
			//          FIM   DA IMPLEMETA��O          //
			//FIM    FIM    FIM    FIM   FIM    FIM   FIM
		
	}

}
