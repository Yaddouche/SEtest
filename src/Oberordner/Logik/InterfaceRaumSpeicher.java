package Oberordner.Logik;


public interface InterfaceRaumSpeicher {

    public void speicherVerfuegbarenRaum(Raum raum);
    public void speicherBelegtenRaum(Raum raum);
    public void ladeVerfuegbareRaeume();
    public void ladeBelegteRaeume();

}
