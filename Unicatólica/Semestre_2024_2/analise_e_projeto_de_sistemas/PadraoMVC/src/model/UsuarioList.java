package model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioList {
	private List<Usuario> usuarios;
	
	public UsuarioList() {
		this.usuarios = new ArrayList<>();
	}
	
	public void adicionarUsuarios(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
}
