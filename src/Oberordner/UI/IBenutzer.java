package Oberordner.UI;

import Oberordner.Logik.Objekte.Raum;

//@ Author Sami Yaddouche

public interface IBenutzer {


   void bucheRaum();
   void storniereRaum(Raum raum);
   void zeigeMeineBuchungen();
   String toString();

}