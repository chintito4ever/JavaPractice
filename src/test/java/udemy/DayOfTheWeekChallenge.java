package udemy;

public class DayOfTheWeekChallenge {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDayOfTheWeek(5);
		printDayOfTheWeek(7);

	}
	
	public static void printDayOfTheWeek(int day) {
		
		if(day== 0) {
			System.out.println("Sunday");
		}else if(day==1) {
			System.out.println("Monday");
		}else if(day==2) {
			System.out.println("Tuesday");
		}else if(day==3) {
			System.out.println("Thursday");
		}else if(day==4) {
			System.out.println("Friday");
		}else if(day==5) {
			System.out.println("Saturday");
		}else if(day==6) {
			System.out.println("Wednesday");
		}else {
			System.out.println("Invalid day");
		}
		
//		switch(day) {
//		case 0: 
//			System.out.println("Sunday");
//			break;
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		default:
//			System.out.println("Invalid day");
//			break;
//		}
		
	}

}
