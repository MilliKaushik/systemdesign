package adapter.imageFilterExample;

import adapter.imageFilterExample.avafilters.CaramelFilter;

public class AdapterImageFilterMain {

	public static void main(String[] args) {
		ImageView imageView = new ImageView(new Image());
		imageView.apply(new VividFilter());
		
		
		imageView.apply(new CaramelFilterAdapter(new CaramelFilter()));
	}

}
