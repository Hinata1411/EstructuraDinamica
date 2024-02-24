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

    //Método para insertar un valor al final de la lista
    public void insertarFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            nuevoNodo.anterior = fin;
            fin = nuevoNodo;
        }
        tamanio++;
    }

    //Método para recorrer hacia adelante
    public void recorrerAdelante(){
        //Creamos un objeto de la clase nodo llamado actual que se inicializa con el nodo que está al principio
        Nodo actual = inicio;
        //Con un ciclo recorrerá la variable actual hasta que actual sea nula
        while (actual != null){
            System.out.println(actual.dato + ""); //Se imprime en consola el valor actual que tiene dato
            actual = actual.siguiente; //Y luego actual toma el valor del siguiente nodo en la lista.
        }
        System.out.println();
    }

    //Método para recrorrer hacia atras
    public void recorrerAtras(){
        //Creamos un objeto de la clase nodo llamado actual que se inicializa con el nodo que está al final
        Nodo actual = fin;
        //Con un ciclo recorrerá la variable actual hasta que actual sea nula
        while (actual != null){
            System.out.println(actual.dato + ""); //Se imprime en consola el valor actual que tiene dato
            actual = actual.anterior; //Y luego actual toma el valor del nodo anterior en la lista.
        }
        System.out.println();
    }

    //Método para mostrar el tamaño de la lista
    public void mostrarTamanio(){
        System.out.println("El tamaño de la lista es de: " + tamanio);
    }

    //Método para mostrar la lista si está vacia
    public void mostrarSiEstaVacia(){
        System.out.println("La lista se encuentra vacía: " + (tamanio == 0));
    }

    //Método para buscar Elemento por Valor
    public void buscarElementoPorValor(int valor) {
        //Creamos un objeto de la clase nodo llamado actual que se inicializa con el nodo que está al inicio
        Nodo actual = inicio;
        //Creamos una variable entera llamada indice que comenzará en 0
        int indice = 0;
        //Con un ciclo recorremos la variable actual hasta que sea nula
        while (actual != null) {
            //Si es diferente de nula, con una condicional verificamos si la variable actual.dato es igual al valor a buscar
            if (actual.dato == valor) {
                System.out.println("El elemento se encuentra en la lista en el índice: " + indice); //Si es igual imprime el lugar en el indice en donde se encuentra el valor
                return;
            }
            actual = actual.siguiente; //La variable actual toma el valor del siguiente nodo
            indice++; //Indice aumenta
        }
        System.out.println("El elemento no se encuentra en la lista"); //Si este valor no se encuentra en la lista se muestra este mensaje en consola
    }

    //Método para buscar un elemento de la lista por medio del índice
    public void buscarElementoPorIndice(int indice) { //Creamos el método colocandole el parámetro de indice
        if (indice < 0 || indice >= tamanio) { //con una condicional verificamos si indice es menor que 0 o indice es mayor o igual al tamaño de la lista
            System.out.println("El índice se encuentra fuera de rango"); //Se imprime un mensaje en consola indicando que el indice está fuera del rango
            return;
        } //Si el indice es mayor que 0 o menor o igual que el tamaño de la lista el nodo actual se posiciona al inicio de la lista
        Nodo actual = inicio;
        //Con un ciclo for se recorre la lista avanzando de uno en uno desde el nodo inicial hasta el nodo que contenga el indice igual al valor a buscar
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente; //La variable actual en cada iteración va tomando el valor del siguiente nodo
        }

        System.out.println("El elemento se encuentra en el índice " + indice + ": " + actual.dato); //Se imprime en consola el indice del elemento encontrado junto con el valor actual de ese nodo
    }

    //Método para borrar elementos de la lista
    public void borrarElemento(int valor) { //El método toma el parámetro entero llamado valor que es el que se desea eliminar
        //Creamos un objeto de la clase nodo llamado actual que se inicializa con el nodo que está al inicio
        Nodo actual = inicio;
        //Con un ciclo recorremos la variable actual hasta que sea nula
        while (actual != null) {
            //Si es diferente de nula, con una condicional verificamos si la variable actual.dato es igual al valor a eliminar
            if (actual.dato == valor) {
                //Con otra condicional verificamos si el nodo actual es el nodo inicial de la lista
                if (actual.anterior == null) {
                    inicio = actual.siguiente;
                    if (inicio != null) {
                        inicio.anterior = null;
                    }
                } else if (actual.siguiente == null) {
                    fin = actual.anterior;
                    fin.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                tamanio--;
                System.out.println("El elemento eliminado contiene el valor de: " + valor);
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("El elemento no se ha encontrado en la lista");
    }
}



