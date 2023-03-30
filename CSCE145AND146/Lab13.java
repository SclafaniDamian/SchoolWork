// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Lab13 {
    private Scanner key;

    public void Lab13Main() {
		
		key = new Scanner(System.in);
		
		System.out.println("Enter the rows of matrix 1:");
		int mat1_rows = key.nextInt();
		
		System.out.println("Enter the columns of matrix 1:");
		int mat1_cols = key.nextInt();
		
		System.out.println("Enter the rows of matrix 2:");
		int mat2_rows = key.nextInt();
		
		System.out.println("Enter the columns of matrix 2:");
		int mat2_cols = key.nextInt();
		
		if((mat1_cols != mat2_cols) || (mat1_rows != mat2_rows))
		{
			System.out.println("Cannot subtract these matrices, dimension mismatch!");
			System.exit(0);
		}
		
		int[][] matrix1 = new int[mat1_rows][mat1_cols];
		int[][] matrix2 = new int[mat2_rows][mat2_cols];
		
		//populate the matrices
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0; j < mat1_cols; j++)
			{
				System.out.println("Enter the matrix(1) value at position (" + i + ", " + j + "):");
				
				matrix1[i][j] = key.nextInt();
			}
		}
		
		for(int i = 0; i < mat2_rows; i++)
		{
			for(int j = 0; j < mat2_cols; j++)
			{
				System.out.println("Enter the matrix(2) value at position (" + i + ", " + j + "):");
				
				matrix2[i][j] = key.nextInt();
			}
		}
		
		int[][] subtractMatrix = new int[mat1_rows][mat2_cols];
		
		int sum = 0;
		
		//subtracting the matrices
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0; j < mat2_cols; j++)
			{
				
				sum += matrix1[i][j] - matrix2[i][j];
				subtractMatrix[i][j] = sum;
				sum = 0;
			}
		}
		
		
		//printing the matrices
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0; j < mat2_cols; j++)
			{
				System.out.print(subtractMatrix[i][j] + " ");
			}
			System.out.println();
		}
			

	}
}
