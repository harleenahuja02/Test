package booleanCharDemo;

public class Hello {

	public static void main(String[] args) {
		
		boolean var= true;		//0 and 1 is not accepted - only true or false;
		System.out.println(" var : "+var);	
		
		
		char var1='&'; 		//Java uses Unicode Mechanism - any code can be printed. Range is 65536 characters.
		System.out.println("var1 :" +var1);
		char var2 = '\u00A7';
		System.out.println("var2 :"+var2);
	}

}
