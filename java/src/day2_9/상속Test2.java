package day2_9;

// 천원샵
// 부모를 상속받아 코드를 재사용하자
class Product {
	Long price = 1000L;
}
class Pen extends Product {
	String name = "펜";
	void 상품소개() {
		System.out.println(price + "원짜리" + name);
	}
}

class Note extends Product {
	String name = "노트";
	void 상품소개() {
		System.out.println(price + "원짜리" + name);
	}
}
public class 상속Test2 {

}


