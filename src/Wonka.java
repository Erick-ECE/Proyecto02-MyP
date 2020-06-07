import java.util.ArrayList;

public class Wonka implements Preparacion{
    //Estado apagado
    private Estado apagado;
    //Estado encendido
    private Estado encendido;
    //Estado de preparación
    private Estado preparando;
    //Estado de empaque
    private Estado empacando;
    //El estado actual de la máquina
    private Estado estadoActual;
    //El recetario de la mñáquina
    private ArrayList<Receta> recetario;
    //Referencia al almacen
    private Almacen almacen;
    //Referencia al adaptador  
    public GalleneitorAdapter galleneitorAdapter;

  /*
  *Constructor para Wonka. Construye la máquina con sus estados 
  * y también el recetario. 
	*/
	public Wonka(GalleneitorAdapter galleneitorAdapter){
    apagado = new WonkaApagado(this);
    encendido = new WonkaEncendido(this);
    preparando = new WonkaPreparando(this);
    empacando = new WonkaEmpacando(this);
    estadoActual = apagado;
    recetario = new ArrayList<>(); //Este es el recetario 
    this.galleneitorAdapter = galleneitorAdapter;

    // Se guardan las recetas en el recetario de la máquina
    ArrayList<Ingrediente> chocoLeche = new ArrayList<>();
    chocoLeche.add(new Ingrediente("manteca de cacao", 15));
    chocoLeche.add(new Ingrediente("azucar", 10));
    chocoLeche.add(new Ingrediente("leche", 15));
    Receta chocolateConLeche = new Receta("Chocolate con leche", chocoLeche);

    ArrayList<Ingrediente> chocoObs = new ArrayList<>();
    chocoObs.add(new Ingrediente("manteca de cacao", 35));
    chocoObs.add(new Ingrediente("azucar", 8));
    chocoObs.add(new Ingrediente("cacao", 25));
    Receta chocolateObscuro = new Receta("Chocolate Obscuro", chocoObs);

    ArrayList<Ingrediente> chocAlmen = new ArrayList<>();
    chocAlmen.add(new Ingrediente("manteca de cacao", 35));
    chocAlmen.add(new Ingrediente("azucar", 8));
    chocAlmen.add(new Ingrediente("almendras", 5));
    Receta chocolateConAlmendras = new Receta("Chocolate con almendras", chocAlmen);
    /*----------------------------------------------------*/
    recetario.add(chocolateConAlmendras);
    recetario.add(chocolateConLeche);
    recetario.add(chocolateObscuro);
    /*----------------------------------------------------*/
    ArrayList<Ingrediente> ositoDulce = new ArrayList<>();
    ositoDulce.add(new Ingrediente("Agua", 10));
    ositoDulce.add(new Ingrediente("Grenetina", 7));
    ositoDulce.add(new Ingrediente("Miel de maiz", 5));
    Receta ositosDulces = new Receta("Ositos Dulces", ositoDulce);

    ArrayList<Ingrediente> gusanoAcido = new ArrayList<>();
    gusanoAcido.add(new Ingrediente("Agua", 12));
    gusanoAcido.add(new Ingrediente("Grenetina", 8));
    gusanoAcido.add(new Ingrediente("saborizante acido", 6));
    Receta gusanosAcidos = new Receta("Gusanos Acidos", gusanoAcido);

    ArrayList<Ingrediente> frutaChamoy = new ArrayList<>();
    frutaChamoy.add(new Ingrediente("Agua", 10));
    frutaChamoy.add(new Ingrediente("Grenetina", 6));
    frutaChamoy.add(new Ingrediente("Chamoy", 9));
    Receta frutasConChamoy = new Receta("Frutas Chamoy", frutaChamoy);
    /*------------------------------------------------------*/
    recetario.add(ositosDulces);
    recetario.add(gusanosAcidos);
    recetario.add(frutasConChamoy);
    /*-------------------------------------------------------*/

    ArrayList<Ingrediente> gallSaladas = new ArrayList<>();
    gallSaladas.add(new Ingrediente("Harina", 20));
    gallSaladas.add(new Ingrediente("Agua", 10));
    gallSaladas.add(new Ingrediente("Huevo", 1));
    gallSaladas.add(new Ingrediente("Sal", 3));
    Receta galletasSaladas = new Receta("Galleta Salada", gallSaladas);
    ArrayList<Ingrediente> gallRell = new ArrayList<>();
    gallRell.add(new Ingrediente("Harina", 24));
    gallRell.add(new Ingrediente("Leche", 10));
    gallRell.add(new Ingrediente("Huevo", 1));
    gallRell.add(new Ingrediente("Mermelada", 5));
    Receta galletasRellenas = new Receta("Galleta Rellena", gallRell);
    ArrayList<Ingrediente> gallChisp = new ArrayList<>();
    gallSaladas.add(new Ingrediente("Harina", 23));
    gallSaladas.add(new Ingrediente("Leche", 12));
    gallSaladas.add(new Ingrediente("Huevo", 1));
    gallSaladas.add(new Ingrediente("Chispas", 7));
    Receta galletasConChispas = new Receta("Galleta con Chispas", gallChisp);
    /*----------------------------------------------------------*/
    recetario.add(galletasSaladas);
    recetario.add(galletasRellenas);
    recetario.add(galletasConChispas);

  }

  /**
   * Método que determina el estado actual de la maquina
   * @param nuevoEstado
   */
  public void asignarEstadoActual(Estado nuevoEstado) {
    estadoActual = nuevoEstado;
  }

  /**
   * Método que regresa el estado apagado de la máquina
   * @return apagando
   */
  public Estado getEstadoApagado() {
    return apagado;
  }

  /**
   * Método que regresa el estado encendido de la máquina
   * @return encendido 
   */
  public Estado getEstadoEncendido() {
    return encendido;
  }

  /**
   * Método que regresa el estado preparando de la máquina
   * @return preparando
   */
  public Estado getEstadoPreparando() {
    return preparando;
  }

  /**
   * Método que regresa el esdtado de empacando de la máquina
   * @return empacando 
   */
  public Estado getEstadoEmpacando() {
    return empacando;
  }

  /**
   * Método de la interfaz preparacion que elige el molde del dulce
   * @param molde El molde a elegir
   */
  @Override
  public void eligeMolde(String molde) {
    System.out.println("Se eligio el molde de " + molde);
  }

  /**
   * Método que indica que la mezcla ya se ha puesto en el molde
   */
  @Override
  public void poneMezcla() {
    System.out.println("Se puso la mezcla en el molde");
  }

  /**
   * Método que agrega los ingredientes extras del dulce 
   * @param dulce El dulce del cual se agregan los ingredientes extra
   */
  @Override
  public void ingredientesExtra(String dulce) {
    System.out.println("Se agregaron los ingredientes extra de  " + dulce);
  }

  /**
   * Método que valida el pedido que recibe. 
   * @param p El pedido que recibe la máquina
   * @return true Si el pedido es aceptado, false en otro caso
   */
  public void validarPedido(String p) {
    Receta dulce = null;
    //Encuentra la receta del dulce
    for (Receta r : recetario){
      if(r.getNombre().equals(p))
        dulce = r;
    }
    //Hasta este punto, tenemos la receta para un único dulce,
    //recordemos que hemos dicho que un lote tiene 250 unidades 
    int cant = 250;
    Receta paraLote = new Receta(dulce.getNombre(),dulce.getReceta());
    //Creamos la receta para los 250 items del lote
    for (Ingrediente i : paraLote.getReceta()){
      i.aumentarCantidad(i.getCantidad()*(cant-1));
    }
    //Comparamos la cantidad de ingredientes en el almacen con los que 
    //se requiere en la receta, de tal manera que todos los faltantes
    //se "acompletan en el almacen"
    for(Ingrediente i : paraLote.getReceta()) {
      while(almacen.getCantidadDeIngrediente(i.getNombre())<i.getCantidad()){
        System.out.println("No se cuenta con suficiente "+i.getNombre()+
                          " para la receta...");
        almacen.reabastecerIngrediente(i.getNombre());
      }
    }
  }

  /**
   * Método que prepara un dulce y regresa un lote con 250 piezas 
   * del dulce
   * @param p El dulce a preparar
   * @return Un lote del tipo de dulce que se eligió
   */
  public Lote prepararDulce(String p) {
    eligeMolde(p);
    poneMezcla();
    ingredientesExtra(p);
    switch (p) {
      case "Gusanos Acidos":
        return new Lote(new GusanosAcidos().getTipo());

      case "Ositos Dulces":
        return new Lote(new OsitosDulces().getTipo());

      case "Frutas Chamoy":
        return new Lote(new FrutasChamoy().getTipo());

      case "Chocolate Con Almendras":
        return new Lote(new ChocolateConAlmendras().getTipo());

      case "Chocolate Con Leche":
        return new Lote(new ChocolateConAlmendras().getTipo());

      case "Chocolate Oscuro":
        return new Lote(new ChocolateOscuro().getTipo());

      default:
        return new Lote("");
    }
  }
}