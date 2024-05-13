
public class UndirectedGraphDemo {

	public static void main(String[] args) {
		
		UndirectedGraph graph = new UndirectedGraph(9);

		graph.addEdge(0,1);
		graph.addEdge(0,3);
		graph.addEdge(1,3);
		graph.addEdge(0,2);
		graph.addEdge(2,4);
		graph.addEdge(3,4);
		graph.addEdge(5,8);
		graph.addEdge(6,5);
		
		
		graph.printConnectedComponents();
		
	}

}