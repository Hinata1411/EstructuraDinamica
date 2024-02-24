public class ListaDoblementeEnlazada {
    //Clase Lista Doblemente Enlazada
    //Referencias a objetos de la clase Nodo
    Nodo inicio;
    Nodo fin;
    //variable entera llamada tamanio que servirá para almacenar el tamaño de la lista enlazada
    int tamanio;

    //Constructor de la clase en donde se inicializan los objetos inicio y fin como nulo
    //Y el tamaño comienza en 0

    public ListaDoblementeEnlazada(){
        this.inicio = null;
        this.fin = null;
        this.tamanio = 0;
    }

    //Método para insertar al Inicio que recibe como parámentro la variable dato
    public void insertarInicio(int dato){
        Nodo nuevoNodo = new Nodo(dato); //Instanciamos un nuevo Nodo y abrimos una condicional en donde si la lista está vacia osea que inicio es igual a nulo,
        //Si esto es así inicio y fin serían un nuevo nodo.
        if (inicio == null){
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else { //Si la lista no está vacia, nuevoNodo.siguiente se establece como el nodo inicial
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo; //El inicio.anterior se establece como nuevoNodo
            inicio = nuevoNodo; //Al igual que inicio se establece como nuevoNodo
        }
        tamanio++; // Y el tamaño de la lista aumenta.
    }

    //Método para recorrer hacia adelante
    public void recorrerAdelante(){
        //Creamos un objeto de la clase nodo llamado actual que se inicializa con el noco que está al principio
        Nodo actual = inicio;
        //Con un ciclo se recorrerá la variable actual hasta que sea diferente de nulo
        while (actual != null){
            System.out.println(actual.dato + ""); //Se imprime en consola el valor actual que tiene dato
            actual = actual.siguiente; //Y luego actual toma el valor del siguiente nodo en la lista.
        }
        System.out.println();
    }





}
