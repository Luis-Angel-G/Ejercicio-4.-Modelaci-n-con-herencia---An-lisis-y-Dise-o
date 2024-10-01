class Primate extends Mamifero{
    private int estructura;
    private int inteligencia;
    private double cerebro;
    public Primate(int estructura, int inteligencia, double cerebro) {
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