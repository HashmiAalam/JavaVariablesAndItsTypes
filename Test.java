public class Test {
	int a=25,b=45,c=11;    // instance variables:- The variable defined inside the class(instance area) and outside of method/constructor/block are called instance variable
	public static void main(String[] args){
		int a=10,b=20;   // local variables:- The variable defined inside the block, method and in constructor are called local variables
		System.out.println(a+b);
        new Test().sampleMethod();		
	}
	void sampleMethod(){
		int a=80;
		System.out.println(a);      //Scope :- output will be 80 i.e main method local variable a is not visible to sampleMethod
		System.out.println(b);   // This line will not give error i.e. if JVM not find b in local area it goes to instance area
		int c=50;
		System.out.println(c);    //JVM  finds c in local area so it will not go to instance area i.e. local variable has first priority
	}
}