package week1.Day2;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj =new Car();
		obj.applyBreak();
		obj.applyGear();
		obj.switchOnAc();
		obj.applyAcclerate();
			
	}
	
	private boolean applyBreak() {
		boolean obj =true;
		return obj;
	}

	public double applyGear() {
		System.out.println('Y');
		return 0;
		
	}
	
	public void switchOnAc() {
		System.out.println("done");
	}
	
	String applyAcclerate() {
		System.out.println("Acclerate Applied");
		return null;
		 
		
	}
}
