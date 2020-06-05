/*
* Interfaz Estado para los estados de la Factory
*/
public interface Estado {
    //Método para la preparación de dulces
    void preparaDulce(String dulce);
    //Método para el empacado de dulces
    void empacarDulce(Lote lote);
    //Método para entregar lote al repartidor
    void darLote(Lote lote);
    //Método para mandar reabastecer un ingrediente si no se cuenta con lo suficiente
    void reabastecer(Ingrediente ingrediente);
    //Método para apagar la máquina
    void apagar();
}