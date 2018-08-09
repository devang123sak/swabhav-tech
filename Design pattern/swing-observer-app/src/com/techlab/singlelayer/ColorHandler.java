package com.techlab.singlelayer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorHandler implements ActionListener {

	private JFrame colorFrame;

	public ColorHandler(JFrame frame) {
		this.colorFrame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getActionCommand().equals("RED")) {
			colorFrame.getContentPane().setBackground(Color.red);
		} else {
			colorFrame.getContentPane().setBackground(Color.blue);
		}
	}

}
