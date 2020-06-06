import java.util.ArrayList;

/**
 * Receta. Clase que modela la receta de un dulce. 
 * @author Daniel Villegas & Erick Castro & Ricardo Desales 
 */
public class Receta {

    //Nombre de la receta
    String nombre;
    //Lista con los ingredientes de la receta
    ArrayList<Ingrediente> ingredientes;

    /**
     * Constructor de la receta
     * @param nombre Nombre del dulce a preparar
     * @param ingredientes Ingredientes del dulce
     */
    public Receta(String nombre, ArrayList<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes; 
    }

    /**
     * Método que regresa los ingredientes de la receta. _
     */
    public ArrayList<Ingrediente> getReceta(){
        return ingredientes;
    }

    /**
     * Método que regresa el nombre de la receta
     */
    public String getNombre(){ return nombre; }
}