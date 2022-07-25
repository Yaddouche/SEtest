package Oberordner.UI;

import Oberordner.Logik.Objekte.Raum;

//@ Author Sami Yaddouche

public interface IBenutzer {

   String bucheRaum(Raum raum);
   String storniereRaum(Raum raum);
   String zeigeMeineBuchungen();
   String zeigeVerfuegbareRaeume();

   static void erstelleNeuenBenutzer(String objektname,String name, String passwort) {

   }

}