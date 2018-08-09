package com.techlab.singlelayer;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SingleLayer extends JFrame {

	public SingleLayer() {

		this.setTitle("Single Layer");
		this.setSize(1024, 786);
		this.setVisible(true);

		JButton redButton = new JButton("RED");
		redButton.setBounds(230, 300, 100, 80);
		redButton.setFont(new Font("Arial", Font.ITALIC, 20));
		this.add(redButton);
		this.setLayout(null);
		this.setVisible(true);
		redButton.addActionListener(new ColorHandler(this));

		JButton blueButton = new JButton("BLUE");
		blueButton.setBounds(430, 300, 100, 80);
		blueButton.setFont(new Font("Arial", Font.ITALIC, 20));
		this.add(blueButton);
		this.setLayout(null);
		this.setVisible(true);
		blueButton.addActionListener(new ColorHandler(this));

	}
}
