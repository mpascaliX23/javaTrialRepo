public abstract class GenericAnimal implements Animal {


	private boolean canFly = false;
	private boolean canSwim = false;
	private boolean canRun = false;
	private Double weight = null;
	private String race = null;
	private String roar = null;


	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isCanSwim() {
		return canSwim;
	}
	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
	public boolean isCanRun() {
		return canRun;
	}
	public void setCanRun(boolean canRun) {
		this.canRun = canRun;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getRoar() {
		return roar;
	}
	public void setRoar(String roar) {
		this.roar = roar;
	}

	

}
