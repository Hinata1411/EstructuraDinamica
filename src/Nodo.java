public class Nodo {
    //Clase nodo
    //Creamos variable int llamada dato
    int dato;
    //Referencias a objetos de la clase Nodo
    Nodo siguiente;
    Nodo anterior;

    //Constructor de la clase Nodo que lleva el parámetro de dato
    //e inicializa los atributos dato con el valor dato
    //siguiente y anterior en nulo.
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
