public class WonkaPreparando implements Estado{
    Wonka maquina;


    //Constructor para Wonka Preparando
    WonkaPreparando(Wonka maquina){
        this.maquina = maquina;
    }
    //Método para la preparación de dulces
    public void preparaDulce(String dulce){

        maquina.validarPedido(dulce);

        if(dulce == "Galleta Rellena" || dulce == "Galleta Salada" || dulce == "Galleta con Chispas"){
            maquina.galleneitorAdapter.prepararDulce(dulce);
        }
        else{
            maquina.prepararDulce(dulce);
        }
       
    }

    //Método no implementado en este estado
    public void empacarDulce(Lote lote){
        System.out.println("Aquí no puedo empacar, primero prepara un lote\n");
    }
    //Método no implementado en este estado
    public void darLote(Lote lote){
        System.out.println("Aquí no puedo entregar, primero prepara un lote\n");
    }

    //Método para reabastecer en bodega en caso de que un ingrediente sea insuficiente
    @Override
    public void reabastecer(Ingrediente ingrediente) {
        // TODO Auto-generated method stub

    }

    //Método no implementado en este estado
    public void apagar(){
        System.out.println("Primero termino de preparar...\n");
    }

    
}