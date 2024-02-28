package day2_5;

import java.util.ArrayList;

// 처리하는 클래스 -> 객체 생성 X

public class GuestBookService {

	private static ArrayList<GuestBook> list = new ArrayList<>();
	
	public static void save(GuestBook gb) {
		list.add(gb);
	}
	
	public static ArrayList<GuestBook> findAll() {
		return list;
	}
	
	// 객체를 비교할 때는 ==가 아니라 equals 메소드를 사용한다
	// 객체를 리턴하는 경우 실패하면 null을 리턴한다
	public static GuestBook findById(Long gno) {
		for(GuestBook gb:list) {
			if(gb.getGno().equals(gno)) {
				return gb;
			}
		}
		return null;
		// 값을 찾는거라 true/false로 리턴할 수 없다 
		// 객체로 리턴하기 때문에 null로 리턴한다
	}
	
	public static Boolean delete(Long gno) {
		return false;
	}
}