package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.Voceeu.Components.Cabecalho;

import javax.swing.JButton;

public class MenuView_Usuario {

	private JFrame frame;
	private Cabecalho cabecalho;

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
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botaoVoos = new JButton("Voos"); //Gustavo - Botão para acessar aos voos do usuario
		botaoVoos.setBounds((int) (frame.getSize().width * 0.5 - 58.5), (int) (frame.getSize().height * 0.125), 117, 29);
		frame.getContentPane().add(botaoVoos);
		
		JButton botaoPassagem = new JButton("Passagem"); //Gustavo - Botão para acessar as passagens do usuario
		botaoPassagem.setBounds(botaoVoos.getBounds().x, (int) (botaoVoos.getBounds().y + (botaoVoos.getSize().height * 1.5)), 117, 29);
		frame.getContentPane().add(botaoPassagem);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds((int) (frame.getBounds().getCenterX() - 58.5), (int) (frame.getBounds().getMaxY() - 72.5), 117, 29);
		frame.getContentPane().add(botaoVoltar);
		
		this.cabecalho = new Cabecalho(this.frame);
	}

}
