package com.springcore.constructorInjection.ambiguity;

/*NOTE:
 * so to avoid below 2 commented ambiguity scenario's we are going to provide type parameter inside bean
*/
public class Addition {
	private int a;
	private int b;

//constructor call sequence default behavior (Ambiguity): if string constructor anywhere in class if not then order wise first constructor
	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Construct: double, double");
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("value of a: "+ a);
		System.out.println("value of b: "+ b);
		System.out.println("Construct: int, int");
	}
//If only above 2 constructor presents and if don't give type in bean then it'll call 1st constructor instaed you gave integer values
	// If below string constructor is present at below line then it's not going to
	// follow 1st order & type also if you didn'y gave any type parameter inside
	// bean then it'll treat values as a string and call below string typed
	// constructor
	
	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b =  Integer.parseInt(b);
		System.out.println("Construct: String, String");
	}
	

	public void doSum() {
		System.out.println("Sum is: " + (this.a + this.b));
	}
}
