import java.util.Scanner;

public class DriverProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestion gestion = new Gestion();

        while (true) {
            System.out.println("=== Menú del Zoológico ===");
            System.out.println("1. Agregar un Felino");
            System.out.println("2. Agregar un Primate");
            System.out.println("3. Mostrar Lista de Animales");
            System.out.println("4. Mostrar Costos Mensuales");
            System.out.println("5. Verificar Recintos Adecuados");
            System.out.println("6. Verificar Condiciones para Aceptar Ejemplares");
            System.out.println("7. Mostrar Historial de Intercambios");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1: // Agregar un Felino
                    agregarFelino(scanner, gestion);
                    break;
                case 2: // Agregar un Primate
                    agregarPrimate(scanner, gestion);
                    break;
                case 3: // Mostrar Lista de Animales
                    System.out.println("Lista de animales:");
                    System.out.println(gestion.mostrarAnimales());
                    break;
                case 4: // Mostrar Costos Mensuales
                    mostrarCostosMensuales(gestion);
                    break;
                case 5: // Verificar Recintos Adecuados
                    verificarRecintosAdecuados(gestion);
                    break;
                case 6: // Verificar Condiciones para Aceptar Ejemplares
                    verificarCondiciones(gestion, scanner);
                    break;
                case 7: // Mostrar Historial de Intercambios
                    System.out.println("Historial de intercambios:");
                    System.out.println(gestion.mostrarHistorialIntercambio());
                    break;
                case 0: // Salir
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return; // Terminar el programa
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void agregarFelino(Scanner scanner, Gestion gestion) {
        System.out.println("=== Agregar Felino ===");
        System.out.print("Ingrese el nombre científico: ");
        String nombreCientifico = scanner.nextLine();
        
        System.out.print("Ingrese el hábitat: ");
        String habitat = scanner.nextLine();

        System.out.print("Ingrese la esperanza de vida: ");
        double esperanza = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el tipo de pelaje (1: corto, 2: largo, 3: grueso, 4: ausente): ");
        int pelaje = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la cantidad promedio de crías: ");
        int crias = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el peso del animal en kg: ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el tiempo de gestación en meses: ");
        int gestacion = Integer.parseInt(scanner.nextLine());

        System.out.print("¿Está en peligro de extinción? (true/false): ");
        boolean extincion = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Ingrese el tipo de dieta (1: Carnívoro, 2: Omnívoro): ");
        int dieta = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la especie: ");
        String especie = scanner.nextLine();

        System.out.print("Ingrese el tamaño del recinto en metros cuadrados: ");
        int recinto = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el tamaño del mamífero (1: pequeño, 2: mediano, 3: grande): ");
        int tamanio = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la longitud de la cola en cm: ");
        double cola = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el color del pelaje: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese la velocidad máxima: ");
        double velocidad = Double.parseDouble(scanner.nextLine());

        Felino nuevoFelino = new Felino(nombreCientifico, habitat, esperanza, pelaje, crias, peso, 
                                          gestacion, extincion, dieta, especie, recinto, tamanio, 
                                          cola, color, velocidad);
        gestion.agregarAnimal(nuevoFelino);

        System.out.print("¿Acepta al ejemplar? (si/no): ");
        String aceptacion = scanner.nextLine();
        if (aceptacion.equalsIgnoreCase("si")) {
            gestion.registrarAceptacion(nuevoFelino);
        }

        System.out.print("¿Se registrará como intercambio? (si/no): ");
        String intercambio = scanner.nextLine();
        if (intercambio.equalsIgnoreCase("si")) {
            gestion.registrarIntercambio(nuevoFelino);
        }
    }

    private static void agregarPrimate(Scanner scanner, Gestion gestion) {
        System.out.println("=== Agregar Primate ===");
        System.out.print("Ingrese el nombre científico: ");
        String nombreCientifico = scanner.nextLine();

        System.out.print("Ingrese el hábitat: ");
        String habitat = scanner.nextLine();

        System.out.print("Ingrese la esperanza de vida: ");
        double esperanza = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el tipo de pelaje (1: corto, 2: largo, 3: grueso, 4: ausente): ");
        int pelaje = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la cantidad promedio de crías: ");
        int crias = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el peso del animal en kg: ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el tiempo de gestación en meses: ");
        int gestacion = Integer.parseInt(scanner.nextLine());

        System.out.print("¿Está en peligro de extinción? (true/false): ");
        boolean extincion = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Ingrese el tipo de dieta (1: Carnívoro, 2: Omnívoro): ");
        int dieta = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la especie: ");
        String especie = scanner.nextLine();

        System.out.print("Ingrese el tamaño del recinto en metros cuadrados: ");
        int recinto = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el tamaño del mamífero (1: pequeño, 2: mediano, 3: grande): ");
        int tamanio = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la estructura social (1: solitario, 2: grupal, 3: familiar, 4: jerárquico): ");
        int estructura = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el nivel de inteligencia (1-100): ");
        int inteligencia = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el tamaño del cerebro en gramos: ");
        double cerebro = Double.parseDouble(scanner.nextLine());

        Primate nuevoPrimate = new Primate(nombreCientifico, habitat, esperanza, pelaje, crias, peso, 
                                            gestacion, extincion, dieta, especie, recinto, tamanio, 
                                            estructura, inteligencia, cerebro);
        gestion.agregarAnimal(nuevoPrimate);

        System.out.print("¿Acepta al ejemplar? (si/no): ");
        String aceptacion = scanner.nextLine();
        if (aceptacion.equalsIgnoreCase("si")) {
            gestion.registrarAceptacion(nuevoPrimate);
        }

        System.out.print("¿Se registrará como intercambio? (si/no): ");
        String intercambio = scanner.nextLine();
        if (intercambio.equalsIgnoreCase("si")) {
            gestion.registrarIntercambio(nuevoPrimate);
        }
    }

    private static void mostrarCostosMensuales(Gestion gestion) {
        System.out.println("=== Costos Mensuales ===");
        for (Mamifero animal : gestion.listaAnimales) {
            double costoMensual = gestion.calcularCostoMensual(animal);
            System.out.println("El costo mensual de mantenimiento para " + animal.getNombreCientifico() + " es: Q" + costoMensual);
        }
    }

    private static void verificarRecintosAdecuados(Gestion gestion) {
        System.out.println("=== Verificación de Recintos Adecuados ===");
        for (Mamifero animal : gestion.listaAnimales) {
            boolean adecuado = gestion.esRecintoAdecuado(animal);
            System.out.println("¿El recinto es adecuado para " + animal.getNombreCientifico() + "? " + (adecuado ? "Sí" : "No"));
        }
    }

    private static void verificarCondiciones(Gestion gestion, Scanner scanner) {
        System.out.print("Ingrese el presupuesto disponible para el año: ");
        double presupuesto = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el costo de construcción del recinto: ");
        double costoConstruccion = Double.parseDouble(scanner.nextLine());

        for (Mamifero animal : gestion.listaAnimales) {
            boolean condicionesAdecuadas = gestion.verificarCondiciones(presupuesto, costoConstruccion, animal);
            System.out.println("¿Es adecuado aceptar al ejemplar " + animal.getNombreCientifico() + "? " + (condicionesAdecuadas ? "Sí" : "No"));
        }
    }
}