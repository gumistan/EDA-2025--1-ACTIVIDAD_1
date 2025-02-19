/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

/**
 *
 * @author María José Osorio
 */
public class Nota {
    private int nota;
    private String nombreEstudiante;
    
    public Nota(int nota, String nombreEstudiante){
      this.nota = nota;
      this.nombreEstudiante = nombreEstudiante;
    }
    
    public int getNota() {
        return nota;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
}
