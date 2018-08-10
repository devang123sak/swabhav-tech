package com.techlab.tic.tac.toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonActionHandler implements ActionListener {

	GameConsole gameConsole = new GameConsole();

	public ButtonActionHandler(TicTacToeGui frame) {

	}

	@Override
	public void actionPerformed(ActionEvent event) {

		JButton theRightButton = (JButton) event.getSource();
		try {

			if (event.getActionCommand().equals("0")) {
				gameConsole.startGame(0, 0);
				theRightButton.setIcon(getIcon());
			} else if (event.getActionCommand().equals("1")) {
				gameConsole.startGame(0, 1);
				theRightButton.setIcon(getIcon());
			} else if (event.getActionCommand().equals("2")) {
				gameConsole.startGame(0, 2);
				theRightButton.setIcon(getIcon());
			} else if (event.getActionCommand().equals("3")) {
				gameConsole.startGame(1, 0);
				theRightButton.setIcon(getIcon());
			} else if (event.getActionCommand().equals("4")) {
				gameConsole.startGame(1, 1);
				theRightButton.setIcon(getIcon());
			} else if (event.getActionCommand().equals("5")) {
				gameConsole.startGame(1, 2);
				theRightButton.setIcon(getIcon());
			} else if (event.getActionCommand().equals("6")) {
				gameConsole.startGame(2, 0);
				theRightButton.setIcon(getIcon());
			} else if (event.getActionCommand().equals("7")) {
				gameConsole.startGame(2, 1);
				theRightButton.setIcon(getIcon());
			} else if (event.getActionCommand().equals("8")) {
				gameConsole.startGame(2, 2);
				theRightButton.setIcon(getIcon());
			}

		} catch (CellAlreadyMarkException e) {
			e.printStackTrace();
		}
	}

	public ImageIcon getIcon() {
		ImageIcon icon = null;
		ImageIcon X = new ImageIcon(("images/red-x.jpg"));
		ImageIcon O = new ImageIcon(("images/black-o.jpg"));
		String currentIcon = gameConsole.getIcon();
		if (currentIcon == "X") {
			icon = X;
		} else if (currentIcon == "O") {
			icon = O;
		}
		return icon;
	}

}
