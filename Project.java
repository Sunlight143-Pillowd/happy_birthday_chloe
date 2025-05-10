package bored;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		int choices = 0;

		do {
			System.out.print("\n|=======================================================|");
			System.out.print("\n|\t\t   Binary Conversion\t\t\t|");
			System.out.print("\n|=======================================================|\n");
			System.out.println("|\t\t1 - Binary to Decimal\t\t\t|\n" + "|\t\t2 - Binary to Octadecimal\t\t|\n|"
					+ "\t\t3 - Binary to Hexadecimal\t\t|\n" + "|\t\t4 - Add Two Binary\t\t\t|\n"
					+ "|\t\t5 - Subtract Two Binary\t\t\t|\n" + "|\t\t6 - Multiply Two Binary\t\t\t|\n"
					+ "|\t\t7 - Divide Two Binary\t\t\t|\n" + "|\t\t8 - Exit\t\t\t\t|");
			System.out.print("|=======================================================|");
			System.out.print("\n\nChoose on the method you want to do: ");
			choices = sc.nextInt();
			switch (choices) {
			case 1:
				btd();
				break;
			case 2:
				bto();
				break;
			case 3:
				bth();
				break;
			case 4:
				add();
				break;
			case 5:
				sub();
				break;
			case 6:
				mult();
				break;
			case 7:
				div();
				break;
			case 8:
				exit();
				break;
			}

		} while (choices != 8);

	}

	private static void btd() {
		// TODO Auto-generated method stub
		int fnal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bin	: ");
		String bin = sc.next();
		char ch;
		int counter = bin.length();

		for (int j = 0; j < bin.length(); j++) {
			ch = bin.charAt(--counter);
			int power = (int) Math.pow(2, j);
			int ch1 = Integer.parseInt(Character.toString(ch));
			int result = ch1 * power;
			fnal = fnal + result;
		}
		System.out.print(fnal);
		System.out.println();
	}

	private static void bto() {
		// TODO Auto-generated method stub
		int fnal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bin	: ");
		String bin = sc.next();
		char ch;
		int counter = bin.length();

		for (int i = 0; i <= counter / 3; i++) {
			fnal = 0;
			for (int j = 0; j < 3; j++) {
				ch = bin.charAt(--counter);
				int power = (int) Math.pow(2, j);
				int ch1 = Integer.parseInt(Character.toString(ch));
				int result = ch1 * power;
				fnal = fnal + result;
				System.out.print(fnal);
			}
		}

		if (counter % 3 == 2) {
			fnal = 0;
			for (int j = 0; j < 2; j++) {
				ch = bin.charAt(--counter);
				int power = (int) Math.pow(2, j);
				int ch1 = Integer.parseInt(Character.toString(ch));
				int result = ch1 * power;
				fnal = fnal + result;
			}
			System.out.print(fnal);

		}

		else if (counter % 3 == 1) {
			fnal = 0;
			for (int j = 0; j < 1; j++) {
				ch = bin.charAt(--counter);
				int power = (int) Math.pow(2, j);
				int ch1 = Integer.parseInt(Character.toString(ch));
				int result = ch1 * power;
				fnal = fnal + result;
			}
			System.out.println(fnal);
		}
		System.out.println();
	}

	private static void bth() {
		// TODO Auto-generated method stub
		int fnal = 0;
		String fnal1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Bin	: ");
		String bin = sc.next();
		int counter = bin.length();
		char ch;

		for (int i = 0; i < bin.length() / 4; i++) {

			fnal = 0;
			for (int j = 0; j < 4; j++) {
				ch = bin.charAt(--counter);
				int power = (int) Math.pow(2, j);
				int ch1 = Integer.parseInt(Character.toString(ch));
				int result = ch1 * power;
				fnal = fnal + result;

			}
			if (fnal < 10) {
				System.out.println(fnal);
			} else {
				switch (fnal) {
				case 10: {
					fnal1 = "A";
					break;
				}
				case 11: {
					fnal1 = "B";
					break;

				}
				case 12: {
					fnal1 = "C";
					break;
				}
				case 13: {
					fnal1 = "D";
					break;
				}
				case 14: {
					fnal1 = "E";
					break;
				}
				case 15: {
					fnal1 = "F";
					break;
				}
				}
				System.out.println(fnal1);
			}
		}

		if (bin.length() % 4 == 3) {
			fnal = 0;
			for (int j = 0; j < 3; j++) {
				ch = bin.charAt(--counter);
				int power = (int) Math.pow(2, j);
				int ch1 = Integer.parseInt(Character.toString(ch));
				int result = ch1 * power;
				fnal = fnal + result;
			}
			System.out.println(fnal);

		}

		if (bin.length() % 4 == 2) {
			fnal = 0;
			for (int j = 0; j < 2; j++) {
				ch = bin.charAt(--counter);
				int power = (int) Math.pow(2, j);
				int ch1 = Integer.parseInt(Character.toString(ch));
				int result = ch1 * power;
				fnal = fnal + result;
			}
			System.out.println(fnal);

		}
		if (bin.length() % 4 == 1) {
			fnal = 0;
			for (int j = 0; j < 1; j++) {
				ch = bin.charAt(--counter);
				int power = (int) Math.pow(2, j);
				int ch1 = Integer.parseInt(Character.toString(ch));
				int result = ch1 * power;
				fnal = fnal + result;
			}
			System.out.println(fnal);

		}
		System.out.println();
	}

	private static void add() {
		// TODO Auto-generated method stub
		int fnal = 0;
		int fnal1 = 0;
		int fnal2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bin	: ");
		String bin = sc.next();
		int counter = bin.length();
		char ch;
		for (int i = 0; i < bin.length(); i++) {
			ch = bin.charAt(--counter);
			int power = (int) Math.pow(2, i);
			int ch1 = Integer.parseInt(Character.toString(ch));
			int result = ch1 * power;
			fnal = fnal + result;
		}

		System.out.print("Bin	: ");
		String bin1 = sc.next();
		int counter2 = bin1.length();
		for (int j = 0; j < bin1.length(); j++) {
			char ch2 = bin1.charAt(--counter2);
			int power = (int) Math.pow(2, j);
			int ch3 = Integer.parseInt(Character.toString(ch2));
			int result1 = ch3 * power;
			fnal1 = fnal1 + result1;
		}

		fnal2 = fnal + fnal1;
		System.out.println(bin + " + " + bin1 + " = " + fnal2);
		System.out.println();
	}

	private static void sub() {
		// TODO Auto-generated method stub
		int fnal = 0;
		int fnal1 = 0;
		int fnal2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bin	: ");
		String bin = sc.next();
		int counter = bin.length();
		char ch;
		for (int i = 0; i < bin.length(); i++) {
			ch = bin.charAt(--counter);
			int power = (int) Math.pow(2, i);
			int ch1 = Integer.parseInt(Character.toString(ch));
			int result = ch1 * power;
			fnal = fnal + result;
		}

		System.out.print("Bin	: ");
		String bin1 = sc.next();
		int counter2 = bin1.length();
		for (int j = 0; j < bin1.length(); j++) {
			char ch2 = bin1.charAt(--counter2);
			int power = (int) Math.pow(2, j);
			int ch3 = Integer.parseInt(Character.toString(ch2));
			int result1 = ch3 * power;
			fnal1 = fnal1 + result1;
		}

		fnal2 = fnal - fnal1;
		System.out.println(bin + " - " + bin1 + " = " + fnal2);
		System.out.println();
	}

	private static void mult() {
		// TODO Auto-generated method stub
		int fnal = 0;
		int fnal1 = 0;
		int fnal2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bin	: ");
		String bin = sc.next();
		int counter = bin.length();
		char ch;
		for (int i = 0; i < bin.length(); i++) {
			ch = bin.charAt(--counter);
			int power = (int) Math.pow(2, i);
			int ch1 = Integer.parseInt(Character.toString(ch));
			int result = ch1 * power;
			fnal = fnal + result;
		}

		System.out.print("Bin	: ");
		String bin1 = sc.next();
		int counter2 = bin1.length();
		for (int j = 0; j < bin1.length(); j++) {
			char ch2 = bin1.charAt(--counter2);
			int power = (int) Math.pow(2, j);
			int ch3 = Integer.parseInt(Character.toString(ch2));
			int result1 = ch3 * power;
			fnal1 = fnal1 + result1;
		}

		fnal2 = fnal * fnal1;
		System.out.println(bin + " x " + bin1 + " = " + fnal2);
		System.out.println();
	}

	private static void div() {
		// TODO Auto-generated method stub
		int fnal = 0;
		int fnal1 = 0;
		int fnal2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bin	: ");
		String bin = sc.next();
		int counter = bin.length();
		char ch;
		for (int i = 0; i < bin.length(); i++) {
			ch = bin.charAt(--counter);
			int power = (int) Math.pow(2, i);
			int ch1 = Integer.parseInt(Character.toString(ch));
			int result = ch1 * power;
			fnal = fnal + result;
		}

		System.out.print("Bin	: ");
		String bin1 = sc.next();
		int counter2 = bin1.length();
		for (int j = 0; j < bin1.length(); j++) {
			char ch2 = bin1.charAt(--counter2);
			int power = (int) Math.pow(2, j);
			int ch3 = Integer.parseInt(Character.toString(ch2));
			int result1 = ch3 * power;
			fnal1 = fnal1 + result1;
		}

		fnal2 = fnal / fnal1;
		System.out.println(bin + " / " + bin1 + " = " + fnal2);
		System.out.println();
	}

	private static void exit() {
		// TODO Auto-generated method stub
		System.out.print("Exiting");
		int loop = 0;
		while (loop != 3) {
			try {
				for (int i = 0; i < 3; i++) {
					System.out.print(".");
					Thread.sleep(150);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			loop++;
		}

		System.out.println("\n");
		System.out.print("\n|=======================================================|");
		System.out.print("\n|\t\t     Program Close\t\t\t|");
		System.out.print("\n|=======================================================|\n");
	}

}
