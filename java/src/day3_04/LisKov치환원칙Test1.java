package day3_04;

// ======= 핸드폰 판매점 (com.world.phone) =======
class S22 {
	
}
class S23 {
	
}
class S24 {
	
}
class Z플립5 {
	
}
class 아이폰14 {
	
}
class 아이폰15 {
	
}
// ======= 사람 (com.world.man) =======

class 사람 {
	private S22;
	private S23;
	private S24;
	private Z플립5;
	private 아이폰14;
	private 아이폰15;
}
public class LisKov치환원칙Test1 {
	// 구체적인 클래스를 사용하면 코드가 지랄난다
	public static void main(String[] args) {
		사람 s = new 사람(null, null, null, new Z플립5(), null, null);
	}
}
