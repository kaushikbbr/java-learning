/*
class Odemo2{
	A getA(){
		A a1 = null;
		a1 = new A();
		return(a1);
	}
	public static void main(String args[]){
		Odemo2 d = new Odemo2();
		A x = d.getA();
		x.functionA();
		int i = d.getA().j;
		System.out.println(i);
	}
}
*/


class Odemo2{
	A a1 = new A();
	int i;
	Odemo2 d1;
	public static void main(String args[]){
		Odemo2 d1 = new Odemo2();
		d1.i = 25;
		System.out.println(d1.d1);
	}
}
