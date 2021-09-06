package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	public static Scanner scanner = new Scanner(System.in);		
	public static char board[] = new char[10];
	public static char playerCharacter;
	public static char computerCharacter;

	public static void initializeBoard() {

		for(int index = 1; index < 10;index++) {
			board[index] = ' ';
		}
	}

	public static void chooseCharacter() {

		System.out.print("Choose your character (X/O): ");
		String choice = scanner.nextLine().toUpperCase();
		switch(choice) {

		case "X": playerCharacter = 'X';
			      computerCharacter = 'O';
			      break;
		case "O": playerCharacter = 'O';
				  computerCharacter = 'X';
				  break;
		}
	}

	public static void main(String[] args) {
		System.out.println("----------Welcome to Tic Tac Toe Game----------");
		initializeBoard();
	}
}