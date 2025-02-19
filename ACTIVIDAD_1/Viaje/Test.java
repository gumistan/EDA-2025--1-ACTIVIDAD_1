/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viaje;

/**
 *
 * @author María José Osorio
 */
public class Test {
    public static void main(String[] args){
    Gasto[]gastos = {
    new Gasto(Tipo.HOSPEDAJE, 180.0, 5022024),
    new Gasto(Tipo.COMIDA, 50.0, 12032024),
    new Gasto(Tipo.TRANSPORTE, 70.0, 8012024),
    new Gasto(Tipo.ROPA, 95.0, 20042024),
    new Gasto(Tipo.HOSPEDAJE, 210.0, 15022024),
    new Gasto(Tipo.COMIDA, 30.0, 3032024),
    new Gasto(Tipo.ROPA, 60.0, 18012024),
    new Gasto(Tipo.TRANSPORTE, 35.0, 7042024),
    new Gasto(Tipo.HOSPEDAJE, 250.0, 22022024),
    new Gasto(Tipo.COMIDA, 45.0, 10032024),
    new Gasto(Tipo.ROPA, 110.0, 25012024),
    new Gasto(Tipo.TRANSPORTE, 55.0, 9042024),
    new Gasto(Tipo.COMIDA, 25.0, 4022024),
    new Gasto(Tipo.HOSPEDAJE, 195.0, 17032024),
    new Gasto(Tipo.ROPA, 85.0, 27012024),
    new Gasto(Tipo.TRANSPORTE, 40.0, 6042024),
    new Gasto(Tipo.COMIDA, 35.0, 14022024),
    new Gasto(Tipo.HOSPEDAJE, 230.0, 30032024)
      };
    
    Viaje viaje = new Viaje(gastos);
    viaje.calcularGastos();
    double gastosHospedaje = viaje.getHospedaje();
    double gastosRopa = viaje.getRopa();
    double gastosTransporte = viaje.getTransporte();
    double gastosComida = viaje.getComida();
    
    System.out.println("Los gastos totales del hospedaje son: " + gastosHospedaje);
    System.out.println("Los gastos totales de la ropa son: " + gastosRopa);
    System.out.println("Los gastos totales del transporte son: " + gastosTransporte);
    System.out.println("Los gastos totales de la comida son: " + gastosComida);
    System.out.println("Se realizaron en total " + viaje.getCantidadComida() + " gastos en comida");
    
   double maxGasto = gastosHospedaje;
   String categoriaMax = "Hospedaje";

   if (gastosRopa > maxGasto) {
    maxGasto = gastosRopa;
    categoriaMax = "Ropa";
   }
   
   if (gastosTransporte > maxGasto) {
    maxGasto = gastosTransporte;
    categoriaMax = "Transporte";
   }
   
   if (gastosComida > maxGasto) {
    maxGasto = gastosComida;
    categoriaMax = "Comida";
   }

System.out.println("Se invirtió más dinero en " + categoriaMax);
     
 }
}

