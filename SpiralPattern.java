package Variation;

public class SpiralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int[][] a=new int[n][n];
		
		int jmin=0, jmax=a.length-1, imin=0, imax=a.length-1;
		
		int count=n*n;
		
		while (jmin<=jmax)
		{
			for (int i = jmin; i <=jmax; i++) 
			{
				a[imin][i]=count--;
				
			}
			imin++;
			for (int i = imin; i <=imax; i++)
			{
				a[i][jmax]=count--;
			}
			jmax--;
			for (int i = jmax; i >=jmin; i--) {
				a[imax][i]=count--;
			}
			imax--;
			for (int i = imax; i >= imin; i--) {
				a[i][jmin]=count--;
			}
			jmin++;
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
