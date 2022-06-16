package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MenuView_Usuario {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView_Usuario window = new MenuView_Usuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuView_Usuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel logo = new JLabel("Logo");
		logo.setBounds(6, 6, 43, 43);
		frame.getContentPane().add(logo);
		
		JButton botaoVoos = new JButton("Voos"); //Gustavo - Botão para acessar aos voos do usuario
		botaoVoos.setBounds(154, 77, 117, 29);
		frame.getContentPane().add(botaoVoos);
		
		JButton botaoPassagem = new JButton("Passagem"); //Gustavo - Botão para acessar as passagens do usuario
		botaoPassagem.setBounds(154, 118, 117, 29);
		frame.getContentPane().add(botaoPassagem);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(154, 237, 117, 29);
		frame.getContentPane().add(botaoVoltar);
	}

}
