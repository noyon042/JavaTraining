package Class5;

public class NewT {
	public static void main(String[] args) {
		
		int [][] m= {
				     {1,2,3},
				     {4,5,6},
				     {7,8,9}
				     };
		
		int [][] n= {
				{9,8,7},
				{6,5,4},
				{3,2,1}
			     };
		
		int [][]result=new int[3][3];
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				
				result[i][j]=m[i][j]+n[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
//		for(int i=0;i<result.length;i++) {
//			for(int j=0;j<result.length;j++) {
//				
//			}
//			
//			
//		}
	}
}
