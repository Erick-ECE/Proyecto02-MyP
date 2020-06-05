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
        maquina.prepararMasa();
        maquina.hornearGalleta();
    }

    @Override
    public void ingredientesExtra(){
        System.out.println("Sin ingredientes extra");
    }
}