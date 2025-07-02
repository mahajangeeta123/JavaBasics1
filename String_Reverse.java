package Interview_Program;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String input="Welcome";
           String output="";
           
           for(int i=input.length()-1;i>=0;i--)
           {
        	   char c1=input.charAt(i);
        	   output=output+c1;
           }
           System.out.println("Actual String:"+input);
           System.out.println("Reverse String:"+output);
	}

}
