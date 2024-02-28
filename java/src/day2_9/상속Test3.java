package day2_9;

import java.util.ArrayList;

// 상속의 합
class Parent {
	int a;
}

class Child extends Parent{
	int b;
}
public class 상속Test3 {
	public static void main(String[] args) {
		// 1. 부모의 참조변수는 자식을 가리킬 수 있다
		Parent ob1 = new Child();
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		
		Child ob2 = new Child();
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		
		// 역은 불가능
		// Child ob = new Parent();
		
		// 왜 부모로 자식을 가리키지? -> 
	}
}
