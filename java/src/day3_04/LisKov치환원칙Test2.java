package day3_04;

import lombok.AllArgsConstructor;

// ======= 핸드폰 판매점 (com.world.phone) =======
// 부모의 참조변수는 자식을 가리킬 수 있다
// Phone p = new SS22();
// p = new SZ플립5();

class Phone{
	
}
class SS22 {
	
}
class SS23 {

}
class SS24 {
	
}
class SZ플립5 {
	
}
class S아이폰14 {
	
}
class S아이폰15 {
	
}
// ======= 사람 (com.world.man) =======
@AllArgsConstructor
class Saram {
	private Phone phone;
}
public class LisKov치환원칙Test2 {
	// 구체적인 클래스를 사용하면 코드가 1번 예제처럼 된다
	// 추상적인 부모 클래스로 작업해야 한다
	public static void main(String[] args) {
		Saram s = new Saram(new I아이폰15());
	}
}
