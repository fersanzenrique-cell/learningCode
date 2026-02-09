#include <stdio.h>

int fib (int n) {
    if (n <= 2) /* Evita la recursion infinita. */ 
        return 1;
    else 
        return fib (n - 1) + fib (n - 2);
        /* En C una condicional se puede escribir asi solo cuando es una linea, si son mas de una tienes que crear un bloque con {} y sin terminar con ;*/   
        // “a block is a statement, in some ways.”
        // En este caso se utiliza la recursividad, se llama a la funcion a si misma para crear "bucle", en este caso si se cumple el if el programa para.
        // avoid infinite recursion.
}

int main () {
    return 0;
    // En java no es necesario indicar return si es void, sin embargo en c si
    // En este caso nuestro main devuelve un 0, int
}