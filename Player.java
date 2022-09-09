package com.monocept.model;

public class Player {
	private String name;
	private MarkType mark;

	public Player(String name,MarkType mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public MarkType sign() {
		return mark;
	}

	public String getName() {
		return name;
	}

	public MarkType getMark() {
		return mark;
	}
	
	

}
