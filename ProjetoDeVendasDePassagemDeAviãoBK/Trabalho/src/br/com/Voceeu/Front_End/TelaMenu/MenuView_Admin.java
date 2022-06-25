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
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botaoAdicionarVoo = new JButton("Adicionar Voo"); 
		botaoAdicionarVoo.setBounds((int) (frame.getSize().width * 0.5 - 58.5), (int) (frame.getSize().height * 0.125), 117, 29);
		frame.getContentPane().add(botaoAdicionarVoo);
		
		JButton botaoServidor = new JButton("Servidor"); //Gustavo - Botão para acessar ao servidor
		botaoServidor.setBounds(botaoAdicionarVoo.getBounds().x, (int) (botaoAdicionarVoo.getBounds().y + (botaoAdicionarVoo.getSize().height * 1.5)), 117, 29);
		frame.getContentPane().add(botaoServidor);
		
		JButton botaoRelatorio = new JButton("Relatorio"); //Gustavo - Botão para acessar ao relatorio
		botaoRelatorio.setBounds(botaoAdicionarVoo.getBounds().x, (int) (botaoServidor.getBounds().y + (botaoServidor.getSize().height * 1.5)), 117, 29);
		frame.getContentPane().add(botaoRelatorio);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds((int) (frame.getBounds().getCenterX() - 58.5), (int) (frame.getBounds().getMaxY() - 72.5), 117, 29);
		frame.getContentPane().add(botaoVoltar);
		
		this.cabecalho = new Cabecalho(this.frame);
	}
}
