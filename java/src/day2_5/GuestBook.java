package day2_5;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

// 번호, 제목, 작성자, 작성시간

@Getter
public class GuestBook {
	private Long gno;
	@Setter
	private String content;
	private String writer;
	// LocalDate, LocalDateTime
	private LocalDateTime writeTime;
	
	
}