package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
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
		frame.setBounds(100, 100, 600, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botaoVoos = new JButton("Comprar vôos");
		botaoVoos.setBounds((int) (frame.getSize().getHeight() * 0.3), (int) (frame.getSize().getHeight() * 0.3), 250, 40);
		frame.getContentPane().add(botaoVoos);
		
		JButton botaoPassagem = new JButton("Ver minhas passagem");
		botaoPassagem.setBounds((int) (botaoVoos.getBounds().x), (int) (botaoVoos.getBounds().y + 40), 250, 40);
		frame.getContentPane().add(botaoPassagem);
		
		JButton botaoVoltar = new JButton("Deslogar");
		botaoVoltar.setBounds((int) (botaoPassagem.getBounds().x), (int) (botaoPassagem.getBounds().y + 40), 250, 40);
		frame.getContentPane().add(botaoVoltar);
		
	}

}
