package Class5;

public class Class5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] m=new int[10];
	
		m[0]=10;
		m[1]=20;
		m[2]=30;
		m[3]=40;
		m[4]=50;
		m[5]=60;
		m[6]=70;
		m[7]=80;
		m[8]=90;
		m[9]=100;
		
		int [] n={1,2,3,4,5,6,7,8,9};
		for(int b :n) {
			System.out.print(b+" ");
		}
		
		System.out.println();
		
		
		
		for(int i=0;i<=4;i++) {
			
			if(i<=3) {
			System.out.print(m[i]+" ,");
		}
			else {
				System.out.print(m[i]);
			}
		}
		
		
		System.out.println();
		
		
		for(int i=0;i<=9;i++) {
			if(i<=8) {
			System.out.print(m[i]+" ,");
		}
			else {
				System.out.print(m[i]);
			}
		}
			
	}

}
