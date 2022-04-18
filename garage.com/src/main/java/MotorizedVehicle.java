public abstract class MotorizedVehicle implements ICar {
	public String color;// it is public and thats why we have not getters and setters
	private IEngine engine;
	private String model;
	private ElectronicIgnition ignitionSystem;

	public MotorizedVehicle(String model, IEngine engine, ElectronicIgnition ignitionSystem) {
		this.engine = engine;
		this.model = model;
		this.ignitionSystem = ignitionSystem;
	}

	public void start() {
		this.ignitionSystem.turnOn();// we have not access turnon and start
		this.engine.start();
	}

	public boolean getIsStarted() {
		return this.ignitionSystem.getIsOn() && this.engine.getIsStarted();

	}

	public String getModel() {
		return this.model;
	}

}
