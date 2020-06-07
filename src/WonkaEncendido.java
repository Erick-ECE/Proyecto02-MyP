public class WonkaEncendido implements Estado{
    private Wonka maquina;
    public String nombre = "Encendido";

    public WonkaEncendido(Wonka maquina){
        this.maquina = maquina;
    }
    //Método que cambia de encendido a estado de preparar
    public void preparaDulce(String dulce){
        maquina.dameEstadoActual();
        maquina.asignarEstadoActual(maquina.getEstadoPreparando());
        maquina.getEstadoActual().preparaDulce(dulce);
    }
    //Método no implementado en este estado
    public void empacarDulce(Lote lote){
        System.out.println("No puedo empacar ahora\n");
    }
    //Método no implementado en este estado
    public void darLote(Lote lote){
        System.out.println("No tengo nada que entregar...\n");
    }
    
    //Método para reabastecer en bodega en caso de que un ingrediente sea insuficiente
    public void reabastecer(Ingrediente ingrediente){
        maquina.dameEstadoActual();
        while(almacen.getCantidadDeIngrediente(i.getNombre())<i.getCantidad()){
            System.out.println("No se cuenta con suficiente "+i.getNombre()+
                                " para la receta...");
            almacen.reabastecerIngrediente(i.getNombre());
        }
    }
    //Método no implementado en este estado
    public void apagar(){
        System.out.println("Apagando máquina...\n");
        maquina.asignarEstadoActual(maquina.getEstadoApagado());
    }

    public void getNombre(){
        System.out.println("Estado actual: Encendido\n");
    }
}