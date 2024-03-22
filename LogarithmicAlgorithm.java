public class LogarithmicAlgorithm {

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 100000000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        int target = size - 1;

        long startTime = System.nanoTime();  // Iniciar el cronómetro
        int index = binarySearch(array, target);
        long endTime = System.nanoTime();  // Detener el cronómetro

        long duration = (endTime - startTime) / 1000;  // Calcular la duración en milisegundos
        System.out.println("Índice del elemento encontrado: " + index);
        System.out.println("Tiempo de ejecución: " + duration + " microsegundos");
    }
}
