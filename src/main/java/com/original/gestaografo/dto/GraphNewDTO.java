package com.original.gestaografo.dto;

import java.io.Serializable;

public class GraphNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String source;
	private String target;
	private Integer distance;
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public GraphNewDTO() {
		super();
	}

	public GraphNewDTO(String source, String target, Integer distance) {
		super();
		this.source = source;
		this.target = target;
		this.distance = distance;
	}

}
