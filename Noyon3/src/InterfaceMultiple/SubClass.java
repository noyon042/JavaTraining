package InterfaceMultiple;

public class SubClass implements Class1,Class2{

	@Override
	public void wellcome() {
		System.out.println("Wellcome addie");
	}
	
	@Override
	public void display() {
		System.out.println("Display addie");
	}

}
