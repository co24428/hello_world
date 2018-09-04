
public class wrapperClass {
	public static void main(String[] args) {
		int i = 10000;
		
		Integer integerValue = i; //boxing
		int i2 = integerValue; //unboxing
		
		short s = integerValue.shortValue();
		long l = integerValue.longValue();
		
		System.out.println(i);
		System.out.println(integerValue);
		System.out.println(i2);
		System.out.println(s);
		System.out.println(l);
	}
}
