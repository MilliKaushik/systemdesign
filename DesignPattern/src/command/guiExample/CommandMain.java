package command.guiExample;

import command.guiExample.fx.Button;

public class CommandMain {
	
	
	public static void main(String[] args) {

		CustomerService customerService= new CustomerService();
		AddCustomerCommand command = new AddCustomerCommand(customerService);
		
		Button button = new Button(command);
		button.click();

		
	}
}
