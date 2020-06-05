import java.util.ArrayList;
import java.util.Random;

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
    
    //Objeto random
    Random rnd; 
    //Repartidores que podrán realizar las entregas
    private ArrayList<Repartidor> repartidores; // INICIA CON 7
    //Proxys de las sucursales para revisar sus inventarios
    private ArrayList<SucursalProxy> sucursalProxys; 
    //Referencia a la máquina wonka que utiliza
    Wonka wonka;


    //suponiendo que lo que se tiene que construir ya lo está
    
    /**
     * Método que recibe el pedido pedido que se va a procesar
     * @param pedido Cadena con el pedido
     */
    public void recibirPedido(ArrayList<String> pedido, int id) {
        
        ArrayList<Lote> pedidoTotal = new ArrayList<>();

        //Obtenemos el proxy
        SucursalProxy proxy = null;
        for(SucursalProxy sp : sucursalProxys){
            if (sp.getId() ==id)
                proxy = sp;
        }

        for(String p : pedido ){
            if (proxy.consultarInventario(p) == 0) {
                //No hay, entonces preparas
                if (wonka.validarPedido(p)) {
                    pedidoTotal.add(wonka.prepararDulce(p));
                } else {
                    System.out.println("Tienes, pa que quieres \n");
                }
            }
        }
    }

    /**
     * Método de la interfaz
     * @param o 
     */
    public void update(ArrayList<String> pedido, int id) {
        recibirPedido(pedido, id);
    }
} 