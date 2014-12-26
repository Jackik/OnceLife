package cn.oncelife.bean;

public class PersonInfo {
	private Integer id;
	private String RealName;
	private Gender gender=Gender.男;
	private String jiguan;
	private PersonAccount children;
	private PersonAccount parent;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRealName() {
		return RealName;
	}
	public void setRealName(String realName) {
		RealName = realName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getJiguan() {
		return jiguan;
	}
	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}
	public PersonAccount getChildren() {
		return children;
	}
	public void setChildren(PersonAccount children) {
		this.children = children;
	}
	public PersonAccount getParent() {
		return parent;
	}
	public void setParent(PersonAccount parent) {
		this.parent = parent;
	} 
}
