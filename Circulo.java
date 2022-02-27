package poo;

public class Circulo implements FigGeometrica{

    private double radio;
    private final double PI = Math.PI;

    public Circulo(){

        radio = 0;
    }

    public Circulo(double r) {
        radio = r;
    }

    @Override
    public double calcularArea() {
        return Math.pow(radio, 2)*PI;
    }

    @Override
    public double calcularPerimetro() {
        return PI*2*radio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public String tipoFigura() {
        return getClass().getSimpleName();
    }

    public int compareTo(Circulo otro){
        int resp;
        if(this.radio > otro.radio)
            resp = 1;
        else
            if(this.radio == otro.radio)
                resp = 0;
            else
                resp = -1;

       return resp;
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", PI=" + PI +
                '}';
    }
}
