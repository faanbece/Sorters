/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientos;

/**
 *
 * @author faanb
 */
public class QuickSort {   

    public void quicksort(String A[], String tk, int criter, int izq, int der) {
        String pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        String aux;
        while (i < j) {            // mientras no se crucen las búsquedas
            //System.out.println(A[i].split(tk)[criter]);
            //System.out.println("A[i] -> "+A[i]);
            //System.out.println("pivote -> "+pivote);
            //A[i]<=pivote
            while (A[i].split(tk)[criter].compareTo(pivote.split(tk)[criter]) <= 0 && i < j) {
                i++; // busca elemento mayor que pivote
              //  System.out.println("Loop1 ");
            }
            //System.out.println("A[i] -> "+A[i]);
            //System.out.println("pivote -> "+pivote);
            while (A[j].split(tk)[criter].compareTo(pivote.split(tk)[criter]) > 0) {
                j--;         
                // busca elemento menor que pivote
              //  System.out.println("Loop 2");
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = A[i];                  // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            quicksort(A,tk,criter, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(A,tk,criter, j + 1, der); // ordenamos subarray derecho
        }
    }
}
