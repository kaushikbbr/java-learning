class SimpleInterest{
	void intCal(double p, int t, double r){
		double si = (p*t*r)/100;
		System.out.println("Interest is : " + si);
		double ta = si + p;
		System.out.println("Total Amount : " + ta);
	}
	public static void main(String args[]){
		SimpleInterest si = new SimpleInterest();
		if (args.length >= 3){
			String s = args[0].trim();
			Double d = new Double(s);
			double p = d.doubleValue();
			int t = Integer.parseInt(args[1].trim());
			double r = Double.parseDouble(args[2].trim());
			si.intCal(p, t, r);
		}else
			System.out.println("Wrong values passed");
	}
}