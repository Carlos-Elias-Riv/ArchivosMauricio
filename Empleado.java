/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author cerivera
 */
public abstract class Empleado {

    private static int serie = 100;
    private int claveEmpleado;
    private String nombreEmpleado;
    protected double sueldoBase;

    protected Empleado() {
        serie += 1;
        claveEmpleado = serie;
    }

    public Empleado(int clave) {
        claveEmpleado = clave;
    }

    protected Empleado(String nombre, double sueldo) {
        sueldoBase = sueldo;
        nombreEmpleado = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void ajustaSueldo(double percent) {
        sueldoBase = sueldoBase * (1 + percent);
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String nombreYSueldo(){
        return nombreEmpleado + "--" + sueldoBase;
    }

    public String toString() {
        return "\nEl empleado de nombre: " + "-- " + nombreEmpleado
                + "--tiene el sueldo: " + sueldoBase;
    }

    public boolean equals(Object obj) {
        boolean resp = false;
        if (obj instanceof Empleado && obj != null) {
            Empleado otro = (Empleado) obj;
            resp = claveEmpleado == otro.claveEmpleado;
        }


        return resp;
    }

    public abstract double calculaSalario(double prestac, double deduc);
}
