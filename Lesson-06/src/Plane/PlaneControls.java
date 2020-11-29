package Plane;

public abstract class PlaneControls {
	void moveUp() {
		double mu = Math.random()*3000;
		System.out.println("Літак рухається верх на  висоту " + mu + " метрів");
		
	};
	void moveDown() {
		double md = Math.random()*3000;
		
		System.out.println("Літак рухається вниз на  висоту " + md + " метрів");
		
	};
	void moveLeft() {
		double ml = Math.random()*3000;
		System.out.println("Літак рухається вліво на " + ml + " метрів");
		
	};
	void moveRight() {
		double mr = Math.random()*3000;
		System.out.println("Літак рухається вправо на " + mr + " метрів");
		
	};

}
