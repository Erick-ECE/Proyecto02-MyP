public interface Estado {
    Object preparaDulce(String dulce);
    void empacarDulce(Lote lote);
    Lote darLote(Lote lote);
    void reabastecer(Ingrediente ingrediente);
}