import java.util.Arrays;

public class MatrixMultiplier {

	public static void main(String[] args) {

		// define a 3 x2 matrix
		int matrix1[][] = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };

		int matrix2[][] = new int[][] { { 1, 4 }, { 2, 5 }, { 3, 6 } };

		int result[][] = matrixMultiplier(matrix1, matrix2);
		
		for(int i =0;i<result.length;i++){
			for(int j=0;j<result[0].length;j++){
				System.out.print(result[i][j]+"\t");
				
			}
			System.out.println();
		}

	}

	private static int[][] matrixMultiplier(int[][] matrix1, int[][] matrix2) {

		int matrix1Rows = matrix1.length;
		int matrix1Columns = matrix1[0].length;
		int matrix2Columns = matrix2[0].length;
		
		int sum=0;

		int result[][] = new int[matrix1Rows][matrix2Columns];
		
		for (int i = 0; i < matrix1Rows; i++) {
			for (int j = 0; j < matrix2Columns; j++) {
				 for (int k = 0; k < matrix1Columns; k++) { 
					 
					 System.out.println(i);
					 System.out.println(j);
					 System.out.println(k);
					 
					/*System.out.println(matrix1[i][k]);
					System.out.println(matrix2[k][j]);*/
			            result[i][j] += matrix1[i][k] * matrix2[k][j];
			        }
			}
		}

		return result;

	}

}
