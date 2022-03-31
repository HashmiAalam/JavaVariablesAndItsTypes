 //Two type of methods and all methods have 3 parts 1) method declaration 2) method implementation 3) method call 
 public class Test {
	 int a=10,b=30;
	 //method:- methods are used for writing the logics of application
	//static method
	public static void main(String[] args){     //static method memory allocated with class loading so we can access static method via class 
	Test t= new Test();
	  System.out.println(t.a+t.b +" in static method");
	  
	  t.sampleMethod();   //3) method call 
	  }
	  //instance method 
	  //1)method declaration
	void sampleMethod(){   //instance method memory allocated when object is created so we can access these methods via object only e.g. it get called by 't'
		System.out.println("Hi instance method");   //2) method implementation
	}
}
