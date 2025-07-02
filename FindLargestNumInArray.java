package Interview_Program;

public class FindLargestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,30,20,70,60,40};
		int max1;
		int max2;
		
		if(a[0]>a[1])
		{
			max1=a[0];
			max2=a[1];
		}
		else
		{
			max1=a[1];
			max2=a[0];
			
			for(int i=2;i<a.length-1;i++)
			{
				if(a[i]>max1)
				{
					max2=max1;
					max1=a[i];
				}
				else
				{
					max2=a[i];
				}
			}
			System.out.println("Largest Number="+max1);
			System.out.println("SecondLargest Number="+max2);
		}
		

	}

}
