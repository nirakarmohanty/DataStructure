package com.src.nirakar.ds.graph;

public class Graph {

	int MAX_VERTEX;
	int nVertexPoint;
	int adjMatrix[][];
	Vertex vertexList[];

	Graph() {
		adjMatrix = new int[MAX_VERTEX][MAX_VERTEX];
		vertexList = new Vertex[MAX_VERTEX];
		nVertexPoint = 0;
	}

	public void addVertexes(Character data) {
		Vertex newVertex = new Vertex(data, false);
		vertexList[nVertexPoint] = newVertex;
		nVertexPoint= nVertexPoint+1;
	}

	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	public void display(Vertex vertex) {
		System.out.println("Vertex  : "+ vertex.value);
	}

	public void bfs(int i) {
		vertexList[0].wasVisited= true;
		display(vertexList[0]);
	}
}
