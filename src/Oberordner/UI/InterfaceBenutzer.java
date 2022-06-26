package Oberordner.UI;

import Oberordner.Logik.Raum;

import java.util.ArrayList;

public interface InterfaceBenutzer {

   String bucheRaum(Raum raum);
   String storniereRaum(Raum raum);
   String zeigeMeineBuchungen();
   String zeigeVerfuegbareRaeume();

}
