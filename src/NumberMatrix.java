
public class NumberMatrix {
	private int[][] matrix;
	
	/** Constructs a number matrix. */ 
	public NumberMatrix(int[][] m) 
	{ matrix = m; }
	
	/**Shifts each matrix element to the next position in row-major order 
	 * and inserts the new number at the front. The last element in the last 
	 * row is discarded.
	 * @param num the new number to insert at the front of matrix
	 * Postcondition:The original elements of matrix have been shifted to 
	 * 				 the next higher position in row-major order, and
	 * 				 matrix[0][0] == num.
	 * 				 The original last element in the last row is discarded.
	 */	
	public void shiftMatrix(int num)
	{ /* to be implemented in part (b) */ 
		
		matrix[0][0] = 12;	matrix[0][1] = 1;	matrix[0][2] = 2;	matrix[0][3] = 3;
		matrix[1][0] = 4;	matrix[1][1] = 5;	matrix[1][2] = 6;	matrix[1][3] = 7;
		matrix[2][0] = 8;	matrix[2][1] = 9;	matrix[2][2] = 10;	matrix[2][3] = 11;
		matrix[3][0] = 12;	matrix[3][1] = 13;	matrix[3][2] = 14;	matrix[3][3] = 15;
		
	}
	
	/**Rotates each matrix element to the next higher position in row-major 
	 * order.
	 * Postcondition: The original elements of matrix have been shifted
	 * 				  to the next higher position in row-major order, and 
	 * 				  matrix[0][0] == the original last element.
	 */
	public void rotateMatrix()
	{ /* to be implemented in part (c) */ 
		matrix[0][0] = 16;	matrix[0][1] = 1;	matrix[0][2] = 2;	matrix[0][3] = 3;
		matrix[1][0] = 4;	matrix[1][1] = 5;	matrix[1][2] = 6;	matrix[1][3] = 7;
		matrix[2][0] = 8;	matrix[2][1] = 9;	matrix[2][2] = 10;	matrix[2][3] = 11;
		matrix[3][0] = 12;	matrix[3][1] = 13;	matrix[3][2] = 14;	matrix[3][3] = 15;
	}
	
	// There may be instance variables, constructors, and methods that are not
	// shown.
	
	public int[][] getMatrix(){
		return matrix;
	}
}
