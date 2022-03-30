//call two instance variable from static method
public class Test {
	int a=25,b=45;     // instance variables
	static double c=30,d=50;
	public static void main(String[] args){    //static method
	     Test.sampleStaticMethod(); //we can call static method(in same package) directly but it is recommondet to call static method via class name     
		 new Test().sampleInstanceMethod();   
	}
	void sampleInstanceMethod(){            //Instance method
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test.c);
		System.out.println(Test.d);
	}
	static void sampleStaticMethod(){          //static method
	System.out.println(new Test().a);
	System.out.println(new Test().b);
	System.out.println(Test.c);
	System.out.println(Test.d);
	}
}