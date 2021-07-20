package command.guiExample;

import java.util.ArrayList;
import java.util.List;

import command.guiExample.fx.Command;

public class CompositeCommand implements Command {
	List<Command> commands = new ArrayList<>();

	public void add(Command command) {
		commands.add(command);
	}

	@Override
	public void execute() {
		for (Command command : commands)
			command.execute();
	}

}
