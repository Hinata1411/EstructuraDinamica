public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        int opcion;
        int valor;
        int indice;

        do {
            System.out.println("------Lista Doblemente Enlazada------");
            System.out.println("1. Insertar al Inicio");
            System.out.println("2. Insertar al Final");
            System.out.println("3. Recorrer hacia Adelante");
            System.out.println("4. Recorrer hacia Atrás");
            System.out.println("5. Mostrar el Tamaño de la Lista");
            System.out.println("6. Mostrar si la Lista está Vacia");
            System.out.println("7. Buscar Elemento por Valor");
            System.out.println("8. Buscar Elemento por Indice");
            System.out.println("9. Borrar un Elemento");
            System.out.println("0. Salir");

            System.out.print("Ingrese la opción que desee realizar: ");
            System.out.println();
            opcion = obtenerEntero();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar al inicio: ");
                    valor = obtenerEntero();
                    lista.insertarInicio(valor);
                    break;

                case 2:
                    System.out.print("Ingrese el valor a insertar al final: ");
                    valor = obtenerEntero();
                    lista.insertarFinal(valor);
                    break;

                case 3:
                    System.out.println("Recorrido hacia Adelante:");
                    lista.recorrerHaciaAdelante();
                    break;

                case 4:
                    System.out.println("Recorrido hacia Atrás:");
                    lista.recorrerHaciaAtras();
                    break;

                case 5:
                    lista.mostrarTamaño();
                    break;

                case 6:
                    lista.mostrarSiEstaVacia();
                    break;

                case 7:
                    System.out.print("Ingrese el valor a buscar: ");
                    valor = obtenerEntero();
                    lista.buscarElementoPorValor(valor);
                    break;

                case 8:
                    System.out.print("Ingrese el índice a buscar: ");
                    indice = obtenerEntero();
                    lista.buscarElementoPorIndice(indice);
                    break;

                case 9:
                    System.out.print("Ingrese el valor a borrar: ");
                    valor = obtenerEntero();
                    lista.borrarElemento(valor);
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }

        } while (opcion != 0);
    }

    private static int obtenerEntero() {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            return scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingrese un valor entero válido.");
            return 0;
        }

    }
}