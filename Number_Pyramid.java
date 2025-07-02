package Interview_Program;

public class Number_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int k=1;
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
				//k++;
			}
			System.out.println();
		}
	}

}
