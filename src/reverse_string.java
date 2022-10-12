
public class reverse_string {

	public static void main(String[] args) {
		String str= "Hello World", nstr="";
        char ch;    
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed string: "+ nstr);

	}

}
