package EstructurasDeDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebasDeCalculadora {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        String valor= InfijaAPostfija.conversor(lee.nextLine());
        System.out.println(valor);
        System.out.println(InfijaAPostfija.evaluaExpresion(valor));
        ArrayList <Character> nums = new ArrayList<Character>();

    }
}
