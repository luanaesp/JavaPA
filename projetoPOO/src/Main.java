package br.uern.di.lpc.animaisfantasticos;

import br.uern.di.lpc.animaisfantasticos.Papagaio;
import br.uern.di.lpc.animaisfantasticos.Currupio;

public class Main {

public static void main(String[] args){
   
   Papagaio rommel = new Papagaio(40);
   Currupio limajr = new Currupio(120);

   rommel.cantar();
   limajr.cantar();
  }

  

}