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

/**
 * Servlet implementation class CadastroCliente
 */
@WebServlet("/CadastroCliente.do")
public class CadastroCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Ínicio do Código
		
		//Capturando  parâmetros do Cliente
		
		String nomeCliente = request.getParameter("nome_cliente");
		String dataNascimento = request.getParameter("data_nsc_cliente");
		String cpfCliente = request.getParameter("cpf_cliente");
		String rgCliente = request.getParameter("rg_cliente");
		String telefoneCliente = request.getParameter("telefone_cliente");
		String cep = request.getParameter("cep_cliente");
		String enderecoCliente =  request.getParameter("endereco_cliente");
		String complementoCasa = request.getParameter("complemento_cliente");
		String cidade = request.getParameter("cidade_cliente");
		String estado =  request.getParameter("estado_cliente");
		String emailCliente = request.getParameter("email_cliente");
		String sennhaCliente = request.getParameter("senha_cliente");
		
		
		//Criando um objeto de saída de dados
		
		PrintWriter saidaDados = response.getWriter();
		
		//Criando um Objeto de sessão
		
		HttpSession sessao = request.getSession();
		
		
		//Instanciando a classe Cliente para criar um novo cliente
		
		Cliente novoCliente =  new Cliente(nomeCliente, dataNascimento, cpfCliente,
				rgCliente, telefoneCliente, cep,
				enderecoCliente, complementoCasa,
				cidade, estado, 
				emailCliente, sennhaCliente);
		
		//Adicionando o objeto novoCliente dentro de um ArrayList
		
		List<Cliente> clientes ;
		
		if(sessao.getAttribute("lista_clientes") ==  null) {
		
			clientes =  new ArrayList();
			
		}else {
			
			clientes =  (List<Cliente>) sessao.getAttribute("lista_clientes");
		}
		
		//Adicionando um novo contato
		clientes.add(novoCliente);
		
		
		// Adicionando a lista de contatos a  sessão£o do usuário
				sessao.setAttribute("lista_clientes", clientes);
				
				// Redirecionar o usuário para a lista
				response.sendRedirect("ListaClientes.do");
				
				
				//FIM    FIM    FIM    FIM   FIM    FIM   FIM
				//          FIM   DA IMPLEMETAÇÃO          //
				//FIM    FIM    FIM    FIM   FIM    FIM   FIM

	}

}
