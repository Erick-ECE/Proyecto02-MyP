import java.util.*;
/**
* Repartidor. Esta clase será la encargada de entregar los lotes 
* fabricados a las sucursales que los solicitan
*
*/

public class Repartidor {

    //id del repartidor
    private int id;
    //RFC del repartidor
    private String rfc;
    //Nombre del repartidor
    private String nombre;
    //Referencia a las sucursales
    private ArrayList<Sucursal> sucursales;

    /**
     * Constructor de la clase
     * @param id Id del repartidor
     * @param rfc RFC del repartidor
     * @param nombre Nombre del repartidor
     */
    public Repartidor(int id, String rfc, String nombre,
    ArrayList<Sucursal> sucursales ) {
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre; 
        this.sucursales = sucursales;
    }

    /**
     * Método que regresa el id del repartidor
     * @return id 
     */
    public int getId() { return id; }

    /**
     * Método que reparte un pedido de lotes a una sucursal
     * @param pedido El pedido realizado
     * @param id El id de la sucursal
     */
    public void repartir(ArrayList<Lote> pedido, int id) {
        Sucursal s = null;
        //Encontramos la sucursal
        for(Sucursal d : sucursales) {
            if(d.getId() == id) {
                s = d;
                break;
            }
        }
        //Encontró la tienda
        System.out.println("Sucursal: "+ id+ "recibiendo pedido...\n" );
        System.out.println("Actualizando inventario...\n");
        for(Lote l : pedido){
            s.agregarLote(l);
            System.out.println("Lote de tipo"+ l.getTipo());
        }
        System.out.println("Pedido entregado con éxito.");
    }
    
    /**
     * Método que regresa la información del repartidor
     */
    public void getInformacion(){
        System.out.println("Nombre: "+nombre+"\n"+"ID: "+ id +"\n" + 
                            "RFC: "+rfc+"\n");
    }

    @Override
    public String toString() {
        return "Repartidor [id=" + id + ", nombre=" + nombre + ", rfc=" + rfc + ", sucursales=" + sucursales + "]";
    }

    
}