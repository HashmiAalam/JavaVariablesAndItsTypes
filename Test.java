//Use of Static and Instance variables 
public class Test {
	int a=25;     // instance variables
	static double c=30;
	public static void main(String[] args){    //static method
	   Test t1=new Test();                       //1st object
        	System.out.println(t1.a);  //25      //intial value
            System.out.println(Test.c);	// 30.0
             t1.a=t1.a+5;
             Test.c=Test.c+5;
 			System.out.println(t1.a);  //30
            System.out.println(Test.c); //35.0
			t1.a=t1.a+5;
             Test.c=Test.c+5;
			 System.out.println(t1.a);  // 35
            System.out.println(Test.c); //40.0
			Test t2=new Test();                     //2nd object
			System.out.println(t2.a);    //25         //intial value
            System.out.println(Test.c);   //40.0  if one object changes the value of static variable the change will be reflected for all object  
			t2.a=t2.a+15;
			Test.c=Test.c+15;
			System.out.println(t2.a);    //40
            System.out.println(Test.c);  //55.0  
			Test t3= new Test();                 //3rd object
			System.out.println(t3.a);    //25    //intial value i.e. for every object new memory is allocated to instance variable
            System.out.println(Test.c);  //55.0   if one object changes the value of static variable the change will be reflected for all object
			                             //this means for static variables one memory is allocated and all objects has access to common memory
	}
	
}