package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AssentosView extends JFrame {

	private static final long serialVersionUID = 5286971624750160450L;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssentosView frame = new AssentosView();
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
	public AssentosView() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		for (int u = 0; u < 7; u++) {
			for (int i = 0; i < 3; i++) {
				Icon icon = new ImageIcon("/Users/arthurmartinssaraiva/Downloads/cadeiraNormal.png");
				JButton btnCadeira = new JButton(icon);
				btnCadeira.setBounds((int) ((frame.getSize().getHeight()*0.20) + (i * 50)), (int) ((frame.getSize().getWidth() * 0.1) + (u * 50)), 50, 50);
				frame.getContentPane().add(btnCadeira);
				
				JButton btnCadeira2 = new JButton(icon);
				btnCadeira2.setBounds((int) ((frame.getSize().getHeight()*0.55) + (i * 50)), (int) ((frame.getSize().getWidth() * 0.1) + (u * 50)), 50, 50);
				frame.getContentPane().add(btnCadeira2);
			}
		}
		
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds((int) (frame.getSize().getHeight() * 0.08), (int) (frame.getSize().getWidth() * 0.8), 250, 40);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds((int) (btnVoltar.getBounds().getMaxX() + 10 ), (int) (btnVoltar.getBounds().getY()), 250, 40);
		frame.getContentPane().add(btnConfirmar);
	}

}
