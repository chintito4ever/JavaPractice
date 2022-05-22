package practice;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 20; i++) {
			
			//System.out.println("I love Allah");
		}
		
		int[] grades = {100, 99, 98, 97, 96};
		
		for (int i = ( grades.length -1); i >= 0 ; i--) {
			
			//System.out.println(grades[i]);
		}
		
		//String name = "Miraz Nabi";
		
		//for(int i= (name.length()-1); i >= 0; i--) {
			//System.out.print(name.charAt(i));
		//}
		
	    String name = "Gaurav";
	    String reversedString = "Sarkar";
	    
	    for(int i = name.length()-1; i>=0; i--){
	      reversedString = reversedString + name.charAt(i);
	    }
	    System.out.println(reversedString);
	}

}
