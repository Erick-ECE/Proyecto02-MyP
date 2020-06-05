import java.util.Collection; 
/**
* Sucursal. Clase para modelar una sucursal.
* @author Daniel Villegas & Erick Castro & Ricardo Desales
* @version Junio 2020
*/

public class Sucursal implements InterfazConsulta {

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
    Sucursal(int id, String direccion, String reposteroEncargado, 
            String jefeTecnico) {
        this.id = id;
        this. direccion = direccion;
        this.reposteroEncargado = reposteroEncargado;
        this.jefeTecnico = jefeTecnico; 
    }

    /**
     * Método que regresa el id de la sucursal
     * @return id 
     */
    public int getId( return id ;)

    /**
     * Método que realiza un pedido
     * @param pedido La cadena con el pedido 
     */
    public void realizarPedido(String pedido) {
        jefeTecnico.recibirPedido(pedido);
    }

    /**
     * Método que regresa la información de la sucursal
     */
    public void getInformacion() {}


}