package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.toedter.calendar.JCalendar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ComprarPassagemView extends JFrame {

	private static final long serialVersionUID = -2921338372778270052L;
	private JFrame frame;
	private JTextField LocalPartidatextField;
	private JTextField DestinotextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComprarPassagemView frame = new ComprarPassagemView();
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
	public ComprarPassagemView() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		LocalPartidatextField = new JTextField();
		LocalPartidatextField.setColumns(10);
		LocalPartidatextField.setBounds((int) (frame.getSize().getHeight() * 0.25), (int) (frame.getSize().getHeight() * 0.01), 250, 40);
		frame.getContentPane().add(LocalPartidatextField);
		JLabel lblLocalPartida = new JLabel("Local de partida: ");
		lblLocalPartida.setBounds((int) (LocalPartidatextField.getBounds().x - 130), (int) (LocalPartidatextField.getBounds().y + 10), 200, 16);
		frame.getContentPane().add(lblLocalPartida);
		
		DestinotextField = new JTextField();
		DestinotextField.setColumns(10);
		DestinotextField.setBounds((int) (LocalPartidatextField.getBounds().x), (int) (LocalPartidatextField.getBounds().y + 40), 250, 40);
		frame.getContentPane().add(DestinotextField);
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds((int) (DestinotextField.getBounds().x - 130), (int) (DestinotextField.getBounds().y + 10), 200, 16);
		frame.getContentPane().add(lblDestino);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds((int) (frame.getSize().getHeight() * 0), (int) (DestinotextField.getBounds().y + 60), (int) (frame.getSize().getHeight()), 350);
		frame.getContentPane().add(calendar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds((int) (frame.getSize().getHeight() * 0.3), (int) (calendar.getBounds().y + 360), 250 , 40);
		frame.getContentPane().add(btnVoltar);
		
		
	}

}
