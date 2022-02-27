package EstructurasDeDatos;

import java.util.Scanner;

public class PruebaInvierteCadena {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        String valor = lee.nextLine();

       InvierteCadena rp = new InvierteCadena(valor);

        System.out.println(rp.invertirCadena());

    }
}
