/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author cerivera
 */
public class Escuela {
    
    private String nombre; 
    private String direc;
    private Alumno[] alumnos;
    private final int NUMALUMNOS = 50;
    private int totalums;
    
    
    public Escuela(){
        alumnos = new Alumno[NUMALUMNOS];
        totalums = 0;
    }
    
    public Escuela(String nom, String direccion){
        this();
        nombre = nom; 
        direc = direccion;
    }
    
    public String buscarAlumno(int clave){
        Alumno buscado = new Alumno(clave);
        String resp;
        int i =0;
        
        while(i < totalums && !buscado.equals(alumnos[i]))
            i++;
        
        if(i >=0)
            resp = alumnos[i].toString();
        
        else
            resp = "No se encontro el alumno con la clave ingresada";
        
        return resp;
        
    }
    
    public boolean altaAlumno(String nombre){
        boolean resp = false;
        
        if(totalums < NUMALUMNOS){
            Alumno nuevo = new Alumno(nombre);
            alumnos[totalums] = nuevo;
            totalums+= 1;
            resp = true;
        }
        
        return resp;
    }
    
    public boolean altaCalificacion(int claveunica, double cali){
        boolean resp = false;
        
        Alumno buscado = new Alumno(claveunica);
        
        int i =0;
        
        while(i < totalums && !buscado.equals(alumnos[i]))
            i++;
        
        int pos = i;
        
        if(pos >= 0)
            resp = alumnos[pos].altaCalificacion(cali);
            
        
        return resp;
        
    }
    
    public String nombreyPromedioTodos(){
        StringBuilder bobthebuilder = new StringBuilder();
        bobthebuilder.append("\nLos datos de los alumnos son los siguientes: \n");
        for(int i =0; i< totalums; i++)
            bobthebuilder.append(alumnos[i].nombreYPromedio()).append("\n");
        
        return bobthebuilder.toString();
    }
    
    public String alumnoMasAprobado(){
        String resp = "no tengo alumnos";
        if(totalums > 0){
            int i =0;
            int primero = alumnos[i].getTotalCalifs();
            int pos=0;
            for(i =1; i< totalums; i++)
                if(alumnos[i].getTotalCalifs() > primero){
                    primero = alumnos[i].getTotalCalifs();
                    pos = i;
                }
                
            resp = alumnos[pos].getNombre();
        }
        
        return resp;
        
    }
    
    public String generaReporte(){
        StringBuilder bobthebuilder = new StringBuilder();
        bobthebuilder.append("\nLa escuela con nombre: ").append(nombre);
        bobthebuilder.append("--- tiene a los siguientes alumnos: ");
        
        for(int i = 0; i<totalums; i++)
            bobthebuilder.append("\n").append(alumnos[i].toString());
        
        return bobthebuilder.toString();
    }
    
    
    
}
