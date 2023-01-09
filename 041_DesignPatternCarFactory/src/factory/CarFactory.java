package factory;

public class CarFactory {
	public ICar createCars(ECar carType) {
		switch (carType) {
		case HATCBACK:
			return new HatchBack();

		case JEEP:
			return new Jeep();

		case SEDAN:
			return new Sedan();
		default:
			throw new IllegalArgumentException("Unknown car type: " + carType);
		}
	}
}
