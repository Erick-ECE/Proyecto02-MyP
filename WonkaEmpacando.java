public class WonkaEmpacando implements Estado{
    Wonka maquina;

    WonkaEmpacando(Wonka maquina){
        this.maquina = maquina;
    }
    //Método no implementado en este estado
    void preparaDulce(String dulce){
        System.out.println("Ya preparé, aqui solo puedo empacar y enviar pedidos\n");
    }
    //Método para empacar lotes de dulces
    void empacarDulce(Lote lote){
        System.out.println("Empacando lote...\n");
    }
    //Método para entregar lotes a sucursales por medio de repartidores
    void darLote(Lote lote){
        /*
        * TODO
        */
    }
    //Método no implementado en este estado
    void reabastecer(Ingrediente ingrediente){
        System.out.println("Ya reabastecí, aqui solo puedo empacar y enviar pedidos\n");
    }
    //Método no implementado en este estado
    void apagar(){
        System.out.println("No me puedo pagar mientras empaco...\n");
    }
}