package EstructurasDeDatos;


import java.util.ArrayList;

public class InfijaAPostfija {

    public static String conversor(String entrada) {
        StringBuilder bob = new StringBuilder();
        ArrayList<Character> nums = new ArrayList<Character>();
        ArrayList<Character> ops = new ArrayList<Character>();
        ops.add('+');
        ops.add('-');
        ops.add('/');
        ops.add('*');
        PilaA<Character> pila = new PilaA<Character>();
        for (int i = 0; i < 10; i++) {
            nums.add(Character.forDigit(i, 10));
        }

        for (int i = 0; i < entrada.length(); i++) {
            if (nums.contains(entrada.charAt(i)) || entrada.charAt(i) == '.') {
                bob.append(entrada.charAt(i));

            }

            else if (entrada.charAt(i) == '(')
                pila.push(entrada.charAt(i));

            else if (entrada.charAt(i) == ')') {
                while (!pila.isEmpty() && !pila.peek().equals('('))
                    bob.append(pila.pop());

                if (pila.peek().equals('('))
                    pila.pop();

            }

            else if (ops.contains(entrada.charAt(i))) {

                while (!pila.isEmpty() && jerarquia(pila.peek(), entrada.charAt(i)))
                    bob.append(pila.pop());

                pila.push(entrada.charAt(i));
                bob.append(',');

            }



        }

        while (!pila.isEmpty())
            bob.append(pila.pop());



        return bob.toString();
    }

    private static boolean jerarquia(char peek, char op) {
        int a, b;
        if (peek == '+' || peek == '-' || peek == '(')
            if(peek == '(')
                a= 0;
            else
                a = 1;
        else
            a = 2;
        if (op == '+' || op == '-')
            b = 1;
        else
            b = 2;

        return a >= b; // esto es lo que me indica que lo de hasta arriba de la pila sea mayor o igual al caracter en el que estoy
    }



    public static double evaluaExpresion(String limpio) {
        double resp = 0;
        ArrayList<Character> ops = new ArrayList<Character>();
        ops.add('+');
        ops.add('-');
        ops.add('/');
        ops.add('*');
        String numero = "";
        boolean pasePorOperador = false;
        double peek;
        char operador;
        PilaA<Double> resultado = new PilaA<Double>();
        for (int i = 0; i < limpio.length(); i++) {
            if (limpio.charAt(i) != ',' && !ops.contains(limpio.charAt(i))) {
                numero += limpio.charAt(i);
                pasePorOperador = false;
            }
            else if (ops.contains(limpio.charAt(i))) {
                peek = resultado.peek();
                resultado.pop(); // nunca voy a hacer un pop de una pila vacía porque antes de un operador siempre tengo numero
                operador = limpio.charAt(i);
                if (!numero.equals(""))
                    resultado.push(opera(operador, peek, Double.parseDouble(numero)));
                else
                    resultado.push(opera(operador, resultado.peek(), peek));
                pasePorOperador = true;
                numero = "";
            }

            if (!pasePorOperador && limpio.charAt(i) == ',')
                if (numero.equals("")) {
                    resultado.push(0.0);
                    numero = "";
                    pasePorOperador = false;
                }
                else if (!numero.equals(".")) {
                    resultado.push(Double.parseDouble(numero));
                    numero = "";
                }


        }


        return resultado.peek();
    }

    private static double opera(char operador, double first, double second) {
        double resp=0;
        if(operador == '/' && second== 0) // falta ver la solucion a que esto no pase
            second = second;
        switch (operador) {
            case '+': resp = first+second; break;
            case '*': resp = first*second; break;
            case '/': resp = first/second; break;
            case '-': resp = first-second; break;
        }

        return resp;
    }
}
