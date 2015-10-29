package observer;

public interface Observable {
	
	public void register(Observer o);
	public void notifyAllObservers();
	public void remove();

}
