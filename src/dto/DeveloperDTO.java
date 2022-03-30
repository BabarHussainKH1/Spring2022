package dto;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class DeveloperDTO {
	private String name;
	private String title;
	private int exp;
	private List<Skills> skillSet;
	private Map<String, String> experience;

	public DeveloperDTO(String name, String title, int exp, List<Skills> skillSet, Map<String, String> experience) {
		super();
		this.name = name;
		this.title = title;
		this.exp = exp;
		this.skillSet = skillSet;
		this.experience = experience;
	}

	public Map<String, String> getExperience() {
		return experience;
	}

	public void setExperience(Map<String, String> experience) {
		this.experience = experience;
	}

	public List getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(List<Skills> skillSet) {
		this.skillSet = skillSet;
	}

	public DeveloperDTO() {
		// TODO Auto-generated constructor stub
	}

	public DeveloperDTO(String name, String title, int exp, List<Skills> skillSet) {
		super();
		this.name = name;
		this.title = title;
		this.exp = exp;
		this.skillSet = skillSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DeveloperDTO(String name, String title, int exp) {
		super();
		this.name = name;
		this.exp = exp;
		this.title = title;
	}

	@Override
	public String toString() {
		return "{\"name\":\"" + name + "\", \"title\":\"" + title + "\", \"exp\":\"" + exp + "\", \"skillSet\":" + skillSet
				+ ", \"experience\":" + new Gson().toJson(experience)+ "}";
	}

}
