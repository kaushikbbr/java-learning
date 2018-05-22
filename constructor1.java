class constructor1{
	constructor1(){
		System.out.println("Inside constructor");
	}
	void constructor1(){
		System.out.println("Inside constructor named functoin");
	}
	public static void main(String args[]){
		constructor1 c1 = new constructor1();
		c1.constructor1();
	}
}
