import java.util.Scanner;

public class DriverProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestion gestion = new Gestion();

        while (true) {
            System.out.println("¿Desea agregar un animal? (sí/no): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("Ingrese el nombre científico: ");
            String nombreCientifico = scanner.nextLine();

            System.out.println("Ingrese el hábitat: ");
            String habitat = scanner.nextLine();

            System.out.println("Ingrese la esperanza de vida: ");
            double esperanza = Double.parseDouble(scanner.nextLine());

            System.out.println("Ingrese el tipo de pelaje (1: corto, 2: largo, 3: grueso, 4: ausente): ");
            int pelaje = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese la cantidad promedio de crías: ");
            int crias = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el peso del animal en kg: ");
            double peso = Double.parseDouble(scanner.nextLine());

            System.out.println("Ingrese el tiempo de gestación en meses: ");
            int gestacion = Integer.parseInt(scanner.nextLine());

            System.out.println("¿Está en peligro de extinción? (true/false): ");
            boolean extincion = Boolean.parseBoolean(scanner.nextLine());

            System.out.println("Ingrese el tipo de dieta (1: Carnívoro, 2: Omnívoro): ");
            int dieta = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese la especie: ");
            String especie = scanner.nextLine();

            System.out.println("Ingrese el tamaño del recinto en metros cuadrados: ");
            int recinto = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el tamaño del mamífero (1: pequeño, 2: mediano, 3: grande): ");
            int tamanio = Integer.parseInt(scanner.nextLine());

            System.out.println("¿Es un Felino? (sí/no): ");
            String esFelino = scanner.nextLine();

            Mamifero nuevoMamifero;

            if (esFelino.equalsIgnoreCase("sí")) {
                System.out.println("Ingrese la longitud de la cola en cm: ");
                double cola = Double.parseDouble(scanner.nextLine());

                System.out.println("Ingrese el color del pelaje: ");
                String color = scanner.nextLine();

                System.out.println("Ingrese la velocidad máxima: ");
                double velocidad = Double.parseDouble(scanner.nextLine());

                nuevoMamifero = new Felino(nombreCientifico, habitat, esperanza, pelaje, crias, peso, 
                                            gestacion, extincion, dieta, especie, recinto, tamanio, 
                                            cola, color, velocidad);
            } else {
                System.out.println("Ingrese la estructura social (1: solitario, 2: grupal, 3: familiar, 4: jerárquico): ");
                int estructura = Integer.parseInt(scanner.nextLine());

                System.out.println("Ingrese el nivel de inteligencia (1-100): ");
                int inteligencia = Integer.parseInt(scanner.nextLine());

                System.out.println("Ingrese el tamaño del cerebro en gramos: ");
                double cerebro = Double.parseDouble(scanner.nextLine());

                nuevoMamifero = new Primate(nombreCientifico, habitat, esperanza, pelaje, crias, peso, 
                                             gestacion, extincion, dieta, especie, recinto, tamanio, 
                                             estructura, inteligencia, cerebro);
            }

            gestion.agregarAnimal(nuevoMamifero);

            System.out.println("¿Acepta al ejemplar? (sí/no): ");
            String aceptacion = scanner.nextLine();
            if (aceptacion.equalsIgnoreCase("sí")) {
                gestion.registrarAceptacion(nuevoMamifero);
            }

            System.out.println("¿Se registrará como intercambio? (sí/no): ");
            String intercambio = scanner.nextLine();
            if (intercambio.equalsIgnoreCase("sí")) {
                gestion.registrarIntercambio(nuevoMamifero);
            }
        }

        System.out.println("Lista de animales:");
        System.out.println(gestion.mostrarAnimales());

        for (Mamifero animal : gestion.listaAnimales) {
            double costoMensual = gestion.calcularCostoMensual(animal);
            System.out.println("El costo mensual de mantenimiento para " + animal.getNombreCientifico() + " es: Q" + costoMensual);
        }

        for (Mamifero animal : gestion.listaAnimales) {
            boolean adecuado = gestion.esRecintoAdecuado(animal);
            System.out.println("¿El recinto es adecuado para " + animal.getNombreCientifico() + "? " + (adecuado ? "Sí" : "No"));
        }

        System.out.println("Historial de intercambios:");
        System.out.println(gestion.mostrarHistorialIntercambio());

        scanner.close();
    }
}