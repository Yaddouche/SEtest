package Oberordner;

import Oberordner.Logik.Benutzer;
import Oberordner.Logik.Raum;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Raum testRaum = new Raum("Audimax", 1, true);
        Raum testRaum2 = new Raum("Audimatze", 2, true);
        Benutzer testNutzer = new Benutzer("Olaf");


        System.out.println(testRaum.getVerfuegbarkeit());
        System.out.println(testNutzer.bucheRaum(testRaum));
        testNutzer.bucheRaum(testRaum2);
        System.out.println(testRaum.getVerfuegbarkeit());
      //  System.out.println(testNutzer.storniereRaum(testRaum));
        //System.out.println(testRaum.getVerfuegbarkeit());

        System.out.println(testNutzer.zeigeMeineBuchungen());
        System.out.println(testRaum2.getName());

    }
}
