package adapter.imageFilterExample;

import adapter.imageFilterExample.avafilters.CaramelFilter;

public class CaramelFilterAdapter implements Filter {

	private CaramelFilter caramelFilter;

	public CaramelFilterAdapter(CaramelFilter caramelFilter) {
		this.caramelFilter = caramelFilter;
	}

	@Override
	public void apply(Image image) {
		caramelFilter.init();
		caramelFilter.render(image);
	}

}
