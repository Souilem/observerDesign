
public class ObserverImpl1 implements Observer {
/*
	@Override
	public void update(int observable) {
		
		int state = ((ObservableImpl)observable).getState();
		System.out.println("************ ObserverImpl1 ***************");
		double res=	state * state + 9;
		System.out.println("nouvelle mise à jour state:" + state);
		System.out.println("Resulat de calcul res:" + res);
		System.out.println("***************************");
	}
	*/
	
	@Override
	public void update(int state) {
		
		//int state = ((ObservableImpl)observable).getState();
		System.out.println("************ ObserverImpl1 ***************");
		double res=	state * state + 9;
		System.out.println("nouvelle mise à jour state:" + state);
		System.out.println("Resulat de calcul res:" + res);
		System.out.println("***************************");
	}

}
