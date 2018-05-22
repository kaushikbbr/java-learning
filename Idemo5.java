class Idemo5{
	public static void main(String args[]){
		I3 i1 = new Idemo4();
		Idemo4 d1 = (Idemo4)i1; // Typecasting reference of interface to its equivalent reference of a class 
		I1 i2 = new Idemo4();
		Idemo4 d2 = (Idemo4)i2;
		I3 i3 = (I3)i2;
		I2 i4 = new Idemo4();
		I3 i5 = (I3)i4; // Typecasting interface reference to its equivalent interface of another interface
	}
}