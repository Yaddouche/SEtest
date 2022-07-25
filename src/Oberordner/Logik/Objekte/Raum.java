package Oberordner.Logik.Objekte;

import Oberordner.UI.IRaum;

//@Author Katharina Brinz

public class Raum implements IRaum {
    private String name;
    private int raumID;
    private boolean verfuegbarkeit;

    public Raum(String name, int raumID, boolean verfuegbarkeit){
        this.name = name;
        this.raumID = raumID;
        this.verfuegbarkeit = true;
    }


    public void setVerfuegbarkeit(boolean status) {
        this.verfuegbarkeit = status;
    }

    public boolean getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    public int getRaumID() {
        return raumID;
    }

    public void setRaumID(int raumID) {
        this.raumID = raumID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }


}