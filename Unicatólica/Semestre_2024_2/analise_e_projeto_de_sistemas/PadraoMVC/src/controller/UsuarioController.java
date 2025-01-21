package controller;

import model.Usuario;
import model.UsuarioList;
import view.UsuarioView;

public class UsuarioController {
	
	private Usuario Usmodel;
	private UsuarioView Usview;
	private UsuarioList Uslist;
	
	public UsuarioController(UsuarioList Uslist, UsuarioView Usview) {
		this.Uslist = Uslist;
		this.Usview = Usview;
	}
	
	public void adicionarUsuario() {
		String nome = Usview.getNome();
		int idade = Usview.getIdade();
		String email = Usview.getEmail();
		String telefone = Usview.getTelefone();
		Usuario usuario = new Usuario(nome, idade, email, telefone);
		Uslist.adicionarUsuarios(usuario);
	}
	
	public void listarUsuarios() {
		for(Usuario usuario : Uslist.getUsuarios()) {
			Usview.exibirUsuario(usuario.getNome(), usuario.getIdade(), usuario.getEmail(), usuario.getTelefone());
		}
	}
}
