import java.beans.IntrospectionException;
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
    void agregarIngrediente(Ingrediente ingrediente){
        ingredientes.put(ingrediente.nombre,ingrediente.cantidad);
    }

    //Método para reabastecer ingredientes (se reabastece por default 150 unidades)
    void reabastecerIngrediente(String ingrediente){
        System.out.println("Reabasteciendo " +ingrediente+"\n");
        Integer cantidadActual = ingredientes.get(ingrediente);
        ingredientes.put(ingrediente.nombre,cantidadActual+150);
    }

    //Método para reducir cantidad de ingrediente consumido por receta
    void decrementaIngrediente(String ingrediente, int cantidad){
        System.out.println("Rreceta consume " +cantidad+" de " +ingrediente+"\n");
        Integer cantidadActual = ingredientes.get(ingrediente);
        ingredientes.put(ingrediente.nombre,cantidadActual-cantidad);
    }
}