package practice;

public class ReverseUsingLoop {
	//Reverse String using loop
	
	public static void main(String[] args) {
		String country = "United States of America";
		//System.out.println(country.length());
		
		for(int i=(country.length()-1); i>=0; i--) {
			
			System.out.print(country.charAt(i));
		}
	}
}
