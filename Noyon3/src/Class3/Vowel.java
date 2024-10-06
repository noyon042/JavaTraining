package Class3;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter word");
		ch=obj.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("Vowel=="+ch);
		}
		else {
			System.out.println("Constant=="+ch);
		}
	}

}
