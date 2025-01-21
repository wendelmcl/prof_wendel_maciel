package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioViewGUI extends JFrame {
    private JTextField nomeField;
    private JTextField idadeField;
    private JTextField emailField;
    private JTextField telefoneField;
    private JTextArea displayArea;
    private JButton addButton;
    private JButton listButton;

    public UsuarioViewGUI() {
        // Configurações da Janela
        setTitle("Cadastro de Usuário");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Campos de entrada
        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Idade:"));
        idadeField = new JTextField();
        add(idadeField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Telefone:"));
        telefoneField = new JTextField();
        add(telefoneField);

        // Botões
        addButton = new JButton("Adicionar Usuário");
        add(addButton);

        listButton = new JButton("Listar Usuários");
        add(listButton);

        // Área de exibição
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea));

        // Tornar a janela visível
        setVisible(true);
    }

    // Getters para os campos
    public String getNome() {
        return nomeField.getText();
    }

    public int getIdade() {
        try {
            return Integer.parseInt(idadeField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Idade inválida. Por favor, insira um número.");
            return 0;
        }
    }

    public String getEmail() {
        return emailField.getText();
    }

    public String getTelefone() {
        return telefoneField.getText();
    }

    // Método para exibir usuários na área de exibição
    public void exibirUsuarios(String usuarios) {
        displayArea.setText(usuarios);
    }

    // Métodos para adicionar ActionListeners
    public void addUsuarioListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void listUsuariosListener(ActionListener listener) {
        listButton.addActionListener(listener);
    }
}