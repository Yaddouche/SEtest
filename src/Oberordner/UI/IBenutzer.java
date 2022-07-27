package Oberordner.UI;

import Oberordner.Logik.Objekte.Raum;

//@ Author Sami Yaddouche

public interface IBenutzer {

   String bucheRaum(Raum raum);
   String storniereRaum(Raum raum);
   String zeigeMeineBuchungen();
   String zeigeVerfuegbareRaeume();
   String toString();

}