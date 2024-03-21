import java.util.Random;

public class QuadraticAlgorithm {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int size = 100000;  // Tamaño del arreglo
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100);  // Llenar el arreglo con números aleatorios
        }

        long startTime = System.nanoTime();  // Iniciar el cronómetro
        bubbleSort(array);
        long endTime = System.nanoTime();  // Detener el cronómetro

        long duration = (endTime - startTime) / 1000;  // Calcular la duración en milisegundos
        System.out.println("Tiempo de ejecución: " + duration + " microsegundos");
    }
}
