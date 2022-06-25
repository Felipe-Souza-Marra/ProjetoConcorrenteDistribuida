package br.com.Voceeu.Front_End.TelaServidor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.com.Voceeu.Components.Cabecalho;

import javax.swing.JButton;

public class ServidorView {

	private JFrame frame;
	private JTextField passagemTextField; //Gustavo - Area para pesquisar uma passagem
	private Cabecalho cabecalho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServidorView window = new ServidorView();
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
	public ServidorView() {
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
		
		JList listPassagens = new JList(); //Gustavo - Lista de passagens no servidor
		listPassagens.setBounds(frame.getBounds().x + 25, (int) (frame.getBounds().y + ((frame.getSize().height - 200) * 0.2)), (frame.getSize().width - 50), (frame.getSize().height - 200));
		frame.getContentPane().add(listPassagens);
		
		JLabel buscarPassagem = new JLabel("Buscar passagem");
		buscarPassagem.setBounds(listPassagens.getBounds().x, listPassagens.getBounds().y + listPassagens.getSize().height + 10, 113, 26);
		frame.getContentPane().add(buscarPassagem);
		
		passagemTextField = new JTextField();
		passagemTextField.setBounds(buscarPassagem.getBounds().x + buscarPassagem.getSize().width + 10, buscarPassagem.getBounds().y, 150, 26);
		frame.getContentPane().add(passagemTextField);
		passagemTextField.setColumns(10);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds((int) frame.getBounds().getMinX(), (int) frame.getBounds().getMaxY() - 58, 117, 29);
		frame.getContentPane().add(botaoCancelar);
		
		JButton botaoContinuar = new JButton("Continuar");
		botaoContinuar.setBounds((int) frame.getBounds().getMaxX() - 117, (int) frame.getBounds().getMaxY() - 58, 117, 29);
		frame.getContentPane().add(botaoContinuar);
		
		this.cabecalho = new Cabecalho(this.frame);
	}

}
