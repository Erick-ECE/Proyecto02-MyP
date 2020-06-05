/**
* Interfaz Subject. Es utilizada en el patron Observer. 
* @author Daniel Villegas $ Erick Castro & Ricardo Desales 
* @version Junio 2020 
*/

public interface Subject {

    //Método para agregar un observador
    public static add(Object o);
    //Método para eliminar un observador
    public static remove(Object o);
    //Método que realiza la notificación al observador
    public static notify(Object o); 
}

