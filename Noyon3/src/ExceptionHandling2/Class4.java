package ExceptionHandling2;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			voteAlegable(17);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
	
	public static void voteAlegable(int a) {
		if(a<18) {
			throw new IllegalArgumentException("Age must be minimum 18");
		}
		else {
			System.out.println("Is Voter");
		}
	}

}
