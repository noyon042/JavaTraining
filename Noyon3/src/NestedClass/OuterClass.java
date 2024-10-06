package NestedClass;

public class OuterClass {

       static int a=20;
       int b=10;
       
       private static int c=30;
       
       static int display() {
    	   return a/2;
       }
       static class InnerClass{
    		int result=OuterClass.display();
    		OuterClass obj=new OuterClass();
    		int d=a+c;
    		int e=d+obj.b;
    	}
       
}



