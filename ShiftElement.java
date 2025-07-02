package Interview_Program;

public class ShiftElement {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,4,5,0,0,8};
		
		for(int i=a.length-1;i>=0;i--)
		{
		  if(a[i]==0)
		  {
			  a[i+1]=a[i];
		  }
		  System.out.println(a[i]);
		}
	}

}
