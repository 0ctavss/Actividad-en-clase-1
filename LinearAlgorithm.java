import java.util.Random;

public class LinearAlgorithm {

    public static int linearSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int size = 100000000;  // Tamaño del arreglo
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100);  // Llenar el arreglo con números aleatorios
        }

        long startTime = System.nanoTime();  // Iniciar el cronómetro
        int result = linearSum(array);
        long endTime = System.nanoTime();  // Detener el cronómetro

        long duration = (endTime - startTime) / 1000;  // Calcular la duración en milisegundos
        System.out.println("Resultado: " + result);
        System.out.println("Tiempo de ejecución: " + duration + " microsegundos");
    }
}