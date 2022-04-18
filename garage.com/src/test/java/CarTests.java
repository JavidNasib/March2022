import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CarTests {
	private Car Car;

	@BeforeClass
	public void setup() {
		String model = "Corvette";
		LargeEngine engine = new LargeEngine();
		ElectronicIgnition ignitionSystem = new ElectronicIgnition();

		this.Car = new Car(model, engine, ignitionSystem);

	}

	@Test
	public void canBuildCar() {
		Car car = this.Car;

		String actualModel = "Corvette";

		assertEquals(actualModel, Car.getModel(), "it is not same model");
	}

	@Test
	public void canStartCar() {
		Car car = this.Car;

		car.start();
		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "");
	}
}
