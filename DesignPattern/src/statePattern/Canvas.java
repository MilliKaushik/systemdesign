package statePattern;

//Canvas class is going to work with the abstract/interface tool class. It doesn't care 
//about any specific tool but it will behave differently depending on specific too that we give it at runtime.
//This is called State pattern as the state pattern allows an object to behave differently when 
//its state changes.
//Open close principle - Classes should be open for extension and closed for modification
//We can add new functionality without changing existing code. 
public class Canvas {
	private Tool tool;

	public void mouseDown() {
		tool.mouseDown();
	}

	public void mouseUp() {
		tool.mouseUp();
	}

	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}
}
