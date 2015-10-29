package observer;

import java.util.ArrayList;
import java.util.List;

public class Score implements Observable {
	
	private int runs;
	private int overs;
	private int wickets;
	private String innings;
	
	
	List<Observer> registeredObservers;
	
	public Score() {
		registeredObservers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {
		registeredObservers.add(o);
	}

	@Override
	public void notifyAllObservers() {
		for (Observer o : registeredObservers) {
			o.update(runs, wickets, overs, innings);
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void updateNewScore(int runs,int wickets,int overs,String innings){
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		this.innings = innings;
		notifyAllObservers();
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getOvers() {
		return overs;
	}

	public void setOvers(int overs) {
		this.overs = overs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getInnings() {
		return innings;
	}

	public void setInnings(String innings) {
		this.innings = innings;
	}

}
