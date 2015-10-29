package observer;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Score subject = new Score();
		
		
	    Observer o1 = new ConcreteObserver(subject);
	    Observer o2 = new ConcreteObserver(subject);
	    Observer o3 = new ConcreteObserver(subject);
	    
	   
	    try {
	    	subject.updateNewScore(13, 0, 1, "India");
			Thread.sleep(2000);
			subject.updateNewScore(16, 1, 2, "India");
			Thread.sleep(3000);
			subject.updateNewScore(44, 2, 3, "India");
			Thread.sleep(2000);
			subject.updateNewScore(56, 3, 4, "India");
			Thread.sleep(7000);
			subject.updateNewScore(56, 3, 5, "India");
			Thread.sleep(2000);
			subject.updateNewScore(67, 3, 6, "India");
			Thread.sleep(8000);
			subject.updateNewScore(87, 3, 7, "India");
			Thread.sleep(2000);
			subject.updateNewScore(92, 4,8, "India");
			Thread.sleep(10000);
			subject.updateNewScore(100, 5, 9, "India");
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
