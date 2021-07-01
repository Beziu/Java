package de.kartenkartenkarten.gui;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class Regio extends JPanel {
	
	private JButton oben = new JButton("Norden");
	private JButton unten = new JButton("Süden");
	private JButton links = new JButton("Westen");
	private JButton rechts = new JButton("Osten");
	private JButton mitte = new JButton("Zentrum");
	
	private JButton pumuckl = new JButton("Ja tez tu jestem");
	
	public Regio() {
		setLayout(new BorderLayout(5 ,5));
		zusammenSetzen();
		
		unsinnMachen();
	}

	
	private void unsinnMachen() {
		//add(pumuckl, BorderLayout.EAST);
		add(new Gitter());
	}


	/**
	 * Funkcja 'add' przychodzi z parametrem 
	 */
	private void zusammenSetzen() {
		add(links, BorderLayout.WEST);
		add(oben, BorderLayout.NORTH);
		add(rechts, BorderLayout.EAST);
		add(unten, BorderLayout.SOUTH);
		add(mitte);
		// lub
		//add(mitte, BorderLayout.CENTER);
	}

}
