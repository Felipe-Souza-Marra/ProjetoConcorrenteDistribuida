package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class AdicionarVooView extends JFrame {

	private static final long serialVersionUID = 1991389970725672229L;
	private JFrame frame;
	private JTextField nomeVooTextField;
	private JTextField partidaTextField; 
	private JTextField chegadaTextField;
	private JTextField precoTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionarVooView frame = new AdicionarVooView();
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
	public AdicionarVooView() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		nomeVooTextField = new JTextField();
		nomeVooTextField.setToolTipText("");
		nomeVooTextField.setBounds((int) (frame.getSize().getHeight() * 0.4), (int) (frame.getSize().getHeight() * 0.1), 250, 40);
		frame.getContentPane().add(nomeVooTextField);
		nomeVooTextField.setColumns(10);
		JLabel lblNomeVoo = new JLabel("Nome do Voo: ");
		lblNomeVoo.setBounds((int) (nomeVooTextField.getBounds().x - 130), (int) (nomeVooTextField.getBounds().y + 10), 200, 16);
		frame.getContentPane().add(lblNomeVoo);
		
		partidaTextField = new JTextField();
		partidaTextField.setColumns(10);
		partidaTextField.setBounds((int) (nomeVooTextField.getBounds().x), (int) (nomeVooTextField.getBounds().y + 40), 250, 40);
		frame.getContentPane().add(partidaTextField);
		JLabel lblLocalPartida = new JLabel("Local da partida: ");
		lblLocalPartida.setBounds((int) (partidaTextField.getBounds().x - 130), (int) (partidaTextField.getBounds().y + 10), 200, 16);
		frame.getContentPane().add(lblLocalPartida);
		
		chegadaTextField = new JTextField();
		chegadaTextField.setColumns(10);
		chegadaTextField.setBounds((int) (partidaTextField.getBounds().x), (int) (partidaTextField.getBounds().y + 40), 250, 40);
		frame.getContentPane().add(chegadaTextField);
		JLabel lblLocalChegada = new JLabel("Local da chegada: ");
		lblLocalChegada.setBounds((int) (chegadaTextField.getBounds().x - 130), (int) (chegadaTextField.getBounds().y + 10), 200, 16);
		frame.getContentPane().add(lblLocalChegada);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds((int) (chegadaTextField.getBounds().x), (int) (chegadaTextField.getBounds().y + 40), 250, 40);
		frame.getContentPane().add(dateChooser);
		JLabel lblData = new JLabel("Data: ");
		lblData.setBounds((int) (dateChooser.getBounds().x - 130), (int) (dateChooser.getBounds().y + 10), 200, 16);
		frame.getContentPane().add(lblData);
		
		precoTextField = new JTextField();
		precoTextField.setColumns(10);
		precoTextField.setBounds((int) (dateChooser.getBounds().x), (int) (dateChooser.getBounds().y + 40), 250, 40);
		frame.getContentPane().add(precoTextField);
		JLabel lblValorPassagem = new JLabel("Valor da passagem: ");
		lblValorPassagem.setBounds((int) (precoTextField.getBounds().x - 130), (int) (precoTextField.getBounds().y + 10), 200, 16);
		frame.getContentPane().add(lblValorPassagem);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds((int) (frame.getSize().getHeight() * 0.1), (int) (precoTextField.getBounds().y + 70), 250, 40);
		frame.getContentPane().add(botaoCancelar);
		
		JButton botaoAdicionar = new JButton("Adicionar");
		botaoAdicionar.setBounds((int) (botaoCancelar.getBounds().x + 260), (int) (precoTextField.getBounds().y + 70), 250, 40);
		frame.getContentPane().add(botaoAdicionar);
		
	}
}
