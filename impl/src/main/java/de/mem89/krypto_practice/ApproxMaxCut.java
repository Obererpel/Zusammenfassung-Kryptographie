package de.mem89.krypto_practice;

import java.util.HashSet;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.alg.NeighborIndex;
import org.jgrapht.graph.Subgraph;

public class ApproxMaxCut<V,E> {

	private Graph<V,E> graph;
	private Subgraph<V,E,Graph<V,E>> s1;
	private Subgraph<V,E,Graph<V,E>> s2;
	
	public ApproxMaxCut(Graph<V,E> graph) {
		this.graph = graph;
		
		
		maxCut();
	}
	
	private void maxCut() {
		Set<V> a = new HashSet<V>();
		Set<V> b = new HashSet<V>();
		Set<V> vertexSet = new HashSet<V>(graph.vertexSet());
		
		NeighborIndex<V,E> ni = new NeighborIndex<V, E>(graph);
		
		a.add((V) vertexSet.toArray()[0]);
		vertexSet.remove((V) vertexSet.toArray()[0]);
		
		for(V v : vertexSet){			
			int n = ni.neighborsOf(v).size();
			if((n + a.size()) <= (n + b.size()))	a.add(v);
			else b.add(v);
		}
		
		s1 = new Subgraph<V, E, Graph<V,E>>(graph, a, null);
		s2 = new Subgraph<V, E, Graph<V,E>>(graph, b, null);
	}

	public Subgraph<V, E, Graph<V, E>> getS1() {
		return s1;
	}

	public Subgraph<V, E, Graph<V, E>> getS2() {
		return s2;
	}

	
	
}
