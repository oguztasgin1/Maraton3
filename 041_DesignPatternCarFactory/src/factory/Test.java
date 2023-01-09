package factory;


public class Test {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		carFactory.createCars(ECar.SEDAN).uretiliyor();
		carFactory.createCars(ECar.HATCBACK).uretiliyor();
		carFactory.createCars(ECar.JEEP).uretiliyor();
	}

}
