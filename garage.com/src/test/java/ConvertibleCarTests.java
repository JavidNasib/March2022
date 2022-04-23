import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConvertibleCarTests {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		ElectronicIgnition ignitionSystem = new ElectronicIgnition();

		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.Car;

		String actualModel = "Miata";

		assertEquals(actualModel, Car.getModel(), "it is not same model");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;

		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar car = this.Car;

		
		boolean isLowerTop = car.LowerTop();

		Assert.assertTrue(isLowerTop, "it is not");
	}

	@Test
	public void canRaiseTop() {
		ConvertibleCar car = this.Car;

		boolean isRaiseTop = car.RaiseTop();

		Assert.assertTrue(isRaiseTop, "it is not");

	}
}
