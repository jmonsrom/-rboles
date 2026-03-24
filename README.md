Implementación de Árbol Binario de Búsqueda (BST) en Java

Este proyecto pretende implementar un Árbol Binario de Búsqueda funcional, permitiendo la gestión de datos numéricos a través de una interfaz de consola.

Conceptos Clave

¿Qué es un Árbol Binario?
Es una estructura de datos no lineal en la que cada nodo puede tener como máximo dos hijos: izquierdo y derecho. En esta implementación (BST), se sigue la regla:

- Los valores menores que la raíz van al subárbol izquierdo.
- Los valores mayores que la raíz van al subárbol derecho.

Recorrido Inorden
Es un método de exploración que sigue la secuencia: Izquierda -> Raíz -> Derecha**. 
- Resultado: Produce una lista de los valores del árbol en orden estrictamente ascendente (de menor a mayor).

Implementación Técnica
El programa está unificado en la clase `ArbolBinarioApp` y utiliza:
1. Recursividad: Para insertar y buscar elementos de manera eficiente.
2. Scanner: Para capturar la entrada del usuario en tiempo real.
3. Punteros (Referencias): Para conectar los nodos.

Ejemplos de Ejecución

Ejemplo 1: Inserción y Ordenamiento
Si insertamos los números en este orden: `45, 23, 67, 12, 34`.
- Árbol lógico:
      45
     /  \
    23   67
   /  \
  12   34
- Salida Inorden: `12 23 34 45 67` (¡Orden perfecto!)

Ejemplo 2: Proceso de Búsqueda
- Búsqueda exitosa: Si el usuario busca `67`, el programa comparará: ¿67 > 45? Sí, va a la derecha. ¿67 == 67? Sí. Resultado: `"Número encontrado"`.
- Búsqueda fallida: Si el usuario busca `100`, el programa llegará al final de las ramas derechas y, al no encontrar nada, devolverá: `"No existe"`.

Instrucciones de Uso
1. Compilar: `javac ArbolBinarioApp.java`
2. Ejecutar: `java ArbolBinarioApp`

Integrantes
- JUAN GUILLERMO MONSALVE ROMÁN, C.C. 1020461679
- Profe, debido a la falta de grupo me ví en la necesidad de hacer el trabajo de forma individual.

