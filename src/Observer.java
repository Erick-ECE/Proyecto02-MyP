import java.util.ArrayList;
/**
* Interfaz Observer. Utilizada para el modelamiento del patrón
* Observer. 
* @author Daniel Villegas & Erick Castro & Ricardo Desales   
* @version Junio 2020
*/

public interface Observer {
    //Método update de la interfaz 
    public void update(ArrayList<String> pedido, int id); 

} 