package Interface;

public class Class2 implements Class1 {

	@Override
	public int addValue() {
		return a*3;
	}
	
	
	@Override
	public int calculate(int a) {
	
		return a;
	}
	@Override
	public String name(String a) {
		return a;
		
	}
	@Override
	public void add() {
		System.out.println("Hello");
		
	}
	@Override
	public Double cal(Double a) {
		return a;
	}
}
