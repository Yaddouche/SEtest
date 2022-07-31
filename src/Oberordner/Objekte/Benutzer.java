package Oberordner.Objekte;

import java.util.ArrayList;



import Oberordner.UI.IBenutzer;



//@Author Sami Yaddouche
public class Benutzer implements IBenutzer {
    private String name;
    private String passwort;
    private int benutzerID;

    private static ArrayList<Raum> meineBuchungen = new ArrayList<>();

    //Konstruktor
    public Benutzer(String name, String passwort) {
        this.name = name;
        this.passwort = passwort;
        this.benutzerID = (int) (Math.random() * 100);
    }



    @Override
    public void zeigeMeineBuchungen() {
        for (Raum buchungen : meineBuchungen) {
            System.out.println(buchungen);
        }
    }


    public void fuegeBuchungHinzu(Raum raum) {
        meineBuchungen.add(raum);
    }




    public String getName() {return name;}

    public String getPasswort() {return passwort;}

    public int getBenutzerID() {return benutzerID;}


    public void setName(String name) {
        this.name = name;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }


    public String toString() {
        return "Name: " + getName() + "\nPasswort: " + getPasswort();
    }




public static void main(String[] args) {


    Benutzer sami = new Benutzer("sami","abc");


}
}

