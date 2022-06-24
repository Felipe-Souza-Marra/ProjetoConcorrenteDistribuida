package br.com.Voceeu.Front_End.TelaCadastro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import br.com.Voceeu.Components.Cabecalho;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroView {

	private JFrame frmVoceEEu;
	private JTextField emailTextField; //Gustavo - Área pra escrever o email do login
	private JTextField senhaTextField; //Gustavo - Área pra escrever a senha do login
	private Cabecalho cabecalho;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroView window = new CadastroView();
					window.frmVoceEEu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVoceEEu = new JFrame();
		frmVoceEEu.setBounds(100, 100, 450, 300);
		frmVoceEEu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVoceEEu.getContentPane().setLayout(null);
		
		JLabel email = new JLabel("E-mail");
		email.setBounds(125, 90, 42, 16);
		frmVoceEEu.getContentPane().add(email);
		
		JLabel senha = new JLabel("Senha");
		senha.setHorizontalAlignment(SwingConstants.CENTER);
		senha.setBounds(125, 123, 37, 16);
		frmVoceEEu.getContentPane().add(senha);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(187, 85, 130, 26);
		frmVoceEEu.getContentPane().add(emailTextField);
		emailTextField.setColumns(10);
		
		senhaTextField = new JTextField();
		senhaTextField.setBounds(187, 118, 130, 26);
		frmVoceEEu.getContentPane().add(senhaTextField);
		senhaTextField.setColumns(10);
		
		JButton botaoCadastro = new JButton("OK");
		botaoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoCadastro.setBounds(187, 174, 75, 29);
		frmVoceEEu.getContentPane().add(botaoCadastro);
		
		JButton botaoSemLogin = new JButton("Continuar sem Login");
		botaoSemLogin.setBounds(142, 209, 175, 29);
		frmVoceEEu.getContentPane().add(botaoSemLogin);
		
		this.cabecalho = new Cabecalho(this.frmVoceEEu);
	}
}
