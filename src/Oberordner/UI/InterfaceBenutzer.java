package Oberordner.UI;

import Oberordner.Objekte.Raum;

//@ Author Sami Yaddouche

public interface InterfaceBenutzer {

   String bucheRaum(Raum raum);
   String storniereRaum(Raum raum);
   String zeigeMeineBuchungen();
   String zeigeVerfuegbareRaeume();

}