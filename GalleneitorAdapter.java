public class GalleneitorAdapter implements Preparacion {
    public Galleneitor maquina;


    public GalleneitorAdapter(Galleneitor maquina){
        this.maquina = maquina;
    }

    @Override
    public void eligeMolde(){
        System.out.println("Molde de galleta generico");

    }

    @Override
    public void poneMezcla(){
       System.out.println("Mezcla Galleta");
    }

    @Override
    public void ingredientesExtra(){
        System.out.println("Sin ingredientes extra");
    }

    public Lote prepararDulce(String p) {
        Lote l = new Lote(maquina.prepararDulce(p));
        return l;
    }
}