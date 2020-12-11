package tiktactoe;

import java.util.Scanner;

public class tictactoe {

	static int won = 0;
	static int retry = 1;

	static String[][] board = new String[3][3];

	static int boardVal = 1;
	private static final int Rows = 3;
	private static final int Column = 3;
	
	static String user = "";
	static int turn = 0;
	static int counter = 0;
	
	static int box = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Yeetabix's Tik Tok Toe");
		System.out.println("---------------------------------");
		System.out.println("Player one's counter is 0, Player two's counter is X");
		System.out.println("Select a number to set the box to your counter");

		initalizeBoard();
		PrintBoard();

		while (won == 0) {
			if (retry == 1) {
				Player1();
			} 
			else if (retry == 2) {
				Player2();
			}
		}
		
		if (retry == 1) {
			System.out.println("Player 0 Wins!");
		}
		else if (retry == 2) {
			System.out.println("Player X Wins!");
		}
		System.out.println("The Game is now Finished!! :D");
	}

	private static void initalizeBoard() {
		
		for (int i = 0; i < Rows; i++) {
			for (int j = 0; j < Column; j++) {
				int l = boardVal++;
				String k = Integer.toString(l);
				System.out.println("i = " + i + " j = " + j+ " k = " + k);
				board[i][j] = k ;
			}
		}
	}
	
	public static void PrintBoard() {
		
		System.out.println("Board");
		System.out.println(board[0][0]);
		System.out.println(board[0][1]);
		System.out.println(board[0][2]);
		System.out.println(" |---+---+---|");
		System.out.println(" | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | ");
		System.out.println(" |---+---+---|");
		System.out.println(" | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | ");
		System.out.println(" |---+---+---|");
		System.out.println(" | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | ");
		System.out.println(" |---+---+---|");
	}
	
	public static void checkCondition(String user, int won, int counter, int retry) {
		

		System.out.println("User    : " + user);
		System.out.println("Won     : " + won);
		System.out.println("Counter : " + counter);
		System.out.println("Retry   : " + retry);
		
		if (board[0][0].equalsIgnoreCase(user) && (board[0][1].equalsIgnoreCase(user)) && (board[0][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[1][0].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[1][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[2][0].equalsIgnoreCase(user) && (board[2][1].equalsIgnoreCase(user)) && (board[2][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][0].equalsIgnoreCase(user) && (board[1][0].equalsIgnoreCase(user)) && (board[2][0].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][1].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[2][1].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][2].equalsIgnoreCase(user) && (board[1][2].equalsIgnoreCase(user)) && (board[2][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][0].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[2][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][2].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[2][0].equalsIgnoreCase(user))) {
			won = 1;
		} else if (counter == 8) {
			System.out.println("Its a Draw!");
			retry = 0;
			won = 1;
		} else {
			counter++;
		}
	}
	
	public static void Player1() {
		
		System.out.println("Player X's turn.");
		user = "x";
		boxy();
		if (turn == 1) {
			retry = 1;
		} else {
			retry = 2;
		}

		PrintBoard();

		if (board[0][0].equalsIgnoreCase(user) && (board[0][1].equalsIgnoreCase(user)) && (board[0][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[1][0].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[1][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[2][0].equalsIgnoreCase(user) && (board[2][1].equalsIgnoreCase(user)) && (board[2][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][0].equalsIgnoreCase(user) && (board[1][0].equalsIgnoreCase(user)) && (board[2][0].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][1].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[2][1].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][2].equalsIgnoreCase(user) && (board[1][2].equalsIgnoreCase(user)) && (board[2][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][0].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[2][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][2].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[2][0].equalsIgnoreCase(user))) {
			won = 1;
		} else if (counter == 8) {
			System.out.println("Its a Draw!");
			retry = 0;
			won = 1;
		} else {
			counter++;
		}
	}

	public static void Player2() {
		
		System.out.println("Player 0's turn.");
		user = "0";
		boxy();
		if (turn == 1) {
			retry = 2;
		} else {
			retry = 1;
		}

		PrintBoard();

		if (board[0][0].equalsIgnoreCase(user) && (board[0][1].equalsIgnoreCase(user)) && (board[0][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[1][0].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[1][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[2][0].equalsIgnoreCase(user) && (board[2][1].equalsIgnoreCase(user)) && (board[2][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][0].equalsIgnoreCase(user) && (board[1][0].equalsIgnoreCase(user)) && (board[2][0].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][1].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[2][1].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][2].equalsIgnoreCase(user) && (board[1][2].equalsIgnoreCase(user)) && (board[2][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][0].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[2][2].equalsIgnoreCase(user))) {
			won = 1;
		} else if (board[0][2].equalsIgnoreCase(user) && (board[1][1].equalsIgnoreCase(user)) && (board[2][0].equalsIgnoreCase(user))) {
			won = 1;
		} else if (counter == 8) {
			System.out.println("Its a Draw!");
			retry = 0;
			won = 1;
		} else {
			counter++;
		}
	}

	public static void boxy() {
		
		box = scan.nextInt();
		switch (box) {

		case 1:
			if (board[0][0].equalsIgnoreCase("0") || board[0][0].equalsIgnoreCase("X")) {
				System.out.println("Box 1 has already been filled,\nPlease select a box that has not already been used!");
				turn = 1;
			} else {
				
				board[0][0] = user;
				turn = 0;
			}
			break;
		case 2:
			if (board[0][1].equalsIgnoreCase("0") || board[0][1].equalsIgnoreCase("x")) {
				System.out.println("Box 2 has already been filled,\nPlease select a box that has not already been used!");
				turn = 1;
			} else {
				board[0][1] = user;
				turn = 0;
			}
			break;
		case 3:
			if (board[0][2].equalsIgnoreCase("0") || board[0][2].equalsIgnoreCase("x")) {
				System.out.println("Box 3 has already been filled,\nPlease select a box that has not already been used!");
				turn = 1;
			} else {
				board[0][2] = user;
				turn = 0;
			}
			break;
		case 4:
			if (board[1][0].equalsIgnoreCase("0") || board[1][0].equalsIgnoreCase("x")) {
				System.out.println("Box 4 has already been filled,\nPlease select a box that has not already been used!");
				turn = 1;
			} else {
				board[1][0] = user;
				turn = 0;
			}
			break;
		case 5:
			if (board[1][1].equalsIgnoreCase("0") || board[1][1].equalsIgnoreCase("x")) {
				System.out.println("Box 5 has already been filled,\nPlease select a box that has not already been used!");
				turn = 1;
			} else {
				board[1][1] = user;
				turn = 0;
			}
			break;
		case 6:
			if (board[1][2].equalsIgnoreCase("0") || board[1][2].equalsIgnoreCase("x")) {
				System.out.println("Box 6 has already been filled,\nPlease select a box that has not already been used!");
				turn = 1;
			} else {
				board[1][2] = user;
				turn = 0;
			}
			break;
		case 7:
			if (board[2][0].equalsIgnoreCase("0") || board[2][0].equalsIgnoreCase("x")) {
				System.out.println("Box 7 has already been filled,\nPlease select a box that has not already been used!");
				turn = 1;
			} else {
				board[2][0] = user;
				turn = 0;
			}
			break;
		case 8:
			if (board[2][1].equalsIgnoreCase("0") || board[2][1].equalsIgnoreCase("x")) {
				System.out.println("Box 8 has already been filled,\nPlease select a box that has not already been used!");
				turn = 1;
			} else {
				board[2][1] = user;
				turn = 0;
			}
			break;
		case 9:
			if (board[2][2].equalsIgnoreCase("0") || board[2][2].equalsIgnoreCase("x")) {
				System.out.println("Box 9 has already been filled,\nPlease select a box that has not already been used!");
				turn = 1;
			} else {

				board[2][2] = user;
				turn = 0;
			}
			break;
		default:
			System.out.println("Error! Not a Valid Move!");
			turn = 1;
		}
	}
}


