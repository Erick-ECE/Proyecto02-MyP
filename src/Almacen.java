
//import java.beans.IntrospectionException;
import java.util.ArrayList;
//import java.util.Hashtable;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
 * Clase Almacen para guardar los ingredientes
 */
public class Almacen {
    //Hashtable <String,Integer> ingredientes;
    private ArrayList<Ingrediente> ingredientes;
    //Constructor de la clase, crea la Hash para los ingredientes
    /*Almacen(){
        ingredientes = new Hashtable<String,Integer>();
    }

    //Método para agregar nuevos ingredientes 
    public void agregarIngrediente(String ingrediente, int cantidad){
        ingredientes.put(ingrediente,cantidad);
    }*/

    /**
     * Constructor
     */
    public Almacen(){
        ingredientes = new ArrayList<>();
    }
    /**
     * Método que agrega un ingrediente a la lista de ingredientes del 
     * almacen
     * @param i El ingrediente a agregar
     */
    public void agregarIngrediente(Ingrediente i) {
        ingredientes.add(i);
    }

    //Método para reabastecer ingredientes (se reabastece por default 150 unidades)
    public void reabastecerIngrediente(String ingrediente){
        System.out.println("Reabasteciendo " +ingrediente+"\n");
        //Integer cantidadActual = ingredientes.get(ingrediente);
        //ingredientes.put(ingrediente,cantidadActual+150);
        for(Ingrediente i : ingredientes){
            if(i.getNombre()== ingrediente ){
                i.aumentarCantidad(100);
                break;
            }
        } 
    }

    //Método para reducir cantidad de ingrediente consumido por receta
    public void decrementaIngrediente(String ingrediente, int cantidad){
        System.out.println("Receta consume " +cantidad+" de " +ingrediente
        +"\n");
        //Integer cantidadActual = ingredientes.get(ingrediente);
        //ingredientes.put(ingrediente,cantidadActual-cantidad);
        for(Ingrediente i : ingredientes){
            if(i.getNombre().equals(ingrediente)){
                i.disminuirCantidad(cantidad);
                break;
            }
        }
    }

    /**
     * Método que regresa la cantidad que se encuentra almacenada en el
     * almacen
     * @param ingrediente El ingrediente a buscar
     * @return La cantidad del ingrediente (un valor entero)
     */
    public int getCantidadDeIngrediente(String ingrediente) { 
        int cantidad = 0;
        for(Ingrediente i : ingredientes) {
            if (i.getNombre().equalsIgnoreCase(ingrediente)){
                cantidad = i.getCantidad();
            }
        }
        return cantidad; 
    }
}