public class Formatting {
	public int		prop1	= 5;
	public int[]	aProp2	= { 1, 2, 3, 4, 5 };

	public void method1() {
		if (prop1 >= 0) {
			System.out.print("greater than or equal to zero");
		} else {
			System.out.print("less than zero");
		}
	}

	public void method2() {
		switch (prop1) {
		case 0:
			// it's zero
			break;
		default:
			break;
		}
	}
}