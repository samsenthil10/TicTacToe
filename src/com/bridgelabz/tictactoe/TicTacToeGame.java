package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {


	public static final int HEADS=1;
	public static final int TAILS=2;
	public static Scanner scanner = new Scanner(System.in);		
	public static char board[] = new char[10];
	public static char playerCharacter;
	public static char computerCharacter;
	public static char currentPlayer;

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
		default:System.out.println("Invalid Character!");
		System.exit(0);
		}
	}

	public static void showBoard() {

		System.out.println(" -------------");
		for (int iterator = 1; iterator < 10; iterator++) {
			System.out.print(" | " + iterator);
			if (iterator % 3 == 0) {
				System.out.println(" | ");
				System.out.println(" -------------");
			}
		}
	}

	public static void currentBoard() {

		System.out.println(" -------------");
		for (int iterator = 1; iterator < 10; iterator++) {
			System.out.print(" | " + board[iterator]);
			if (iterator % 3 == 0) {
				System.out.println(" | ");
				System.out.println(" -------------");
			}
		}
	}

	public static void chooseBoardPosition(char currentPlayer) {

		System.out.print("Choose your block: ");
		int position = scanner.nextInt();
		if(position > 0 && position < 10) {
			if(board[position]==' ') {
				board[position] = currentPlayer;
				currentBoard();
			}
			else {
				System.out.println("Block Occupied");
			}
		}
		else {

			System.out.println("Invalid Position");
		}
	}
	
	public static void tossForFirstPlayer() {
		
		System.out.print("Choose your toss(Heads(1)/Tails(2)): ");
		int tossCall = scanner.nextInt();
		int toss = HEADS + (int)(Math.random() * TAILS);
		if(tossCall == toss)
			currentPlayer = playerCharacter;
		else
			currentPlayer = computerCharacter;
	}

	public static void main(String[] args) {

		System.out.println("----------Welcome to Tic Tac Toe Game----------");
		System.out.println();
	}
}