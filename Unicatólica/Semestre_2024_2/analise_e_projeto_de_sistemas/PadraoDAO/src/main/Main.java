package main;

import daoimplementation.UsuarioDAOImpl;
import daointerface.UsuarioDAO;
import model.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adicionar Usuário
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		Usuario novoUsuario = new Usuario("Teste", "teste@gmail.com");
		usuarioDAO.adicionarUsuario(novoUsuario);
		
		//Buscar Usuário
		Usuario usuario = usuarioDAO.buscarUsuario(1);
		System.out.println("Usuario encontrado: " + "ID: " + usuario.getId()
			+" Nome: " + usuario.getNome() + " E-mail: " + usuario.getEmail());
		
		//Listar os Uusários
		System.out.println("Lista de Usuários: ");
		for(Usuario u : usuarioDAO.listarUsuarios()) {
			System.out.println("ID: " + u.getId() + " Nome: " + u.getNome()
			+ " E-mail: " + u.getEmail());
		}
		
		//Atualizar Usuário
		usuario.setId(7);
		usuario.setNome("Teste");
		usuario.setEmail("Teste@gmail.com");
		usuarioDAO.atualizarUsuario(usuario);
		
		//Deletar Usuario
		usuarioDAO.deletarUsuario(10);

	}
}
