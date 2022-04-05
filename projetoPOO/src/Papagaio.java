package br.uern.di.lpc.animaisfantasticos;

import br.uern.di.lpc.animaisfantasticos.Ave;

public class Papagaio extends Passaro{

   private int max_distancia;

   public Papagaio(int distancia){
   
      this.max_distancia = distancia;
   }

   public void cantar(){

      System.out.println("Papagaio Legal");
   }

   public int voar(int distancia){

   return distancia > this.max_distancia ? this.max_distancia : distancia;
   }
}

