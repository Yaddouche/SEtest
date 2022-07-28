package Oberordner.Logik;


import Oberordner.Datenbank.RaumDatenbank;
import Oberordner.Logik.Objekte.Benutzer;
import Oberordner.Logik.Objekte.Raum;
import Oberordner.UI.IRaumBuchung;
import Oberordner.UI.LoginFenster;

import javax.swing.*;
import static Oberordner.Datenbank.BenutzerDatenbank.alleBenutzer;
import static Oberordner.Datenbank.BenutzerDatenbank.speicherBenutzer;


public class RaumBuchung implements IRaumBuchung {

    /** Raum buchen */
    public static void bucheRaum(Raum raum) {

        if (raum.getVerfuegbarkeit()) {
            RaumDatenbank.speicherBelegtenRaum(raum);
            raum.setVerfuegbarkeit(false);
            Benutzer.fuegeBuchungHinzu(raum);
           System.out.println("Sie haben den Raum: " + raum.getName() + " erfolgreich gebucht.");
        }

        else if (!raum.getVerfuegbarkeit()) {
            System.out.println("Der Raum " + raum.getName() + " ist leider bereits belegt.");
        }
    }


    /** Buchung stornieren */
    public static void storniereBuchung(Raum raum) {

    }

    /** Benutzer erstellen */
    public static void registriereBenutzer() {

        // Eingabefelder:
        JTextField[] feld = {new JTextField(), new JTextField()};
        Object[] msg = {"Name:", feld[0], "Passwort:", feld[1]};
        // Dialogfenster:
        int click = JOptionPane.showConfirmDialog(null, msg, "Registrierung", 2);


        speicherBenutzer(feld[0].getText(),feld[1].getText());
    // }
        JOptionPane.showMessageDialog(null, "Ihr Benutzer: " + feld[0].getText() + " wurde erfolreich erstellt.");

    }

    /** Passwort abgleich */
    public static boolean pruefePasswort(String name, String passwort) {
        boolean ergebnis = false;
        for(int i = 0; i < alleBenutzer.size();i++) {
            if (alleBenutzer.contains(name) && alleBenutzer.contains(passwort)) {
                ergebnis = true;
            }
            else {ergebnis = false;}
        }
        return ergebnis;
    }

    /** Einloggen */
    public static void loginBenutzer() {
        // Eingabefelder:
        JTextField[] feld = {new JTextField(), new JTextField()};
        Object[] msg = {"Name:", feld[0], "Passwort:", feld[1]};
        // Dialogfenster:
        int option = JOptionPane.showConfirmDialog(null, msg, "Login", 2);

        // Passwort abgleich
        if (pruefePasswort(feld[0].getText(), feld[1].getText())) {
            JOptionPane.showMessageDialog(null, "Herzlich Willkommen: " + feld[0].getText() + "\nSie haben sich erfolgreich eingeloggt!");
        } else {
            JOptionPane.showMessageDialog(null, "Der Name oder das Passwort ist falsch!");
        }
    }

    /** Hier beginnt die Raumbuchung */
    public static void starteProgramm() {
        LoginFenster loginFenster = new LoginFenster();
    }

    }



