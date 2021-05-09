
public class Student {

	int id;

	String name;

	// @OneToMany
	Address address;

}

class Bird {
	IFly ifly;
	IDisplay idisplay;
}

interface IFly {

}

//concreteFlyA
//concreteFlyB
interface IDisplay {

}

//concreteDisplayA
//concreteDisplayB
class Duck extends Bird {
	// flyA
	// displayA
}

class Hen extends Bird {
	// flyA
	// displayB
}

class Pigeon extends Bird {
	// flyB
	// displayA
}
