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
		System.out.println("���������������� ��������, �������� ��������� " + ts + " �������� �� ������");
		
	}
	
	@Override
	public void stels() {
		PlainVoids.super.stels();
		int stels = (int) Math.random();
		System.out.println("��������� ����� ��������, ���� ���� ��������� ��� ������ �������� " + stels + " ������");
	}
	@Override
	public void NucleanBomb() {
		PlainVoids.super.NucleanBomb();
		int bomb = (int) (Math.random()*10);
		System.out.println("������� ���� ��������, ������ " + bomb + " ������� ���������");
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
