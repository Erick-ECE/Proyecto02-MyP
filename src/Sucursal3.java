import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
/**
* Sucursal. Clase para modelar una sucursal con un HashSet.
* @author Daniel Villegas & Erick Castro & Ricardo Desales
* @version Junio 2020
*/

public  class Sucursal3 extends Sucursal {

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
    Sucursal3(String direccion, String reposteroEncargado, 
            JefeTecnico jefeTecnico) {
        this.id = 3;
        this. direccion = direccion;
        this.reposteroEncargado = reposteroEncargado;
        this.add(jefeTecnico);
        this.inventario = new HashSet<Lote>();
    }
}