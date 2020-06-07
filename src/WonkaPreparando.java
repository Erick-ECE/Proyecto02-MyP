public class WonkaPreparando implements Estado{
    Wonka maquina;
    public String nombre = "Preparando";

    //Constructor para Wonka Preparando
    WonkaPreparando(Wonka maquina){
        this.maquina = maquina;
    }
    //Método para la preparación de dulces
    public void preparaDulce(String dulce){
        maquina.dameEstadoActual();

        if(dulce == "Galleta Rellena" || dulce == "Galleta Salada" || dulce == "Galleta con Chispas"){
            maquina.setLotePreparado(maquina.galleneitorAdapter.prepararDulce(dulce));
        }
        else{
            maquina.setLotePreparado(maquina.prepararDulce(dulce));
        }

        maquina.asignarEstadoActual(maquina.getEstadoEmpacando());
        maquina.getEstadoActual().darLote(lotePreparado);
       
    }

    //Método no implementado en este estado
    public void empacarDulce(Lote lote){
        System.out.println("Aquí no puedo empacar, primero prepara un lote\n");
    }
    //Método no implementado en este estado
    public void darLote(Lote lote){
        System.out.println("Aquí no puedo entregar, primero prepara un lote\n");
    }

    //Método no implementado en este estado
    @Override
    public void reabastecer(Ingrediente ingrediente) {
        System.out.println("Primero termina de preparar\n");
    }

    //Método no implementado en este estado
    public void apagar(){
        System.out.println("Primero termino de preparar...\n");
    }

    public void getNombre(){
        System.out.println("Estado actual: Preparando\n");
    }
    
}