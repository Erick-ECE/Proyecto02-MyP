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

    /**
     * Constructor de la clase
     * @param id Id del repartidor
     * @param rfc RFC del repartidor
     * @param nombre Nombre del repartidor
     */
    public Repartidor(int id, String rfc, String nombre) {
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre; 
    }

    /**
     * Método que regresa el id del repartidor
     * @return id 
     */
    public int getId() { return id; }
    
    /**
     * Método que regresa la información del repartidor
     */
    public void getInformacion(){
        System.out.println("Nombre: "+nombre+"\n"+"ID: "+ id +"\n" + 
                            "RFC: "+rfc+"\n");
    }

}