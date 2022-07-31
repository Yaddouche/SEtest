package Oberordner.Logik;


import Oberordner.Datenbank.RaumDatenbank;
import Oberordner.Logik.Objekte.Benutzer;
import Oberordner.Logik.Objekte.Raum;
import Oberordner.UI.BuchungsFenster;
import Oberordner.UI.IRaumBuchung;
import Oberordner.UI.LoginFenster;

import javax.swing.*;

// import static Oberordner.Datenbank.BenutzerDatenbank.benutzerDatenbank;        <-- lässt sich nicht importieren ? Warum ?

import static Oberordner.Datenbank.RaumDatenbank.*;
import static Oberordner.Logik.IBenutzerDatenbank.speicherBenutzer;


public class RaumBuchung implements IRaumBuchung {
    RaumDatenbank raumDatenbank = new RaumDatenbank();

    /**
     * Raum buchen
     */
    public static void bucheRaum() {
        System.out.println(ladeAlleRaeume());
        System.out.println("Welchen Raum möchten Sie buchen ?");

        Object[] obj = {"Audimax", "MU13", "Bibliothek"};
        ImageIcon icon = new ImageIcon("Räume");
        Object antwort = JOptionPane.showInputDialog(null, "Welchen Raum möchten Sie buchen ?", "Eingabefenster",
                JOptionPane.INFORMATION_MESSAGE, icon, obj, "");
        if (antwort.equals("Audimax")) {
            if (Raum.getVerfuegbarkeit(audimax)) {
                audimax.setVerfuegbarkeit(false);
                RaumDatenbank.speicherBelegtenRaum(audimax);
                RaumDatenbank.entferneVerfuegbarenRaum(audimax);
                JOptionPane.showMessageDialog(null, "Sie haben den Raum: 'Audimax' erfolgreich gebucht");
            } else if (!Raum.getVerfuegbarkeit(audimax)) {
                JOptionPane.showMessageDialog(null, "Der Raum: 'Audimax' ist leider nicht verfügbar.");
            }

        }
        if (antwort.equals("MU13")) {
            if (Raum.getVerfuegbarkeit(mu13)) {
                mu13.setVerfuegbarkeit(false);
                RaumDatenbank.speicherBelegtenRaum(mu13);
                RaumDatenbank.entferneVerfuegbarenRaum(mu13);
                JOptionPane.showMessageDialog(null, "Sie haben den Raum: 'MU13' erfolgreich gebucht");
            } else if (!Raum.getVerfuegbarkeit(mu13)) {
                JOptionPane.showMessageDialog(null, "Der Raum: 'MU13' ist leider nicht verfügbar.");
            }

        }
        if (antwort.equals("Bibliothek")) {
            if (Raum.getVerfuegbarkeit(bibliothek)) {
                bibliothek.setVerfuegbarkeit(false);
                RaumDatenbank.speicherBelegtenRaum(bibliothek);
                RaumDatenbank.entferneVerfuegbarenRaum(bibliothek);
                JOptionPane.showMessageDialog(null, "Sie haben den Raum: 'Bibliothek' erfolgreich gebucht");
            } else if (!Raum.getVerfuegbarkeit(bibliothek)) {
                JOptionPane.showMessageDialog(null, "Der Raum: 'Bibliothek' ist leider nicht verfügbar.");
            }
        }
    }

    /**
     * Buchung stornieren
     */
    public static void storniereBuchung() {
        System.out.println(ladeAlleRaeume());
        System.out.println("Welchen Raum möchten Sie stornieren ?");

        Object[] obj = {"Audimax", "MU13", "Bibliothek"};
        ImageIcon icon = new ImageIcon("Räume");
        Object antwort = JOptionPane.showInputDialog(null, "Welchen Raum möchten Sie stornieren ?", "Eingabefenster",
                JOptionPane.INFORMATION_MESSAGE, icon, obj, "");
        if (antwort.equals("Audimax")) {
            if (!Raum.getVerfuegbarkeit(audimax)) {
                audimax.setVerfuegbarkeit(true);
                RaumDatenbank.speicherVerfuegbarenRaum(audimax);
                RaumDatenbank.entferneBelegtenRaum(audimax);
                JOptionPane.showMessageDialog(null, "Sie haben den Raum: 'Audimax' erfolgreich storniert");
            } else if (Raum.getVerfuegbarkeit(audimax)) {
                JOptionPane.showMessageDialog(null, "Die Stornierung ist fehlgeschlagen. \nDer Raum war nicht von ihnen gebucht");
            }

        }
        if (antwort.equals("MU13")) {
            if (!Raum.getVerfuegbarkeit(mu13)) {
                mu13.setVerfuegbarkeit(true);
                RaumDatenbank.speicherVerfuegbarenRaum(mu13);
                RaumDatenbank.entferneBelegtenRaum(mu13);
                JOptionPane.showMessageDialog(null, "Sie haben den Raum: 'MU13' erfolgreich storniert");
            } else if (Raum.getVerfuegbarkeit(mu13)) {
                JOptionPane.showMessageDialog(null, "Die Stornierung ist fehlgeschlagen. \nDer Raum war nicht von ihnen gebucht");
            }
        }
        if (antwort.equals("Bibliothek")) {
            if (!Raum.getVerfuegbarkeit(bibliothek)) {
                bibliothek.setVerfuegbarkeit(true);
                RaumDatenbank.speicherVerfuegbarenRaum(bibliothek);
                RaumDatenbank.entferneBelegtenRaum(bibliothek);
                JOptionPane.showMessageDialog(null, "Sie haben den Raum: 'Bibliothek' erfolgreich storniert");
            } else if (Raum.getVerfuegbarkeit(bibliothek)) {
                JOptionPane.showMessageDialog(null, "Die Stornierung ist fehlgeschlagen. \nDer Raum war nicht von ihnen gebucht");
            }
        }


    }

    /**
     * Benutzer erstellen
     */
    public static void registriereBenutzer() {

        // Eingabefelder:
        JTextField[] feld = {new JTextField(), new JTextField()};
        Object[] msg = {"Name:", feld[0], "Passwort:", feld[1]};
        // Dialogfenster:
        int click = JOptionPane.showConfirmDialog(null, msg, "Registrierung", 2);


        speicherBenutzer(feld[0].getText(), feld[1].getText());

        JOptionPane.showMessageDialog(null, "Ihr Benutzer: " + feld[0].getText() + " wurde erfolreich erstellt.");
        //loginBenutzer();

        buchungOderStornierung();
    }

    /**
     * Passwort abgleich
     */
    public static boolean pruefePasswort(String name, String passwort) {
        boolean ergebnis = false;
        Benutzer sami = new Benutzer("sami", "passwort");
        if (name == sami.getName() && passwort == sami.getPasswort()) {
            ergebnis = true;
        }

        return ergebnis;
    }

    /**
     * Funktioniert leider noch nicht und wird daher ausgelassen
     */

    // Einloggen
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


    /**
     * Hier beginnt das Programm
     */
    public static void starteProgramm() {
        LoginFenster loginFenster = new LoginFenster();
    }

    public static void buchungOderStornierung() {
        BuchungsFenster buchungsFenster = new BuchungsFenster();
    }
}


