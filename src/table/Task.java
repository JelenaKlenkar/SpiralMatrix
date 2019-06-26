package table;



import javax.swing.JOptionPane;

public class Task {
	
	public static void main(String[] args) {
		
		int Rows=Integer.parseInt(JOptionPane.showInputDialog("a"));
		int Columns=Integer.parseInt(JOptionPane.showInputDialog("b"));
		
		int spiral [][]= new int[Rows][Columns];
		
		int value =1;
		int minRow=0;
		int maxRow=Rows-1;
		int minColumn=0;
		int maxColumn=Columns-1;
		
		
		
		while(value <= Columns*Rows) {
			//from final row  right bottom to left bottom
		for(int i=maxColumn;i>=minColumn;i--) {
			spiral [maxRow][i]=value++;
		
			
		}
		//from final row left bottom up to first row left top
		for(int i=maxRow-1;i>=minRow;i--) {
			spiral[i][minColumn]=value++;
			
		}
		//from first row left top to right top
		for(int i=minColumn +1;i<=maxColumn;i++) {
			spiral[minRow][i]=value++;
		
		}
		
		//from right max row-3 to right max row-1
		
		for(int i=minRow +1;i<=maxRow-1;i++) {
			spiral[i][maxRow]=value++;
			
		}
		
		
		minColumn++;
        
        minRow++;
         
        maxColumn--;
         
        maxRow--;
		}
		
		for(int i=0;i<Rows;i++) {
			for(int j=0;j<Columns;j++) {
				System.out.print(spiral[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}


}

