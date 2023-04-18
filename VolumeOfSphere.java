package Variation;

public class VolumeOfSphere {
	
/*
ProblemStatement
calculate volume of sphere, print answer in int
formula :
4πr*r*r/3
*/

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		double r = 23;	        
		myCode(r);
	}
	//EndOfMainMethod
	private static void myCode(double r)
	{
		System.out.println("Volume is:"+(int)Math.ceil(4*3.14*r*r*r/3));
	}
}

