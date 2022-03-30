package dto;

import org.springframework.scheduling.annotation.Async;

public class Answers {
	private String id;
	private String answer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answers(String id, String answer) {
		super();
		this.id = id;
		this.answer = answer;
	}

	public Answers() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Answers [id=" + id + ", answer=" + answer + "]";
	}

}
