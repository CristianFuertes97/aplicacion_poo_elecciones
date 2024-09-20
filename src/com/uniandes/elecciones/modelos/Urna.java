package com.uniandes.elecciones.modelos;

public class Urna {
    // metodos
    public void mostrarCandidatos(Candidato candidato){
        System.out.println("Nombre: "+ candidato.getNombre());
        System.out.println("Edad: "+ candidato.getEdad());
        System.out.println("Partido politico: "+candidato.getPartidoPolitico());
        System.out.println("Costo Campaña: "+ candidato.getCostoCampañA());
        
    }

    public void mostrarVotaciones(Candidato candidato){
        System.out.println("Votaciones por genero masculino: "+ candidato.getGeneroMasculino());
        System.out.println("Votaciones por genero femenino: "+ candidato.getGeneroFemenino());
        System.out.println("Votaciones por influencia television: "+ candidato.getVotosInfluenciaTelevision());
        System.out.println("Votaciones por influencia radio: "+ candidato.getVotosInfluenciaRadio());
        System.out.println("Votaciones por influencia internet: "+ candidato.getVotosInfluenciaInternet());
        System.out.println("Votaciones por personas jovenes: " + candidato.getVotosEdadJoven());
        System.out.println("Votaciones por personas de edad media: "+ candidato.getVotosEdadMedia());
        System.out.println("Votaciones por personas mayores: "+ candidato.getVotosEdadMayor());
        System.out.println("costo por voto television: "+ candidato.costoPorTelevision());
    }

    

}
