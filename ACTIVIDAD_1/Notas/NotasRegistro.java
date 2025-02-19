/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

/**
 *
 * @author María José Osorio 
 */
public class NotasRegistro {
  private Nota[] notas = new Nota[58];
    
  public NotasRegistro(Nota[] notas){
       this.notas = notas;
    }  
 
  public double obtenerNotaPromedio(){
    int suma = 0;
    for(Nota n : notas){
      suma += n.getNota();
    }
   return (double) suma / notas.length;
  }

  public void ordenar(){
   quickSort(notas, 0, notas.length -1);
  }
 
  public static void quickSort(Nota[] notas, int inicio, int fin){
   if(inicio < fin){
      int pivoteIndex  = partition(notas, inicio, fin);
      quickSort(notas, inicio, pivoteIndex -1);
      quickSort(notas, pivoteIndex + 1, fin);
   }
 }
  
  private static int partition(Nota[] notas, int inicio, int fin){
    Nota pivote = notas[fin];
    int i = inicio - 1;
    
    for(int j = inicio; i < fin; j++){
     if(notas[j].getNota() <= pivote.getNota()){
     i++;
     Nota temp = notas[i];
     notas[i] = notas[j];
     notas[j] = temp; 
    }
    
   }
     
     Nota temp = notas[i + 1];
     notas[i + 1] = notas[fin];
     notas[fin] = temp;
 
    return i + 1;
  }
  
  public int getCantidadEstudiantes(){
    int cantidad = 0;
    for(Nota nota: notas){
    if(nota.getNota() >= 18){
    cantidad++;
   }
  }
    return cantidad;
  }
  
  public int getNotasSuperiorAlPromedio(){
    int cantidad = 0;
    double promedio = obtenerNotaPromedio();
    
    for(Nota nota: notas){
     if(nota.getNota() > promedio){
      cantidad++;
     }
    }
    
    return cantidad;
  }
  
  
  public Nota getNotaMasAlta(){
   return notas[notas.length-1];
  }
  
  
  
  public Nota getNotaMasBaja(){
   return notas[0];
  }
  
   public double porcentajeAprobado(){
   int aprobados = 0;
    for(Nota nota: notas){
     if(nota.getNota() >= 11){
      aprobados++;
     }
    }
    return (double) aprobados / notas.length * 100; 
   }

   public double porcentajeDesaprobado(){
   int desaprobados = 0;
    for(Nota nota: notas){
     if(nota.getNota() < 11){
      desaprobados++;
     }
    }
    return (double) desaprobados / notas.length * 100; 
   }   
   
   public Nota[] getNotas() {  
        return notas;
    }
  
}
 
 
   
    
    

