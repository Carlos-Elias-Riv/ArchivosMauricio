package EstructurasDeDatos;

import java.util.Scanner;

public class PruebaParentesis {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        String valor = lee.nextLine();

        RevisorParentesis rp = new RevisorParentesis(valor);

        System.out.println(rp.analizarParentesis());

    }
}
