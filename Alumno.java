/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author cerivera
 */
public class Alumno {
    private static int serie = 100;
    private int claveUnica;
    private String nombreAlum;
    private double[] califMateriasAprob;
    private int totalCalif;
    private final int MAX_CALIF = 50;
    
    public Alumno(){
        serie = serie +1;
        claveUnica = serie;
        totalCalif = 0;
        califMateriasAprob = new double[MAX_CALIF];
    }
    
    public Alumno(String nombre){
        this();
        nombreAlum = nombre;
    }
    
    
    public Alumno(int clave){
        claveUnica = clave;
    }
    
    public boolean altaCalificacion(double cali){
        boolean resp = false;
        
        if(cali > 6 && cali < 10)
            if(totalCalif < MAX_CALIF){
                califMateriasAprob[totalCalif] = cali;
                resp = true;
                totalCalif+=1;
            }
        return resp;
    }
    
    public String getNombre(){
        return nombreAlum;
    }
    
    public boolean equals(Object obj){
        boolean resp = false;
        if(obj!= null){
            Alumno otro = (Alumno) obj;
            resp = otro.claveUnica == claveUnica;
        }
        return resp;
    }
    
    public int getTotalCalifs(){
        return totalCalif;
    }
    
    public String toString(){
        StringBuilder bobthebuilder = new StringBuilder();
        bobthebuilder.append("\nEl alumno con nombre: ").append(nombreAlum).append(
        "-- tiene las siguientes calificaciones: ");
        for(int i =0; i< totalCalif; i++){
            bobthebuilder.append("\n").append(califMateriasAprob[i]);
        }
        return bobthebuilder.toString();
    }
    
    public double calculaPromedio(){
        double suma=0;
        double promedio=0;
        if(totalCalif > 0){
            for(int i =0; i< totalCalif; i++)
                suma+= califMateriasAprob[i];
            promedio = suma/totalCalif;
        }
        return promedio;
        
    }
    
    public String nombreYPromedio(){
        return "\nEl alumno tiene el nombre: " + nombreAlum + "-- y tiene "
                + "el siguiente promedio: " + calculaPromedio();
    }
    
    
    
    
    
    
}
