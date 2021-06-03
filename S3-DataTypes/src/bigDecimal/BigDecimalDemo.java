package bigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//automatic round off is done by java but sometimes it creates problems:
		//gives extra precision
		double x=1.45;
		double y=2.55;
		System.out.println(x+y); //this is okay
		
		double a=1.05;
		double b=2.55;
		System.out.println(a+b); //result is not desired one so we can use big decimal for more precision
		
		BigDecimal d1=new BigDecimal(1.05);
		BigDecimal d2=new BigDecimal(2.55);
		System.out.println(d1.add(d2)); //still issue is there, so to disable rounding off, the arg can be passed as a string.
		
		BigDecimal d3=new BigDecimal("1.05");
		BigDecimal d4=new BigDecimal("2.55");
		System.out.println(d3.add(d4)); //result is correct
	}

}
