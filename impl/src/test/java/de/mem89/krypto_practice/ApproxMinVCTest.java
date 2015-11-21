package de.mem89.krypto_practice;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.junit.Before;
import org.junit.Test;

import de.mem89.krypto_practice.ApproxMinVC;

public class ApproxMinVCTest {
	static UndirectedGraph<Integer,DefaultEdge> graph; 
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSquare() {
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
		
		ApproxMinVC<Integer,DefaultEdge> minVc = new ApproxMinVC<Integer, DefaultEdge>(graph);
		Set<Integer> vc = minVc.getVertexCover();
		
		System.out.println(vc);
		fail("Not yet implemented");

	}


}
