package br.com.Voceeu.Front_End.TelaRelatorio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;

public class RelatorioView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelatorioView window = new RelatorioView();
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
	public RelatorioView() {
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
		botaoVoltar.setBounds(158, 237, 117, 29);
		frame.getContentPane().add(botaoVoltar);
		
		JList relatorioList = new JList(); //Gustavo - Lista para ver o relatorio do servidor
		relatorioList.setBounds(16, 61, 428, 169);
		frame.getContentPane().add(relatorioList);
	}

}
