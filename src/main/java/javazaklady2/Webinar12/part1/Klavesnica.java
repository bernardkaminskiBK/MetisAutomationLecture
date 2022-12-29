package javazaklady2.Webinar12.part1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Klavesnica extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField textovePole;
	private JPanel panelTlacitok;

	/**
	 * vytvara novy objekt klavesnica
	 */
	public Klavesnica() {

		vytvorTextovePole();
		vytvorPanelTlacitok();
		vytvorTlacitkoBodka();
		vytvorTlacitkoCE();

		setLayout(new BorderLayout());

		add(textovePole, BorderLayout.NORTH);
		add(panelTlacitok);

	}

	/**
	 * vytvara textove pole
	 */
	public void vytvorTextovePole() {
		textovePole = new JTextField(12);
	}

	/**
	 * vytvara tlacitko CE s listenerom
	 */
	private void vytvorTlacitkoCE() {
		JButton tlacitkoCE = new JButton("CE");

		tlacitkoCE.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textovePole.setText("");

			}
		});
		panelTlacitok.add(tlacitkoCE);

	}

	/**
	 * vytvara tlacitko bodka s listenerom
	 */
	private void vytvorTlacitkoBodka() {

		JButton tlacitko = new JButton(".");

		tlacitko.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!textovePole.getText().contains(".") && !textovePole.getText().isEmpty())
					textovePole.setText(textovePole.getText() + tlacitko.getText());
			}
		});
		panelTlacitok.add(tlacitko);
	}

	/**
	 * vytvara panel numerickych tlacitok
	 */
	private void vytvorPanelTlacitok() {

		panelTlacitok = new JPanel(new GridLayout(4, 3));

		pridajNumerickeTlacitko("1");
		pridajNumerickeTlacitko("2");
		pridajNumerickeTlacitko("3");
		pridajNumerickeTlacitko("4");
		pridajNumerickeTlacitko("5");
		pridajNumerickeTlacitko("6");
		pridajNumerickeTlacitko("7");
		pridajNumerickeTlacitko("8");
		pridajNumerickeTlacitko("9");
		pridajNumerickeTlacitko("0");

	}

	/**
	 * vytvara numericke tlacitka s listenerom
	 * 
	 * @param popis popis tlacitka
	 */
	public void pridajNumerickeTlacitko(String popis) {

		JButton tlacitko = new JButton(popis);

		tlacitko.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textovePole.setText(textovePole.getText() + tlacitko.getText());
			}
		});

		panelTlacitok.add(tlacitko);
	}

	/**
	 * vracia vytvorene textove pole
	 * 
	 * @return textove pole
	 */
	public JTextField getTextovePole() {
		return textovePole;
	}

	/**
	 * nastavuje obsah textoveho pola
	 * 
	 * @param string obsah textoveho pola
	 */
	public void setTextovePole(String string) {
		textovePole.setText(string);
	}
}
