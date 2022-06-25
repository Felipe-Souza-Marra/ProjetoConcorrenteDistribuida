package br.com.Voceeu.Front_End.TelaPassagens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;

import br.com.Voceeu.Components.Cabecalho;

public class PassagensView_Usuario {

	private JFrame frame;
	private Cabecalho cabecalho;

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
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds((int) (frame.getBounds().getCenterX() - 58.5), (int) (frame.getBounds().getMaxY() - 72.5), 117, 29);
		frame.getContentPane().add(botaoVoltar);
		
		JList list = new JList(); //Gustavo - Lista para vizualisar as passagens do usuario
		list.setBounds(frame.getBounds().x + 25, (int) (frame.getBounds().y + ((frame.getSize().height - 200) * 0.25)), (frame.getSize().width - 50), (frame.getSize().height - 200));
		frame.getContentPane().add(list);
		
		this.cabecalho = new Cabecalho(this.frame);
	}

}
