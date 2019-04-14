
public class Test {

	public static void main(String[] args) {
		int[][] puzzle   = 
			   {{0, 0, 6, 1, 0, 0, 0, 0, 8}, 
                {0, 8, 0, 0, 9, 0, 0, 3, 0}, 
                {2, 0, 0, 0, 0, 5, 4, 0, 0}, 
                {4, 0, 0, 0, 0, 1, 8, 0, 0}, 
                {0, 3, 0, 0, 7, 0, 0, 4, 0}, 
                {0, 0, 7, 9, 0, 0, 0, 0, 3}, 
                {0, 0, 8, 4, 0, 0, 0, 0, 6}, 
                {0, 2, 0, 0, 5, 0, 0, 8, 0}, 
                {1, 0, 0, 0, 0, 2, 5, 0, 0}};
		
		SudokuSolver a = new SudokuSolver(puzzle);
		
		int[][]m=a.solve();
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		}
}
