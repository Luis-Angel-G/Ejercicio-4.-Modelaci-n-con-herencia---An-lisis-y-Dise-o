class Mamifero extends Animal {
    protected int pelaje;
    protected int crias;
    protected double peso;
    protected int gestacion;
    protected boolean extincion;
    protected int dieta;
    protected String especie;
    protected int recinto;
    protected int tamanio;

    public Mamifero(String nombreCientifico, String habitat, double esperanza, int pelaje, int crias, double peso, 
                    int gestacion, boolean extincion, int dieta, String especie, int recinto, int tamanio) {
        super(nombreCientifico, habitat, esperanza); // Llama al constructor de Animal
        this.pelaje = pelaje;
        this.crias = crias;
        this.peso = peso;
        this.gestacion = gestacion;
        this.extincion = extincion;
        this.dieta = dieta;
        this.especie = especie;
        this.recinto = recinto;
        this.tamanio = tamanio;
    }

    public int getPelaje() {
        return pelaje;
    }

    public void setPelaje(int pelaje) {
        this.pelaje = pelaje;
    }

    public int getCrias() {
        return crias;
    }

    public void setCrias(int crias) {
        this.crias = crias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }

    public boolean isExtincion() {
        return extincion;
    }

    public void setExtincion(boolean extincion) {
        this.extincion = extincion;
    }

    public int getDieta() {
        return dieta;
    }

    public void setDieta(int dieta) {
        this.dieta = dieta;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getRecinto() {
        return recinto;
    }

    public void setRecinto(int recinto) {
        this.recinto = recinto;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}