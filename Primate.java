class Primate extends Mamifero {
    private int estructura;
    private int inteligencia;
    private double cerebro;

    public Primate(String nombreCientifico, String habitat, double esperanza, int pelaje, int crias, double peso, 
                   int gestacion, boolean extincion, int dieta, String especie, int recinto, int tamanio,
                   int estructura, int inteligencia, double cerebro) {
        super(nombreCientifico, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, especie, recinto, tamanio);
        this.estructura = estructura;
        this.inteligencia = inteligencia;
        this.cerebro = cerebro;
    }

    public int getEstructura() {
        return estructura;
    }

    public void setEstructura(int estructura) {
        this.estructura = estructura;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getCerebro() {
        return cerebro;
    }

    public void setCerebro(double cerebro) {
        this.cerebro = cerebro;
    }
}