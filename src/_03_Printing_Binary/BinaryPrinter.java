package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	
	public static void main(String[] args) {
		
		BinaryPrinter bp = new BinaryPrinter();
		int value = 17;
		bp.printIntBinary(value);
		short dog = 10;
		bp.printShortBinary(dog);
		byte b = 15;
		bp.printByteBinary(b);
		
		long valueL = 1509;
		bp.printLongBinary(valueL);
		
	}
	
	public void printByteBinary(byte val) {
		int length = 0;
		
		for(int i = 0; i < val; i++) {
			int trueVal = (int) Math.pow(2, i);
			if(trueVal >= val) {
				length = i;
				break;
			}
		}
		
		String b = "";
		int remainingValue = val;
		boolean rest = false;
		
		for(int j = length; j >= 0; j--) {
			if(rest) {
				b = b + "0";
				continue;
			}
			int tV = (int) Math.pow(2, j);
			if(remainingValue >= tV) {
				b = b+"1";
				remainingValue -= tV;
			}
			else {
				b = b+"0";
			}
			
			if(remainingValue <= 0) {
				rest = true;
			}
		}
		
		
		
		System.out.println(b);
	}
	
	public void printShortBinary(short val) {
int length = 0;
		
		for(int i = 0; i < val; i++) {
			int trueVal = (int) Math.pow(2, i);
			if(trueVal >= val) {
				length = i;
				break;
			}
		}
		
		String b = "";
		int remainingValue = val;
		boolean rest = false;
		
		for(int j = length; j >= 0; j--) {
			if(rest) {
				b = b + "0";
				continue;
			}
			int tV = (int) Math.pow(2, j);
			if(remainingValue >= tV) {
				b = b+"1";
				remainingValue -= tV;
			}
			else {
				b = b+"0";
			}
			
			if(remainingValue <= 0) {
				rest = true;
			}
		}
		
		
		
		System.out.println(b);
	}
	
	public void printIntBinary(int val) {
		int length = 0;
		
		for(int i = 0; i < val; i++) {
			int trueVal = (int) Math.pow(2, i);
			if(trueVal >= val) {
				length = i;
				break;
			}
		}
		
		String b = "";
		int remainingValue = val;
		boolean rest = false;
		
		for(int j = length; j >= 0; j--) {
			if(rest) {
				b = b + "0";
				continue;
			}
			int tV = (int) Math.pow(2, j);
			if(remainingValue >= tV) {
				b = b+"1";
				remainingValue -= tV;
			}
			else {
				b = b+"0";
			}
			
			if(remainingValue <= 0) {
				rest = true;
			}
		}
		
		
		
		System.out.println(b);
	}
	
	public void printLongBinary(long val) {
int length = 0;
		
		for(int i = 0; i < val; i++) {
			int trueVal = (int) Math.pow(2, i);
			if(trueVal >= val) {
				length = i;
				break;
			}
		}
		
		String b = "";
		long remainingValue = val;
		boolean rest = false;
		
		for(int j = length; j >= 0; j--) {
			if(rest) {
				b = b + "0";
				continue;
			}
			int tV = (int) Math.pow(2, j);
			if(remainingValue >= tV) {
				b = b+"1";
				remainingValue -= tV;
			}
			else {
				b = b+"0";
			}
			
			if(remainingValue <= 0) {
				rest = true;
			}
		}
		
		
		
		System.out.println(b);
	}
}
