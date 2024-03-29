package src.practice;

import javax.swing.JOptionPane;

public class Task2 {
	public static void main(String[] args) {
		// Fill the table in spiral form from center counterclockwise starting from 1

		int Row = Integer.parseInt(JOptionPane.showInputDialog("Input number of rows: "));
		int Column = Integer.parseInt(JOptionPane.showInputDialog("Input number of columns: "));

		int[][] spiral = new int[Row][Column];

		int value = Row * Column;
		int r1 = 0;
		int r2 = Row - 1;
		int c1 = 0;
		int c2 = Column - 1;

		while (value >= 1) {
			// from first row left to right
			for (int i = c1; i <= c2; i++) {
				if (value >= 1) {
					spiral[r1][i] = value--;
				}
			}
			// from r1+1 down to r2-1
			for (int j = r1 + 1; j <= r2; j++) {
				if (value >= 1) {
					spiral[j][c2] = value--;
				}
			}
			// from c2-1 right to c1 left
			for (int i = c2 - 1; i >= c1; i--) {
				if (value >= 1) {
					spiral[r2][i] = value--;
				}
			}
			// from r2-1 down up to r1+1
			for (int j = r2 - 1; j >= r1 + 1; j--) {
				if (value >= 1) {
					spiral[j][c1] = value--;
				}
			}

			c1++;
			r1++;
			c2--;
			r2--;
		}

		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < Column; j++) {
				System.out.print(spiral[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
