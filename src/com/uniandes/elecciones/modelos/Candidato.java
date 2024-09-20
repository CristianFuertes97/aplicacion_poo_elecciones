package com.uniandes.elecciones.modelos;

public class Candidato{
    // Atributos
    private String nombre;
    private String apellido;
    private String partidoPolitico;
    private int edad;
    private double costoCampaña;
    private int votos;
    private int votosInfluenciaInternet;
    private int votosInfluenciaRadio;
    private int votosInfluenciaTelevision;
    private int generoMasculino;
    private int generoFemenino;
    private int votosEdadJoven;
    private int votosEdadMedia;
    private int votosEdadMayor;

    // Getters and asetters
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPartidoPolitico() {
		return this.partidoPolitico;
	}

	public void setPartidoPolitico(String partidoPolitico) {
		this.partidoPolitico = partidoPolitico;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getCostoCampañA() {
		return this.costoCampaña;
	}

	public void setCostoCampañA(double costoCampaña) {
		this.costoCampaña = costoCampaña;
	}

	public int getVotos() {
		return this.votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	public int getVotosInfluenciaInternet() {
		return this.votosInfluenciaInternet;
	}

	public void setVotosInfluenciaInternet(int votosInfluenciaInternet) {
		this.votosInfluenciaInternet = votosInfluenciaInternet;
	}

    public int getVotosInfluenciaRadio() {
        return this.votosInfluenciaRadio;
    }

    public void setVotosInfluenciaRadio(int votosInfluenciaRadio) {
        this.votosInfluenciaRadio = votosInfluenciaRadio;
    }

    public int getVotosInfluenciaTelevision() {
        return this.votosInfluenciaTelevision;
    }

    public void setVotosInfluenciaTelevision(int votosInfluenciaTelevision) {
        this.votosInfluenciaTelevision = votosInfluenciaTelevision;
    }

	public int getGeneroMasculino() {
		return this.generoMasculino;
	}

	public void setGeneroMasculino(int generoMasculino) {
		this.generoMasculino = generoMasculino;
	}

	public int getGeneroFemenino() {
		return this.generoFemenino;
	}

	public void setGeneroFemenino(int generoFemenino) {
		this.generoFemenino = generoFemenino;
	}

	public int getVotosEdadJoven() {
		return this.votosEdadJoven;
	}

	public void setVotosEdadJoven(int votosEdadJoven) {
		this.votosEdadJoven = votosEdadJoven;
	}

	public int getVotosEdadMedia() {
		return this.votosEdadMedia;
	}

	public void setVotosEdadMedia(int votosEdadMedia) {
		this.votosEdadMedia = votosEdadMedia;
	}

	public int getVotosEdadMayor() {
		return this.votosEdadMayor;
	}

	public void setVotosEdadMayor(int votosEdadMayor) {
		this.votosEdadMayor = votosEdadMayor;
	}

    // Metodos
    public void inicializar(){
        setNombre("");
        setApellido("");
        setPartidoPolitico("");
        setEdad(0);
        setVotosEdadJoven(0);
        setVotosEdadMayor(0);
        setVotosEdadMedia(0);
        setVotosInfluenciaInternet(0);
        setVotosInfluenciaRadio(0);
        setVotosInfluenciaTelevision(0);

    }

    public int agregarVotoTelevision(){
        return this.votosInfluenciaTelevision++;
    }

    public int agregarVotoRadio(){
        return this.votosInfluenciaRadio++;
    }

    public int agregarVotoInternet(){
        return this.votosInfluenciaInternet++;
    }

    public int agregarVotoMasculino(){
        return this.generoMasculino++;
    }

    public int agregarVotoFemenino(){
        return this.generoFemenino++;
    }
    
    public int agregarVotoEdadJoven(){
        return this.votosEdadJoven++;
    }

    public int agregarVotoEdadMedia(){
        return this.votosEdadMedia++;
    }

    public int agregarVotoEdadMayor(){
        return this.votosEdadMayor++;
    }

	public double costoPorTelevision(){
		return (this.votosInfluenciaTelevision * 1000) + this.costoCampaña;
	}
	public double costoPorRadio(){
		return (this.votosInfluenciaRadio * 500) + this.costoCampaña;
	}
	public double costoPorInternet(){
		return (this.votosInfluenciaInternet * 100)+ this.costoCampaña;
	}

	public void registrarVotoGenero(int genero){
        if(genero == 1){
            agregarVotoMasculino();                                                                                                                                                                                                 
        } 
		else if (genero == 2){
			agregarVotoFemenino();
		}
    }

	public void registrarVotoPublicidad(int opcion){
		if(opcion == 1){
			agregarVotoTelevision();
			costoPorTelevision();
		}else if (opcion == 2){
			agregarVotoRadio();
			costoPorRadio();
		}else if (opcion == 3){
			agregarVotoInternet();
			costoPorInternet();
		}else{
			
		}
	}

	public void registrarVotoEdad(int opcion){
		if(opcion == 1){
			agregarVotoEdadJoven();
		}else if (opcion == 2){
			agregarVotoEdadMedia();
		}else if(opcion == 3){
			agregarVotoEdadMayor();
		}
	}
}
                                         