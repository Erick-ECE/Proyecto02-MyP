import java.util.ArrayList;

/**
* JefeTecnico Clase que modela el jefe técnico del sistema 
* Este ente está encargado de la interacción de la máquina para
* preparar dulces y las sucursales. Cuando una máquina se queda sin 
* recursos, este ente es el encargado de surtir el amancen. 
* Cuando una sucursal realiza un pedido, este ente es el encargado
* de procesar su pedido. Cuando existen ingredientes isuficientes, 
* éste ente los resurte.
* @author Daniel Villegas & Erick Castro & Ricardo Desales  
*/

public class JefeTecnico implements Observer {
    
    //Repartidores que podrán realizar las entregas
    private ArrayList<Repartidor> repartidores;
    //Proxys de las sucursales para revisar sus inventarios
    private ArrayList<SucursalProxy> sucursalProxys; 
    //Referencia a la máquina wonka que utiliza
    Wonka wonka;

    /**
     * Constructor 
     * @param repartidores Los
     */


}