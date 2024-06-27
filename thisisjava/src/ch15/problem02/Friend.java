package ch15.problem02;

public class Friend {
	private String name;
	private String tel;
	private String school;
	
	public Friend(String name, String tel, String school) {
		this.name = name;
		this.tel = tel;
		this.school = school;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + this.getName() + " 핸드폰 : " + this.getTel() + " 학교 : " + this.getSchool());
	}

}
