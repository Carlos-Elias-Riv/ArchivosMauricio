/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author cerivera
 */
public class Administrativo extends Empleado {
    private String departamento;
    private String telefono;
    
    public Administrativo(){
        super();
    }
    
    public Administrativo(int clave){
        super(clave);
    }
    
    public Administrativo(String nombre, double sueldo, String dept, String telefono){
        super(nombre, sueldo);
        departamento = dept;
        this.telefono = telefono;
    }
    
    
    public void setDept(String dept){
        departamento = dept;
    }
    
    public String toString(){
        return super.toString() + "-- es un administrativo que trabaja " +
                "en el departamento: " + departamento +"-- con el telefono: " +
                telefono;
    }

    @Override
    public double calculaSalario(double prestac, double deduc) {
        return getSueldoBase()*(1+prestac +deduc) ; // puedo usar sueldoBase porque esta protected en la clase super
    }



        
    
}
