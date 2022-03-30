//call two instance variable from static method
public class Test {
	int a=25,b=45;     // instance area-instance variables
	public static void main(String[] args){    //static method
	     Test.sampleStaticMethod1();      
		 sampleStaticMethod2();   //we can call static method(in same package) directly but it is recommondet to call static method via class name
	}
	static void sampleStaticMethod1(){            //static method
		System.out.println(new Test().a);   //static-area and instance-variable:- so object creation is needed because a and b get memory when object is created
		System.out.println(new Test().b);     // System.out.println(b); if we call directly we get error:- non-static variable b cannot be referenced from a static context 

	}
	static void sampleStaticMethod2(){          //static method
		System.out.println(new Test().a);
		System.out.println(new Test().b);

	}
}