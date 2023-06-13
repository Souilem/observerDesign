
public interface Observable {
	
	public void subscribe(Observer o); // subscribe
	public void unsubscribe(Observer o); // remove
	public void notiyObservers(); //notify

}
