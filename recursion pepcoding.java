package carry;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class recursionpepcoding {

	//public static void main(String[] args) throws Exception {
		//		// printing decreasing solution using recursion
//		
	Scanner sc = new Scanner(System.in);
		
//		//  note point: in  psvdthrows exception 
//		


//		
//		
//		int n = sc.nextInt();
		pdi(n);
}
	public static void pdi(int n){
		if(n==0) {
			return;
		}
		System.out.println(n);
		pdi(n-1);
		System.out.println(n);

	
		
		// factorial using recursion
		
//		int n = sc.nextInt();
//		int f =  factorial(n);
//		System.out.println(f);
//		
//	}
//	public static int  factorial(int n) {
//		if(n==1) {
//			return 1;
//		}
//		
//		int fnm1 = factorial(n-1);
//		
//		int fn = n*fnm1;
//		return fn;
		
		  
		
//		
//		// calculate power using recursion
//		
//		int x = sc.nextInt();
//		int n = sc.nextInt();
//		int xn = power(x,n);
//		System.out.println(xn);
//	}
//		public static int power(int x , int n){
//			if(n==0) {
//				return 1;
//			}
//			
//			int xpnb2 =  power(x ,n/2);
//			int xn =  xpnb2 * xpnb2;
//			if(n%2 ==1 ) {
//				xn = xn*x;
//				
//			}
//			return xn;
//		}
//		
		
		
		
		
		// display using recursion 
//		
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i =0; i<arr.length ; i++) {
//			arr[i] = sc.nextInt();
//		}
//		displayArr(arr,0);
//}
// public static void displayArr(int[] arr , int idx) {
//	 if(idx== arr.length ) {
//		 return;
//	 }
//	 System.out.print(arr[idx] + "");
//	 displayArr(arr , idx+1);
// }
       
	
	
	// display arr reverse 

  int n = sc.nextInt();
  int[]arr = new int[n];
//     for(int i =0 ; i<arr.length;i++) {
//    	 arr[i] = sc.nextInt();
//     }
//     displayArrReverse(arr,0);
//	}
//	public static void displayArrReverse(int[] arr , int idx) {
//	  if(idx == arr.length) {
//		  return;
//	  }
//	
//		displayArrReverse(arr , idx +1 );
//		System.out.println(arr[idx]);
//			
//		}
//	
//     
//  	
	
	
	
	// get keypad combination 
	
	
	
	
	
	
	
    public static void main(String[] args) throws Exception {


    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row){
        if(row == chess.length){
            System.out.println(qsf + ".");
            return;
        }
        for(int col = 0; col < chess.length; col++){
            if(chess[row][col] == 0 && isQueenSafe(chess, row, col) == true){
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isQueenSafe(int[][] chess, int row, int col){
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }





        for(int i = row, j = col - 1; j >= 0; j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        return true;
    }
}
	
	
	
	
