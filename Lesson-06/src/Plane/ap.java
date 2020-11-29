package Plane;

public class ap {public static void main(String[] args) {
	
	Su27 su27 =  new Su27(21.6, 15.3, 4.32, 1500, "gray");
	System.out.println(su27);
	su27.startEngine();
	su27.landingPlane();
	su27.moveUp();
	su27.moveLeft();
	su27.moveRight();
	su27.moveDown();
	su27.stels();
	su27.NucleanBomb();
	su27.turbospeed();
	su27.takeoffPlane();
	

}

}



