package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginView extends JFrame {

	private static final long serialVersionUID = 741799359299288783L;
	private JFrame frame;
	private JTextField emailTextField;
	private JTextField senhaTextField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		emailTextField = new JTextField();
		emailTextField.setBounds((int) (frame.getSize().getHeight() * 0.33), (int) (frame.getSize().getHeight() * 0.3), 250, 40);
		frame.getContentPane().add(emailTextField);
		emailTextField.setColumns(10);
		
		senhaTextField = new JTextField();
		senhaTextField.setBounds((int) (emailTextField.getBounds().x), (int) (emailTextField.getBounds().y + 40), 250, 40);
		frame.getContentPane().add(senhaTextField);
		senhaTextField.setColumns(10);
		
		JButton botaoCadastro = new JButton("OK");
		botaoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoCadastro.setBounds((int) (senhaTextField.getBounds().x), (int) (senhaTextField.getBounds().y + 50), 250, 40);
		frame.getContentPane().add(botaoCadastro);
		
		JLabel email = new JLabel("E-mail");
		email.setBounds((int) (emailTextField.getBounds().x - 50), (int) (emailTextField.getBounds().y + 10), 200, 16);
		frame.getContentPane().add(email);
		
		JLabel senha = new JLabel("Senha");
		senha.setBounds((int) (senhaTextField.getBounds().x - 50), (int) (senhaTextField.getBounds().y + 10), 200, 16);
		frame.getContentPane().add(senha);
	}

}
