package com.techlab.tic.tac.toe;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TicTacToeGui extends JFrame {

	JButton button[] = new JButton[9];

	JLabel resultLabel;

	public TicTacToeGui() {
		startGame();
	}

	public TicTacToeGui(String firstplayer, String secondPlayer)
			throws CellAlreadyMarkException {

		setTitle("Tic Tac Toe Game");
		setSize(1024, 786);
		setVisible(true);
		displayPlayerInfo(firstplayer, secondPlayer);
		displayButtons(new ButtonActionHandler(this));

	}

	public void startGame() {

		JLabel player1, player2;
		player1 = new JLabel("PLAYER 1: ");
		player1.setBounds(300, 50, 300, 50);
		player2 = new JLabel("PLAYER 2: ");
		player2.setBounds(300, 100, 300, 50);
		player1.setFont(new Font("Arial", Font.ITALIC, 25));
		player2.setFont(new Font("Arial", Font.ITALIC, 25));
		this.add(player1);
		this.add(player2);
		this.setLayout(null);
		player1.setVisible(true);
		player2.setVisible(true);

		JTextField playerText1, playerText2;
		playerText1 = new JTextField();
		playerText1.setBounds(460, 60, 150, 30);
		playerText2 = new JTextField();
		playerText2.setBounds(460, 110, 150, 30);
		this.add(playerText1);
		this.add(playerText2);
		this.setLayout(null);
		this.setVisible(true);

		JButton startButton = new JButton("START");
		startButton.setBounds(400, 200, 100, 100);
		this.add(startButton);
		startButton.setVisible(true);
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String firstPlayer = playerText1.getText();
				String secondPlayer = playerText2.getText();
				try {
					new TicTacToeGui(firstPlayer, secondPlayer);
				} catch (CellAlreadyMarkException e) {
					e.printStackTrace();
				}
			}
		});

	}

	public void displayPlayerInfo(String firstplayer, String secondPlayer) {

		JLabel player1, player2, result, playerLabel1, playerLabel2;// ,
																	// resultLabel;
		player1 = new JLabel("PLAYER 1: ");
		player1.setBounds(800, 50, 100, 30);
		player2 = new JLabel("PLAYER 2: ");
		player2.setBounds(800, 100, 100, 30);
		result = new JLabel("RESULT : ");
		result.setBounds(800, 150, 100, 30);

		playerLabel1 = new JLabel(firstplayer);
		playerLabel1.setBounds(860, 50, 150, 30);
		this.add(playerLabel1);
		playerLabel1.setVisible(true);

		playerLabel2 = new JLabel(secondPlayer);
		playerLabel2.setBounds(860, 100, 150, 30);
		this.add(playerLabel1);
		this.add(playerLabel2);
		playerLabel2.setVisible(true);

		this.add(player1);
		this.add(player2);
		this.add(result);
		this.setLayout(null);
		this.setVisible(true);

	}

	public void displayResultLabel(String playerTurn) {
		System.out.println("hi");
		resultLabel = new JLabel(playerTurn);
		resultLabel.setBounds(870, 150, 150, 30);
		this.add(resultLabel);
		resultLabel.setVisible(true);
	}

	public void displayButtons(ButtonActionHandler buttonActionHandler) {

		int x_position = 100, y_position = 100;
		for (int count = 0; count <= 8; count++) {
			String value = Integer.toString(count);
			button[count] = (JButton) new JButton(value);
			button[count].setBounds(x_position, y_position, 150, 150);
			add(button[count]);

			if (count == 3 || count == 6) {
				y_position += 200;
				x_position = 100;
				button[count].setBounds(x_position, y_position, 150, 150);
				add(button[count]);
			}
			button[count].addActionListener(buttonActionHandler);
			x_position += 200;
		}
	}

}
