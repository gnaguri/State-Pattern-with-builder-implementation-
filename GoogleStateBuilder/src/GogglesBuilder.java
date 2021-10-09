
public abstract class GogglesBuilder {

	
	 String name;
	 
	 GoggleType goggleType ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GoggleType getGoggleType() {
		return goggleType;
	}

	public void setGoggleType(GoggleType goggleType) {
		this.goggleType = goggleType;
	}

public abstract void addGlasses();
public abstract void addFrame();
public abstract void addShape();
	
	
}
