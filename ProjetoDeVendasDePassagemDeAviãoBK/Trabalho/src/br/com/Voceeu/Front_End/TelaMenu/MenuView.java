package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MenuView {

	private JFrame frame;
	private JTable tabelaAssentosLivres; //Gustavo - Tabela de assentos livres
	private JTextField assentosTextField; //Gustavo - Area pra pesquisar assentos livres

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel logo = new JLabel("Logo"); //Gustavo - Logo para o cabecalho (ainda não exportei)
		logo.setBounds(6, 6, 43, 43);
		frame.getContentPane().add(logo);
		
		JList listaAssentosLivres = new JList(); //Gustavo - Lista para vizualisar os assentos livres
		listaAssentosLivres.setBounds(112, 57, 227, 32);
		frame.getContentPane().add(listaAssentosLivres);
		
		tabelaAssentosLivres = new JTable(); 
		tabelaAssentosLivres.setBounds(112, 101, 227, 32);
		frame.getContentPane().add(tabelaAssentosLivres);
		
		JLabel assentosImage = new JLabel("imagemAssentos");
		assentosImage.setBounds(112, 145, 227, 43);
		frame.getContentPane().add(assentosImage);
		
		JLabel assentos = new JLabel("Assentos"); //Gustavo - Imagem para ilustracao (ainda não exportei)
		assentos.setBounds(112, 210, 61, 16);
		frame.getContentPane().add(assentos);
		
		assentosTextField = new JTextField();
		assentosTextField.setBounds(185, 205, 130, 26);
		frame.getContentPane().add(assentosTextField);
		assentosTextField.setColumns(10);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(6, 238, 117, 29);
		frame.getContentPane().add(botaoCancelar);
		
		JButton adicionarBotao = new JButton("Adicionar");
		adicionarBotao.setBounds(327, 238, 117, 29);
		frame.getContentPane().add(adicionarBotao);
	}
}
