import java.util.Scanner;

/**
 * DulceriaRosa
 */
public class DulceriaRosa {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion;
        
        char v = 92;
        System.out.println("\n"+
        "(    "+v+"/ )( "+v+"(  )   / __)(  __)/ ___)\n"+
        " ) D () "+v+"/ (/ (_/"+v+"( (__  ) _) "+v+"___ "+v+" \n"+
       "(____/"+v+"____/"+v+"____/ "+v+"___)(____)(____/ \n"+
       "     ____   __   ____   __           \n"+
        "    (  _ "+v+" /  "+v+" / ___) / _"+v+"         \n"+
        "     )   /(  O )"+v+"___ "+v+"/    "+v+"        \n"+
        "    (__"+v+"_) "+v+"__/ (____/"+v+"_/"+v+"_/  \n");

        System.out.println("Bienvenido! ¿Que desea hacer?");
        System.out.println("1. Preparar Gomitas  "+
                           "2. Preparar Chocolate "+
                           "3. Preparar Galletas "+
                           "4. Consutar " );


        opcion = s.nextInt();
        switch (opcion) {
            case 1:
                // llamamos wonka 3000 preparamos gomitas
                break;
            
            case 2 :
                // llamamos wonka 3000 preparamos chocolate
                break;

            case 3:
            // TODO
                break;
            case 4:
            // TODO
                break;
                
            default:
                break;
        }


        /**
         * TODO
         * aqui se crea jefe tecnico
         * Se crea Sucursal 1, 2 y 3
         * Se crean Repatidores y se agregan a JT
         * Se agregan Proxys de sucursales a JT
         * asignas proxys a sucursales y proxys a JT
         * Se agregan ingredientes con cantidades iniciales
         * Se crea Wonka, Galleinator, Adapter y se vinculan a JT
         * Se crean los pedidos de cada sucursal
         * y
         * se hacen los pasos de una simulación con los casos pedidos en el documento
        */

        s.close();
    }
}