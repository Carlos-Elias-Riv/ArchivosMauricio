package poo;

public class Avion implements ObjVolador{
    private static int serie = 100;
    private int clave;
    private int capacidad;
    private String nombre;


    public Avion(){
        serie += 1;
        clave = serie;
    }

    public Avion(int clave){
        this.clave = clave;
    }

    public Avion(String nom, int capacidad){
        this();
        nombre = nom;
        this.capacidad = capacidad;
    }

    public int getCapacidad(){
        return capacidad;
    }



    @Override
    public void despega() {
        System.out.println("\nEl avion ha despegado");
    }

    @Override
    public void aterriza() {
        System.out.println("\nEl avion ha aterrizado");
    }

    @Override
    public void seDesplaza() {
        System.out.println("\nEl avion se ha desplazado");
    }


    @Override
    public boolean equals(Object o) {
        boolean resp = false;

        if(o instanceof Pajaro && o != null){
            Avion otro = (Avion) o;
            resp = otro.clave == clave;
        }

        return resp;
    }


}
