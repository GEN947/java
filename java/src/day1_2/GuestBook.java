package day1_2;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuestBook {
	private Long bno;
	private String content;
	private String name;
	private LocalDate writeday;
	
	public GuestBook(Long bno, String content, String name, LocalDate writeday) {
		this.bno = bno;
		this.content = content;
		this.name = name;
		this.writeday = writeday;
	}
}
