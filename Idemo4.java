interface I1{
	public void functionX();
	public void functionY();
}

interface I2{
	public void functionP();
	public void functionQ();
}

interface I3 extends I1,I2{
	public void functionX();
	public void functionR();
}

class Idemo4 implements I3{
	public void functionX(){
		System.out.println("This is function--->X");
	}
	
	public void functionY(){
		System.out.println("This is function--->Y");
	}
	
	public void functionP(){
		System.out.println("This is function--->P");
	}
	
	public void functionQ(){
		System.out.println("This is function--->Q");
	}	

	public void functionR(){
		System.out.println("This is function--->R");
	}
	
	public static void main(String args[]){
		I3 i = new Idemo4();
		i.functionX();
		i.functionR();
		i.functionP();
	}	
}






