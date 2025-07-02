package Interview_Program;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[][]= {{2,4,5},{1,2,3},{3,5,7}};
      
      
      //System.out.println(a[2][2]);
      
      for(int i=0;i<3;i++)
      {
    	  for(int j=0;j<3;j++)
    	  {
    		  System.out.print(a[i][j]+"\t");
    	  }
    	  System.out.println();
      }
	}

}
