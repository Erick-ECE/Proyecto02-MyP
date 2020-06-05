/**
* SucursalProxy. Clase  para el modelamiento del proxy entre el  * jefe técnico y las sucursales.
* @author Daniel Villegas & Erick Castro & Ricardo Desales
* @version Junio 2020
*/

public class SucursalProxy implements InterfazConsulta{
    //Sucursal con la que realiza la conexión 
    Sucursal suc; 

    /**
     * Constructor
     * @param s La Sucursal
     */
    public SucursalProxy(Sucursal s) {suc = s }

    /**
     * Método de la interfaz 
     * @param tipoDeDulce La descripcion del tipo de dulce que 
     * se desea buscar
     */
    public int consultarInventario(String tipoDeDulce) {
        s.consultarInventario(tipoDeDulce);
    }



} 