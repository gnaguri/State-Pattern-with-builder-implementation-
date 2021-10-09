
public class GogglesState implements State {

	@Override
	public void build() {
	 
		System.out.println("Goggles machine building states");
		
	}

	@Override
	public void addFrame() {
		System.out.println("Adding Frame to the Goggle");
		
	}

	@Override
	public void addGlassType() {
		System.out.println("Adding glass to the Goggle");
	}

	@Override
	public void change() {
	 
		System.out.println("Change the goggle type ");
	}

	@Override
	public void shape() {
	 
		System.out.println("Round shape glasses add to the goggle");
		
	}

}
