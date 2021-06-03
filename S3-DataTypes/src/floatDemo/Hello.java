package floatDemo;

public class Hello {

	public static void main(String[] args) {
		int a=9/2;		//use int instead of long, short, byte
		float b=10f/6f;		//less precision upto 7 decimal digits (32 bit/4 byte) - use f to indicate 
		double c=10d/6d;		//double precision upto 16 decimal digits (64 bit/8 byte) - faster - use d to indicate
		System.out.println("a ="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		
		
		int mark=512;
		double percentage=mark*0.46f;
		System.out.println("percentage : "+percentage);
	}

}
