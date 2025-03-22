package practice;

class Car {}
class Bus extends Car {}
class SchoolBus extends Bus {}

class OpenCar extends Car {}
class SportsCar extends OpenCar {}

public class EX11_02 {
	public static void main(String[] args) {
		Car c1 = new SchoolBus();
		
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Car c2 = new OpenCar();
		OpenCar oc = new SportsCar();
	}
	
	
	
}
