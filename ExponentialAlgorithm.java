import java.util.ArrayList;

public class ExponentialAlgorithm {

    public static ArrayList<ArrayList<Integer>> generateSubsets(int[] array) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        int n = array.length;
        for (int i = 0; i < (1 << n); i++) {
            ArrayList<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(array[j]);
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // Conjunto de entrada

        long startTime = System.nanoTime(); // Registro del tiempo de inicio
        ArrayList<ArrayList<Integer>> subsets = generateSubsets(array);
        long endTime = System.nanoTime(); // Registro del tiempo de finalización

        // Imprimir los subconjuntos generados
        for (ArrayList<Integer> subset : subsets) {
            System.out.print("{ ");
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println("}");
        }

        long duration = (endTime - startTime) / 1000; // Cálculo de la duración en milisegundos
        System.out.println("Tiempo de ejecución: " + duration + " microsegundos");
    }
}
