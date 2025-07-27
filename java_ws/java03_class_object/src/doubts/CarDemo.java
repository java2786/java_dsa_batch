package doubts;

class Car{
	int speed;
	
	void applyBreak(){
		System.out.println("Break");
		speed = 0;
	}
	
	void accelerate() {
		speed = speed + 10;
	}
}

public class CarDemo {
	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println(car.speed+"KM/H");
		car.accelerate();
		car.accelerate();
		car.accelerate();
		System.out.println(car.speed+"KM/H");
		car.applyBreak();
		System.out.println(car.speed+"KM/H");
		
	}
}
