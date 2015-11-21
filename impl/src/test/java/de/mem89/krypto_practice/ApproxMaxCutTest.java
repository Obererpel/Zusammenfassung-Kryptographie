package de.mem89.krypto_practice;

import static org.junit.Assert.*;

import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.junit.Before;
import org.junit.Test;

public class ApproxMaxCutTest {
	static UndirectedGraph<Integer,DefaultEdge> graph; 
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		graph = new SimpleGraph<Integer, DefaultEdge>(DefaultEdge.class);
		
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		graph.addVertex(5);
		graph.addVertex(6);
		
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(1, 5);
		graph.addEdge(2, 5);
		graph.addEdge(6, 5);
		graph.addEdge(6, 3);
		
		
		ApproxMaxCut<Integer,DefaultEdge> maxCut = new ApproxMaxCut<Integer, DefaultEdge>(graph);
		System.out.println("S1: " + maxCut.getS1());
		System.out.println("S2: " + maxCut.getS2());
		
		fail("Not yet implemented");
	}

}
