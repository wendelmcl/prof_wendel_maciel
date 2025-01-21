package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.UsuarioController2;
import model.Usuario;
import model.UsuarioList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsuarioViewGUI2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NomeTF;
	private JTextField IdadeTF;
	private JTextField TelefoneTF;
	private JTextField EmailTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioViewGUI2 frame = new UsuarioViewGUI2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UsuarioViewGUI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(6, 18, 60, 29);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(6, 64, 61, 16);
		contentPane.add(lblIdade);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(6, 107, 61, 16);
		contentPane.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(5, 147, 61, 16);
		contentPane.add(lblEmail);
		
		NomeTF = new JTextField();
		NomeTF.setBounds(78, 19, 237, 26);
		contentPane.add(NomeTF);
		NomeTF.setColumns(10);
		
		IdadeTF = new JTextField();
		IdadeTF.setColumns(10);
		IdadeTF.setBounds(79, 59, 237, 26);
		contentPane.add(IdadeTF);
		
		TelefoneTF = new JTextField();
		TelefoneTF.setColumns(10);
		TelefoneTF.setBounds(79, 102, 237, 26);
		contentPane.add(TelefoneTF);
		
		EmailTF = new JTextField();
		EmailTF.setColumns(10);
		EmailTF.setBounds(78, 142, 237, 26);
		contentPane.add(EmailTF);
		
		JButton btnAdicionarUsuarios = new JButton("Adicionar Usuários");
		btnAdicionarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = NomeTF.getText();
				String idade = IdadeTF.getText();
				String email = EmailTF.getText();
				String telefone = TelefoneTF.getText();
				
				Usuario usuario = new Usuario(nome, Integer.parseInt(idade), email, telefone);
				UsuarioList usl = new UsuarioList();
				
				usl.adicionarUsuarios(usuario);
				JOptionPane.showMessageDialog(btnAdicionarUsuarios, "Usuário adicionado com sucesso!");
				
				NomeTF.setText(" ");
				IdadeTF.setText(" ");
				TelefoneTF.setText(" ");
				EmailTF.setText(" ");
				
			}
		});
		btnAdicionarUsuarios.setBounds(6, 201, 200, 29);
		contentPane.add(btnAdicionarUsuarios);
		
		JButton btnListarUsurios = new JButton("Listar Usuários");
		btnListarUsurios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnListarUsurios.setBounds(218, 201, 200, 29);
		contentPane.add(btnListarUsurios);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NomeTF.setText(" ");
				IdadeTF.setText(" ");
				TelefoneTF.setText(" ");
				EmailTF.setText(" ");
			}
		});
		btnCancelar.setBounds(115, 237, 200, 29);
		contentPane.add(btnCancelar);
	}
}
