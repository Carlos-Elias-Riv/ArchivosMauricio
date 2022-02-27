package EstructurasDeDatos;

public class InvierteCadena {

    private String nom;

    public InvierteCadena(String nom){
        this.nom = nom;
    }


    public String invertirCadena(){
        StringBuilder bobthebuilder = new StringBuilder();
        PilaA<Character> pila = new PilaA<Character>();
        for(int i =0; i<nom.length(); i++)
            pila.push(nom.charAt(i));

        while(!pila.isEmpty())
            bobthebuilder.append(pila.pop());

        return bobthebuilder.toString();
    }
}
