//import java.util.Serializable;

/**
* Interfaz para el modelamiento del proxy entre el jefe técnico y las
* sucursales.
* @author Daniel Villegas & Erick Castro & Ricardo Desales
* @version Junio 2020
*/

public interface InterfazConsulta {

    /**
    * Método de la interfaz.
    * @param tipo El tipo de dulce que se va a buscar
    */
    public int consultarInventario(String tipo);
  
}
