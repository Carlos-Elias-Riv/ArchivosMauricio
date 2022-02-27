package poo;

public class Triangulo implements FigGeometrica{
    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo() {

    }

    public Triangulo(double l1, double l2, double l3) {
        lado1= l1;
        lado2 = l2;
        lado3 = l3;
    }

    public boolean isEquilatero(){

        return lado1==lado2 && lado2==lado3;
    }



    @Override
    public double calcularArea() {
        double area;

        double s;
        s = (lado1+lado2+lado3)/2;

        area = Math.sqrt((s*(s-lado1)*(s-lado2)*(s-lado3)));

        return area;
    }

    @Override
    public String tipoFigura() {
        return getClass().getSimpleName();
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
