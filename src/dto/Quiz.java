package dto;

import java.util.List;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Quiz {
	private List<Question> questions;
	private Map<String, String> answers;

	public Quiz() {
		// TODO Auto-generated constructor stub
	}

	public Quiz(List<Question> questions, Map<String, String> answers) {
		super();
		this.questions = questions;
		this.answers = answers;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Map<String, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Quiz [questions=" + questions + ", answers=" + answers + "]";
	}

}
