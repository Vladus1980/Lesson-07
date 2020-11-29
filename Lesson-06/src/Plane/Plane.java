package Plane;

public abstract class Plane extends PlaneControls{
	double hight;
	double width;
	double weight;
	
	public Plane(double hight, double width, double weight) {
		super();
		this.hight = hight;
		this.width = width;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "˳��� ��-27 (������� = " + hight + " �., ������ ���� = " + width + " �., ����� ���������� ���� = " + weight + " ���)";
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	void startEngine() {
		double se;
		se = Math.random()*68 + 20;
		System.out.println("������� ��������, �� ������� �������� " + se + " ������");
		
		
	};
	
	void landingPlane() {
		double lp;
		lp = Math.random()*1000;
		System.out.println("�� ������� ���� �� �������� �� " + lp + " ��������");
		
	};
	void takeoffPlane() {
		System.out.println("˳��� ��� �� �������");
		
	}

	
		
	

}
