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
		panel.setBounds(0, 0, 450, 55);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Voos");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(62, 16, 43, 29);
		btnNewButton.setBorder(null);
		panel.add(btnNewButton);
		
		btnMinhasPassagens = new JButton("Minhas passagens");
		btnMinhasPassagens.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnMinhasPassagens.setBorder(null);
		btnMinhasPassagens.setBackground(Color.LIGHT_GRAY);
		btnMinhasPassagens.setBounds(134, 16, 136, 29);
		panel.add(btnMinhasPassagens);
		
		JLabel lblNewLabel = new JLabel("Usúario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(315, 22, 61, 16);
		panel.add(lblNewLabel);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.DARK_GRAY);
		canvas.setBounds(400, 10, 40, 40);
		panel.add(canvas);
		
		canvas_1 = new Canvas();
		canvas_1.setBackground(Color.DARK_GRAY);
		canvas_1.setBounds(10, 10, 40, 40);
		panel.add(canvas_1);
	}
	
}
