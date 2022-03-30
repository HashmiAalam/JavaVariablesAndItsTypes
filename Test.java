public class Test {
	int a=25,b=45,c=11;    // instance variables:- The variable defined inside the class(instance area) and outside of method/constructor/block are called instance variable
	static int d=40,e=70;
	public static void main(String[] args){    //static method
	      //static area
		int a=10,b=20;   // local variables:- The variable defined inside the block, method and in constructor are called local variables
		System.out.println(a+b);
		Test t=new Test();   // object creation
        t.sampleMethod();   //JVM is responsible for execution of main method only if we don't call sampleMethod then JVM will not call it by itself
		                    // to call user defined method object reference is needed 't' in this case
        System.out.println(t.a);  //Different area(static-instance) reference is required to access instance variables 
        //we can call static variables directly
        System.out.println(d+e);
        // but it is recommended to call it by class name
          System.out.println(Test.e-Test.d);		
	}
	void sampleMethod(){
		int a=80;
		System.out.println(a);      //Scope :- output will be 80 i.e main method local variable a is not visible to sampleMethod
		System.out.println(b);   //since JVM not find b in local area it goes to instance area, No reference is needed because area is same(instance-instance) 
		int c=50;
		System.out.println(c);    //JVM  finds c in local area so it will not go to instance area i.e. local variable has first priority
		System.out.println(Test.d);  //we can access static variables via class name
		System.out.println(Test.e);
	}
}