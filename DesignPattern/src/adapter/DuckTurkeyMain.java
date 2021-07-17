package adapter;

public class DuckTurkeyMain {
	
	public static void main(String[] args) {
		Duck duck1 = new MountainDuck();
		duck1.fly();
		duck1.quack();
		
		Turkey turkey = new WildTurkey();
		Duck duck2 = new TurkeyAdapter(turkey);
		duck2.fly();
		duck2.quack();
	}

}
