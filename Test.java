public class Test {
	public static void main(String[] args){
		int a=10,b=20;   // local variables:- The variable defined inside the block, method and in constructor are called local variables
		System.out.println(a+b);
        new Test().sampleMethod();		
	}
	void sampleMethod(){
		int a=80;
		System.out.println(a);      //Scope :- output will be 80 i.e main method local variable a is not visible to sampleMethod
		//System.out.println(b);   // This line will give error:- can not find variable b
	}
}