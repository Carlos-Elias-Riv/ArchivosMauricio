package poo;

public class AplicacionObjetosVoladores {

    private ObjVolador[] voladors; // puedo declarar un arreglo de este tipo
    private int tE;
    public AplicacionObjetosVoladores(){
        voladors = new ObjVolador[5];
        tE = 0;
    }

    public boolean altaObjetoVolador(String nom, String habit){ // este es para pajaros
        boolean resp = false;
        if(tE < 5){
            Pajaro nuevo = new Pajaro(nom, habit);
            voladors[tE] = nuevo;
            resp = true;
            tE+=1;
        }

        return resp;
    }

    public boolean altaObjetoVolador(String nom, int capacidad) {
        boolean resp = false;

        if (tE<5) {
            Avion nuevo = new Avion(nom, capacidad);
            voladors[tE] = nuevo;
            resp = true;
            tE += 1;
        }

        return resp;
    }

    public String buscaPajaro(int clave){
        String resp = "No tengo ese pajaro";
        Pajaro busca = new Pajaro(clave);

        int i =0;
        while(i< tE && voladors[i].equals(busca))
            i++;

        if(i< tE)
            resp = voladors[i].toString();

        return resp;

    }

    public String buscaAvion(int clave){
        String resp = "No tengo ese avion";
        Avion busca = new Avion(clave);
        int i =0;

        while(i < tE && voladors[i].equals(busca))
            i++;

        if(i<tE)
            resp = voladors[i].toString();

        return resp;
    }

    public boolean actualizarHabitat(int clave, String habitat){

        Pajaro otro = new Pajaro(clave);

        int i =0;

        while(i<tE && voladors[i].equals(otro))
            i++;

        if(i<tE)
            ((Pajaro)voladors[i]).setHabitat(habitat);


        return i<tE;
    }




}
