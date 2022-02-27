package poo;

public abstract class Cuadrilatero implements FigGeometrica {
    private double lado1;
    private double lado2;

    public Cuadrilatero(){
    }

    public Cuadrilatero(double l1, double l2){
        lado1 = l1;
        lado2 = l2;
    }

    public double calcularArea(){
        return lado1*lado2;
    }

    public  double calcularPerimetro(){
        return 2 * (lado1 + lado2);
    }

    public String toString(){
        return "\nEl siguiente cuadrilatero tiene las siguientes medidas: " + lado1 + "---" + lado2;
    }


}
