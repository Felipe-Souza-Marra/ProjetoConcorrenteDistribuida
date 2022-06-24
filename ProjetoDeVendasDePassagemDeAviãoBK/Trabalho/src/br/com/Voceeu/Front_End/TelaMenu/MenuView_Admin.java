package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.Voceeu.Components.Cabecalho;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class MenuView_Admin {

	private JFrame frame;
	private Cabecalho cabecalho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView_Admin window = new MenuView_Admin();
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
	public MenuView_Admin() {
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
		
		JButton botaoAdicionarVoo = new JButton("Adicionar Voo"); 
		botaoAdicionarVoo.setBounds(159, 78, 117, 29);
		frame.getContentPane().add(botaoAdicionarVoo);
		
		JButton botaoServidor = new JButton("Servidor"); //Gustavo - Botão para acessar ao servidor
		botaoServidor.setBounds(159, 113, 117, 29);
		frame.getContentPane().add(botaoServidor);
		
		JButton botaoRelatorio = new JButton("Relatorio"); //Gustavo - Botão para acessar ao relatorio
		botaoRelatorio.setBounds(159, 151, 117, 29);
		frame.getContentPane().add(botaoRelatorio);
		
		JButton botaoVoltar = new JButton("Voltar"); 
		botaoVoltar.setBounds(159, 237, 117, 29);
		frame.getContentPane().add(botaoVoltar);
		
		this.cabecalho = new Cabecalho(this.frame);
	}
}
