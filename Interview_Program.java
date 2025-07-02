package Amezon_Sourse;

import java.util.Arrays;

public class Interview_Program {

	public static void main(String[] args) {
		String input="sorry! some error occured";
		
		char ch[]=input.toCharArray();
		
		//System.out.println(Arrays.toString(ch));
		
	
		for(int i=0;i<ch.length;i++)
		{
			int count =0;
			if(ch[i]=='0' || ch[i]==' ')continue;
			
		  for(int j=i+1;j<ch.length;j++)
				  {
			  		
			          if(ch[i]==ch[j])
			          {
			        	count++; 
			        	ch[j]='0';
			        	
			          }
				  }
		  if(count>0) System.out.print(ch[i]); 
		}
         
	}

}
