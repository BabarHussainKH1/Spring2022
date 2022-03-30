package dto;

import java.util.List;

public class Question {
	private String id;
	private String title;
	private List<String> options;

	public Question() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public Question(String id, String title, List<String> options) {
		super();
		this.id = id;
		this.title = title;
		this.options = options;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", options=" + options + "]";
	}

	public Question(String title, List<String> options) {
		super();
		this.title = title;
		this.options = options;
	}

}
