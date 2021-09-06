package com.bridgelabz.tictactoe;

public class TicTacToeGame {
	
	public static char board[] = new char[10];
	
	public static void initializeBoard() {
		
		for(int index = 1; index < 10;index++) {
			board[index] = ' ';
		}
	}
	
	public static void main(String[] args) {
		System.out.println("----------Welcome to Tic Tac Toe Game----------");
		initializeBoard();
	}
}
