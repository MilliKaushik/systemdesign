package command.guiExample.fx;

public class Button {

	private String label;

	private Command command;

	public Button(Command command) {
		this.command = command;
	}

	public void click() {
		command.execute();
		// the code that should be executed here will be dependent on where we use this
		// button.
		// For example, on one dialog box when the user clicks on the button, perhaps we
		// want to save something to the db. In some place else, when the user clicks on
		// the button, perhaps we want to delete a record.
		// So at the time of designing this framework, at the time of implementing this
		// Button class, we dont know what code should be exceuted when we click this
		// button
		// The command pattern aims to solve this problem
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
