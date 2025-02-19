/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cedula;

import java.util.Arrays;

/**
 *
 * @author María José Osorio
 */
public class Cedula {
    private int[] cedula;
    private final int TAMANIO = 100;
    
    public Cedula(){
     this.cedula = new int[TAMANIO];
    }
    
    public void ordenarElementos(){
     Arrays.sort(this.cedula);
    }
    
    public int buscarCedula(int numero){
     int posicion = Arrays.binarySearch(this.cedula, numero);
     return (posicion >= 0) ? posicion: -1;
    }
    
    public int cantidadCedulas(int numero){
     int cantidad = 0;
      for(int cedula: cedula){
       if(cedula > numero){
         cantidad++;
       }
      }
     return cantidad;
    }
    
    public int[] getCedula() {
        return cedula;
    }
}
