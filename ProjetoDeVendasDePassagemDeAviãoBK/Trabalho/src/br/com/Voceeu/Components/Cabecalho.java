package br.com.Voceeu.Components;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Cabecalho {
	
	private final Panel panel = new Panel();
	private JButton btnMinhasPassagens;
	private Canvas canvas_1;
	
	public Cabecalho(JFrame frame) {
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, frame.getSize().width, 55);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnMinhasPassagens = new JButton("Minhas passagens");
		btnMinhasPassagens.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnMinhasPassagens.setBorder(null);
		btnMinhasPassagens.setBackground(Color.LIGHT_GRAY);
		btnMinhasPassagens.setBounds((int) (panel.getSize().width * 0.5) - 68, panel.getBounds().y, 136, panel.getSize().height);
		panel.add(btnMinhasPassagens);
		
		//IMAGEM USUARIO
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.DARK_GRAY);
		canvas.setBounds(panel.getSize().width - 50, panel.getBounds().y, panel.getSize().height, panel.getSize().height);
		panel.add(canvas);
		
		JLabel lblNewLabel = new JLabel("Usúario");
		lblNewLabel.setBounds(canvas.getBounds().x - canvas.getSize().width, canvas.getBounds().y, 61, canvas.getSize().height);
		panel.add(lblNewLabel);
		
		//LOGO
		canvas_1 = new Canvas();
		canvas_1.setBackground(Color.DARK_GRAY);
		canvas_1.setBounds(panel.getBounds().x, panel.getBounds().y, panel.getSize().height, panel.getSize().height);
		panel.add(canvas_1);
		
		JButton btnNewButton = new JButton("Voos");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(canvas_1.getBounds().x + canvas_1.getSize().width, canvas_1.getBounds().y, 43, canvas_1.getSize().height);
		btnNewButton.setBorder(null);
		panel.add(btnNewButton);
	}
	
}
