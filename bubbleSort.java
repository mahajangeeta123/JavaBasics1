package Interview_Program;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {5,3,7,9,2,10};
        int temp;
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]<a[j])
        		{
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        	
        }
        for( int i=0;i<a.length;i++)
        	{System.out.println(a[i]);}
	}

}
