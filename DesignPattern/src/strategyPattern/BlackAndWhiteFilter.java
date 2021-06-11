package strategyPattern;

public class BlackAndWhiteFilter implements Filter {

	@Override
	public void filter(String fileName) {
		System.out.println("Filtering using B&W");
	}
}
