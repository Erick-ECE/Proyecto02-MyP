public class WonkaApagado implements Estado{
    Wonka maquina;

    WonkaApagado(Wonka maquina){
        this.maquina = maquina;
    }
    //Método no implementado en este estado
    void preparaDulce(String dulce){
        System.out.println("Estoy apagado, enciéndeme\n");
    }
    //Método no implementado en este estado
    void empacarDulce(Lote lote){
        System.out.println("Estoy apagado, enciéndeme\n");
    }
    //Método no implementado en este estado
    void darLote(Lote lote){
        System.out.println("Estoy apagado, enciéndeme\n");
    }
    //Método no implementado en este estado
    void reabastecer(Ingrediente ingrediente){
        System.out.println("Estoy apagado, enciéndeme\n");
    }
    //Método no implementado en este estado
    void apagar(){
        System.out.println("Ya estoy apagado, enciéndeme\n");
    }
}