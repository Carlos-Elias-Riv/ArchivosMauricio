/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;


import java.util.Scanner;
public class PruebaComplejoVacacional {
    
    public static void main(String[] args){
        
        System.out.println("Dame el nombre del complejo vacacional: ");
        Scanner lee = new Scanner(System.in);
        
        String nombre;
        
        nombre = lee.nextLine();
        
        ComplejoVacacional loquesea = new ComplejoVacacional(nombre);
        
        for(int i =1; i<=10; i++){
            double alto, ancho;
            
            System.out.println("\nDame las medidas de la alberca" + i);
            System.out.println("\nSu alto: ");
            
            alto = lee.nextDouble();
            System.out.println("\nSu alto: ");
            ancho = lee.nextDouble();
            
            loquesea.altaAlberca(alto, ancho);
            
            
        }
        
        System.out.println(loquesea.toString());
        
        System.out.println("\nEl area total de las albercas es: ");
        
        System.out.println(loquesea.areaAlbercas());
        
        System.out.println(loquesea.cercarAlbercas());
            
       
    }
    
}
