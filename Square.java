/**
 * 
 */

/**
 * @author ferdi
 *
 */



public class Square {
	
	private int side;

	//default constructor
	public Square()
	{
		this.side = 0; //This sets the default side to 0.0
	}
	//default constructor concludes here
	
	//Preferred Constructor
	public Square(int side)
	{
		this.side = side;
	}
	//Preferred constructor concludes here
	
	public double getSide()
	{
		return side;
	}
	
	public int getArea()
	{
		int area = side *2; /*Calculates the given sides times 2, then
		 						Stores the result to the area variable*/
		return area;
	}
	//Area method concludes here
}
