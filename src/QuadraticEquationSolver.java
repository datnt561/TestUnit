import java.util.Scanner;
import java.lang.Math;
public class QuadraticEquationSolver {

	double a, b, c;

	public QuadraticEquationSolver() {
	}

	public QuadraticEquationSolver(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public void input() {
		Scanner input = new Scanner(System.in);
		setA(input);
		setB(input);
		setC(input);
		input.close();
	}

	public void setA(Scanner input) {

		System.out.print("Nhap a = ");
		a = input.nextFloat();

	}

	public double getA() {
		return a;
	}

	public void setB(Scanner input) {

		System.out.print("Nhap b = ");
		b = input.nextFloat();

	}

	public double getB() {
		return b;
	}

	public void setC(Scanner input) {

		System.out.print("Nhap c = ");
		c = input.nextFloat();

	}

	public double getC() {
		return c;
	}

	public double computeDelta() {
		return b * b - 4 * a * c;
	}

	public double returnX1() {
		double delta = computeDelta();
		return (-b + Math.sqrt(delta)) / (2 * a);
	}

	public double returnX2() {
		double delta = computeDelta();
		return (-b - Math.sqrt(delta)) / (2 * a);
	}

	public double returnX() {
		return -b / (2 * a);
	}

	public static void main(String[] args) {
		QuadraticEquationSolver pt = new QuadraticEquationSolver();
		pt.input();
		if (pt.getA() == 0) {
			if (pt.getB() == 0) {
				if (pt.getC() == 0)
					System.out.println("Phuong trinh vo so nghiem");
				else
					System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("Phuong trinh co 1 nghiem la:");
				System.out.println(pt.returnX());
			}

		} else {
			if (pt.computeDelta() > 0) {
				System.out.println("Phuong trinh co 2 nghiem la:");
				System.out.println(pt.returnX1());
				System.out.println(pt.returnX2());
			} else
				System.out.println("Phuong trinh vo nghiem");

		}
	}


}
