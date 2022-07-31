package Oberordner.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Oberordner.Logik.RaumBuchung.*;

/**
 * Diese Klasse erstellt die Eröffnungsfenster
 */


public class BuchungsFenster implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Willkommen!!!");
    JButton buchen = new JButton("Buchen");
    JButton stornieren = new JButton("Stornieren");

    /**
     * Konstruktor der Klasse bzw wie die Fenster aussehen sollen
     */
    public BuchungsFenster() {

        label.setBounds(100, 100, 200, 40);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(buchen);

        /** Login Knopf */
        stornieren.setBounds(100, 300, 200, 40);
        stornieren.setFocusable(true);
        stornieren.addActionListener(this);

        /** Registrierungs-Knopf */
        buchen.setBounds(100, 250, 200, 40);
        buchen.setFocusable(true);
        buchen.addActionListener(this);

        frame.add(stornieren);
        frame.add(buchen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    /**
     * Diese Methode lässt etwas geschehen, wenn man auf die Knöpfe drückt
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buchen) {
            frame.dispose();
            bucheRaum();
        }
        if (e.getSource() == stornieren) {
            frame.dispose();
            storniereBuchung();
        }

    }
}