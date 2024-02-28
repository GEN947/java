package day2_9;

// 상속: 무보 것은 내 것
// 상속의 개념이 잘 이해 안 되면 다이어그램 생각
class 부모 {
	int 부모재산 = 1000000;
}

class 자식 extends 부모 {
	int 자식재산 = 50000;
}
public class 상속Test1 {
	public static void main(String[] args) {
		자식 ob = new 자식();
		System.out.println(ob.부모재산);
		System.out.println(ob.자식재산);
	}
}
