package br.com.Voceeu.Front_End.TelaPassagens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;

public class PassagensView_Usuario {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassagensView_Usuario window = new PassagensView_Usuario();
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
	public PassagensView_Usuario() {
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
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(154, 237, 117, 29);
		frame.getContentPane().add(botaoVoltar);
		
		JList list = new JList(); //Gustavo - Lista para vizualisar as passagens do usuario
		list.setBounds(16, 61, 428, 164);
		frame.getContentPane().add(list);
	}

}
