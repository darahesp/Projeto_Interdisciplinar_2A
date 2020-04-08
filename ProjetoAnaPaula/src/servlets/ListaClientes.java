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

/**
 * Servlet implementation class ListaClientes
 */
@WebServlet("/ListaClientes.do")
public class ListaClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Pega sessão do usuário

		HttpSession sessao = request.getSession();

		// Lendo os valores da sessão
		ArrayList<Cliente> clientes = (ArrayList) sessao.getAttribute("lista_clientes");

		// Instanciar objeto de saida
		PrintWriter saida = response.getWriter();

		// Listar os contatos dentro da lista de contatos

		for (Cliente cliente : clientes) {

			saida.println("Nome: " + cliente.getNome_cliente() + " Data de Nascimento: " + cliente.getData_nsc_cliente()
					+ " Cpf: " + cliente.getCpf_cliente() + " RG:" + cliente.getRg_cliente() + "Telefone:"
					+ cliente.getTelefone_cliente() + " Cep:" + cliente.getCep_cliente() + "Endereço:"
					+ cliente.getEndereco_cliente() + " Complemento:" + cliente.getComplemento_cliente() + "Cidade:"
					+ cliente.getCidade_cliente() + " Estado:" + cliente.getEstado_cliente() + "E-mail:"
					+ cliente.getEmail_cliente() + " Senha:" + cliente.getSenha_cliente());
 
			
			saida.println("<br>");
			saida.println("<br>");
		}
		saida.println("<br>");
		saida.println("<br>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
