/*
* Interfaz Estado para los estados de la Factory
*/
public interface Estado {
    //Método para la preparación de dulces
    public void preparaDulce(String dulce);
    //Método para el empacado de dulces
    public void empacarDulce(Lote lote);
    //Método para entregar lote al repartidor
    public void darLote(Lote lote);
    //Método para mandar reabastecer un ingrediente si no se cuenta con lo suficiente
    public void reabastecer(Ingrediente ingrediente);
    //Método para apagar la máquina
    public void apagar();
    // metodo para regresar el nombre del estado actual
    public void getNombre();
}