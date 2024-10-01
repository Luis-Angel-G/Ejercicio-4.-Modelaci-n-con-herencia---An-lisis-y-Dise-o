class Felino extends Mamifero{
    private double cola;
    private String color;
    private double velocidad;

    public Felino(double cola, String color, double velocidad) {
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