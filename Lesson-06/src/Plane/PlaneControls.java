package Plane;

public abstract class PlaneControls {
	void moveUp() {
		double mu = Math.random()*3000;
		System.out.println("˳��� �������� ���� ��  ������ " + mu + " �����");
		
	};
	void moveDown() {
		double md = Math.random()*3000;
		
		System.out.println("˳��� �������� ���� ��  ������ " + md + " �����");
		
	};
	void moveLeft() {
		double ml = Math.random()*3000;
		System.out.println("˳��� �������� ���� �� " + ml + " �����");
		
	};
	void moveRight() {
		double mr = Math.random()*3000;
		System.out.println("˳��� �������� ������ �� " + mr + " �����");
		
	};

}
