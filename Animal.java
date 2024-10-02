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

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getEsperanza() {
        return esperanza;
    }

    public void setEsperanza(double esperanza) {
        this.esperanza = esperanza;
    }
}