class Ademo1{
	int arr1[];
	float arr2[] = new float[3];
	public static void main(String args[]){
		Ademo1 a1 = new Ademo1();
		System.out.println(a1.arr1);
		System.out.println(a1.arr2);
		a1.arr2[1] = 6.7f;
		a1.arr1 = new int[3];
		a1.arr1[a1.arr1.length-1] = 12;
		int arr1[] = new int[4];
		for(int i=0; i<arr1.length-1;i++){
			arr1[i] = i*i;
			System.out.println(arr1[i]);
		}
	}
}