package poo;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;

public class AplicacionFiguraGeometrica {
    FigGeometrica [] arre;
    int tE;

    public AplicacionFiguraGeometrica(){
        arre = new FigGeometrica[5];
        tE = 0;
    }

    public boolean altaFigura(double medida, boolean isCuadrado){


        if(tE < 5) {
            if(isCuadrado) {
                Cuadrado nuevo = new Cuadrado(medida);
                arre[tE] = nuevo;
            }
            else {
                Circulo nuevo = new Circulo(medida);
                arre[tE] = nuevo;
            }
            tE+=1;

        }

        return tE < 5;
    }




    public boolean altaFigura(double l1, double l2){
        boolean resp = false;
        if(tE < 5){
            Rectangulo nuevo = new Rectangulo(l1, l2);
            arre[tE] = nuevo;
            tE += 1;
        }

        return resp;
    }

    public boolean altaFigura(double l1, double l2, double l3){
        if(tE < 5){
            Triangulo nuevo = new Triangulo(l1, l2, l3);
            arre[tE] = nuevo;
            tE += 1;
        }

        return tE < 5;
    }

    public String areaTodasFiguras(){
        StringBuilder bobthebuilder = new StringBuilder();
        bobthebuilder.append("\nEl area de las figuras es el siguiente: ");
        for(int i =0; i<tE; i++)
            bobthebuilder.append("\n").append(arre[i].tipoFigura()).append("\t").append(arre[i].calcularArea());



        return bobthebuilder.toString();
    }

    public String circuloMasGrande(){
        String resp= "No tengo circulos";
        Circulo mayor = new Circulo();
        for(int i =0; i< tE; i++)
            if(arre[i] instanceof Circulo && mayor.compareTo((Circulo)arre[i]) > 0)
                mayor = (Circulo) arre[i];

        if(mayor.getRadio() > 0)
            resp = mayor.toString();

        return resp;
    }

    public int totalCuadrados(){
        int count = 0;

        for(int i =0; i<tE; i++)
            if(arre[i] instanceof Cuadrado)
                count+=1;

        return count;
    }

    public boolean eliminarEquilateros(){
        boolean resp = false;
        int j;
        int i =0;
        while(i<tE) {
            if (arre[i] instanceof Triangulo && ((Triangulo) arre[i]).isEquilatero()) {
                arre[i] = arre[tE - 1];
                tE-=1;
                resp = true;
            }
            else
                i+=1;


        }


        return resp;
    }





}
