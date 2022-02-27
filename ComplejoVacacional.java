/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author hca
 */
public class ComplejoVacacional {
    private int numAlbs;
    private int totAlbs; // para llevar la cuenta en la alta de albercas
    private Rectangulo[] albercas;
    private String nom;
    
    public ComplejoVacacional(){
        totAlbs = 0;
        numAlbs = 9;
    }
    
    public ComplejoVacacional(String nombre){
        this();
        albercas = new Rectangulo[numAlbs];
    }
    
    public boolean altaAlberca(double alto, double ancho){
        boolean resp = false;
       if(totAlbs< numAlbs){
           Rectangulo nuevaAlb = new Rectangulo(alto, ancho);
           albercas[totAlbs] = nuevaAlb;
           resp = true;
           totAlbs++;
       }
       
       return resp;
       
    }
    
    public String getNombre(){
        return nom;
    }
    
    public double areaAlbercas(){
        double suma = 0;
        for(int i = 0; i<totAlbs; i++)
            suma+= albercas[i].calcularArea();
        return suma;
    }
    
    public String cercarAlbercas(){ 
        StringBuilder bobthebuilder = new StringBuilder();
        for(int i =0; i<totAlbs; i++){
           bobthebuilder.append("\nLa alberca numero:  ").append(i+1).append(
           "  necesita: ").append(albercas[i].calcularPerimetro()).append("  metros de cerca");
        }
        
        return bobthebuilder.toString();
    }
    
    public String toString(){
        StringBuilder bobthebuilder = new StringBuilder();
        bobthebuilder.append("\nEl complejo vacacional llamado").append(nom).append(
        "--tiene las siguientes albercas con las medidas: ").append("\n");
        for(int i =0; i<totAlbs;i++)
            bobthebuilder.append(albercas[i].toString()).append("\n");
        return bobthebuilder.toString();
    }
}
