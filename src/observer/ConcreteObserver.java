package observer;

public class ConcreteObserver implements Observer{
	
	public ConcreteObserver(Observable o) {
		o.register(this);
	}

	@Override
	public void update(int runs, int wickets, int overs, String innings) {
		System.out.println("Score Alert : ( " +innings + ") Runs -> " + runs + ", Wickets -> " + wickets + ", Overs -> " + overs);
	}

}
