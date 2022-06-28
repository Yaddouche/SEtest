/*package test.logik;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Test;

import Oberordner.Logik.Benutzer;
import Oberordner.Logik.Raum;

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
} */