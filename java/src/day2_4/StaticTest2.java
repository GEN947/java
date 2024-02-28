package day2_4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class StaticTest2 {
	private Long a;
	public Long sum(Long b) {
		return a+b;
	}
}

public class StaticTest2 {
	public static void main(String[] args) {
		// s1과 s2는 가진 값이 다르다
		StaticTest2 s1 = new StaticTest2(1000L);
		StaticTest2 s2 = new StaticTest2(9999L);
		
		// sum 메소드는 객체가 가진 필드를 가지고 계산하므로 결과도 다르다
		// static을 사용하는 경우
		//		항상 같은 값을 가지는 필드
		// 		입력을 주면 결과가 정해진 메소드
		System.out.println(s1.sum(100L));
		System.out.println(s2.sum(100L));
	}
}