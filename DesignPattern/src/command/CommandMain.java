package command;

import command.guiExample.AddCustomerCommand;
import command.guiExample.BlackAndWhiteCommand;
import command.guiExample.CompositeCommand;
import command.guiExample.CustomerService;
import command.guiExample.ResizeCommand;
import command.guiExample.fx.Button;

public class CommandMain {
	
	
	public static void main(String[] args) {

		CustomerService customerService= new CustomerService();
		AddCustomerCommand command = new AddCustomerCommand(customerService);
		
		Button button = new Button(command);
		button.click();

		
		CompositeCommand compositeCommands = new CompositeCommand();
		compositeCommands.add(new ResizeCommand());
		compositeCommands.add(new BlackAndWhiteCommand());
		
		compositeCommands.execute();
		
	}
}
