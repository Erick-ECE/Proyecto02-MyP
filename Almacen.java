//import java.beans.IntrospectionException;
import java.util.Hashtable;

/**
 * Clase Almacen para guardar los ingredientes
 */
public class Almacen {
    Hashtable <String,Integer> ingredientes;
    //Constructor de la clase, crea la Hash para los ingredientes
    Almacen(){
        ingredientes = new Hashtable<String,Integer>();
    }

    //Método para agregar nuevos ingredientes 
    public void agregarIngrediente(String ingrediente, int cantidad){
        ingredientes.put(ingrediente,cantidad);
    }

    //Método para reabastecer ingredientes (se reabastece por default 150 unidades)
    public void reabastecerIngrediente(String ingrediente){
        System.out.println("Reabasteciendo " +ingrediente+"\n");
        Integer cantidadActual = ingredientes.get(ingrediente);
        ingredientes.put(ingrediente,cantidadActual+150);
    }

    //Método para reducir cantidad de ingrediente consumido por receta
    public void decrementaIngrediente(String ingrediente, int cantidad){
        System.out.println("Rreceta consume " +cantidad+" de " +ingrediente+"\n");
        Integer cantidadActual = ingredientes.get(ingrediente);
        ingredientes.put(ingrediente,cantidadActual-cantidad);
    }
}