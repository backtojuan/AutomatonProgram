//-----------------------------------------------------------------------------------------------------------
package model;
//-----------------------------------------------------------------------------------------------------------
/**
 * this class manage the necessary attributes, constants and methods to create transitions for an existing finite automaton.
 * @author Juan José Valencia Jaramillo
 * @version 1.0
 */
public class Transition {
	
	private String input;
	private State source;
	private State destination;
//-----------------------------------------------------------------------------------------------------------
	/**
	 * <b>Transition constructor</b>
	 * @param input the particular symbol that makes the automaton goes from a source state to a destination state.
	 * @param source the current state of the processing.
	 * @param destination the next state of the processing given the input.
	 */
	public Transition(String input, State source, State destination) {
		this.input = input;
		this.source = source;
		this.destination = destination;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the input symbol of a transition.
	 * <b>Pre:</b> the Transition exists.
	 * <b>Pos:</b> 
	 * @return the input symbol for this transition.
	 */
	public String getInput() {
		return input;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the current state of the automaton before an input symbol is processed.
	 * <b>Pre:</b> the Transition exists (it is defined/possible). <br>
	 * <b>Pos:</b> the processing of the input symbol takes the automaton from this state to another. <br>
	 * @return the current state or origin state for this transition.
	 */
	public State getSource() {
		return source;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the following state of the automaton after an input symbol is processed.
	 * <b>Pre:</b> the Transition exists. (it is defined/possible). <br>
	 * <b>Pos:</b> the processing of the input symbol takes the automaton from a state to this.
	 * @return the following state or source state for this transition.
	 */
	public State getDestination() {
		return destination;
	}
//-----------------------------------------------------------------------------------------------------------
	@Override
	/**
	 * This method returns a string report of this transition, including it's input symbol, source and destination
	 */
	public String toString() {
		return ""+ input + ", "+source+"-"+destination+"";
	}
//-----------------------------------------------------------------------------------------------------------
}