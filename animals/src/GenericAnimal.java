public abstract class GenericAnimal implements Animal {

	private boolean canFly = false;
	private boolean canSwim = false;
	private boolean canRun = false;
	private Double weight = null;
	
	@Override
	public String getRace() {
		return "genericAnimal";
	}

	@Override
	public String getRoar() {
		return "genericRoar";
	}

}
