package Plane;

public class Su27 extends Plane implements PlainVoids{
	
	public Su27(double hight, double width, double weight) {
		super(hight, width, weight);
		
	}
	

	@Override
	public String toString() {
		return "" + super.toString()+ "";
	}

	@Override
	public void turbospeed() {
		PlainVoids.super.turbospeed();
		double ts = Math.random()*(2000 - maxSpeed)+ maxSpeed ;
		System.out.println("“урбоприскоренн€ ув≥мкнуто, швидк≥сть становить " + ts + " к≥лометр≥в за годину");
		
	}
	
	@Override
	public void stels() {
		PlainVoids.super.stels();
		int stels = (int) Math.random();
		System.out.println("“ехнолог≥ю —“≈Ћ— ув≥мкнуто, л≥так буде невидимий дл€ радар≥в прот€гом " + stels + " хвилин");
	}
	@Override
	public void NucleanBomb() {
		PlainVoids.super.NucleanBomb();
		int bomb = (int) (Math.random()*10);
		System.out.println("ядерний удар нанесено, ск≥нуто " + bomb + " €дерних боЇголовок");
	}
	
	int maxSpeed;
	String color;
	public Su27(double hight, double width, double weight, int maxSpeed, String color) {
		super(hight, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}


	@Override
	void moveUp() {
		super.moveUp();
	}


	@Override
	void moveDown() {
		super.moveDown();
	}


	@Override
	void moveLeft() {
		super.moveLeft();
	}


	@Override
	void moveRight() {
		super.moveRight();
	}
	
	

}
