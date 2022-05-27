package Visualizações;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class TelaInicial {

	private JFrame frmPassagensAreas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frmPassagensAreas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPassagensAreas = new JFrame();
		frmPassagensAreas.setTitle("Passagens aéreas ");
		frmPassagensAreas.setBounds(100, 100, 450, 300);
		frmPassagensAreas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CardLayout myLayout = new CardLayout();
		frmPassagensAreas.getContentPane().setLayout(myLayout);
		
		JPanel Principal = new JPanel();
		frmPassagensAreas.getContentPane().add(Principal, "Principal");
		Principal.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myLayout.show(frmPassagensAreas.getContentPane(), "AdicionarPassageiro");
			}
		});
		btnNewButton.setBounds(6, 6, 117, 29);
		Principal.add(btnNewButton);
		
		JPanel AdicionarPassageiro = new JPanel();
		frmPassagensAreas.getContentPane().add(AdicionarPassageiro, "AdicionarPassageiro");
		AdicionarPassageiro.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myLayout.show(frmPassagensAreas.getContentPane(), "Principal");
			}
		});
		btnNewButton_1.setBounds(327, 6, 117, 29);
		AdicionarPassageiro.add(btnNewButton_1);
	}
}
