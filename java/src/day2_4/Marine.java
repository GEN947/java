package day2_4;

// 체력: 
public class Marine {
	
	// 전체 체력은 모든 마린들이 공유
	public static Long 전체체력 = 40L;
	
	// 현재체력은 마린마다 다르다 -> 정보 은닉
	private Long 현재체력;
	
	public Marine() {
		현재체력 = 40L;
	}
}