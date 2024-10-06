package Class5;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] m=new int[10];
		int sum1=0;
		int sum2=0;
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
		//int []m={10,20,30,40,50,60,70,80,90,100};
		
//		
		for(int i=0;i<m.length;i++) {
			
			sum1=sum1+m[i];
			
		}
		System.out.println(sum1);
		
//		int i=0;
		for(int n:m) {
			sum2=sum2+n;
			
		}
		System.out.println(sum2);
		}
	}


