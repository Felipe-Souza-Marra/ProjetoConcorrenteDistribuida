package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InfoPassagemView extends JFrame {

	private static final long serialVersionUID = -1753339740616819973L;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoPassagemView window = new InfoPassagemView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InfoPassagemView() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomePassageiro = new JLabel("Passageiro: ");
		lblNomePassageiro.setBounds((int) (frame.getSize().getHeight() * 0.1), (int) (frame.getSize().getHeight() * 0.1), 200, 16);
		frame.getContentPane().add(lblNomePassageiro);
		
		JLabel lblLocalAssento = new JLabel("Número do Assento: ");
		lblLocalAssento.setBounds((int) (lblNomePassageiro.getBounds().x), (int) (lblNomePassageiro.getBounds().y + 35), 200, 16);
		frame.getContentPane().add(lblLocalAssento);
		
		JLabel lblLocalEmbarque = new JLabel("Local de embarque: ");
		lblLocalEmbarque.setBounds((int) (lblLocalAssento.getBounds().x), (int) (lblLocalAssento.getBounds().y + 35), 200, 16);
		frame.getContentPane().add(lblLocalEmbarque);
		
		JLabel lblHoraViagem = new JLabel("Horário de embarque: ");
		lblHoraViagem.setBounds((int) (lblLocalEmbarque.getBounds().x), (int) (lblLocalEmbarque.getBounds().y + 35), 200, 16);
		frame.getContentPane().add(lblHoraViagem);
		
		JLabel lblDestinoViagem = new JLabel("Destino: ");
		lblDestinoViagem.setBounds((int) (lblHoraViagem.getBounds().x), (int) (lblHoraViagem.getBounds().y + 35), 200, 16);
		frame.getContentPane().add(lblDestinoViagem);
		
		JLabel lblHoraChegada = new JLabel("Horário de desembarque: ");
		lblHoraChegada.setBounds((int) (lblDestinoViagem.getBounds().x), (int) (lblDestinoViagem.getBounds().y + 35), 200, 16);
		frame.getContentPane().add(lblHoraChegada);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds((int) (frame.getSize().getHeight() * 0.32), (int) (frame.getSize().getHeight() * 0.7), 250, 40);
		frame.getContentPane().add(botaoVoltar);
	}

}
