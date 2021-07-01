package de.kartenkartenkarten.gui;

import java.awt.CardLayout;

import javax.swing.*;

/**
 * Demo kombinacja kilku Layout
 * @author grzeg
 *
 */
public class MixMitMessung {
	
	/**
	 * Zawieta 5 JSlider
	 */
	private JPanel anzeige = new JPanel();
	
	
	/**
	 * Zawiera komponenty nawigacyjne
	 */
	private JPanel navigation = new JPanel();
	
	private JSlider[] regler = new JSlider[5];
	
	private JButton vor;
	private JButton zurueck;
	private JButton asnfang;
	private JButton ende;
	
	/**
	 * Menedzer wsadowy
	 * batch manager
	 */
	private CardLayout stapelvarwalter = new CardLayout();
	
	
	
}
