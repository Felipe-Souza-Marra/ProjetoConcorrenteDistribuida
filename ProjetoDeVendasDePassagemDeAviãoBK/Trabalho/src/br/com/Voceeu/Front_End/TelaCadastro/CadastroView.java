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
		frmVoceEEu.setBounds(0, 0, 800, 600);
		frmVoceEEu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVoceEEu.getContentPane().setLayout(null);
		
		emailTextField = new JTextField();
		emailTextField.setBounds((int) ((frmVoceEEu.getSize().width * 0.5) - ((frmVoceEEu.getSize().width * 0.25) * 0.5)), (int) (frmVoceEEu.getSize().height * 0.5) - 13, (int) (frmVoceEEu.getSize().width * 0.25), 26);
		frmVoceEEu.getContentPane().add(emailTextField);
		emailTextField.setColumns(10);
		
		JLabel email = new JLabel("E-mail");
		email.setBounds((int) (emailTextField.getBounds().x - (emailTextField.getBounds().width * 0.3)), emailTextField.getBounds().y, 42, emailTextField.getSize().height);
		frmVoceEEu.getContentPane().add(email);
		
		senhaTextField = new JTextField();
		senhaTextField.setBounds(emailTextField.getBounds().x, emailTextField.getBounds().y + emailTextField.getBounds().height, emailTextField.getSize().width, emailTextField.getSize().height);
		frmVoceEEu.getContentPane().add(senhaTextField);
		senhaTextField.setColumns(10);
		JLabel senha = new JLabel("Senha");
		senha.setBounds((int) (senhaTextField.getBounds().x - (senhaTextField.getBounds().width * 0.3)), senhaTextField.getBounds().y, 37, senhaTextField.getSize().height);
		frmVoceEEu.getContentPane().add(senha);
		
		JButton botaoCadastro = new JButton("OK");
		botaoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Gustavo - Acao do botao
			}
		});
		botaoCadastro.setBounds((int) ((frmVoceEEu.getSize().width * 0.5) - 37.5), (int) (frmVoceEEu.getBounds().getSize().height * 0.75), 75, 29);
		frmVoceEEu.getContentPane().add(botaoCadastro);
		
		JButton botaoSemLogin = new JButton("Continuar sem Login");
		botaoSemLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO: Gustavo - Acao do botao
			}
		});
		botaoSemLogin.setBounds(312, botaoCadastro.getBounds().y + botaoCadastro.getBounds().height, 175, 29);
		frmVoceEEu.getContentPane().add(botaoSemLogin);
		
		this.cabecalho = new Cabecalho(this.frmVoceEEu);
	}
}
