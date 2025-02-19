/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

/**
 *
 * @author USUARIO
 */
public class Test {
    public static void main(String args){
    
     Nota[] notas = {
            new Nota(15, "Carlos"), new Nota(12, "Ana"),
            new Nota(18, "Miguel"), new Nota(9, "Sofía"),
            new Nota(14, "Luis"), new Nota(7, "Elena"),
            new Nota(11, "Jorge"), new Nota(16, "Valeria"),
            new Nota(19, "Andrés"), new Nota(10, "Mariana"),
            new Nota(20, "Fernando"), new Nota(8, "Isabel"),
            new Nota(13, "Roberto"), new Nota(17, "Gabriela"),
            new Nota(5, "Pablo"), new Nota(6, "Clara"),
            new Nota(15, "Hugo"), new Nota(14, "Diana"),
            new Nota(9, "Raúl"), new Nota(18, "Lucía"),
            new Nota(7, "Ricardo"), new Nota(12, "Patricia"),
            new Nota(16, "Daniel"), new Nota(11, "Carla"),
            new Nota(13, "Adrián"), new Nota(20, "Beatriz"),
            new Nota(8, "Esteban"), new Nota(10, "Alejandra"),
            new Nota(19, "Manuel"), new Nota(17, "Victoria"),
            new Nota(15, "Eduardo"), new Nota(12, "Natalia"),
            new Nota(18, "Javier"), new Nota(9, "Verónica"),
            new Nota(14, "Felipe"), new Nota(7, "Rosa"),
            new Nota(11, "Tomás"), new Nota(16, "Camila"),
            new Nota(19, "Sebastián"), new Nota(10, "Paula"),
            new Nota(20, "Francisco"), new Nota(8, "Teresa"),
            new Nota(13, "Álvaro"), new Nota(17, "Sara"),
            new Nota(5, "Guillermo"), new Nota(6, "Mónica"),
            new Nota(15, "Óscar"), new Nota(14, "Fabiola"),
            new Nota(9, "Armando"), new Nota(18, "Cecilia"),
            new Nota(7, "Ignacio"), new Nota(12, "Elsa"),
            new Nota(16, "Mario"), new Nota(11, "Silvia"),
            new Nota(13, "Cristian"), new Nota(20, "Raquel")
        };

     NotasRegistro NOTAS = new NotasRegistro(notas);
     NOTAS.ordenar();
     
     System.out.println("La nota promedio es: " + NOTAS.obtenerNotaPromedio());
     System.out.println("Notas ordenadas de menor a mayor");
     
     for(Nota nota: NOTAS.getNotas()){
      System.out.println(nota.getNota() + " - " + nota.getNombreEstudiante());
     }
     
     Nota notaMasBaja = NOTAS.getNotaMasBaja();
     Nota notaMasAlta = NOTAS.getNotaMasAlta();
     
     System.out.println("La nota más alta es " + notaMasAlta.getNota() + " de " + notaMasAlta.getNombreEstudiante());
     System.out.println("La nota más baja es " + notaMasBaja.getNota() + " de " + notaMasBaja.getNombreEstudiante());
     System.out.println(NOTAS.getCantidadEstudiantes() + " obtuvieron notas de 18-19-20");
     System.out.println(NOTAS.getNotasSuperiorAlPromedio() + " fueron mayores al promedio");
     System.out.println(NOTAS.porcentajeAprobado() + "% fue el porcentaje de aprobados");
     System.out.println(NOTAS.porcentajeDesaprobado() + "% fue el porcentaje de desaprobados");
    
    
    
    
    
    
    }
}
