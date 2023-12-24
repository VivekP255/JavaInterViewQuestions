package coreJavaTrickyInterviewQuestions;

public class Main {
	
//	Whats output of below program
	
//	public void pupAge() {
//	     int age;
//	     age = age + 7;
//	     System.out.println("Puppy age is : " + age);
//	  }
//	 
//	  public static void main(String args[]) {
//	     Test test = new Test();
//	     test.pupAge();
//	  }

	
	//output -> Error bydefault local variable in null, so need to declear it.
	//============================================================================================================
	
	
	
	//Whats output of below program 
	
	
//	  public final String name ="Vivek";
//	  public final int age = 27;
//	  public void display(){
//	     System.out.println("Name of the Student: "+this.name);
//	     System.out.println("Age of the Student: "+this.age);
//	  }
//	  public static void main(String args[]) {
//	     new Main().display();
//	  }
	  
//	  Output -> throws exception since final field need to initialize first
	  
/*	  	  public final String name;
	  public final int age;
	  
	  public Main(String name,int age) {
		this.name = name;
		this.age = age;
	  }
	  
	  public void display(){
	     System.out.println("Name of the Student: "+this.name);
	     System.out.println("Age of the Student: "+this.age);
	  }
	  public static void main(String args[]) {
	     new Main("Vivek", 27).display();
	  } */
	
//	public static void main(String[] args)
//    {
//        // S1 refers to Object in the Heap Area
//        // Line-1
//        String s1 = new String("GFG");
// 
//        // S2 refers to Object in SCP Area
//        // Line-2
//        String s2 = s1.intern();
// 
//        // Comparing memory locations
//        // s1 is in Heap
//        // s2 is in SCP
//        System.out.println(s1 == s2);
// 
//        // Comparing only values
//        System.out.println(s1.equals(s2));
// 
//        // S3 refers to Object in the SCP Area
//        // Line-3
//        String s3 = "GFG";
//        
//        System.out.println(s2==s3);
//
//    }
	
	//o/p ==> false
			  //true
				//true
//===============================================================================================================================
	
	public static void main(String[] args) {
	Integer num1 = 100;
	Integer num2 = 100;
	Integer num3 = 500;// cache in memory from -127 to 127
	Integer num4 = 500;
	
	if(num1==num2) {
		System.out.println("num1==num2");
	}
	else {
		System.out.println("num1!=num2");
	}
	
	if(num3==num4) {
		System.out.println("num3==num4");
	}
	else {
		System.out.println("num3!=num4");
	}
	System.out.println("num4 ==> "+num4.hashCode());
	System.out.println("num4 ==> "+num3.hashCode());
	}
}
