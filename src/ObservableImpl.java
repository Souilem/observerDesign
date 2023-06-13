import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
	

	private int state=10;
	private List<Observer> observers = new ArrayList<>();
	
	@Override
	public void subscribe(Observer o) {		
		this.observers.add(o);
	}

	@Override
	public void unsubscribe(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notiyObservers() {
		for(Observer o:observers) {
			//o.update(this);
			o.update(this.state);
		}
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notiyObservers();// notification des que letat change
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	

}
