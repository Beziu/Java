package de.kartenkartenkarten.gui;

import java.awt.BorderLayout;

import javax.swing.*;
import de.kartenkartenkarten.*;



/**
 *  JFrame: Mit Menü
 *  Container (Swing/Awt): über add-Methodebn können Komponenten zugewiesen werden
 *  Komponenten können als Parameter der add-Methoden in einen Container gelegt werden
 *  Top-Level-Container(zb JFrame) : können 1 Menüleiste enthalten
 *  
 *  Menü-Klassen: JMenuBar, JMenu, JMenuItem
 *  	JMenuItem: löst ActionEvent aus
 *  	myJMenuItem.addActionListener(...)
 *  	myJFrame.addWindowListener(...)
 *  
 *  Übung: Bitte Dokumentationskommentar ergänzen
 * @author Alfa
 *
 */
@SuppressWarnings("serial")
public class Hauptfenster extends JFrame {

	private JMenuBar leiste = new JMenuBar();
	
	private JMenu datei = new JMenu("Datei");
	private JMenu layout = new JMenu("Layout");
	private JMenu spielwiese = new JMenu("Spielwiese");
	
	//JMenu Datei:
	private JMenuItem speichern = new JMenuItem("Speichern");
	private JMenuItem allesSpeichern = new JMenuItem("Alles Speichern");
	private JMenuItem beenden = new JMenuItem("Beenden"); //Übung
	
	//JMenu Layout:
	private JMenuItem grid = new JMenuItem("Grid");
	private JMenuItem border = new JMenuItem("Border");
	private JMenuItem flow = new JMenuItem("Flow");
	private JMenuItem mix = new JMenuItem("Kombi");
	
	private Register hauptbereich = new Register();
	
	
	public Hauptfenster() {
		setTitle("Karten Karten Karten");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		bauenMenu();
		bauenHauptbereich();
		
		// Buttons
		beendenClickded();
		gridClicked();
		borderClicked();
		flowClicked();
	}
	
	
	private void flowClicked() {
		flow.addActionListener(value -> hauptbereich.setSelectedComponent(hauptbereich.getBlue()));
	}


	private void borderClicked() {
		//border.addActionListener(value -> hauptbereich.setSelectedIndex(1));
		border.addActionListener(value -> hauptbereich.setSelectedComponent(hauptbereich.getGelb()));
	}


	private void gridClicked() {
		//grid.addActionListener(value -> hauptbereich.setSelectedIndex(0));
		grid.addActionListener(value -> hauptbereich.setSelectedComponent(hauptbereich.getRot()));
	}

	
	private void beendenClickded() {
		beenden.addActionListener(value -> System.exit(1));
	}
	


	/**
	 * bez setLayout , dlatego BorderLayout nie ma drugiego parametru 
	 */
	private void bauenHauptbereich() {
		this.add(hauptbereich);
//		this.add(hauptbereich, BorderLayout.CENTER);
//		this.add(hauptbereich, BorderLayout.SOUTH);
//		this.add(hauptbereich, BorderLayout.WEST);
	}

	/**
	 * Reihenfolge der add-Methoden-Aufrufe gibt die Reihenfolge der Einträge an
	 */
	private void bauenMenu() {
		datei.add(speichern);
		datei.add(allesSpeichern);
		datei.add(beenden);
		
		erstellenLayoutMenu(grid, border,flow,mix);
		
		leiste.add(datei);
		leiste.add(layout);
		leiste.add(spielwiese);
		
		//spielwieseFuellen();
		
		setJMenuBar(leiste);
	}
	
	private void erstellenLayoutMenu(JMenuItem...items ){
		for(int i =0; i< items.length; i++) {
			layout.add(items[i]);
		}
	}
}

/*
* Menue beenden: Klick beendet das Programm
* Menue Spielwiese füllen, JMenu zufügen? Trennlinien zufügen? 
* Layout-Menue: Nutzen um Registerkarten anzuzeigen: JavaDoc
* 2 Methoden nutzen
* Weitere Tabbs: Komponententests...
*/


/*
* JAVADOC! (ohne How To Use...)
* Rahmen(Border) für jede Komponent im FLuss erstellen: Tipp: suchen
* nach: Border! Farbe oder Dicke oder Schriftart(?) der Border ändern KREATIV!
* 
* Hintergrundsfarbe Labels ändern (Optional) Schriftfarbe ändern
* 
* ToolTipText erstellen
* 
* Weitere JTextArea in die Fluss-Klasse "einbauen" die Scrollbalken hat
* 
* Mit einer Regular Expression die NumberFormatException verhindern
*/


