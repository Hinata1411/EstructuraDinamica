public class ListaDoblementeEnlazada {
    //variables de la clase nodo para
    Nodo inicio;
    Nodo fin;
    int tamanio;

    public ListaDoblementeEnlazada(){
        this.inicio = null;
        this.fin = null;
        this.tamanio = 0;
    }

    public void insertarInicio(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if (inicio == null){
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo;
            inicio = nuevoNodo;
        }
        tamanio++;

    }


}
