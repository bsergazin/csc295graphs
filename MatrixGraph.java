import java.util.ArrayList;

public class MatrixGraph<T> {

    ArrayList<Node<T>> nodes;
    private int[][] matrix;
    private boolean isDirected;

    public MatrixGraph(int size, boolean isDirected) {
        super();
        matrix = new int[size][size];
        this.isDirected = isDirected;
        nodes = new ArrayList<>(size);
    }

    public void addNode(T data) {
        Node<T> newNode = new Node<T>(data);
        nodes.add(newNode);
    }

    public boolean checkEdge(int src, int dest) {
        return matrix[src][dest] == 1;
    }

    public void addEdge(int src, int dest) {
        matrix[src][dest] = 1;
        if (!isDirected) {
            matrix[dest][src] = 1;
        }
    }

    public void print() {
        System.out.print("\t");
        for(var node : nodes) {
            System.out.print(node.data + "\t");
        }
        System.out.println();
        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + "\t");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }  
    }
}
