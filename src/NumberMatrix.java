
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
		
		
		
	}
	
	/**Rotates each matrix element to the next higher position in row-major 
	 * order.
	 * Postcondition: The original elements of matrix have been shifted
	 * 				  to the next higher position in row-major order, and 
	 * 				  matrix[0][0] == the original last element.
	 */
	public void rotateMatrix()
	{ /* to be implemented in part (c) */ 
		
	}
	
	// There may be instance variables, constructors, and methods that are not
	// shown.
	
	public int[][] getMatrix(){
		return matrix;
	}
}
