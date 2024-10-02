class Felino extends Mamifero {
    private double cola;
    private String color;
    private double velocidad;

    public Felino(String nombreCientifico, String habitat, double esperanza, int pelaje, int crias, 
                  double peso, int gestacion, boolean extincion, int dieta, String especie, 
                  int recinto, int tamanio, double cola, String color, double velocidad) {
        super(nombreCientifico, habitat, esperanza, pelaje, crias, peso, gestacion, extincion, dieta, especie, recinto, tamanio);
        this.cola = cola;
        this.color = color;
        this.velocidad = velocidad;
    }

    public double getCola() {
        return cola;
    }

    public void setCola(double cola) {
        this.cola = cola;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
