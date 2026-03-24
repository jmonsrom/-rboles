import java.util.Scanner;

// Clase que representa un nodo del árbol
class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int item) {
        valor = item;
        izquierdo = derecho = null;
    }
}

// Clase principal que contendrá la lógica del árbol
public class ArbolBinarioApp {
    Nodo raiz;

    public ArbolBinarioApp() {
        raiz = null;
    }

    public static void main(String[] args) {
        System.out.println("Estructura inicial del Árbol Binario creada.");
    }
}