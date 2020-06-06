public class Wonka implements Preparacion{
    
    private Estado apagado;
    private Estado encendido;
    private Estado preparando;
    private Estado empacando;
    private Estado estadoActual;

  /*
	* constructor para Wonka
	*/
	public Wonka(){
    apagado = new WonkaApagado(this);
    encendido = new WonkaEncendido(this);
    preparando = new WonkaPreparando(this);
    empacando = new WonkaEmpacando(this);
    estadoActual = apagado;
  }

  public void asignarEstadoActual(Estado nuevoEstado){
    estadoActual = nuevoEstado;
	}

  public Estado getEstadoApagado(){
    return apagado;
  }
  
  public Estado getEstadoEncendido(){
    return encendido;
  }
  
  public Estado getEstadoPreparando(){
    return preparando;
  }
  
  public Estado getEstadoEmpacando(){
    return empacando;
	}

  @Override
  public void eligeMolde(){

  }

  @Override
  public void poneMezcla(){

  }

  @Override
  public void ingredientesExtra(){
      
  }

  public boolean validarPedido(String p) {
	  return false;
  }

  public Lote prepararDulce(String p) {
	  return null;
  }
}