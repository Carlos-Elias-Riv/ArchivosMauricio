/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author cerivera
 */
public class Operario extends Empleado{
    private int horasExtras;
    
    public Operario(){
        super();
    }
    
    public Operario(int clave){
        super(clave);
    }
    
    public Operario(String nombre, double sueldo, int horas){
        super(nombre, sueldo);
        horasExtras = horas;
    }
    
  
    
    public String toString(){
        return super.toString() + "-- es un operario que ha trabajado: " + horasExtras + 
                "-- horas extras";
    }

    @Override
    public double calculaSalario(double prestac, double deduc) {
        return getSueldoBase()*(1+prestac - deduc) ;
    }


    public double calculaSalario(double prestac, double deduc, double precioHE){
        return calculaSalario(prestac, deduc) + precioHE*horasExtras;
    }
    
}
