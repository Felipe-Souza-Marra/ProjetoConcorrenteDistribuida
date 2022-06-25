package br.com.Voceeu.Front_End.TelaAdicionarVoo;

import java.awt.*;
import javax.swing.*;
import br.com.Voceeu.Components.Cabecalho;


public class AdicionarVooView {

	public JFrame frame;
	private JTextField nomeVooTextField; //Gustavo - Área pra escrever o nome do voo
	private JTextField partidaTextField; //Gustavo - Área pra escrever o local de partida 
	private JTextField chegadaTextField; //Gustavo - Área pra escrever o local de chegada
	private JTextField dataTextField; //Gustavo - Área pra escrever a data do voo
	private JTextField precoTextField; //Gustavo - Área pra escrever o valor da passagem
	private Cabecalho cabecalho;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionarVooView window = new AdicionarVooView();
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
	public AdicionarVooView() {
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
		
		nomeVooTextField = new JTextField();
		nomeVooTextField.setText("Nome do Voo");
		nomeVooTextField.setToolTipText("");
		nomeVooTextField.setBounds(16, 61, 226, 26);
		frame.getContentPane().add(nomeVooTextField);
		nomeVooTextField.setColumns(10);
		
		partidaTextField = new JTextField();
		partidaTextField.setText("Local da partida");
		partidaTextField.setColumns(10);
		partidaTextField.setBounds(16, 88, 226, 26);
		frame.getContentPane().add(partidaTextField);
		
		chegadaTextField = new JTextField();
		chegadaTextField.setText("Local da chegada");
		chegadaTextField.setColumns(10);
		chegadaTextField.setBounds(16, 115, 226, 26);
		frame.getContentPane().add(chegadaTextField);
		
		dataTextField = new JTextField();
		dataTextField.setText("Data");
		dataTextField.setColumns(10);
		dataTextField.setBounds(16, 143, 226, 26);
		frame.getContentPane().add(dataTextField);
		
		precoTextField = new JTextField();
		precoTextField.setText("Valor");
		precoTextField.setColumns(10);
		precoTextField.setBounds(16, 172, 226, 26);
		frame.getContentPane().add(precoTextField);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(6, 237, 117, 29);
		frame.getContentPane().add(botaoCancelar);
		
		JButton botaoAdicionar = new JButton("Adicionar");
		botaoAdicionar.setBounds(327, 237, 117, 29);
		frame.getContentPane().add(botaoAdicionar);
		
		this.cabecalho = new Cabecalho(this.frame);
	}
	
	public JFrame returnFrame() {
		return this.frame;
	}
}
