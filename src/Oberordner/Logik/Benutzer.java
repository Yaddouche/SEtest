package Oberordner.Logik;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Oberordner.Datenbank.RaumDatenbank;
import Oberordner.UI.InterfaceBenutzer;

//@Author Sami Yaddouche
public class Benutzer implements InterfaceBenutzer {
    private String name;
    private ArrayList<Raum> meineBuchungen = new ArrayList<>();

    //Konstruktor
    public Benutzer(String name) {
        this.name = name;
    }

    // Datenbank
    protected RaumDatenbank raumDatenbank = new RaumDatenbank();

    // (1)Benutzer bucht einen Raum (2) Verfügbarkeit des Raum geprüft (3) geändert wenn verfügbar (4) zur Datenbank hinzugefügt (5)zu meineBuchungen hinzugefügt
    @Override
    public String bucheRaum(Raum raum) {
        String ausgabe = "";

        if (raum.getVerfuegbarkeit() != false) {

            Object[] obj={"Ja","Nein"};
            ImageIcon icon = new ImageIcon("jaNein");
            Object antwort = JOptionPane.showInputDialog(null, "Wollen Sie den Raum '" + raum +  "' buchen?", "Eingabefenster",
                    JOptionPane.INFORMATION_MESSAGE, icon, obj,"");
            if (antwort.equals("Ja")) {
                ausgabe = "Sie haben den Raum '" + raum + "' erfolgreich gebucht";
                raum.setVerfuegbarkeit(false);
                raumDatenbank.speicherBelegtenRaum(raum);
                raumDatenbank.entferneVerfuegbarenRaum(raum);
                meineBuchungen.add(raum);
            } else if (antwort.equals("Nein")) {
                ausgabe = "Der Raum '" + raum +  "' wurde nicht gebucht";
            }


        } else if (raum.getVerfuegbarkeit() == false) {
            ausgabe = "Der Raum '" + raum + "' ist nicht verfügbar.";
        }
        return ausgabe;
    }


    // (1)Benutzer storniert Raum (2)Verfügbarkeit wird geändert (3)Raum von meineBuchungen gelöscht
    @Override
    public String storniereRaum(Raum raum) {
        String ausgabe = "";
        if (raum.getVerfuegbarkeit() == false) {
            raum.setVerfuegbarkeit(true);
            meineBuchungen.remove(raum);
            raumDatenbank.speicherVerfuegbarenRaum(raum);
            raumDatenbank.entferneBelegtenRaum(raum);
            ausgabe = "Sie haben die Buchung des Raumes " + raum + " erfolgreich storniert.";
        } else if (raum.getVerfuegbarkeit()) {
            ausgabe = "Der von ihnen angegebene Raum " + raum + " ist nicht gebucht\nHaben Sie den richtigen Raum eingegeben ?";
        }

        return ausgabe;
    }

    //TODO: Wie zeigt man Objekte mit Namen an anstatt Raum@5bf6742 ?  Bsp: Raum Audimax, Raum 103 etc.?
    @Override
    public String zeigeMeineBuchungen() {
        return "Meine Buchungen: " + meineBuchungen;
    }

    @Override
    public String zeigeVerfuegbareRaeume() {
        String ausgabe = "";
        ausgabe = "Verf�gbaren Raeume: " + raumDatenbank.ladeVerfuegbareRaeume();
        return ausgabe;
    }

    public ArrayList<Raum> getMeineBuchungen() {
        return meineBuchungen;
    }

    public String getName() {
        return name;
    }
}

