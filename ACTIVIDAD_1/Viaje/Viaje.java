/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viaje;

/**
 *
 * @author María José Osorio
 */
public class Viaje {
   private Gasto[]gastos;
   private double comida;
   private double hospedaje;
   private double transporte;
   private double ropa;
   private int cantidadComida;
   
   public Viaje(){
    this.gastos = new Gasto[18];
   }
   
   public Viaje(Gasto[] gastos){
    this.gastos = gastos;
   }
   
   public void calcularGastos(){
     comida = 0;
     hospedaje = 0; 
     transporte = 0;
     ropa = 0;
     cantidadComida = 0;
     
      for(int i=0; i<gastos.length; i++){
        Tipo tipo = gastos[i].getTipo();
        
        if(tipo == tipo.COMIDA){
            cantidadComida++;
            comida += gastos[i].getMonto();
        }else if(tipo == tipo.HOSPEDAJE){
            hospedaje += gastos[i].getMonto();
        }else if(tipo == tipo.ROPA){
            ropa += gastos[i].getMonto();
        }else if(tipo == tipo.TRANSPORTE){
            transporte += gastos[i].getMonto();
        }
        
      }
   }
   
    public double getComida() {
     return comida;
    }

    public double getHospedaje() {
     return hospedaje;
    }

    public double getTransporte() {
     return transporte;
    }

    public double getRopa() {
     return ropa;
    }

    public int getCantidadComida() {
     return cantidadComida;
    }
    
    
}
