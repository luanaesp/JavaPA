package br.uern.di.lpc.animaisfantasticos;

import br.uern.di.lpc.animaisfantasticos.Ave;

public class Currupio extends Passaro{

   private int max_distancia;

   public Currupio(int distancia){
   
      this.max_distancia = distancia;
   }

   public void cantar(){

      System.out.println("Piu frio fru fri Pió");
   }

   public int voar(int distancia){

   return distancia > this.max_distancia ? this.max_distancia : distancia;
   }
}
