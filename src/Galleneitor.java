//recibe la masa sin cocinar y debe cocinarse, 
//no tienen moldes distintos pues todas las galletas son redondas, y 
//las galletas con chispas se cocinan con las chispas en la masa sin ingredientes extra
public class Galleneitor {
    Galleta g; // galleta a preparar

    public Galleneitor() {
    } 

    public String prepararDulce(String p) {
        prepararMasa(p);
        hornearGalleta(p);
        switch (p) {
            case "Galleta Mermelada":
                Galleta g = new GalletaMermelada();
                return g.tipo;

            case "Galleta Rellena":
                Galleta g1 = new GalletaRellena();
                return g1.tipo;
        
            case "Galleta Salada":
                Galleta g2 = new GalletaSalada();
                return g2.tipo;
            case "Galleta con Chispas":
            Galleta g3 = new GalleteConChispas();
            return g3.tipo;

            default:
                System.out.println("Tipo de Galleta no registrado");
                return "Error galleta tipo";
                
        }
    } 

    
    public void prepararMasa(String p){
        System.out.println("Preparando masa de "+ p);
    }

    public void hornearGalleta(String p){
        System.out.println("Horneando "+ p);

    }

    

}