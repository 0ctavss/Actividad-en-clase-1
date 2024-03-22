import java.util.Arrays;

public class LinearLogarithmicAlgorithm {

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    public static void main(String[] args) {
        int size = 10000000; // Tamaño del arreglo
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 1000); // Llenar el arreglo con números aleatorios
        }

        long startTime = System.nanoTime(); // Iniciar el cronómetro
        mergeSort(array, 0, array.length - 1);
        long endTime = System.nanoTime(); // Detener el cronómetro

        long duration = (endTime - startTime) / 1000; // Calcular la duración en microsegundos

        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(array));
        System.out.println("Tiempo de ejecución: " + duration + " microsegundos");
    }
}
