// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class MatrixMultiplication {
    private Scanner key;

    public void MatrixMultiplicationMain() {
		
		key = new Scanner(System.in);
		
		System.out.println("Enter the rows of matrix 1:");
		int mat1_rows = key.nextInt();
		
		System.out.println("Enter the columns of matrix 1:");
		int mat1_cols = key.nextInt();
		
		System.out.println("Enter the rows of matrix 2:");
		int mat2_rows = key.nextInt();
		
		if(mat1_cols != mat2_rows)
		{
			System.out.println("Cannot multiply these matrices, dimension mismatch!");
			System.exit(0);
		}
		
		System.out.println("Enter the columns of matrix 2:");
		int mat2_cols = key.nextInt();
		
		int[][] matrix1 = new int[mat1_rows][mat1_cols];
		int[][] matrix2 = new int[mat2_rows][mat2_cols];
		
		//populate the matrices
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0; j < mat1_cols; j++)
			{
				System.out.println("Enter the matrix value at position (" + i + ", " + j + "):");
				
				matrix1[i][j] = key.nextInt();
			}
		}
		
		for(int i = 0; i < mat2_rows; i++)
		{
			for(int j = 0; j < mat2_cols; j++)
			{
				System.out.println("Enter the matrix value at position (" + i + ", " + j + "):");
				
				matrix2[i][j] = key.nextInt();
			}
		}
		
		int sum = 0;
		
		int[][] productMatrix = new int[mat1_rows][mat2_cols];
		
		//multiple the 2 matrices
		
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0 ; j < mat2_cols; j++)
			{
				for(int k = 0; k < mat1_cols; k++)
				{
					sum += matrix1[i][k] * matrix2[k][j];
				}
			
				productMatrix[i][j] = sum;
				sum = 0;
			}
		}
		
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0; j < mat2_cols; j++)
			{
				System.out.print(productMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
