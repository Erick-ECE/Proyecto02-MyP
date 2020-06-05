/**
* SucursalProxy. Clase  para el modelamiento del proxy entre el  * jefe técnico y las sucursales.
* @author Daniel Villegas & Erick Castro & Ricardo Desales
* @version Junio 2020
*/

public class SucursalProxy implements InterfazConsulta{
    //Sucursal con la que realiza la conexión 
    Sucursal sucursal; 

    /**
     * Constructor
     * @param s La Sucursal
     */
    public SucursalProxy{Sucursal sucursal) {this.sucursal = sucursal; }

    /**
     * Método que regresa el id de la sucursal a la que hace referencia el
     * el peoxy
     * @return id 
     */
    public int getId(){ return sucursal.getId(); }

    /**
     * Método de la interfaz 
     * @param tipoDeDulce La descripcion del tipo de dulce que 
     * se desea buscar
     */
    public int consultarInventario(final String tipoDeDulce) {
        sucursal.consultarInventario(tipoDeDulce);
    }



} 