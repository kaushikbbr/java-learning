interface Xyz{
	public void functionX();
}

class Idemo2{
	void function1(Xyz x1){
		System.out.println("Inside function1 of Idemo2");
		x1.functionX();
		System.out.println("End of function1 in Idemo2");
	}
}

class T implements Xyz{
	public void functionX(){
		System.out.println("U r in functionX of the class T");
	}
}

class Idemo3{
	static Xyz getXyz(){
		Xyz x1 = new T();
		return x1;
	}
}	

class TestMain{
	public static void main(String args[]){
		T t1 = new T();
		Idemo2 i1 = new Idemo2();
		i1.function1(t1);
		t1.functionX();
		System.out.println("Now implementing connection con similar statements");
		Xyz x1 = Idemo3.getXyz();
		x1.functionX();
		
	}
}
