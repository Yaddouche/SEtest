package Oberordner.UI;

//@Author Katharina Brinz
public interface IRaum {

     String getName();
     void setName(String name);
     int getRaumID();
     void setRaumID(int raumID);
     boolean getVerfuegbarkeit();
     void setVerfuegbarkeit(boolean status);

}