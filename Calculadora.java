package EstructurasDeDatos;

import java.util.ArrayList;

public class Calculadora {

    private static String infijaAPostfija(String entrada) {
        int i =0;
        StringBuilder bobthebuilder = new StringBuilder();


        return bobthebuilder.toString();


    }

    private static boolean revisaSintaxis(String entrada) {
        boolean res = false;
        ArrayList<Character> opsEspeciales = new ArrayList<>();
        opsEspeciales.add('*');
        opsEspeciales.add('+');
        opsEspeciales.add('-');
        opsEspeciales.add('/');

        int i =1;
        int total =0;
        int tamanio = entrada.length();
        boolean resp = entrada.length() <= 50;
        char first = entrada.charAt(0);
        char last = entrada.charAt(entrada.length()-1);

        if (first == '+' || first == '*' || first == '/' || opsEspeciales.contains(last))
            resp = false;

        while (i < tamanio - 1 && resp) {


        }





        return res;
    }


    public static String convierteAPostfija(String entrada) {
        StringBuilder bobthebuilder = new StringBuilder();

        for (int i = 0; i < entrada.length(); i++) {

        }

        return bobthebuilder.toString();

    }

    // este metodo va a determinar si el primer dato es menor o igual al dato recibido
    private static boolean determinaJerarquia(char peek, char dato) {
        boolean resp = false;


        return resp;
    }
}
