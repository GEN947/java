package day3_03;

import lombok.ToString;

// 렌트카는 따로 지정하지 않으면 제조사: 현대, 배기량: 1300cc, 차량이 기본이라고 하자

// 생성자에서 생성자 호출하기
@ToString
class Car{
	String 제조사;
	Long 배기량;
	
	public Car(String 제조사, Long 배기량) {
		this.제조사 = 제조사;
		this.배기량 = 배기량;
	}
	
	public Car() {
		// this(): 자기 자신의 생성자
		this("현대", 1300L);
	}
	
	public Car(Long 배기량) {
		this("현대", 배기량);
	}
	
	public Car(String 제조사) {
		this(제조사, 1300L);
	}
}

public class Test2 {

}
