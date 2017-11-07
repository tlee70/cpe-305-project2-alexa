package alexa;

/**
 * Implementation of CommandPattern design 
 * Decoupling of commands from the client (Alexa) and various devices
 * 
 * @author Tim
 *
 */

public interface Command {
	public void execute();
}
