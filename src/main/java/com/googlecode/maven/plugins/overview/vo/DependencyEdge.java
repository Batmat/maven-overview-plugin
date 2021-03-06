package com.googlecode.maven.plugins.overview.vo;

import edu.uci.ics.jung.graph.impl.DirectedSparseEdge;
import edu.uci.ics.jung.graph.Vertex;

public class DependencyEdge extends DirectedSparseEdge {
    private String label;

  public DependencyEdge(Vertex vertex1, Vertex vertex2, String label) {
        super(vertex1, vertex2);
        this.label = label;
    }

    public String toString() {
        return label != null ? label : super.toString();
    }
}
