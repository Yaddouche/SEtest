package Oberordner.Datenbank;

import Oberordner.Objekte.Raum;
import org.junit.Test;

import static Oberordner.Datenbank.RaumDatenbank.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaumDatenbankTest {

    @Test
    public void testLadeAlleRaeume1() {
        assertEquals(null,ladeAlleRaeume());

    }

    @Test
    public void testLadeAlleRaeume2() {
        assertEquals(alleRaeume,ladeAlleRaeume());

    }
    /*
    public void testZeigeAlleRaeume() {
        assertEquals("audimax",zeigeAlleRaeume());
    }
*/

}
