public class Ingrediente {
    String nombre;
    int cantidad;

    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    /*
    public void nuevaCantidad(int cantidad){
        this.cantidad = cantidad;
    }*/

    /**
     * Método que disminuye la cantidad de un ingrediente
     * @param c La cantidad del ingrediente a disminuir. Si se llega a 
     * cantidad cero, el ingrediente ya está en cero, se imprime una
     * leyenda
     */
    public void disminuirCantidad(int c){ 
        if (cantidad == 0 || c > cantidad || c == cantidad) {
            System.out.println("Ingrediente en Cero");//SI va aquí????
        }else{
            cantidad -= c;
        } 
    }
    /**
     * Método que aumenta la cantidad del ingrediente
     * @param c La cantidad a sumar del ingrediente
     */
    public void aumentarCantidad(int c){
        cantidad += c;
    }
    
    /**
     * Método que muestra la información del ingrediente 
     */
    public void mostrar(){
        System.out.printf("ingrediente: %s \n cantidad: %d", nombre,cantidad);
    }
    
}