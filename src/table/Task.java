package table;

import javax.swing.JOptionPane;

public class Task {

	public static void main(String[] args) {

		int Row = Integer.parseInt(JOptionPane.showInputDialog("Input number of Rows: "));
		int Column = Integer.parseInt(JOptionPane.showInputDialog("Input number of Columns: "));

		int spiral[][] = new int[Row][Column];

		int value = 1;
		int r1 = 0;
		int r2 = Row - 1;
		int c1 = 0;
		int c2 = Column - 1;

		while (value <= Column * Row) {
			// from final row right bottom to left bottom
			for (int i = c2; i >= c1; i--) {
				spiral[r2][i] = value++;

			}
			// from final row left bottom up to first row left top
			for (int i = r2 - 1; i >= r1; i--) {
				spiral[i][c1] = value++;

			}
			// from first row left top to right top
			for (int i = c1 + 1; i <= c2; i++) {
				spiral[r1][i] = value++;

			}

			// from right max row-3 to right max row-1

			for (int i = r1 + 1; i <= r2 - 1; i++) {
				spiral[i][c2] = value++;

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
