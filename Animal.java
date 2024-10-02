class Animal {
    protected String nombreCientifico;
    protected String habitat;
    protected double esperanza;

    public Animal(String nombreCientifico, String habitat, double esperanza) {
        this.nombreCientifico = nombreCientifico;
        this.habitat = habitat;
        this.esperanza = esperanza;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getEsperanza() {
        return esperanza;
    }
}