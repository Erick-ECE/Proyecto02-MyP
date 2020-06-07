public class WonkaApagado implements Estado{
    private Wonka maquina;
    public String nombre = "Apagado";

    WonkaApagado(Wonka maquina){
        this.maquina = maquina;
    }
    //Método no implementado en este estado
    public void preparaDulce(String dulce){
        System.out.println("Estoy apagado, enciéndeme\n");
    }
    //Método no implementado en este estado
    public void empacarDulce(Lote lote){
        System.out.println("Estoy apagado, enciéndeme\n");
    }
    //Método no implementado en este estado
    public void darLote(Lote lote){
        System.out.println("Estoy apagado, enciéndeme\n");
    }
    //Método no implementado en este estado
    public void reabastecer(Ingrediente ingrediente){
        System.out.println("Estoy apagado, enciéndeme\n");
    }
    //Método no implementado en este estado
    public void apagar(){
        System.out.println("Ya estoy apagado, enciéndeme\n");
    }
}