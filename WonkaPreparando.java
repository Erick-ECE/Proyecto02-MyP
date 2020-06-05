public class WonkaPreparando implements Estado{
    Wonka maquina;

    //Constructor para Wonka Preparando
    WonkaPreparando(Wonka maquina){
        this.maquina = maquina;
    }
    //Método para la preparación de dulces
    void preparaDulce(String dulce){
        /*
        * TODO
        */
    }
    //Método no implementado en este estado
    void empacarDulce(Lote lote){
        System.out.println("Aquí no puedo empacar, primero prepara un lote\n");
    }
    //Método no implementado en este estado
    void darLote(Lote lote){
        System.out.println("Aquí no puedo entregar, primero prepara un lote\n");
    }
    //Método para reabastecer en bodega en caso de que un ingrediente sea insuficiente
    void reabastecer(Ingrediente ingrediente){

    }
    //Método no implementado en este estado
    void apagar(){
        System.out.println("Primero termino de preparar...\n");
    }
}