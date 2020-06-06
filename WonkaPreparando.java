public class WonkaPreparando implements Estado{
    Wonka maquina;

    //Constructor para Wonka Preparando
    WonkaPreparando(Wonka maquina){
        this.maquina = maquina;
    }
    //Método para la preparación de dulces
    public void preparaDulce(String dulce){
        /*
        * TODO
        ////PSEUDOCODIGO///
                    receta = maquina.getReceta(dulce)
                    metodo Factory
                    creaDulce(...){
                        //Wonka O GalleinatorAdapter:
                        (if dulce= galleta){
                            GalleinatorAdapter.prepararDulce(dulce){
                                //por implementar//
                                eligeMolde();
                                void poneMezcla();
                                void ingredientesExtra();
                                //por implementar//
                            }
                        }else{
                            Wonka.prepararDulce(dulce){
                                //por implementar//
                                eligeMolde();
                                void poneMezcla();
                                void ingredientesExtra();
                                //por implementar//
                            }
                        }
                
                    }
        ....
        ////PSEUDOCODIGO///
        
        */
    }
    
    //Método no implementado en este estado
    public oid empacarDulce(Lote lote){
        System.out.println("Aquí no puedo empacar, primero prepara un lote\n");
    }
    //Método no implementado en este estado
    public void darLote(Lote lote){
        System.out.println("Aquí no puedo entregar, primero prepara un lote\n");
    }

    //Método para reabastecer en bodega en caso de que un ingrediente sea insuficiente
    public void reabastecer(Ingrediente ingrediente){
        /*
        * TODO
        ////PSEUDOCODIGO///
            ....hacer reabastecimiento con métodos del almacén/bodega...
        ....
        ////PSEUDOCODIGO///
        */
    }

    //Método no implementado en este estado
    public void apagar(){
        System.out.println("Primero termino de preparar...\n");
    }
}