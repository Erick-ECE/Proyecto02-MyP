public class Lote {
    String tipo;

    public Lote(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Lote [tipo=" + tipo + "]";
    }
    
}