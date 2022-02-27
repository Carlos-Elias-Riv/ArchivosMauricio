package EstructurasDeDatos;

public class Pilas_G1 {

    public static void main(String[] args){
        PilaA<String> colores = new PilaA();
        PilaA<Integer> edades = new PilaA();
        PilaA<Double> precios = new PilaA();
        PilaA pila = new PilaA();


        // CP1: intenta quitar un elemento de una pila vacia
        try {

            System.out.println("\nElemento quitado: " + colores.pop());

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        colores.push("blanco");
        colores.push("verde");
        colores.push("azul");
        colores.push("amarillo");
        colores.push("negro");

        System.out.println("\nPila de colores: \n" + colores);

        // probar el pop

        try {
            System.out.println("\nElemento quitado: " + colores.pop());

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("\nPila de colores: \n" + colores);

        pila.push("jueves");
        pila.push(4.5);
        pila.push(18);
        pila.push(true);
        System.out.println("\nPila mezcla: \n" + pila);


    }
}
