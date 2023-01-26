
public class ArrayFun {

	//public int[] myArray;
	public Square[] myArray;
	public int index;
	public Square S;
	
	//Default constructor
	public ArrayFun()
	{
		myArray = new Square[6];
		
		for(int i = 0; i < 6; i++)
		{
			myArray[i] = new Square(i);
		}
		
		
	}
	
	//Preferred Constructor
	//Square0-Square5 are sides and their values
	
	/*Each Square type variable (Square0-Square5)
	 * are assigned to the myArray index values
	 * and each of those Square type variables are actually
	 * the sides size of their own 
	 */
	
	//Sets the size variable to the size of the array length
	//int size = myArray.length;
	public ArrayFun(int sides, int sides1, int sides2
					,int sides3, int sides4, int sides5)//public ArrayFun(int size)
	{
		/*This Square[] instance defines the square
		 * variables as a Array type, so
		 * that it can be assigned to 
		 * myArray as a value for each
		 * of it's array indexes
		 * 
		 */
		
		myArray = new Square[6];
		
		//Square Square0 = new Square(5);
		
		
		for(int i = 0; i < 6; i++)
		{
			myArray[i] = new Square(i);
		}
		
		/*
		myArray[0] = sides;
		myArray[1] = sides1;
		myArray[2] = sides2;
		myArray[3] = sides3;
		myArray[4] = sides4;
		myArray[5] = sides5;
		*/
		
	}
	
	
	//public void setArrayItem('i' index,Square s)
	public void setArrayItem(int index,Square S)
	{
		//this.setArrayItem(index, s);
		this.index = index;
		this.S = S;

		myArray[index] = S;
	}
	
	public Square getArrayItem(int index)
	{
		return myArray[index];
	}
	
	/*Square array printed forwards 
	 * with each of the indexes and its values
	*/
		
	public void forward()
	{
		for(int i = 0; i < 6; i++)
		{
			System.out.println(myArray[i].getArea());	
		}
	}
	
	/*Square array printed backwards 
	 * with each of the indexes and its values
	*/
	public void backward()
	{
		for(int i = 5; i >= 0; i--)
		{
			System.out.println(myArray[i].getArea());	
		}

	}
	
	/*Sum() goes through all the array values,
	 * Adds them up, then returns out the sum
	 * 
	 */
	
	
	public void sum()
	{
		int accuml = 0;
		for(int i = 0; i < 6; i++)
		{
			accuml = accuml + myArray[i].getArea();
		}
		System.out.println(accuml);
	}
	
}

