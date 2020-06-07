public class GalleneitorAdapter implements Preparacion {
    public Galleneitor galleneitor;


    public GalleneitorAdapter(Galleneitor galleneitor){
        this.galleneitor = galleneitor;
    }

    @Override
    public void eligeMolde(String molde){
        System.out.println("Molde de galleta generico");

    }

    @Override
    public void poneMezcla(){
       System.out.println("Mezcla Galleta");
    }

    @Override
    public void ingredientesExtra(String dulce){
        System.out.println("Sin ingredientes extra");
    }

    public Lote prepararDulce(String p) {
        Lote l = new Lote(maquina.prepararDulce(p));
        return l;
    }
}