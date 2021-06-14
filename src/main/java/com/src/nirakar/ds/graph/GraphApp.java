package com.src.nirakar.ds.graph;

public class GraphApp {

	
	
	public static void main(String[] args) {
		Graph theGraph = new Graph();
		theGraph.addVertexes('A');
	    theGraph.addVertexes('B');
	    theGraph.addVertexes('C');
	    theGraph.addVertexes('D');
	    theGraph.addVertexes('E');
	    theGraph.addVertexes('F');
	    
	    theGraph.addEdge(0, 1);
	    theGraph.addEdge(1, 2);
	    theGraph.addEdge(0, 3);
	    theGraph.addEdge(3, 4);
	    theGraph.addEdge(4, 5);
	    theGraph.addEdge(1, 3);
	    
	    theGraph.bfs(0);
	}

}
