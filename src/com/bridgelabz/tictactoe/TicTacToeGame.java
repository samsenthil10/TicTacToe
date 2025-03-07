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
	public static final char TIE = 'T';
	public static final char CONTINUE = 'C';

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

	public static void chooseBoardPosition() {

		System.out.print("Choose your block: ");
		int position = scanner.nextInt();
		scanner.nextLine();
		if(position > 0 && position < 10) {
			if(board[position]==' ') {
				board[position] = playerCharacter;
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
		scanner.nextLine();
		int toss = HEADS + (int)(Math.random() * TAILS);
		if(tossCall == toss)
			currentPlayer = playerCharacter;
		else
			currentPlayer = computerCharacter;
	}

	public static char checkForGameStateEveryMove() {

		if(board[1] == board[2] && board[2] == board[3] && board[3] == playerCharacter) {
			return playerCharacter;
		}
		else if(board[1] == board[4] && board[4] == board[7] && board[7] == playerCharacter) {
			return playerCharacter;
		}
		else if(board[1] == board[5] && board[5] == board[9] && board[9] == playerCharacter) {
			return playerCharacter;
		}
		else if(board[2] == board[5] && board[5] == board[8] && board[8] == playerCharacter) {
			return playerCharacter;
		}
		else if(board[3] == board[5] && board[5] == board[7] && board[7] == playerCharacter) {
			return playerCharacter;
		}
		else if(board[3] == board[6] && board[6] == board[9] && board[9] == playerCharacter) {
			return playerCharacter;
		}
		else if(board[4] == board[5] && board[5] == board[6] && board[6] == playerCharacter) {
			return playerCharacter;
		}
		else if(board[7] == board[8] && board[8] == board[9] && board[9] == playerCharacter) {
			return playerCharacter;
		}
		else if(board[1] == board[2] && board[2] == board[3] && board[3] == computerCharacter) {
			return computerCharacter;
		}
		else if(board[1] == board[4] && board[4] == board[7] && board[7] == computerCharacter) {
			return computerCharacter;
		}
		else if(board[1] == board[5] && board[5] == board[9] && board[9] == computerCharacter) {
			return computerCharacter;
		}
		else if(board[2] == board[5] && board[5] == board[8] && board[8] == computerCharacter) {
			return computerCharacter;
		}
		else if(board[3] == board[5] && board[5] == board[7] && board[7] == computerCharacter) {
			return computerCharacter;
		}
		else if(board[3] == board[6] && board[6] == board[9] && board[9] == computerCharacter) {
			return computerCharacter;
		}
		else if(board[4] == board[5] && board[5] == board[6] && board[6] == computerCharacter) {
			return computerCharacter;
		}
		else if(board[7] == board[8] && board[8] == board[9] && board[9] == computerCharacter) {
			return computerCharacter;
		}
		for(int index = 1; index < 10;index++)
			if(board[index] == ' ')
				return CONTINUE;
		return TIE;
	}

	public static int computerFinalWinningMove() {

		int flag = 0;

		if(board[1] == board[2] && board[2] == computerCharacter) {
			if(board[3] != ' ') {
				board[3] = computerCharacter;
				return 1;
			}
		}
		else if(board[1] == board[3] && board[3] == computerCharacter) {
			if(board[2] != ' ')  {
				board[2] = computerCharacter;
				return 1;
			}
		}
		else if(board[1] == board[4] && board[4] == computerCharacter) {
			if(board[7] != ' ') {
				board[7] = computerCharacter;
				return 1;
			}
		}
		else if(board[1] == board[7] && board[7] == computerCharacter) {
			if(board[4] != ' ') {
				board[4] = computerCharacter;
				return 1;
			}
		}
		else if(board[1] == board[5] && board[5] == computerCharacter) {
			if(board[9] != ' ') {
				board[9] = computerCharacter;
				return 1;
			}
		}
		else if(board[1] == board[9] && board[9] == computerCharacter) {
			if(board[5] != ' ') {
				board[5] = computerCharacter;
				return 1;
			}
		}
		else if(board[2] == board[3] && board[3] == computerCharacter) {
			if(board[1] != ' ') {
				board[1] = computerCharacter;
				return 1;
			}
		}
		else if(board[2] == board[5] && board[5] == computerCharacter) {
			if(board[8] != ' ') {
				board[8] = computerCharacter;
				return 1;
			}
		}
		else if(board[2] == board[8] && board[8] == computerCharacter) {
			if(board[5] != ' ') {
				board[5] = computerCharacter;
				return 1;
			}
		}
		else if(board[2] == board[5] && board[5] == computerCharacter) {
			if(board[8] != ' ') {
				board[8] = computerCharacter;
				return 1;
			}
		}
		else if(board[3] == board[5] && board[5] == computerCharacter) {
			if(board[7] != ' ') {
				board[7] = computerCharacter;
				return 1;
			}
		}
		else if(board[3] == board[7] && board[7] == computerCharacter) {
			if(board[5] != ' ') {
				board[5] = computerCharacter;
				return 1;
			}
		}
		else if(board[3] == board[6] && board[6] == computerCharacter) {
			if(board[9] != ' ') {
				board[9] = computerCharacter;
				return 1;
			}
		}
		else if(board[3] == board[9] && board[9] == computerCharacter) {
			if(board[6] != ' ') {
				board[6] = computerCharacter;
				return 1;
			}
		}
		else if(board[4] == board[7] && board[7] == computerCharacter) {
			if(board[1] != ' ') {
				board[1] = computerCharacter;
				return 1;
			}
		}
		else if(board[4] == board[5] && board[5] == computerCharacter) {
			if(board[6] != ' ') {
				board[6] = computerCharacter;
				return 1;
			}
		}
		else if(board[4] == board[6] && board[6] == computerCharacter) {
			if(board[5] != ' ') {
				board[5] = computerCharacter;
				return 1;
			}
		}
		else if(board[5] == board[8] && board[8] == computerCharacter) {
			if(board[2] != ' ') {
				board[2] = computerCharacter;
				return 1;
			}
		}
		else if(board[5] == board[6] && board[6] == computerCharacter) {
			if(board[4] != ' ') {
				board[4] = computerCharacter;
				return 1;
			}
		}
		else if(board[5] == board[7] && board[7] == computerCharacter) {
			if(board[3] != ' ') {
				board[3] = computerCharacter;
				return 1;
			}
		}
		else if(board[6] == board[9] && board[9] == computerCharacter) {
			if(board[3] != ' ') {
				board[3] = computerCharacter;
				return 1;
			}
		}
		else if(board[7] == board[8] && board[8] == computerCharacter) {
			if(board[9] != ' ') {
				board[9] = computerCharacter;
				return 1;
			}
		}
		else if(board[7] == board[9] && board[9] == computerCharacter) {
			if(board[8] != ' ') {
				board[8] = computerCharacter;
				return 1;
			}
		}
		return flag;
	}

	public static int blockPlayerFinalWinningMove() {

		int flag = 0;

		if(board[1] == board[2] && board[2] == playerCharacter) {
			if(board[3] != ' ') {
				board[3] = computerCharacter;
				return 1;
			}
		}
		else if(board[1] == board[3] && board[3] == playerCharacter) {
			if(board[2] != ' ')  {
				board[2] = computerCharacter;
				return 1;
			}
		}
		else if(board[1] == board[4] && board[4] == playerCharacter) {
			if(board[7] != ' ') {
				board[7] = computerCharacter;
				return 1;
			}
		}
		else if(board[1] == board[7] && board[7] == playerCharacter) {
			if(board[4] != ' ') {
				board[4] = computerCharacter;
				return 1;
			}
		}
		else if(board[1] == board[5] && board[5] == playerCharacter) {
			if(board[9] != ' ') {
				board[9] = computerCharacter;
				return 1;
			}
		}
		else if(board[1] == board[9] && board[9] == playerCharacter) {
			if(board[5] != ' ') {
				board[5] = computerCharacter;
				return 1;
			}
		}
		else if(board[2] == board[3] && board[3] == playerCharacter) {
			if(board[1] != ' ') {
				board[1] = computerCharacter;
				return 1;
			}
		}
		else if(board[2] == board[5] && board[5] == playerCharacter) {
			if(board[8] != ' ') {
				board[8] = computerCharacter;
				return 1;
			}
		}
		else if(board[2] == board[8] && board[8] == playerCharacter) {
			if(board[5] != ' ') {
				board[5] = computerCharacter;
				return 1;
			}
		}
		else if(board[2] == board[5] && board[5] == playerCharacter) {
			if(board[8] != ' ') {
				board[8] = computerCharacter;
				return 1;
			}
		}
		else if(board[3] == board[5] && board[5] == playerCharacter) {
			if(board[7] != ' ') {
				board[7] = computerCharacter;
				return 1;
			}
		}
		else if(board[3] == board[7] && board[7] == playerCharacter) {
			if(board[5] != ' ') {
				board[5] = computerCharacter;
				return 1;
			}
		}
		else if(board[3] == board[6] && board[6] == playerCharacter) {
			if(board[9] != ' ') {
				board[9] = computerCharacter;
				return 1;
			}
		}
		else if(board[3] == board[9] && board[9] == playerCharacter) {
			if(board[6] != ' ') {
				board[6] = computerCharacter;
				return 1;
			}
		}
		else if(board[4] == board[7] && board[7] == playerCharacter) {
			if(board[1] != ' ') {
				board[1] = computerCharacter;
				return 1;
			}
		}
		else if(board[4] == board[5] && board[5] == playerCharacter) {
			if(board[6] != ' ') {
				board[6] = computerCharacter;
				return 1;
			}
		}
		else if(board[4] == board[6] && board[6] == playerCharacter) {
			if(board[5] != ' ') {
				board[5] = computerCharacter;
				return 1;
			}
		}
		else if(board[5] == board[8] && board[8] == playerCharacter) {
			if(board[2] != ' ') {
				board[2] = computerCharacter;
				return 1;
			}
		}
		else if(board[5] == board[6] && board[6] == playerCharacter) {
			if(board[4] != ' ') {
				board[4] = computerCharacter;
				return 1;
			}
		}
		else if(board[5] == board[7] && board[7] == playerCharacter) {
			if(board[3] != ' ') {
				board[3] = computerCharacter;
				return 1;
			}
		}
		else if(board[6] == board[9] && board[9] == playerCharacter) {
			if(board[3] != ' ') {
				board[3] = computerCharacter;
				return 1;
			}
		}
		else if(board[7] == board[8] && board[8] == playerCharacter) {
			if(board[9] != ' ') {
				board[9] = computerCharacter;
				return 1;
			}
		}
		else if(board[7] == board[9] && board[9] == playerCharacter) {
			if(board[8] != ' ') {
				board[8] = computerCharacter;
				return 1;
			}
		}
		return flag;
	}

	public static int computerChoosesCorners() {
		int flag = 0;
		int[] possibleCorners = {1,3,5,7};
		if(board[1]==' ' || board[3]!=' ' || board[5]!=' ' || board[7]!=' ') {
			while(true) {	
				int chosenIndex = 0 + (int)Math.random()*3;
				int chosenCorner = possibleCorners[chosenIndex];
				if(board[chosenCorner] == ' ') {
					board[chosenCorner] = computerCharacter;
					break;
				}
			}
			return 1;
		}
		return flag;
	}

	public static int computerSubSequentChoice() {

		int flag = 0;

		if(board[5]==' ') {

			board[5]= computerCharacter;
			return 1;
		}

		int[] possibleSides = {2,4,6,8};
		if(board[2]==' ' || board[4]!=' ' || board[6]!=' ' || board[8]!=' ') {
			while(true) {	
				int chosenIndex = 0 + (int)Math.random()*3;
				int chosenSide = possibleSides[chosenIndex];
				if(board[chosenSide] == ' ') {
					board[chosenSide] = computerCharacter;
					break;
				}
			}
			return 1;
		}
		return flag;
	}

	public static void main(String[] args) {

		System.out.println("----------Welcome to Tic Tac Toe Game----------");
		System.out.println();
		String choice = "N";
		char gameState = CONTINUE;
		do {
			initializeBoard();
			chooseCharacter();
			showBoard();
			tossForFirstPlayer();
			while(gameState != TIE || gameState!= playerCharacter || gameState!=computerCharacter) {

				if(currentPlayer == playerCharacter) {
					currentBoard();
					chooseBoardPosition();
					gameState = checkForGameStateEveryMove();
					if(gameState == CONTINUE)
						currentPlayer = computerCharacter;
					else if(gameState == TIE) {
						System.out.println("Draw Game");
						System.out.print("Do you want to continue(Y/N): ");
						choice=scanner.nextLine();
						break;
					}
					else if(gameState == playerCharacter) {
						System.out.println("Player Wins!");
						System.out.print("Do you want to continue(Y/N): ");
						choice=scanner.nextLine();
						break;
					}
					else if(gameState == computerCharacter) {
						System.out.println("Computer Wins!");
						System.out.print("Do you want to continue(Y/N): ");
						choice=scanner.nextLine();
						break;
					}
				}
				else {

					if(computerFinalWinningMove() == 1) {
						System.out.println("Computer Wins!");
						System.out.print("Do you want to continue(Y/N): ");
						choice=scanner.nextLine();
						break;
					}
					else if(blockPlayerFinalWinningMove()==1) {
						currentPlayer = playerCharacter;
						continue;
					}
					else if(computerChoosesCorners() == 1) {

						currentPlayer = playerCharacter;
						continue;
					}
					else {
						if(computerSubSequentChoice()==1) {
							currentPlayer = playerCharacter;
							continue;
						}
					}
				}
			}
		}while(!choice.equalsIgnoreCase("N"));
	}
}