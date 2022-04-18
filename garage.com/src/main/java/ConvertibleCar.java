public class ConvertibleCar extends MotorizedVehicle {
	private int odometer;
	private boolean IsTopLower;
	private boolean IsTopRaise;

	public ConvertibleCar(String model, IEngine engine, ElectronicIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	}

	public int getOdometer() {

		return odometer;
	}

	public boolean LowerTop() {

		return this.IsTopLower = true;
	}

	public boolean RaiseTop() {

		return this.IsTopRaise = true;
	}

}
