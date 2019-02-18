/**DJD Chapter 1: Memory Models Date 08-26-2017
 * 
 */

/**
 * @author SPOC-DJD
 * Practicing values in memory variables by drawing data models
 */
public class Memory_Models_DJD 
{

	/**
	 * @param args
	 */
public static void main(String[] args)
	{
	int var1 = 9;
		// draw a memory model for the first variable, var1
	int var2 = var1 + 1;
		// draw a memory model for the second variable, var2
	var1 = var2 + 6;
	// assign a new value for var1
	System.out.println(
			"var1: " + var1 + ", var2: " + var2);
	// print out- 'variable values' stored in memory for display
	}
}
