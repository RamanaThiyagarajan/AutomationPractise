
public class core_JavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is an Object //String literal
		//String is a object that represents sequence of characters	
				//String s1 = "Ramana";
		
		//new 
		String s2 = new String ("Welcome");
		
		//split with spaces
		/*String s = "Ramana Automation Engineer";
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);*/
		
		//split with 0th Index
		String s = "Ramana Automation Engineer";
		String[] splittedString = s.split("Automation");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		//To print each characters separately in Ascending
		
		for (int i=0; i<s.length(); i++)
			
		{
			System.out.println(s.charAt(i));
		}
		//To print each characters separately in descending
		
		for (int i= s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		
		
	}

}
