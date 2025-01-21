package execucao;

import controller.*;
import model.UsuarioList;
import view.UsuarioViewGUI;
import view.UsuarioViewGUI2;

public class Main {
    public static void main(String[] args) {
        UsuarioList usuarioList = new UsuarioList();
        UsuarioViewGUI2 view2 = new UsuarioViewGUI2();
    }
}

//package execucao;

//import controller.UsuarioController;
//import model.Usuario;
//import model.UsuarioList;
//import view.UsuarioView;

//public class Main {

//	public static void main(String[] args) {
//		Usuario us = new Usuario("", 0, "", "");
//		UsuarioView vw = new UsuarioView();
//		UsuarioList usList = new UsuarioList();
//		UsuarioController uc = new UsuarioController(usList, vw);
		//		
//		uc.adicionarUsuario();
//		uc.adicionarUsuario();
		//		
		//		uc.listarUsuarios();
		
		//	}
		//}