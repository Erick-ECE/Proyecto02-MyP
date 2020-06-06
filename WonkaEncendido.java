public class WonkaEncendido implements Estado{
    private Wonka maquina;

    public WonkaEncendido(Wonka maquina){
        this.maquina = maquina;
    }
    //Método que cambia de encendido a estado de preparar
    public void preparaDulce(String dulce){
        maquina.asignarEstadoActual(getEstadoPreparando());
        /*
        * REVISAR CAMBIO DE ESTADO Y PREPARACIÓN
        ////PSEUDOCODIGO///
                    compruebaDisp = checaIngredientes(String dulce)
                    if(compruebaDisp){
                        maquina.preparaDulce(String dulce)
                    }else{
                        reabastecer(...)
                    }
        ////PSEUDOCODIGO///
        */
    }
    //Método no implementado en este estado
    public void empacarDulce(Lote lote){
        System.out.println("No puedo empacar ahora\n");
    }
    //Método no implementado en este estado
    public void darLote(Lote lote){
        System.out.println("No tengo nada que entregar...\n");
    }
    //Método no implementado en este estado
    public void reabastecer(Ingrediente ingrediente){
        System.out.println("Primero escoge un dulce\n");
    }
    //Método no implementado en este estado
    public void apagar(){
        System.out.println("Apagando máquina...\n");
        maquina.asignarEstadoActual(getEstadoApagado());
    }
}