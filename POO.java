/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author hca
 */
public class POO {
     public static <T extends Comparable <T>> int busquedaBinaria(T[] arre, int tot, T dato){
        int izq, der, cen;
    
        izq =0;
        der = tot-1;
        cen = der/2;
        
        while(izq <= der && !arre[cen].equals(dato)){
            if(arre[cen].compareTo(dato)>0)
                der = cen;
            else
                izq = cen+1;
            cen = (izq+der)/2;
        }
        
        if(izq > der) // fracaso
            cen = (izq+1)*-1;
        
        return cen;
    } 
    
    public static <T> void recorreIzquierda(T[] arre, int tot, int pos){
        
        for(int i = pos; i < tot-1; i++)
            arre[i] = arre[i+1];
        
    }
    
    public static <T extends Comparable <T>> int eliminacionOrdenada(T[] arre, int tot, T dato){
        int pos; 
        pos = busquedaBinaria(arre, tot, dato);
        
        if(pos>=0){
            recorreIzquierda(arre, tot, pos);
            tot -=1;
        }
        return tot; 
    }
    
    public static <T extends Comparable<T>> void ordenarSeleccionDirecta(T[] arre, int tot){
        for(int i =0; i< tot-1; i++){
            T menor = arre[i];
            
            int pos = i;
            
            for(int j= i+1; j<tot; j++)
                if(arre[j].compareTo(menor) > 0){
                    menor = arre[j];
                    pos = j;
                }
            arre[pos] = arre[i];
            arre[i] = menor;
            
        }
    }
}
