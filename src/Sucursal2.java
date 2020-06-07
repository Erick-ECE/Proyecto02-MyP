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
    Sucursal(int id, String direccion, String reposteroEncargado, 
            JefeTecnico jefeTecnico) {
        this.id = id;
        this. direccion = direccion;
        this.reposteroEncargado = reposteroEncargado;
        this.add(jefeTecnico);
        this.inventario = new LinkedList<Lote>();
    }

    @Override
    public int consultarInventario(String tipo) {
        // TODO Auto-generated method stub
        int c = 0;
        for (Lote l : inventario) {
            if(l.getTipo().equals(tipo))
                c++;
        }
        return c;
    }

    /**
     * @param lote Lote que se agregará al inventario
     */
   public void agregarLote(Lote lote) {
       inventario.add(lote);
   }

    /**
    * * Método de la interfaz
     * Método para agregar un observador
     * No se sobreescribe porque solo tiene un observador 
     */
    @Override
    public void add(JefeTecnico jefeTecnico){
        this.jefeTecnico = jefeTecnico; 
    }
  
}