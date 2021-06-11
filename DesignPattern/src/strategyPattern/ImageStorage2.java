package strategyPattern;

//Now we can simply pass the objects - compressor and filter objects - when storing an image. 
//This gives us the flexibility to apply diff compression algo and filter to the same image. 
public class ImageStorage2 {

	public void store(String fileName, Compressor compressor, Filter filter) {
		compressor.compress(fileName);
		filter.filter(fileName);
	}
}
