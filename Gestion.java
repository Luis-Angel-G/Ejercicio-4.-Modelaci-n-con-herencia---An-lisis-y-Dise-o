import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Gestion {
    protected ArrayList<Mamifero> listaAnimales = new ArrayList<>();
    private static final String REGISTRO_CSV = "registro_aceptados.csv";
    private static final String HISTORIAL_INTERCAMBIO_CSV = "historial_intercambios.csv";

    public Gestion() {
        try {
            new File(REGISTRO_CSV).createNewFile();
            new File(HISTORIAL_INTERCAMBIO_CSV).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregarAnimal(Mamifero animal) {
        listaAnimales.add(animal);
    }

    public void eliminarAnimal(Mamifero animal) {
        listaAnimales.remove(animal);
    }

    public String mostrarAnimales() {
        StringBuilder detalles = new StringBuilder();
        for (Mamifero animal : listaAnimales) {
            detalles.append(animal.getNombreCientifico()).append(", ");
        }
        return detalles.toString();
    }

    public double calcularAlimentoDiario(Mamifero animal) {
        double porcentaje = 0.0;
        switch (animal.dieta) {
            case 1:
                porcentaje = animal instanceof Felino ? 0.07 : 0.06;
                break;
            case 2:
                porcentaje = 0.05;
                break;
        }
        return animal.peso * porcentaje;
    }

    public double calcularCostoMensual(Mamifero animal) {
        double costoMantenimiento = 0.0;
        switch (animal.tamanio) {
            case 1:
                costoMantenimiento = 100 * 30;
                break;
            case 2:
                costoMantenimiento = 250 * 30;
                break;
            case 3:
                costoMantenimiento = 400 * 30;
                break;
        }
        double costoAlimento = calcularAlimentoDiario(animal) * 30;
        return costoMantenimiento + costoAlimento;
    }

    public boolean esRecintoAdecuado(Mamifero animal) {
        int areaRequerida = 0;

        if (animal instanceof Felino) {
            if (animal.tamanio == 1) {
                areaRequerida = 50;
            } else if (animal.tamanio == 2) {
                areaRequerida = 100;
            } else if (animal.tamanio == 3) {
                areaRequerida = 200;
            }
        } else if (animal instanceof Primate) {
            if (animal.tamanio == 1) {
                areaRequerida = 50;
            } else if (animal.tamanio == 2) {
                areaRequerida = 150;
            } else if (animal.tamanio == 3) {
                areaRequerida = 400;
            }
        }

        return animal.recinto >= areaRequerida;
    }

    public void registrarAceptacion(Mamifero animal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(REGISTRO_CSV, true))) {
            String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            writer.write(animal.getNombreCientifico() + "," + animal.getEspecie() + "," + fecha);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void registrarIntercambio(Mamifero animal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(HISTORIAL_INTERCAMBIO_CSV, true))) {
            String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            writer.write(animal.getNombreCientifico() + "," + animal.getEspecie() + "," + fecha);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    

    public String mostrarHistorialIntercambio() {
        StringBuilder historial = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(HISTORIAL_INTERCAMBIO_CSV))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                historial.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return historial.toString();
    }
}