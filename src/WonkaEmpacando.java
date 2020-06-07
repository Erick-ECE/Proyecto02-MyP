public class WonkaEmpacando implements Estado{
    
    private Wonka maquina;

    /**
     * Constructor del estado
     * @param maquina Referencia a la máquina
     */
    public WonkaEmpacando(Wonka maquina){
        this.maquina = maquina;
    }

    //Método no implementado en este estado
    public void preparaDulce(String dulce){
        System.out.println("Ya preparé, aqui solo puedo empacar y enviar pedidos\n");
    }
    //Método para empacar lotes de dulces
    public void empacarDulce(Lote lote){
        System.out.println("Empacando lote...\n");
    }
    //Método para entregar lotes a sucursales por medio de repartidores
    public void darLote(Lote lote){
        /*
        * TODO
        */
    }
    //Método no implementado en este estado
    public void reabastecer(Ingrediente ingrediente){
        System.out.println("Ya reabastecí, aqui solo puedo empacar y enviar pedidos\n");
    }
    //Método no implementado en este estado
    public void apagar(){
        System.out.println("No me puedo pagar mientras empaco...\n");
    }
}