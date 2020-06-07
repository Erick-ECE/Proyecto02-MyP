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
    private Repartidor[] repartidores; // INICIA CON 7
    //Proxys de las sucursales para revisar sus inventarios
    private ArrayList<SucursalProxy> sucursalProxys; 
    //Referencia a la máquina wonka que utiliza
    Wonka wonka;

    /**
     * Constructor jefe tecnico
     */
    public JefeTecnico(Wonka wonka) {
        this.wonka = wonka;
        this.repartidores = new Repartidor[10];
        this.wonka.asignarEstadoActual(wonka.getEstadoEncendido());
        this.wonka.dameEstadoActual();
    }


    public JefeTecnico(Wonka wonka, ArrayList<SucursalProxy> sucursalProxys ) {
        this.wonka = wonka;
        this.sucursalProxys = sucursalProxys;
        this.repartidores = new Repartidor[10];
        this.wonka.asignarEstadoActual(wonka.getEstadoEncendido());
        this.wonka.dameEstadoActual();
    }

    public void agregaProxys(SucursalProxy sucursal){
        this.sucursalProxys.add(sucursal);
    }
    
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
                wonka.validarPedido(p);
                wonka.getEstadoActual().preparaDulce(p);
                pedidoTotal.add(wonka.getLotePreparado());
                wonka.setLotePreparado(new Lote(""));
            } else {
                System.out.println("Tienes, pa que quieres \n");
            }
        }

        this.asignarReparticiones(pedidoTotal, id, this.getRepartidores());
    }

    

    /**
     * 
     * @param pedido El pedido que se desea repartir
     * @param id El id de la sucursar a la cual se enviará el pedido
     * @param repartidores Los repartidores posibles
     */
    public void asignarReparticiones(ArrayList<Lote> pedido, int id, 
    Repartidor[] repartidores){
        int carro = rnd.nextInt(100);
        //Revisar elección de repartidor no null
        Repartidor r = null;
        while (r == null){
            r = repartidores[rnd.nextInt(10)];
        }
        System.out.println("Datos de la entrega: \n Repartidor: "+r+ 
        "\nNúmero de camión: "+ carro+"\n ID de sucursal destino: "+ id);
        r.repartir(pedido,id);
    }

    /**
     * Método que contrata un repartidor. Este es asignado en alguno de 
     * los espacios disponibles del arreglo de repartidores. 
     * @param r
     */
    public void contrataRepartidor(Repartidor r) {
        for(int i = 0; i < 10 ; i++){
            if(repartidores[i] == null){
                repartidores[i] = r;
                System.out.println("Repartidor contratado.");
                return;
            }
        }
        System.out.println("no hay vacantes");
    }

    /**
     * Método de la interfaz
     * @param pedido Las cadenas con los pedidos
     * @param id El id de la sucursal  
     */
    @Override 
    public void update(ArrayList<String> pedido, int id) {
        recibirPedido(pedido, id);
    }

    public Repartidor[] getRepartidores() {
        return repartidores;
    }

    
} 