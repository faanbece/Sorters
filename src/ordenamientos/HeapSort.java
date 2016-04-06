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
public class HeapSort {
    private static int N;
    Object obj;
    public void sort(String arr[], String tk,int criter) {
        heapify(arr,tk,criter);
        for (int i = N; i > 0; i--) {
            swap(arr, 0, i);
            N = N - 1;
            maxheap(arr,tk,criter, 0);
        }
    }
    /* Function to build a heap */
    public static void heapify(String arr[],String tk, int criter) {
        N = arr.length - 1;
        for (int i = N / 2; i >= 0; i--) {
            maxheap(arr,tk,criter, i);
        }
    }
    /* Function to swap largest element in heap */
    public static void maxheap(String arr[], String tk,int criter, int i) {
        
        
        
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
    
        if (left <= N && arr[left].split(tk)[criter].compareTo(arr[i].split(tk)[criter]) > 0) {
            max = left;
        }
        if (right <= N && arr[right].split(tk)[criter].compareTo(arr[max].split(tk)[criter]) > 0) {
            max = right;
        }
        if (max != i) {
            swap(arr, i, max);
            maxheap(arr,tk,criter, max);
        }
    }
    /* Function to swap two numbers in an array */
    public static void swap(String arr[], int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
