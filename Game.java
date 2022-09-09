package com.monocept.model;

public class Game {

	private Player currentPlayer;
	private Player[] players;
	private Board board;
	private ResultAnalyzer analyzer;
	private ResultType result = ResultType.PROGRESS;

	public Game(Player[] players, Board board, ResultAnalyzer analyzer) {
		this.players = players;
		this.board = board;
		this.analyzer = analyzer;
		this.currentPlayer = players[0];
	}

	public void play(int loc) {
		board.setCellMark(loc, currentPlayer.sign());
		if (analyzer.analyzeResult() == ResultType.WIN) {
			System.out.println(currentPlayer.getName()+" WON");
			System.exit(0);
		} else if (analyzer.analyzeResult() == ResultType.DRAW) {
			System.out.println("IT'S A DRAW");
			System.exit(0);
		}
		switchCurrentPlayer();
	}

	private void switchCurrentPlayer() {
		if (currentPlayer.equals(players[0])) {
			currentPlayer = players[1];
			return;
		}
		currentPlayer = players[0];

	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

}
