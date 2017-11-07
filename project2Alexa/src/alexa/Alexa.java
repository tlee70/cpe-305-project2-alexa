package alexa;

import java.util.List;
import java.util.ArrayList;

public class Alexa {
	private List<Command> commands;
	
	public Alexa() {
		commands = new ArrayList<Command>();
	}
	
	public void addCommand(int voice, Command command) {
		commands.set(voice, command);
	}
}
