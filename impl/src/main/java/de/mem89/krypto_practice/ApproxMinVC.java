package de.mem89.krypto_practice;

import java.util.HashSet;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.graph.Subgraph;

public class ApproxMinVC<V, E> {
	private Graph<V,E> graph;
	
	public ApproxMinVC(Graph<V,E> graph) {
		this.graph = graph;
	}
	
	public Set<V> getVertexCover(){
		
		
		Subgraph<V,E,Graph<V,E>> copy = new Subgraph<V, E, Graph<V, E>>(graph,null,null);
		Set<V> vc = new HashSet<V>();
		
		while(copy.edgeSet().size() > 0){
			E edge = copy.edgeSet().iterator().next();
			V source = graph.getEdgeSource(edge);
			V target = graph.getEdgeSource(edge);
			
			vc.add(source);
			vc.add(target);
			
			copy.removeVertex(source);
			copy.removeVertex(target);
		}
		
		return vc;
	}
}
