import java.util.*;

class InsertionSort {
    void insertionSort(int[] A) {
        for(int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > key) {
                A[j+1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The array elements before sorting are : ");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        InsertionSort ob = new InsertionSort();
        ob.insertionSort(array);
        System.out.println("Array elements after Insertion Sort are : ");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}