package pb2;

public class Main {
	  public static void main(String[] args) {
	    int Inte = 42;
	    double Doubl = 9.999;
	    char Char = 'q';
	    boolean Bool = false;
	    byte Byt = 98;

	    System.out.println("int: " + Inte);
	    System.out.println("double: " + Doubl);
	    System.out.println("char: " + Char);
	    System.out.println("boolean: " + Bool);
	    System.out.println("byte: " + Byt);
	    System.out.println("min and max: ");
		System.out.println("short min: " + Short.MIN_VALUE + "; max: " + Short.MAX_VALUE);
		System.out.println("byte min: " + Byte.MIN_VALUE + "; max: " + Byte.MAX_VALUE);
		System.out.println("int min: " + Integer.MIN_VALUE + "; max: " + Integer.MAX_VALUE);
		System.out.println("long min: " + Long.MIN_VALUE + "; max: " + Long.MAX_VALUE);
		System.out.println("float min: " + Float.MIN_VALUE + "; max: " + Float.MAX_VALUE);
		System.out.println("double min: " + Double.MIN_VALUE + "; max: " + Double.MAX_VALUE);
		System.out.println("char min: " + Character.MIN_VALUE + "; max: " + Character.MAX_VALUE);
		System.out.println("boolean min: " + Boolean.FALSE + "; max: " + Boolean.TRUE);
		
		int[] Array = {4, 16, 45, 9, 40, 94, 416, 8, 15, 42};

		int min = Array[0];
		int max = Array[0];

		for (int i = 1; i < Array.length; i++) {
		  if (Array[i] < min) {
		    min = Array[i];
		  }
		  if (Array[i] > max) {
		    max = Array[i];
		  }
		}

		System.out.println("arr min: " + min);
		System.out.println("arr max: " + max);
	  }
}