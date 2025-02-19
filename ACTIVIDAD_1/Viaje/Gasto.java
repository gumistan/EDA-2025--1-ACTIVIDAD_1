/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viaje;

/**
 *
 * @author USUARIO
 */
public class Gasto {
    private Tipo tipo;
    private double monto;
    private int fecha;
    
    //fecha en formato DD/MM/AA
    public Gasto(Tipo tipo, double monto, int fecha) {
       this.tipo = tipo;
       this.monto = monto;
       this.fecha = fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }
    
    public int getFecha(){
        return fecha;   
    }
}
