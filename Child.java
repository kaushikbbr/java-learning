class Parent{
	int i;
	void functionP(){
		System.out.println(i);
		System.out.println("Inside Parent class");
	}
	Parent(int x){
		System.out.println("This is parent parametrized constructor and passed integer is : " + x);
	}
	
	public String toString(){
		return "This is toString of Parent class";
		
	}
}

class Child extends Parent{
	int i,j;
	void functionC(){
		System.out.println(j);
		System.out.println(i);
	}
	void functionP(){
		super.functionP();
		System.out.println("This is overrided function of parent");
	}
	
	Child(){
		super(7);
	}
	
	public static void main(String args[]){
		Child c = new Child();
		c.j = 20;
		c.i = 30;
		c.functionC();
		// super.functionP(); --> is not allowed as it is a static block
		c.functionP();
		System.out.println(c); 
	}
}

