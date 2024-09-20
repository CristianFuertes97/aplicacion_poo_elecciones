package com.uniandes.elecciones.principal;

import java.util.Scanner;

import com.uniandes.elecciones.calculos.Votos;
import com.uniandes.elecciones.modelos.Candidato;
import com.uniandes.elecciones.modelos.Urna;

public class App {
    public static void main(String[] args) throws Exception {
      // Candidato 1
      Candidato candidato1 = new Candidato();
      candidato1.setNombre("Felipe Pitti");
      candidato1.setEdad(27);
      candidato1.setPartidoPolitico("Independiente");
      candidato1.setCostoCampañA(1500.00);
      
      
      // Candidato 2
      Candidato candidato2 = new Candidato();
      candidato2.setNombre("Susanita Chirusi");
      candidato2.setEdad(26);
      candidato2.setPartidoPolitico("Revolucionario");
      candidato2.setCostoCampañA(1000.00);
      
        // Candidato 3
      Candidato candidato3 = new Candidato();
      candidato3.setNombre("Manolito Goreiro");
      candidato3.setEdad(26);
      candidato3.setPartidoPolitico("Tradicional");
      candidato3.setCostoCampañA(1000.00);


      Urna urna = new Urna();
      urna.mostrarCandidatos(candidato1);
      System.out.println("*******************************");
      urna.mostrarCandidatos(candidato2);
      System.out.println("*******************************");
      urna.mostrarCandidatos(candidato3);
  
      
      System.out.println("-----------Sistema de votaciones-------------");
  // Votaciones candidatos
      //  votaciones por genero masculino
      for (int i = 0; i < 15; i++) {
        candidato1.registrarVotoGenero(1);
        candidato1.registrarVotoGenero(2);
        candidato2.registrarVotoGenero(1);
        
      }
      // votaciones por influencia de television
      for ( int i = 0; i < 7; i++ ){
        candidato1.registrarVotoPublicidad(1);
        candidato1.registrarVotoPublicidad(1);
        candidato1.registrarVotoPublicidad(2);
        candidato2.registrarVotoPublicidad(1);

      }
      // votos por edad rango joven
      for (int i = 0; i < 10; i++){
        candidato1.registrarVotoEdad(1);
        candidato1.registrarVotoEdad(1);
        candidato2.registrarVotoEdad(2);
        
      }

      urna.mostrarVotaciones(candidato1);
      System.out.println("*********************************");
      // urna.mostrarVotaciones(candidato2);
    
      // total d votaciones en las elecciones candidato 1
      Votos votacion = new Votos();
      System.out.println("Total de votaciones por genero: "+ votacion.calcularVotosGenero(candidato1));
      System.out.println("Total de votaciones por edad: "+ votacion.calcularVotosEdad(candidato1));
      System.out.println("Total de votaciones por publicidad: "+ votacion.calcularVotosPublicidad(candidato1));
      
      System.out.println("---------------------------------------------------");
      System.out.println("Candidato 2");
      System.out.println("Total de votaciones por genero: "+ votacion.calcularVotosGenero(candidato2));
      System.out.println("Total de votaciones por edad: "+ votacion.calcularVotosEdad(candidato2));
      System.out.println("Total de votaciones por publicidad: "+ votacion.calcularVotosPublicidad(candidato2));
      

    }
}
