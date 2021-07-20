package com.original.gestaografo.domain;

import java.util.ArrayList;
import java.util.List;

public class MgrGraph {

	private Integer id;

	private List<Graph> graphs = new ArrayList<>();

	public MgrGraph() {
	}

	public MgrGraph(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Graph> getGraphs() {
		return graphs;
	}

	public void setGraphs(List<Graph> graphs) {
		this.graphs = graphs;
	}

}
