package day1;

import java.util.ArrayList;

// for문: 일반 for, 향상된 for(js의 of, python의 in)
public class Example05 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		for(int i=0; i<3; i++) {
			System.out.println(list1.get(i));
		}
		
		// list1은 객체(Object) -> 객체는 자기일은 자기가 알아서 하는 S/W 부품
		// list1의 크기는 자기가 알고 있어야 한다
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
}
