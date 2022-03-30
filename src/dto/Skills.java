package dto;

public class Skills {
	private String title;
	private double exp;
	private String level;

	public Skills() {
		// TODO Auto-generated constructor stub
	}

	public Skills(String skill, double exp, String level) {
		super();
		this.title = skill;
		this.exp = exp;
		this.level = level;
	}

	public String getSkill() {
		return title;
	}

	public void setSkill(String skill) {
		this.title = skill;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "{\"title\":\"" + title + "\", \"exp\":" + exp + ", \"level\":\"" + level + "\"}";
	}

}
