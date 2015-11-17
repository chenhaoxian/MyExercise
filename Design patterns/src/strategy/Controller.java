package strategy;

public class Controller {
	
	private IStrategy strategy;
	
	public Controller(IStrategy strategy){
		this.strategy = strategy;
	}
	
	public void operate(){
		this.strategy.operate();
	}

}
