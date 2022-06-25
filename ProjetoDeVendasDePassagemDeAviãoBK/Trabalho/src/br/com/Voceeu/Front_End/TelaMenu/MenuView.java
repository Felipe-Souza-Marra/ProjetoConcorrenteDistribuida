package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.com.Voceeu.Components.Cabecalho;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MenuView {

	private JFrame frame;
	private JTable tabelaAssentosLivres; //Gustavo - Tabela de assentos livres
	private JTextField assentosTextField; //Gustavo - Area pra pesquisar assentos livres
	private Cabecalho cabecalho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView window = new MenuView();
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
	public MenuView() {
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
		
		JList listaAssentosLivres = new JList(); //Gustavo - Lista para vizualisar os assentos livres
		listaAssentosLivres.setBounds((int) ((frame.getBounds().width * 0.5) - ((frame.getSize().width - 60) * 0.5)), (int) (frame.getSize().height * 0.125), frame.getSize().width - 60, 32);
		frame.getContentPane().add(listaAssentosLivres);
		
		tabelaAssentosLivres = new JTable(); 
		tabelaAssentosLivres.setBounds(listaAssentosLivres.getBounds().x, (int) (listaAssentosLivres.getBounds().y + (listaAssentosLivres.getSize().height * 1.5)), listaAssentosLivres.getSize().width, listaAssentosLivres.getSize().height * 2);
		frame.getContentPane().add(tabelaAssentosLivres);
		
		JLabel assentosImage = new JLabel("imagemAssentos"); //Gustavo - Imagem para ilustracao (ainda não exportei)
		assentosImage.setHorizontalAlignment(SwingConstants.CENTER);
		assentosImage.setBounds((int) (tabelaAssentosLivres.getBounds().getMinX()), (int) (tabelaAssentosLivres.getBounds().y + (tabelaAssentosLivres.getSize().height * 1.5)), tabelaAssentosLivres.getSize().width, (int) (frame.getSize().height * 0.4));
		frame.getContentPane().add(assentosImage);
		
		JLabel assentos = new JLabel("Assentos"); 
		assentos.setBounds(assentosImage.getBounds().x, (int) (assentosImage.getBounds().y + (assentosImage.getSize().height) + 26), 61, 26);
		frame.getContentPane().add(assentos);
		
		assentosTextField = new JTextField();
		assentosTextField.setBounds(assentos.getBounds().x + assentos.getSize().width + assentos.getSize().height, assentos.getBounds().y, 130, 26);
		frame.getContentPane().add(assentosTextField);
		assentosTextField.setColumns(10);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds((int) frame.getBounds().getMinX(), (int) frame.getBounds().getMaxY() - 58, 117, 29);
		frame.getContentPane().add(botaoCancelar);
		
		JButton botaoAdicionar = new JButton("Adicionar");
		botaoAdicionar.setBounds((int) frame.getBounds().getMaxX() - 117, (int) frame.getBounds().getMaxY() - 58, 117, 29);
		frame.getContentPane().add(botaoAdicionar);
		
		this.cabecalho = new Cabecalho(this.frame);
	}
}
