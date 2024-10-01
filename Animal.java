class Animal{
    protected String nombrecientifico;
    protected String habitat;
    protected double esperanza;

    public Animal(String nombrecientifico, String habitat, double esperanza){
        this.nombrecientifico = nombrecientifico;
        this.habitat = habitat;
        this.esperanza = esperanza;
    }

    public String getNombreCientifico() {
        return nombrecientifico;
    }

    public void setNombreCientifico(String nombrecientifico) {
        this.nombrecientifico = nombrecientifico;
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