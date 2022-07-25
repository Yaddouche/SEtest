package Oberordner.UI;


import javax.swing.*;

import static Oberordner.Datenbank.BenutzerDatenbank.alleBenutzer;
import static Oberordner.Logik.Objekte.Benutzer.erstelleNeuenBenutzer;

public class Display {



    public static void registriereBenutzer() {


        // Eingabefelder:
        JTextField[] feld = {new JTextField(), new JTextField()};
        Object[] msg = {"Name:", feld[0], "Passwort:", feld[1]};
        // Dialogfenster:
        int click = JOptionPane.showConfirmDialog(null, msg, "Registrierung", 2);

        //ToDo: ArrayListe darf kein Element mit gleichen Namen aufnehmen
        if (!alleBenutzer.contains(feld[0].getText())) {

            erstelleNeuenBenutzer(feld[0].getText(), feld[1].getText());

        } else if (alleBenutzer.contains(feld[0].getText())) {

            JOptionPane.showMessageDialog(null,"Ihr Benutzer: " + feld[0].getText() + " ist bereits vergeben.");
        }


        JOptionPane.showMessageDialog(null,"Ihr Benutzer: " + feld[0].getText() + " wurde erfolreich erstellt.");



}
