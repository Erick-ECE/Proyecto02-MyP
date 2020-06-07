import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * DulceriaRosa
 */
public class DulceriaRosa {

    public static void main(String[] args) {

        char v = 92;
        System.out.println("\n"+
        "(    "+v+"/ )( "+v+"(  )   / __)(  __)/ ___)\n"+
        " ) D () "+v+"/ (/ (_/"+v+"( (__  ) _) "+v+"___ "+v+" \n"+
       "(____/"+v+"____/"+v+"____/ "+v+"___)(____)(____/ \n"+
       "     ____   __   ____   __           \n"+
        "    (  _ "+v+" /  "+v+" / ___) / _"+v+"         \n"+
        "     )   /(  O )"+v+"___ "+v+"/    "+v+"        \n"+
        "    (__"+v+"_) "+v+"__/ (____/"+v+"_/"+v+"_/  \n");
        
        Wonka wonka = new Wonka(new GalleneitorAdapter(new Galleneitor()));
        JefeTecnico jefetecnico = new JefeTecnico(wonka);
        Sucursal suc1 = new Sucursal(1,"Tlalnepantla", "Erick", jefetecnico);
        suc1.setInventario(new ArrayList<Lote>());
        Sucursal suc2 = new Sucursal(2,"Iztacalco", "Ricardo", jefetecnico);
        suc2.setInventario(new LinkedList<Lote>());
        Sucursal suc3 = new Sucursal(3,"Naucalpan", "Daniel", jefetecnico);
        suc3.setInventario(new HashSet<Lote>());
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        SucursalProxy s1 = new SucursalProxy(suc1);
        SucursalProxy s2 = new SucursalProxy(suc2);
        SucursalProxy s3 = new SucursalProxy(suc3);
        jefetecnico.agregaProxys(s1);
        jefetecnico.agregaProxys(s2);
        jefetecnico.agregaProxys(s3);

        sucursales.add(suc1);
        sucursales.add(suc2);
        sucursales.add(suc3);

        Repartidor r1 = new Repartidor(1, "caeehdfssr04", "Juan", sucursales);
        Repartidor r2 = new Repartidor(2, "cafggsfsaasd2", "Salvador", sucursales);
        Repartidor r3 = new Repartidor(3, "rwtqwtwqsr04", "Pedro", sucursales);
        
        jefetecnico.contrataRepartidor(r1);
        jefetecnico.contrataRepartidor(r2);
        jefetecnico.contrataRepartidor(r3);

        jefetecnico.agregaProxys(s1);
        jefetecnico.agregaProxys(s2);
        jefetecnico.agregaProxys(s3);

        Ingrediente almendras = new Ingrediente("almendras", 5000);
        Ingrediente cacao = new Ingrediente("cacao", 5000);
        Ingrediente leche = new Ingrediente("leche", 5000);
        Ingrediente mantecaCacao = new Ingrediente("manteca de cacao", 5000);
        Ingrediente grenetina = new Ingrediente("Grenetina", 5000);
        Ingrediente Agua = new Ingrediente("Agua", 5000);
        Ingrediente mielMaiz = new Ingrediente("Miel de maiz", 5000);
        Ingrediente azucar = new Ingrediente("azucar", 5000);
        Ingrediente saborizante = new Ingrediente("saborizante acido", 5000);
        Ingrediente chamoy = new Ingrediente("Chamoy", 5000);
        Ingrediente harina = new Ingrediente("harina", 5000);
        Ingrediente huevo = new Ingrediente("Huevo", 5000);
        Ingrediente sal = new Ingrediente("Sal", 5000);
        Ingrediente chispas = new Ingrediente("Chispas", 5000);
        Ingrediente mermelada = new Ingrediente("Mermelada", 5000);

        wonka.getAlmacen().agregarIngrediente(almendras);
        wonka.getAlmacen().agregarIngrediente(cacao);
        wonka.getAlmacen().agregarIngrediente(leche);
        wonka.getAlmacen().agregarIngrediente(mantecaCacao);
        wonka.getAlmacen().agregarIngrediente(grenetina);
        wonka.getAlmacen().agregarIngrediente(Agua);
        wonka.getAlmacen().agregarIngrediente(mielMaiz);
        wonka.getAlmacen().agregarIngrediente(azucar);
        wonka.getAlmacen().agregarIngrediente(saborizante);
        wonka.getAlmacen().agregarIngrediente(chamoy);
        wonka.getAlmacen().agregarIngrediente(harina);
        wonka.getAlmacen().agregarIngrediente(huevo);
        wonka.getAlmacen().agregarIngrediente(sal);
        wonka.getAlmacen().agregarIngrediente(chispas);
        wonka.getAlmacen().agregarIngrediente(mermelada);
         

        ArrayList<String> pedido1 = new ArrayList<>();
            pedido1.add("Galleta Salada");
            pedido1.add("Frutas Chamoy");
            pedido1.add("Ositos Dulces");
        
        ArrayList<String> pedido2 = new ArrayList<>();
            pedido2.add("Frutas Chamoy");
            pedido2.add("Ositos Dulces");
            pedido2.add("Chocolate con almendras");

        ArrayList<String> pedido3 = new ArrayList<>();
            pedido3.add("Galleta Rellena");
            pedido3.add("Gusanos Acidos");
            
        //System.out.println(suc1.getInventario()==null);
        // sucursal 1 realiza el primer pedido
        suc1.notify(pedido1);
        // sucursal 2 realisa el segundo pedido
        suc2.notify(pedido2);
        // 3ra sucursal realiza su pedido
        suc3.notify(pedido3);

        suc1.notify(pedido1); // sucursal 1 vuelve a pedir lo mismo

        suc2.notify(pedido3);

        suc1.getInformacion();
        suc2.getInformacion();
        suc3.getInformacion();

       
    }
}