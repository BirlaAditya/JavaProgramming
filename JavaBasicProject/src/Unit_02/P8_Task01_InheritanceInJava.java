package Unit_02;

/*
 * 
 - extends keyword
 
 - Subclass
 - SuperClass
 - "Code Re-usability"
 
 Class derived-class-name "extends" base-class
 {
   //methods and fields
 }
 
 Type of Inheritence:
 - Single Inheritence
 - Multilevel Inheritence
 - "Multiple Inheritence:" Java does not support multiple inheritences with classes
   - It handles this feature by implementing more than one interface instead of extending
     more than one class
     
 - Hierarchical Inheritence(Tree?)?: Yes!
 
 - Hybrid Inheritence? No!
 
 - Constructor Calls Flow in Inheritence !
   - Default Constructor
   - Parameterized Constructor
   
 */
public class P08_Task01_InheritenceInJava {

	public static void main(String[] args) {
		
		Three g = new Three();
		g.methodOne();
		g.methodTwo();
		g.methodThree();
		
		Two two = new Two(1);
		D obj = new D(2);
		obj.methodFour();
		
	}

}

class One {
	int a;
	
	One(int x){
		System.out.println("One Constructor!");
	}
	
	public void methodOne() {
		System.out.println("FirstMethod!");
	}
} 

class Two extends One {
	int b;
	
	Two(int x){
		super(3);
		b = x;
		System.out.println("Two");
	}
	
	public void methodTwo() {
		System.out.println("SecondMethod");
	}
}

class Three extends Two {
	int c;
	
	Three() {
		super(1);
		System.out.println("Three Constructor!");
	}
	
	Three(int x){
		super(1);
		c = x;
		System.out.println("Three");
	}
	
	public void methodThree() {
		System.out.println("SecondMethod!");
	}
}

class A {
	int a;
	
	A(int a1){
		a = a1;
	}
	
	public void methodOne() {
		System.out.println(a);
	}
}

class B extends A {
	int b;
	
	B(int x){
		super(10);
		b = x;
	}
	
	public void methodTwo() {
		System.out.println(b);
	}
}

class C extends A {
	int c;
	
	C(){
		super(10);
		c = 10;
	}
	
	public void methodThree() {
		System.out.println(c);
	}
}

class D extends A {
	int d;
	D(int d1) {
		super(d1);
		d = d1;
	}
	
	public void methodFour() {
		System.out.println(d);
	}
}