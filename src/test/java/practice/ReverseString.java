package practice;

public class ReverseString {

public static void main(String[] args) {

    String text = "Asif";

    for (int i = (text.length() - 1); i >= 0; i--) {
        System.out.print(text.charAt(i));
    }
    
    //StringBuffer sf = new StringBuffer(text);
    //System.out.println(sf.reverse());
    
    
    String s ="USA";
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    System.out.println(sb);
    

	}
}