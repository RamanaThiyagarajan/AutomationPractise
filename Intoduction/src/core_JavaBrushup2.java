import java.util.ArrayList;

public class core_JavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		
		//2,4,6,8,10,122- Multiples of 2
		
		// check if array has multiple of 2
		
		for (int i =0; i <arr2.length; i++)
			
		{			
			if(arr2[i] %2 ==0)
			{
			System.out.println(arr2[i]);
			break;
			}		
			
			else 
			{
				System.out.println(arr2[i] + "is not the multiple of 2");
			}
		} 
		
		//Assigning more values to the array
		
		
		ArrayList<String> a = new ArrayList<String>();
		//create object of the class - object.method
		a.add("Automation");
		a.add("selenium");
		a.add("Completed");
		System.out.println(a.get(2));
	}

}
