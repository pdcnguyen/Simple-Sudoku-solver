
public class SudokuSolver {
	
	int[][]n = new int[9][9];
	boolean[][]c = new boolean[9][9];

	public SudokuSolver(int[][] grid) {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(grid[i][j]==0) continue;
				
				n[i][j]=grid[i][j];
				c[i][j]=true;
			}}
	}
	
    public static boolean check(int[][]s, int n, int a, int b) {
		for(int j=0; j<9;j++) {
			if(j==b) continue;
			if(n==s[a][j]) return false;
		}
		
		for(int i=0; i<9; i++) {
			if(i==a) continue;
			if(n==s[i][b]) return false;
		}
	return true;
}
    
    public static boolean try1(int[][]n, boolean[][]c) {
    	  
  	  for(int i=0; i<9; i++) {
  		  for(int j=0; j<9; j++) {
  			  
  			  if(c[i][j]==false) { 
  				  for(int x=1; x<10; x++) {
  					  if(check(n, x, i, j)) {
  						  n[i][j]=x;
  						  c[i][j]=true;
  						  if(try1(n,c)) {
  							  return true;
  						  }
  					  }
  				  }
  				  n[i][j]=0;
  				  c[i][j]=false;
  				  return false;
  			  }
  			  
  		  }
  	  }
  	  return true;
  		}
    
    
    public int[][] solve() {
        if(try1(n, c))return n;
        return null;
    }
}
