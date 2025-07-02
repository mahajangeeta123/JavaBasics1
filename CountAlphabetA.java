package Interview_Program;

import java.util.ArrayList;

public class CountAlphabetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList <String> a=new ArrayList<String>();
          a.add("Alphabet");
          a.add("Aliye");
          a.add("swara");
          a.add("Amar");
          a.add("Ajay");
          
          int count=0;
          
          for(int i=0;i<a.size();i++)
          {
        	  String actual=a.get(i);
        	  if(actual.startsWith("A"))
        	  {
        		  count++;
        	  }
          }
          
          System.out.println(a);
          
          Long c=a.stream().filter(s->s.startsWith("A")).count();
          System.out.println(c);
	}

}
