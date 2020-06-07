import java.util.Collection;
import java.util.LinkedList;
import java.util.ArrayList;
/**
* Sucursal. Clase para modelar una sucursal con una Lista Ligada.
* @author Daniel Villegas & Erick Castro & Ricardo Desales
* @version Junio 2020
*/

public  class Sucursal2 extends Sucursal {

    //Id de la sucursal
    private int id;
    //Dirección de la sucursal
    private String direccion;
    //Nombre del repostero encargado
    private String reposteroEncargado;
    //Colección con el inventario de la sucursal
    private Collection<Lote> inventario;
    //Referencia al jefe técnico 
    private JefeTecnico jefeTecnico;
    /**
     * Constructor de la sucursal
     * @param id Id de la sucursal
     * @param direccion Dirección de la sucursal
     * @param reposteroEncargado Nombre del repostero encargado
     * @param jefeTecnico Referencia al jefe técnico que supervisa
     * el comportamiento de la sucursal 
     */
    Sucursal2(String direccion, String reposteroEncargado, 
            JefeTecnico jefeTecnico) {
        this.id = 2;
        this. direccion = direccion;
        this.reposteroEncargado = reposteroEncargado;
        this.add(jefeTecnico);
        this.inventario = new LinkedList<Lote>();
    }
  
}