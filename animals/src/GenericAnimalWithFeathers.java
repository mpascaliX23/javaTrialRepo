
public class GenericAnimalWithFeathers extends GenericAnimal {

	private String featherSize = null;

	public GenericAnimalWithFeathers() {
		setRace("volatile");
		setCanFly(true);
	}
	
	public String getFeatherSize() {
		return featherSize;
	}

	public void setFeatherSize(String featherSize) {
		this.featherSize = featherSize;
	}
	
	

}
