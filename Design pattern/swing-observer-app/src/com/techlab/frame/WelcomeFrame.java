package com.techlab.frame;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WelcomeFrame extends JFrame {

	public WelcomeFrame() {
		this.setTitle("Welcome");
		this.setSize(1024, 786);
		this.setVisible(true);

		JButton button = new JButton("Hi");
		button.setBounds(330, 300, 100, 80);
		button.setFont(new Font("Arial", Font.ITALIC, 40));
		this.add(button);
		this.setLayout(null);
		this.setVisible(true);

		button.addActionListener(new RedButtonListener(this));
	}

}
