import java.util.ArrayList;

public class Gestion{
    Animal animal;
    ArrayList<Animal> listaAnimales = new ArrayList<>();

    public void agregarAnimal(Animal animal){
        listaAnimales.add(animal);
    }

    public void eliminarAnimal(Animal animal){
        listaAnimales.remove(animal);
    }

    public String mostrarAnimales(){
        for(int i < listaAnimales.size(); i++){
            String anima;
            anima = animal;
            return anima;
        }
    }

    
}