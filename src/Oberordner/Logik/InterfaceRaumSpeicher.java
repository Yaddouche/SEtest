package Oberordner.Logik;

//@ Author Sami Yaddouche, Lena Hartmann
public interface InterfaceRaumSpeicher {

    public void speicherVerfuegbarenRaum(Raum raum);
    public void speicherBelegtenRaum(Raum raum);
    public String ladeVerfuegbareRaeume();
    public String ladeBelegteRaeume();

}