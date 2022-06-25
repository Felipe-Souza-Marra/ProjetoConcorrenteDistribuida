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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList listaPassagens = new JList(); //Gustavo - Lista de passagens no servidor
		listaPassagens.setBounds(17, 61, 427, 85);
		frame.getContentPane().add(listaPassagens);
		
		passagemTextField = new JTextField();
		passagemTextField.setBounds(142, 176, 150, 26);
		frame.getContentPane().add(passagemTextField);
		passagemTextField.setColumns(10);
		
		JLabel buscarPassgem = new JLabel("Buscar passagem");
		buscarPassgem.setBounds(17, 181, 113, 16);
		frame.getContentPane().add(buscarPassgem);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(6, 237, 117, 29);
		frame.getContentPane().add(botaoVoltar);
		
		JButton botaoContinuar = new JButton("Continuar");
		botaoContinuar.setBounds(327, 237, 117, 29);
		frame.getContentPane().add(botaoContinuar);
		
		this.cabecalho = new Cabecalho(this.frame);
	}

}
