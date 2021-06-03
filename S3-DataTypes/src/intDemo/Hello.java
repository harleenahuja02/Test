package intDemo;

public class Hello {

	public static void main(String[] args) {

		int max = 2147483647;		//max value
		int min = -2147483648;	//min value
		short shortMax = 32767;
		short shortMin = -32768;
		long longMax = 923372036854775807L; 	//suffix is required to indicate that its a long value; by default, it will be considered as int
		long longMin = -923372036854775808L; 
		byte byteMax = 127;
		byte byteMin = -128;
	}

}
