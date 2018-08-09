package com.techlab.dropdown;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class DropdownFrame {
	JFrame frame;

	public DropdownFrame() {
		frame = new JFrame("ComboBox Example");
		String color[] = { "Red", "Blue" };
		JComboBox comboBox = new JComboBox(color);
		comboBox.setBounds(150, 150, 90, 20);
		frame.add(comboBox);
		frame.setLayout(null);
		frame.setSize(400, 500);
		frame.setVisible(true);

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBox) {
					JComboBox comboBox1 = (JComboBox) e.getSource();
					String color = (String) comboBox1.getSelectedItem();
					switch (color) {
					case "Red":
						frame.getContentPane().setBackground(Color.red);
						break;
					case "Blue":
						frame.getContentPane().setBackground(Color.BLUE);
						break;

					}
				}

			}
		});
	}
}
