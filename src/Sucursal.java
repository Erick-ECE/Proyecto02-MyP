import java.util.Collection; 
import java.util.ArrayList;
/**
* Sucursal. Clase para modelar una sucursal abstracta.
* @author Daniel Villegas & Erick Castro & Ricardo Desales
* @version Junio 2020
*/

public abstract class Sucursal implements Subject, InterfazConsulta{

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
    
    Sucursal(){    }

    Sucursal(int id, String direccion, String reposteroEncargado, 
              JefeTecnico jefeTecnico) {
          this.id = id;
          this. direccion = direccion;
          this.reposteroEncargado = reposteroEncargado;
          this.add(jefeTecnico);
   
     }

    /**
     * Método que regresa el id de la sucursal
     * @return id 
     */
    public int getId(){ return id ;}

    /**
     * Método que realiza un pedido
     * @param pedido La cadena con el pedido 
     */
    public void realizarPedido(ArrayList<String> pedido) {
        jefeTecnico.recibirPedido(pedido,id);
    }

     @Override
     public int consultarInventario(String tipo) {
         // TODO Auto-generated method stub
         int c = 0;
         if(this.inventario.isEmpty()){
             return 0;
         }
         for (Lote l : this.inventario) {
             if(l.getTipo().equals(tipo))
                 c++;
         }
         return c;
     }

    /**
     * Método que regresa la información de la sucursal
     */
    public void getInformacion() {
        System.out.println("ID: " + id + "\n"+"Dirección: "+ direccion +
        "\n" + "Repostero encargado: "+ reposteroEncargado+ "\n " );
        
        // imprime el inventario
        for (Lote l : inventario) {
            System.out.println(l);
        }
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

    /**
    * * Método de la interfaz
     * Método para eliminar un observador
     * No se sobreescribe porque solo tiene un observador 
     */
   public void remove(Object o){}

    /**
    * * Método de la interfaz
     * Método que realiza la notificación al observador
     * No se sobreescribe porque solo tiene un observador 
     */
   @Override
   public void notify(ArrayList<String> o){
        this.realizarPedido(o);
   }

   public Collection<Lote> getInventario() {
       return inventario;
   }

   public void setInventario(Collection<Lote> inventario) {
       this.inventario = inventario;
   }

   

}