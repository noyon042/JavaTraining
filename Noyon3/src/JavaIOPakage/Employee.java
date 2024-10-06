package JavaIOPakage;

import java.io.Serializable;

public class Employee  implements Serializable{

	private static final long serialVersionUID=1L;
	
	private String empName;
	transient String mobileNo;
	private String email;
	private String designation;
	
	public Employee(String empName,String mobileNo,String email,String designation) {
		this.empName=empName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.designation = designation;
	}
	
	
	


	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void display() {
		System.out.println("name:"+this.empName+ "\n"+ "mobile No:"+this.mobileNo+ "\n"+"Email:"+this.email+"\n"+"Designation:"+this.designation);
	}
	
}
