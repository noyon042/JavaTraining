package ClassTest2;

public class Student {
	private String name, fatherName, motherName, rollNo;
	public void setname(String name, String fatherName, String motherName, String rollNo) {
		this.name=name;
		this.fatherName=fatherName;
		this.motherName=motherName;
		this.rollNo=rollNo;
	}
	public String getname() {
		return name;
	}
	public String getfatherName() {
		return fatherName;
	}
	public String getmotherName() {
		return motherName;
	}
	public String getrollNo() {
		return rollNo;
	}
}
