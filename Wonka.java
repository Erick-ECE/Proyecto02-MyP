public class Wonka implements Preparacion{
    
    Estado apagado;
    Estado encendido;
    Estado preparando;
    Estado empacando;

    Estado estadoActual;

    /*
	* Metodo Fatory
	*/
	Wonka(){
        apagado = new WonkaApagado(this);
        encendido = new WonkaEncendido(this);
        preparando = new WonkaPreparando(this);
        empacando = new WonkaEmpacando(this);

        estadoActual = apagado;
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