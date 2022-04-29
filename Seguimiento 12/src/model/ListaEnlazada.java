package model;

public class ListaEnlazada {

    private Node inicio;
    private Node presente;
    private  int contador = 1;

    public boolean asignarTurno(Node x){


        if(inicio == null){
            inicio = x;
            inicio.setValue(inicio);
            inicio.setAnterior(inicio);

            presente = inicio;
        }
        else {
            Node cola = inicio.getAnterior();
            inicio.setAnterior(x);
            cola.setSiguiente(x);
            x.setSiguiente(inicio);
            x.setAnterior(cola);
        }
        return true;
    }

    public String mostrarELTurno(){

        String message = "";

        if(presente == null){
        	message = "No se encuentra ningun turno registrado";

        }
        else {
        	message = ""+presente.getValue();
        }
		return message;
    }

    public String pasarTurno(){

        String message = "";
        if(inicio == null){

            message = "No hay turnos creados aun";
        }
        else {
            presente.setContador(presente.getContador()+contador);
            inicio = inicio.getSiguiente();
            message = "Se ha pasado el turno con exito";
        }
        return message;
    }
    
	public void EliminarTurnoPresente() {
		
		eliminarTurno(presente);
	}

    public boolean eliminarTurno(Node presente){

        boolean rum = true;

        if(inicio != null){
        	
        	Node x = presente.getSiguiente();
        	Node y = presente.getSiguiente();
        	presente = x;
        	presente = y;
        	inicio = presente;
        }
        return rum;
    }
}