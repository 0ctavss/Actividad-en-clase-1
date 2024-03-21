class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int value) {
        this.val = value;
        this.left = this.right = null;
    }
}

public class LogarithmicAlgorithm {

    static TreeNode root;

    public static TreeNode insert(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.val) {
            node.left = insert(node.left, value);
        } else if (value > node.val) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public static TreeNode search(TreeNode node, int value) {
        if (node == null || node.val == value) {
            return node;
        }
        if (value < node.val) {
            return search(node.left, value);
        }
        return search(node.right, value);
    }

    public static void main(String[] args) {
        int size = 10000;  // Número de nodos en el árbol
        for (int i = 0; i < size; i++) {
            root = insert(root, i);  // Construir el árbol binario de búsqueda
        }
        int target = size - 1;  // Elemento a buscar

        long startTime = System.nanoTime();  // Iniciar el cronómetro
        TreeNode result = search(root, target);
        long endTime = System.nanoTime();  // Detener el cronómetro

        long duration = (endTime - startTime) / 1000;  // Calcular la duración en milisegundos
        if (result != null) {
            System.out.println("El valor " + target + " se encontró en el árbol");
        } else {
            System.out.println("El valor " + target + " no se encontró en el árbol");
        }
        System.out.println("Tiempo de ejecución: " + duration + " microsegundos");
    }
}
