package br.com.Voceeu.Front_End.TelaMenu;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MenuView_Admin {

	private JFrame frame;
	
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

	public MenuView_Admin() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botaoAdicionarVoo = new JButton("Adicionar Voo"); 
		botaoAdicionarVoo.setBounds((int) (frame.getSize().getHeight() * 0.3), (int) (frame.getSize().getHeight() * 0.3), 250, 40);
		frame.getContentPane().add(botaoAdicionarVoo);
		
		JButton botaoServidor = new JButton("Relatório");
		botaoServidor.setBounds((int) (botaoAdicionarVoo.getBounds().x), (int) (botaoAdicionarVoo.getBounds().y + 40), 250, 40);
		frame.getContentPane().add(botaoServidor);
		
		JButton botaoDeslogar = new JButton("Deslogar");
		botaoDeslogar.setBounds((int) (botaoServidor.getBounds().x), (int) (botaoServidor.getBounds().y + 40), 250, 40);
		frame.getContentPane().add(botaoDeslogar);
		
		JLabel lblServerStatus = new JLabel("Server Status: ");
		lblServerStatus.setBounds(10, 10, 200, 16);
		frame.getContentPane().add(lblServerStatus);
		
		JLabel lblServerActive = new JLabel("Active");
		lblServerActive.setBounds(104, 10, 200, 16);
		lblServerActive.setForeground(Color.green);
		frame.getContentPane().add(lblServerActive);
		
	}
}
