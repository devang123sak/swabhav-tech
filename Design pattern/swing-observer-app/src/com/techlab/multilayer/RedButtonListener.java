package com.techlab.multilayer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class RedButtonListener implements ActionListener {

	JFrame buttonListener;

	public RedButtonListener(JFrame frame) {
		this.buttonListener = frame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		buttonListener.getContentPane().setBackground(Color.red);

	}
}