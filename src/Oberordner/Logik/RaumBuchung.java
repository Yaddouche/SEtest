package Oberordner.Logik;

import Oberordner.Datenbank.RaumDatenbank;
import Oberordner.Objekte.Raum;
import Oberordner.UI.IRaumBuchung;

import javax.swing.*;

public class RaumBuchung implements IRaumBuchung {

    public static String bucheRaum(Raum raum){
        String ausgabe = "";

        if (raum.getVerfuegbarkeit()) {

            Object[] obj={"Ja","Nein"};
            ImageIcon icon = new ImageIcon("jaNein");
            Object antwort = JOptionPane.showInputDialog(null, "Wollen Sie den Raum '" + raum +  "' buchen?", "Eingabefenster",
                    JOptionPane.INFORMATION_MESSAGE, icon, obj,"");
            if (antwort.equals("Ja")) {
            //ToDo: Benutzer muss seinen Namen eingeben um die Buchung mit ihm in Verbindung zu setzen; oder wenn er vorher eingeloggt ist ohne <- entscheiden wie das geschehen soll
                RaumDatenbank.speicherBelegtenRaum(raum);
                RaumDatenbank.entferneVerfuegbarenRaum(raum);
                //meineBuchungen.add(raum);
                raum.setVerfuegbarkeit(false);
                ausgabe = "Sie haben den Raum '" + raum + "' erfolgreich gebucht";
            } else if (antwort.equals("Nein")) {
                ausgabe = "Der Raum '" + raum +  "' wurde nicht gebucht";
            }


        } else if (!raum.getVerfuegbarkeit()) {
            ausgabe = "Der Raum '" + raum + "' ist nicht verfügbar.";
        }
        return ausgabe;
}

    public static String storniereBuchung(Raum raum) {
        return null;
    }
}
