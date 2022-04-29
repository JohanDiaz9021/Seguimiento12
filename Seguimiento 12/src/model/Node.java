package model;

public class Node {

    private Node siguiente;
    private Node anterior;
    private int value;
    private int contador;

    public Node(int value){
        this.value = value;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    public int getValue() {
        return value;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

	public void setValue(Node inicio) {
		// TODO Auto-generated method stub
		
	}
}