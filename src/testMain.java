
public class testMain {

	public static void main(String[] args) {
		
		ObservableImpl observable = new ObservableImpl();
		
		Observer ob1 = new ObserverImpl1();
		Observer ob2 = new ObserverImpl2();
		Observer ob3 = new ObserverImpl1();
		
		observable.subscribe(ob1);
		observable.subscribe(ob2);
		observable.subscribe(ob3);
		
		observable.setState(55);
		observable.setState(30);
		observable.unsubscribe(ob1);
		/*observable.subscribe(new Observer() {
			
			@Override
			public void update(Observable observable) {
				// TODO Auto-generated method stub
				System.out.println("Observateur anonyme");
				
			}
		});*/
		
		observable.subscribe(new Observer() {
			
			@Override
			public void update(int state) {
				// TODO Auto-generated method stub
				System.out.println("Observateur anonyme");
				
			}
		});
		
		//observable.subscribe(observable1 -> System.out.println("* Observateur anonyme"));
		
		
		observable.setState(33);

		
	}

}
