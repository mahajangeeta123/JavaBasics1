package Interview_Program;

public class InterviewMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,4,5},{1,2,3},{3,5,7}};
	      
	      int min=a[0][0];
	      //System.out.println(a[2][2]);
	      
	      for(int i=0;i<3;i++)
	      {
	    	  for(int j=0;j<3;j++)
	    	  {
	    		  if(a[i][j]<min)
	    		  {min=a[i][j];}
	    	  }
	    	  
	      }
	      System.out.println(min);
		}

	}


