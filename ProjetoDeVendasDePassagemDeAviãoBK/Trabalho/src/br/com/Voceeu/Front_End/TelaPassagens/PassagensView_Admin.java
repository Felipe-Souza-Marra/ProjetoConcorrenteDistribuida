package br.com.Voceeu.Front_End.TelaPassagens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;

public class PassagensView_Admin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassagensView_Admin window = new PassagensView_Admin();
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
	public PassagensView_Admin() {
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
		
		JList passagensLista = new JList(); //Gustavo - Lista para vizulisar o relatorio de passagens
		passagensLista.setBounds(16, 61, 428, 161);
		frame.getContentPane().add(passagensLista);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(161, 237, 117, 29);
		frame.getContentPane().add(botaoVoltar);
	}

}
