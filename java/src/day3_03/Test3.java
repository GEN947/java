package day3_03;

// 부모 클래스의 생성자 super()
// 객체지향 구성요소
// 1. 캡슐화: 클래스를 만들어라
// 2. 정보은닉: 가능한한 private (케이스를 씌어라)
// 3. 상속
// 4. 다형성

// 객체지향 원칙(SOLID)
// S: 단일책임원칙 - 객체는 자기일만 알아서 하면 된다
// O: 
// L: 
// I: 
// D: 

class 사원 {
	private String name;
	private Long nai;
	public 사원(String name, Long nai) {
		this.name = name;
		this.nai = nai;
	}
}

class 정규직 extends 사원{
	private String position;
	private Long salary;
	
	public 정규직(String name, Long nai, String postition, Long salary) {
		// 생성자 호출은 생성자의 첫 줄에서만 가능
		super(name, nai);
		this.position = "정규직";
		this.salary = 1000000L;
	}
}

public class Test3 {
	public static void main(String[] args) {
		정규직 s1 = new 정규직();
	}
}
