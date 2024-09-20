package com.uniandes.elecciones.calculos;

import com.uniandes.elecciones.modelos.Candidato;

public class Votos{
    // atributos
    private int totalVotos;
    private int totalVotosGenero;
    private int totalVotosEdad;
    private int totalVotosPublicidad;

    // getters de los atributos
    public int getTotalVotosGenero() {
        return this.totalVotosGenero;
    }

    public int getTotalVotosEdad() {
        return this.totalVotosEdad;
    }

    public int getTotalVotsPublicidad() {
        return this.totalVotosPublicidad;
    }

	public int getTotalVotos() {
		return this.totalVotos;
	}


    public int calcularVotosGenero(Candidato candidato){
        return this.totalVotosGenero = candidato.getGeneroFemenino() + candidato.getGeneroMasculino();
    }

    public int calcularVotosEdad(Candidato candidato){
        return this.totalVotosEdad = candidato.getVotosEdadJoven() +candidato.getVotosEdadMayor()+ candidato.getVotosEdadMedia();
    }

    public int calcularVotosPublicidad(Candidato candidato){
        return this.totalVotosPublicidad = candidato.getVotosInfluenciaInternet() + candidato.getVotosInfluenciaRadio() + candidato.getVotosInfluenciaTelevision();
    }

    public int calcularTotalVotos(){
        return this.totalVotos += (getTotalVotosEdad() + getTotalVotosGenero() + getTotalVotsPublicidad());
    }
}
