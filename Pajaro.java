package poo;

public class Pajaro implements ObjVolador{

    private static int serie = 100;
    private int clave;
    private String nombre;
    private String habitat;

    public Pajaro(){
        serie+= 1;
        clave = serie;
    }

    public Pajaro(int clave){
        this.clave = clave;
    }


    public Pajaro(String nom, String habitat){
        this();
        nombre = nom;
        this.habitat = habitat;
    }

    public String toString(){
        return "\nEl nombre del pajaro es: " + nombre + "-- y su clave es: " + clave;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void despega() {
        System.out.println("\nEl pajaro está volando");

    }

    @Override
    public void aterriza() {
        System.out.println("\nEl pajaro ha aterrizado");
    }

    @Override
    public void seDesplaza() {
        System.out.println("\nEl pajaro se esta desplazando");
    }

    public boolean equals(Object obj){
        boolean resp = false;

        if(obj instanceof Pajaro && obj != null){
            Pajaro otro = (Pajaro) obj;
            resp = this.clave == otro.clave;
        }

        return resp;
    }
}
