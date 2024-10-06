package Class5;

public class Class5New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ClassNew [] classNew= new ClassNew[3];
classNew[0]=new ClassNew("noyon",23,"2");
classNew[1]=new ClassNew("mahmud",21,"12");
classNew[2]=new ClassNew("taj",27,"3");

for(ClassNew cn:classNew) {
	System.out.println(cn.name+","+cn.age+","+cn.rollNo);
}
	}

}
