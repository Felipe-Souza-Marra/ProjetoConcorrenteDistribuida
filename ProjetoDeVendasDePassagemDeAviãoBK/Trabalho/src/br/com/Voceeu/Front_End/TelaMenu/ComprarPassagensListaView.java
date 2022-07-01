package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;

public class ComprarPassagensListaView extends JFrame {

	private static final long serialVersionUID = 4141299999770207902L;
	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComprarPassagensListaView frame = new ComprarPassagensListaView();
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComprarPassagensListaView() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIndicativo = new JLabel("Passagens disponíveis para o dia XX/MM/YYYY para (local)");
		lblIndicativo.setBounds((int) (frame.getSize().getHeight() * 0.02), (int) (frame.getSize().getHeight() * 0.02), 300, 16);
		frame.getContentPane().add(lblIndicativo);
		
		String colunasIndicativas[] = { "Origem", "Destino", "Duração", "Linha aérea", "Preço"};
		String[][] valoresMocados = { 
				{"BSB", "SP", "2 horas", "Gol", "R$850,00"},
				{"BSB", "SP", "2'40 horas", "Latam", "R$550,00"},
				{"BSB", "SP", "2'30 horas", "Azul", "R$650,00"},
				{"BSB", "SP", "2 horas", "Gol", "R$850,00"},
		};
		table = new JTable(valoresMocados, colunasIndicativas);
		table.setBounds((int) (frame.getSize().getHeight() * 0), (int) (lblIndicativo.getBounds().y + 31), (int) (frame.getSize().getHeight()), 400);
		frame.getContentPane().add(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds((int) (frame.getSize().getHeight() * 0.08), (int) (table.getBounds().getMaxY() + 10), 250, 40);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds((int) (btnVoltar.getBounds().getMaxX() + 10 ), (int) (table.getBounds().getMaxY() + 10), 250, 40);
		frame.getContentPane().add(btnConfirmar);
		
	}

}
