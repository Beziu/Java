package de.kartenkartenkarten.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

/**
 * Ustawiamy komponenty w komponentach JPanel
 * JPanel: 	jest komponentem i Kontenerem, 
 * 			moze byc ustawiony za pomoca setLayout w LayoutManagen, 
 * 			moze zawierac kod HTML <div>  </div>
 * 
 * Tutaj bedzie demo Grid-Layout
 * Uklada i pozadkuje komponenty 
 * 
 * @author grzeg
 *
 */
public class Gitter extends JPanel {
	private JButton[] knoepfe = new JButton[9];
	private JButton pumuckl = new JButton("Zawsze robie zle");
	
	/**
	 * Ustawíc na sztywno Leyaut JPanel
	 * Uzyc pomocnej funkcji dla komponentow JButton.
	 */
	public Gitter() {
		this.setLayout(new GridLayout(4, 3, 5, 5));
		bauen();
		unsinnMachen();
	}

	private void unsinnMachen() {
		add(pumuckl);
		remove(pumuckl);
		add(pumuckl);
		add(pumuckl);
		//W JavaFX jest blad tej samej referencji komponentu
		//remove(4);
		add(new JLabel(""), 9);
		add(pumuckl, 10);
		pumuckl.addActionListener(e -> System.out.println("Jakis zwykly tekst w konsoli"));
	}

	private void bauen() {
		for(int i = 0; i < knoepfe.length; i++) {
			knoepfe[i] = new JButton("- " + (i + 1) + " -");
			add(knoepfe[i]);
			knoepfe[i].setBackground(Color.CYAN);
			//knoepfe[i].setFont(Font.ITALIC::);
		}
	}

}
