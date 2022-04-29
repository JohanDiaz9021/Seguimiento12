package ui;
import model.ListaEnlazada;
import model.Node;

import java.util.Scanner;

public class Main {

    static ListaEnlazada listEnla = new ListaEnlazada();

    static Scanner must = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println(menu());


    }

    public static boolean menu(){

        boolean rum = true;

        while (rum) {
            System.out.println("\n Escoja la opcion deseada \n");
            System.out.println("1. Dar turno");
            System.out.println("2. Mostrar turno");
            System.out.println("3. Pasar turno");
            System.out.println("4. Eliminar turno actual.");
            System.out.println("5. Fin del programa");
            int seleccion = must.nextInt();

            switch (seleccion) {

                case 1:
                	asignarTurn();
                    break;

                case 2:
                    listEnla.mostrarELTurno();
                    break;

                case 3:
                	pasarTur();
                    break;

                case 4:
                	listEnla.EliminarTurnoPresente();
                    break;

                case 5:
                    rum = false;
                    System.out.println("Gracias por usar nuesto servicio.");
                    break;

                default:
                    System.out.println("Este numero no se encuentra en las opciones, intente de nuevo.");
            }

        }
        return rum;
    }
    


	public static void asignarTurn() {
    	System.out.println("Ingrese el turno a ser asignado");
    	int turnoAsignado = must.nextInt();
		listEnla.asignarTurno(new Node(turnoAsignado));
    }
    public static void pasarTur() {
    	String message = listEnla.pasarTurno();
    	System.out.println(message);
    }
    public static void mostrarTur() {
    	String message = listEnla.mostrarELTurno();
    	System.out.println(message);
    }

}
