
public class ObserverImpl2 implements Observer {
	
	private int cpt;

	@Override
	//public void update(Observable observable) {
		public void update(int state) {
		
	//	int state = ((ObservableImpl)observable).getState();
		if(state%2==0) ++cpt;
		System.out.println("************ ObserverImpl2 ***************");
		System.out.println("nouvelle mise à jour state:" + state);
		System.out.println("Resulat de calcul res:" + ((state%2)==0?"Pair":"Impair"));
		System.out.println("Compteur cpt:" + cpt);
		System.out.println("***************************");
	}

}
