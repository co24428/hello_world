
public class MathExample {
	public static void main(String[] args) {
		System.out.println(Math.abs(-10));				//절대값 구하기 (정수)
		System.out.println(Math.abs(-10.201));			//절대값 정수외에 실수 필드(변수)도 가능 
		System.out.println(Math.PI);					//파이 값
		System.out.println(Math.E);						//E 값 
		System.out.println(Math.round(3.123));			//반올림(정수화) 
		System.out.println(Math.round(3.523));			//반올림(정수화)
		System.out.println(Math.ceil(3.123));			//올림(실수)
		System.out.println(Math.floor(3.723));			//내림(실수)
		System.out.println(Math.random());				//0~1.0의 난수
		System.out.println(Math.addExact(3, 3));		//앞 변수에 뒷변수 합
	}
}
