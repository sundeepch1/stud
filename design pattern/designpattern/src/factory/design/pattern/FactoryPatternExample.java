package factory.design.pattern;

public class FactoryPatternExample {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getInstance("car", 4);
		System.out.println(car);

		Vehicle bike = VehicleFactory.getInstance("bike", 2);
		System.out.println(bike);
	}

}