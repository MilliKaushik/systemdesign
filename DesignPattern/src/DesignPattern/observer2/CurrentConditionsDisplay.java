package DesignPattern.observer2;

public class CurrentConditionsDisplay implements Observer {

	private Observable observable;

	public CurrentConditionsDisplay(Observable observable) {
		observable.registerObserver(this);
		this.observable = observable;
	}

	@Override
	public void update() {
		//double temperature = 
		System.out.println();
	}
}
