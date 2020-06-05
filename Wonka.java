public class Wonka implements Preparacion{
    
    Estado apagado;
    Estado encendido;
    Estado preparando;
    Estado empacando;

    Estado estadoActual;

    /*
	* constructor para Wonka
	*/
	Wonka(){
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
}