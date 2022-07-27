package Oberordner.Logik;

import Oberordner.Datenbank.RaumDatenbank;
import Oberordner.Logik.Objekte.Benutzer;
import Oberordner.Logik.Objekte.Raum;
import Oberordner.UI.IRaumBuchung;


import javax.swing.*;

import static Oberordner.Datenbank.BenutzerDatenbank.*;


public class RaumBuchung implements IRaumBuchung {

    public static String bucheRaum(Raum raum) {
        String ausgabe = "";

        if (raum.getVerfuegbarkeit()) {
            RaumDatenbank.speicherBelegtenRaum(raum);
            raum.setVerfuegbarkeit(false);
            Benutzer.fuegeBuchungHinzu(raum);
            ausgabe = "Sie haben den Raum: " + raum.getName() + " erfolgreich gebucht.";
        }

        else if (!raum.getVerfuegbarkeit()) {
            ausgabe = "Der Raum " + raum.getName() + " ist leider bereits belegt.";
        }
        return ausgabe;
    }

    public static String storniereBuchung(Raum raum) {
        return "";
    }

    /** Benutzer erstellen */
    public static void registriereBenutzer() {

        // Eingabefelder:
        JTextField[] feld = {new JTextField(), new JTextField()};
        Object[] msg = {"Name:", feld[0], "Passwort:", feld[1]};
        // Dialogfenster:
        int click = JOptionPane.showConfirmDialog(null, msg, "Registrierung", 2);


        //ToDo: Benutzer wird gespeichert aber wieso ist bei der zweiten Registrierung der Eintrag in der Arraylist weg??
        // -> in der Main Methode Element der Arraylist nicht sichtbar, Wieso??
        // for (int i = 0; i < alleBenutzer.size();i++) {
        // if (alleBenutzer.contains())
        erstelleBenutzer(feld[0].getText(),feld[1].getText());
        ladeBenutzer();
    // }
        JOptionPane.showMessageDialog(null, "Ihr Benutzer: " + feld[0].getText() + " wurde erfolreich erstellt.");

    }

    /** Passwort vergleich */
    public static boolean pruefePasswort(String name, String passwort) {
        boolean ergebnis = false;

        return ergebnis;
    }

    /** Einloggen */
    public static void loginBenutzer() {
        // Eingabefelder:
        JTextField[] feld = {new JTextField(), new JTextField()};
        Object[] msg = {"Name:", feld[0], "Passwort:", feld[1]};
        // Dialogfenster:
        int option = JOptionPane.showConfirmDialog(null, msg, "Login", 2);

        // Passwort vergleich
        if (pruefePasswort(feld[0].getText(), feld[1].getText())) {
            JOptionPane.showMessageDialog(null, "Herzlich Willkommen: " + feld[0].getText() + "\nSie haben sich erfolgreich eingeloggt!");
        } else {
            JOptionPane.showMessageDialog(null, "Der Name oder das Passwort ist falsch!");
        }
    }


    }



