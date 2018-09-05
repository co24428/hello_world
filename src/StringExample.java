
public class StringExample {

	public static void main(String[] args) {
		String greeting = "hello";						//Hello를 만드는 생성자가 생기고 greeting에 들어가게 됨 
		
		//length, charAt
		for (int i = 0; i < greeting.length(); i++)
			System.out.println(greeting.charAt(i));
		
		//substring
		String hel = greeting.substring(0,3);
		System.out.println(hel);
		
		//concatenation
		String language = "JAVA!";
		String msg = greeting + " " + language;			//String 변수 +로 합치기 가능 
		System.out.println("Welcome to " + msg);
		
		//Equality, use equals; DO NOT USE ==
		//******변수의 값을 비교하고싶을 떄는 무조건 equals
		//****** == 사용하면 그 주소값을 비교하는 꼴
		if (greeting.equals("hello"))					//같으면 true(boolean)
			System.out.println("Exactly same");
		if (greeting.equalsIgnoreCase("hello"))
			System.out.println("Same when case ignored");
		
		//comparison
		/* the value 0 if the argument string is equal to this string;
		 * a value less than 0 if this string is lexicographically less than the string argument; 
		 * and a value greater than 0 if this string is lexicographically greater than the string argument.
		 */
		if (greeting.compareTo(language)<0)									//compareTo의 결과값이 
			System.out.println(greeting + " comes before " + language);		//사전 편찬상 빠르면 0아래값 
		else if (greeting.compareTo(language)>0)
			System.out.println(greeting + " comes after " + language);		//사전 편찬상 느리면 0위값 
		else
			System.out.println(greeting + " equals with " + language);		//서로 같으면 0
		
		//replacement
		String greeting2 = greeting.replace('l', 'L');			//모든 l을 L로 바꾼다.(char)
		System.out.println("The original string: " + greeting + "; After replacement: " + greeting2);
		String greeting3 = greeting.replaceAll("ll", "L");		//모든 ll을 L로 바꾼다. (String)
		System.out.println("The original string: " + greeting + "; After replacement: " + greeting3);
		String greeting4 = greeting.replaceFirst("l", "L");		//첫번쨰 l을 L로 바꾼다. (String)
		System.out.println("The original string: " + greeting + "; After replacement: " + greeting4);
		
		
		//indexOf
		System.out.println(greeting.indexOf('l'));			//있는 경우 맨처음 
		System.out.println(greeting.indexOf('L'));			//없는 경우 -1
		System.out.println(greeting.indexOf("io"));
		System.out.println(greeting.indexOf("lo"));			//오버로딩 -> String값도 가능
		
	}

}
