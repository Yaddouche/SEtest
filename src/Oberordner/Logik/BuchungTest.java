/*package test.logik;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Test;

import Oberordner.Objekte.Benutzer;
import Oberordner.Objekte.Raum;

//@Author Lena Hartmann
public class BuchungTest {

    @Test
    public void testBuchung() {
        Raum testRaum = new Raum("Audimax", 1, true);
        Benutzer testNutzer = new Benutzer("Olaf");

        assertEquals(true, testRaum.getVerfuegbarkeit());
        assertEquals(0, testNutzer.getMeineBuchungen().size());
        String ergebnis = testNutzer.bucheRaum(testRaum);
        assertEquals(false, testRaum.getVerfuegbarkeit());
        assertEquals("Sie haben den Raum Audimax erfolgreich gebucht.", ergebnis);
        assertEquals(1, testNutzer.getMeineBuchungen().size());
    }

    @Test
    public void testStornieren() {
        Raum testRaum = new Raum("Audimax", 1, true);
        Benutzer testNutzer = new Benutzer("Olaf");
        testNutzer.bucheRaum(testRaum);
        String ergebnis = testNutzer.storniereRaum(testRaum);
        assertEquals("Sie haben die Buchung des Raumes " + testRaum.getName() + " erfolgreich storniert.", ergebnis);
        assertEquals(0, testNutzer.getMeineBuchungen().size());
        assertEquals(true, testRaum.getVerfuegbarkeit());
    }

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
} */