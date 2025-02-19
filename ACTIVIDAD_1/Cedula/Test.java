/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cedula;

import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class Test {
    public static void main(String[] args) {
        Cedula cedulaObj = new Cedula();
        cedulaObj.ordenarElementos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las cédulas");
        
       int[]cedulas = cedulaObj.getCedula();
        for (int i = 0; i < 100; i++) {
            cedulas[i] = scanner.nextInt();
        }
        scanner.close();

        int cedulaBuscar = 19144473;
        int posicion = cedulaObj.buscarCedula(cedulaBuscar);
        if (posicion != -1) {
            System.out.println("La cédula " + cedulaBuscar + " está en la posición " + posicion + ".");
        } else {
            System.out.println("La cédula " + cedulaBuscar + " no se encuentra en el arreglo.");
        }

        int cedulaRestriccion = 19145954;
        int cantidad = cedulaObj.cantidadCedulas(cedulaRestriccion);
        System.out.println("La cantidad de cédulas mayores a " + cedulaRestriccion + " es de : " + cantidad);
    }
}
