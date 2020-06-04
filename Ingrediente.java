public class Ingrediente {
    String nombre;
    int cantidad;

    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void nuevaCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public void mostrar(){
        System.out.printf("ingrediente: %s \n cantidad: %d", nombre,cantidad);
    }
    
}