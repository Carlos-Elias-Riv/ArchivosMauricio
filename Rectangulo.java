/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author hca
 */
public class Rectangulo extends Cuadrilatero{

    public Rectangulo(){
        super();
    }
    
    public Rectangulo(double l1, double l2){
        super(l1, l2);
    }
    

    
    /*public boolean equals(Object obj){
        boolean resp = false;
        
        if(obj!= null){
            Rectangulo otro = (Rectangulo) obj;
            resp = otro.lado1 == lado1 && otro.lado2 == lado2;
        }
        return resp;
    }*/

    public String tipoFigura(){
        return "Rectangulo";
    }
    

}
