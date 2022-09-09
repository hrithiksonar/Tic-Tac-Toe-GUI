package com.monocept.model;

public class Cell {
	private MarkType mark;

	public Cell() {
		this.mark =MarkType.EMPTY;
	}
	
	public Cell(MarkType mark) {
		this.mark =mark;
	}
	
	public boolean isCellEmpty() {
		return mark==MarkType.EMPTY;
	}
	
	public MarkType getMark() {
		return mark;
	}

	public void setMarkType(MarkType mark) {
		if(this.mark!=MarkType.EMPTY) {
			throw new CellAlreadyMarkException("Cell is already marked");
		}
		this.mark=mark;
	}
}
