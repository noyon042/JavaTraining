package ClassTest2;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		obj.setname("Noyon", "Nur Alom", "MomTaj", "1");
		System.out.println("First student attributes are:");
		System.out.print(obj.getname() +" ");
		System.out.print(obj.getfatherName() +" ");
		System.out.print(obj.getmotherName() +" ");
		System.out.println(obj.getrollNo());
		System.out.println();
		obj.setname("dsf", "dfim", "dsf", "2");
		System.out.println("Second student attributes are:");
		System.out.print(obj.getname() +" ");
		System.out.print(obj.getfatherName() +" ");
		System.out.print(obj.getmotherName() +" ");
		System.out.println(obj.getrollNo());
		System.out.println();
		obj.setname("dfdfs", "xcs", "sad", "3");
		System.out.println("Third student attributes are:");
		System.out.print(obj.getname() +" ");
		System.out.print(obj.getfatherName() +" ");
		System.out.print(obj.getmotherName() +" ");
		System.out.println(obj.getrollNo());



	}
	
	}


