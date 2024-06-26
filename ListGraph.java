import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
public class ListGraph<T> {
    Map<Integer, List<Integer>> list;
    boolean isDirected;

    public ListGraph(int vertices, boolean isDirected) {
        super();
        list = new HashMap<>();
        for(int i = 0; i < vertices; i++) {
            list.put(i, new LinkedList<Integer>());
        }
    }

    public void addEdge(int src, int dest) {
        list.get(src).add(dest);
        if (!isDirected) {
            list.get(dest).add(src);
        }
    }

    public void print() {
        for(var key : list.keySet()) {
            System.out.print("Vertex " + key + ": ");
            for(var edge : list.get(key)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }
}
