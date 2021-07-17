package strategy;

//used polymorphism
//similar to state pattern but different because in state pattern, we only have one state
//(currentTool) and the functions depends on that state. In strategy pattern, multiple state 
//like compressor, filter etc. 
//Open closed principle is followed as we can create more compressor classes and more filters 
//without impacting this class 
public class ImageStorage1 {
	private Compressor compressor;
	private Filter filter;

	public ImageStorage1(Compressor compressor, Filter filter) {
		this.compressor = compressor;
		this.filter = filter;
	}

	public void store(String fileName) {
		compressor.compress(fileName);
		filter.filter(fileName);
	}
}
