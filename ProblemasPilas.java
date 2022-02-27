package EstructurasDeDatos;

import java.util.Scanner;

public class ProblemasPilas {


    private static int contarElementosPila(PilaA pila) {
       PilaA copia = new PilaA();

        int count = 0;
        while (!pila.isEmpty()) {
            copia.push(pila.pop());
            count++;
        }

        while (!copia.isEmpty()) {
            pila.push(copia.pop());
        }
        return count;
    }

    private static void invertirPila(PilaA pila) {
        PilaA ayuda = new PilaA();
        PilaA ayuda1 = new PilaA();

        while (!pila.isEmpty()) {
            ayuda.push(pila.pop());
        }

        while (!ayuda.isEmpty()) {
            ayuda1.push(ayuda.pop());
        }
        while (!ayuda1.isEmpty()){
            pila.push(ayuda1.pop());
        }

    }

    

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        PilaA <String> pila = new PilaA<String>();
        for (int i = 0; i < 3; i++) {
            pila.push(lee.nextLine());
        }
        System.out.println(contarElementosPila(pila));
        System.out.println(pila.toString());
        invertirPila(pila);
        System.out.println(pila.toString());

    }
}
