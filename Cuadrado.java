package poo;

public class Cuadrado extends Cuadrilatero {

    public Cuadrado(){
        super();
    }

    public Cuadrado(double l1){
        super(l1, l1);
    }

    @Override
    public String tipoFigura() {
        return "Cuadrado";
    }
}
