package com.techlab.multilayer;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MultiLayerFrame extends JFrame {

	public MultiLayerFrame() {
		this.setTitle("MultiLayerFrame");
		this.setSize(1024, 786);
		this.setVisible(true);

		JButton redButton = new JButton("RED");
		redButton.setBounds(230, 300, 100, 80);
		redButton.setFont(new Font("Arial", Font.ITALIC, 20));
		this.add(redButton);
		this.setLayout(null);
		this.setVisible(true);
		redButton.addActionListener(new RedButtonListener(this));

		JButton blueButton = new JButton("BLUE");
		blueButton.setBounds(430, 300, 100, 80);
		blueButton.setFont(new Font("Arial", Font.ITALIC, 20));
		this.add(blueButton);
		this.setLayout(null);
		this.setVisible(true);
		blueButton.addActionListener(new BlueButtonListener(this));

	}
}