package Java08;

class CCircle {
	double pi = 3.14;
	double radius;

	void show_periphery() {
		System.out.println("periphery=" + 2 * pi * radius);
	}
}

public class Class06 {
	public static void main(String arg[]) {
		CCircle cirl1 = new CCircle();
		cirl1.radius = 3.0;
		cirl1.show_periphery();
	}
}