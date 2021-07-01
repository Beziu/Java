package de.kartenkartenkarten.gui;

import java.awt.Color;

import javax.swing.*;

import de.kartenkartenkarten.*;

/**
 * Karty rejestru, rozszezamy o klase JTabbedFrame, 
 * ktory jest komponentem i kontenerem golwnego okna 
 * ktore tez jest kontenerem
 * 
 * Kontener bedzie mial Layout co znacz ze bedie twardo 
 * ustawiony w programie i jego komponenty beda zoorganizowane
 * 		- xxxPane: wszystkie 'Pane' maja sztywne Layout tak jak w JavaFX
 * 		- JPanel/JFrame/JDialog... moze Layout byc ustawiony za pomoca setLayout
 * 
 * @author grzeg
 *
 */
public class Register extends JTabbedPane {
	
	private Gitter rot = new Gitter();
	private Regio gelb = new Regio();
	private Fluss blue = new Fluss();
	
	public Register() {
		//super ? doc
		//testPaneFunkion();
		zusammenStellen();
	}
	

	private void zusammenStellen() {
		rot.setBackground(Color.RED);
		gelb.setBackground(Color.YELLOW);
		blue.setBackground(Color.BLUE);
		
		add(rot, "Keyboard");
		add(gelb, "Directions");
		add(blue, "Text");
	}
	
	
	/**
	 * Pokazuje ulozenie komponentow JTabbedPane 
	 * Tylko do testow, pozniej zakomentujemy
	 */
	private void testPaneFunkion() {
		this.add(new JButton("Klik Mich"), " A-K ");
		this.add(new JLabel("Ten tekst jest nie ladny"), "Tekst do okladki");
		this.add(new JTextArea(), "To jest wieksze pole tekstowe");
		this.add(new JLabel("Gramy"), "Tutaj znajdziemy jakis tekst");
	}
	
	
	public Gitter getRot() {
		return rot;
	}
	
	public Regio getGelb() {
		return gelb;
	}
	
	public Fluss getBlue() {
		return blue;
	}

}
