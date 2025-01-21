package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Usuario;
import model.UsuarioList;
import view.UsuarioViewGUI;
import view.UsuarioViewGUI2;

public class UsuarioController2 {
    private UsuarioList usuarioList;
    private UsuarioViewGUI2 usView;

    public UsuarioController2(UsuarioList usuarioList, UsuarioViewGUI2 usView) {
        this.usuarioList = usuarioList;
        this.usView = usView;
    }
    private void adicionarUsuario() {
        String nome = usView.getName();
        int idade = usView.getName();
        String email = usView.getEmail();
        String telefone = usView.getTelefone();

        Usuario usuario = new Usuario(nome, idade, email, telefone);
        usuarioList.adicionarUsuarios(usuario);

        JOptionPane.showMessageDialog(view, "Usuário adicionado com sucesso!");
    }

    private void listarUsuarios() {
        StringBuilder sb = new StringBuilder();
        for (Usuario usuario : usuarioList.getUsuarios()) {
            sb.append("Nome: ").append(usuario.getNome())
              .append(", Idade: ").append(usuario.getIdade())
              .append(", Email: ").append(usuario.getEmail())
              .append(", Telefone: ").append(usuario.getTelefone())
              .append("\n");
        }
        view.exibirUsuarios(sb.toString());
    }
}