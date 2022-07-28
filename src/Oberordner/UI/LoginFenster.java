package Oberordner.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Oberordner.Logik.RaumBuchung.loginBenutzer;
import static Oberordner.Logik.RaumBuchung.registriereBenutzer;

/** Diese Klasse erstellt die Eröffnungs Fenster */


public class LoginFenster implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Willkommen!!!");
    JButton login = new JButton("Login");
    JButton registriere = new JButton("Registrieren");

    /** Konstruktor der Klasse bzw wie die Fenster aussehen sollen*/
    public LoginFenster() {

        label.setBounds(100,100,200,40);
        label.setFont(new Font(null,Font.PLAIN,25));
        frame.add(label);

        /** Login Knopf */
        login.setBounds(100,300,200,40);
        login.setFocusable(true);
        login.addActionListener(this);

        /** Registrierungs Knopf */
        registriere.setBounds(100,250,200,40);
        registriere.setFocusable(true);
        registriere.addActionListener(this);

        frame.add(registriere);
        frame.add(login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


    }
/** Diese Methode lässt etwas geschehen, wenn man auf die Knöpfe drückt*/
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==registriere) {
            frame.dispose();
            registriereBenutzer();
        }
        if (e.getSource()==login) {
            frame.dispose();
            loginBenutzer();
        }

    }
}
