package de.kartenkartenkarten.gui;

import java.awt.FlowLayout;

import javax.swing.*;

/**
 * Demo flowLayout
 * @author grzeg
 *
 */
public class Fluss extends JPanel {
	
	private JButton okBtn = new JButton("OK");
	private JLabel infoLbl = new JLabel("Dzisiaj jest Czwartek");
	private JTextField inputFld = new JTextField(15);					//15: ilosc wierszy
	private JPasswordField pswFld = new JPasswordField(15);
	private JTextArea textArea = new JTextArea(5, 15);
	private JFormattedTextField formattedText = new JFormattedTextField(15);
	
	public Fluss() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		bauen();
		interaktive();
		
		//readingInput();
		//writingInput();
	}

	
	private void interaktive() {
		inputFld.addActionListener(value -> readingInput());
		pswFld.addActionListener(val -> readPsw());
	}
	
	@Deprecated
	private void readPsw() {
		//String psw = pswFld.getText();
		//textArea.setText(psw);
		char[] psw = pswFld.getPassword();
		//textArea.setText(psw);
	}

	
	private void readingInput() {
		String readedText = inputFld.getText();
		textArea.setText(textArea.getText() + "\n" + readedText);
		
		int newNumber = Integer.parseInt(readedText);
		newNumber++;
		Integer newNumberObjekt = Integer.valueOf(newNumber);
//		inputFld.setText(newNumber + "");
		String  newNumberString = newNumberObjekt.toString();
		inputFld.setText(newNumberString);
		
		Double piNumberObjekt = 3.1415;
		double piNumber = piNumberObjekt;
		
		Boolean valueObjekt = true;
		boolean value = valueObjekt;
		
	}


	private void bauen() {
		
		add(okBtn);
		add(infoLbl);
		add(inputFld);
		add(pswFld);
		add(textArea);
		add(formattedText);
	}

}
