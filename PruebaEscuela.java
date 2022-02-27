/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author cerivera
 */
public class PruebaEscuela {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        
        
        
        System.out.println("\nIngresa el nombre de la escuela: ");
        String nom,direc; 
        nom = lee.nextLine();
        System.out.println("\nIngresa la direccion de la escuela: ");
        direc = lee.nextLine();
        Escuela loquesea = new Escuela(nom, direc);
        System.out.println("\nIngresa el nombre del estudiante: ");
        String nombre; 
        nombre = lee.nextLine();
        loquesea.altaAlumno(nombre);
        for(int i = 0; i<3; i++){
            nombre = lee.nextLine();
            loquesea.altaAlumno(nombre);
        }
        
        for(int j = 1; j<4; j++){        
            for(int i =0; i<10; i++){
            loquesea.altaCalificacion(100+j, i);
            }
        }
        
        System.out.println(loquesea.nombreyPromedioTodos()); 
        System.out.println(loquesea.alumnoMasAprobado());
        
       
    }
    
}
