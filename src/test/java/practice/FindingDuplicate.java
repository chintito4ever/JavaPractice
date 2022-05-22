package practice;

public class FindingDuplicate {
	
	static String [] myArray = {"Miraz", "Asif", "Saad", "Nazifa", "Asif", "Saad"};
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<myArray.length; i++) {
			
			for(int j=i+1; j<myArray.length; j++) {
				
				if(myArray[i]==myArray[j]) {
					System.out.println("Duplicate: "+ myArray[j]);
					
				
				}
			}
		}
	}

}
