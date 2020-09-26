//-----------------------------------------------------------------------------------------------------------
package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//-----------------------------------------------------------------------------------------------------------
/**
 * This class manages the necessary attributes, constants and methods to create finite automatons
 * @author Juan José Valencia Jaramillo
 * @version 1.0
 *
 */
public class Automaton {

	/*
	 * Main attributes for this class.
	 * This attributes are related to the finite automaton itself.
	 */
	private String[] alphabet;
	private List<State> states;
	private List<Transition> transitions;
	private State q0;
	private List<State> acceptanceStates;
//-----------------------------------------------------------------------------------------------------------
	/**
	 * Secondary attributes and constants for this class.
	 * This attributes are related mostly to the data structured use to represent a finite automaton, a vertex.
	 */
	private int numberOfStates;
	private int numberOfTransitions;
//-----------------------------------------------------------------------------------------------------------
	/**
	 * <b>Automaton constructor</b>
	 * @param alphabet contains the valid symbols used to create strings that can be accepted for this automaton.
	 * @param accepStates contains the specific states that lead the automaton to accept the input string.
	 */
	public Automaton(State initialState, String[] alphabet) {
		this.alphabet = alphabet;
		states = new LinkedList<State>();
		transitions = new LinkedList<Transition>();
		this.q0 = initialState;
		acceptanceStates = new ArrayList<State>();
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the alphabet set of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the alphabet. <br>
	 * @return the alphata of this automaton
	 */
	public String[] getAlphabet(){
		return alphabet;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the states set of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the set of states. <br>
	 * @return the states sets of this automaton.
	 */
	public List<State> getStates() {
		return states;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the transitions set of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the set of transitions. <br>
	 * @return the transitions set of this automaton.
	 */
	public List<Transition> getTransitions(){
		return transitions;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the initial state of an automaton
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the initial state. <br>
	 * @return the initial state of this automaton.
	 */
	public State getInitialState() {
		return q0;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the acceptance states set of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the set of acceptance states. <br>
	 * @return the acceptance states set of this automaton.
	 */
	public List<State> getAcceptanceStates() {
		return acceptanceStates;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the total states of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the number of states. <br> 
	 * @return the number of states for this automaton.
	 */
	public int getNumberOfStates() {
		return numberOfStates;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the total transitions of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the set of acceptance states. <br>
	 * @return the number of transitions for this automaton.
	 */
	public int getNumberOfTransitions() {
		return numberOfTransitions;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method adds a new state to an automaton
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the state is added sucessfully to the set of states of an automaton. 
	 * <b>Pos:</b> the total number of states for the automaton is increased in one. <br>
	 * @param state the state that is going to be added to the set of states of an automaton.
	 */
	public void addState(State state) {
		state.setIndex(numberOfStates);
		states.add(state);
		if(state.getIsAcceptance()) {
			acceptanceStates.add(state);
		}
		numberOfStates++;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method adds a new transition to an automaton
	 * <b>Pre:</b> the source state exists.
	 * <b>Pre:</b> the destination state exists. <br>
	 * <b>Pos:</b> the transition from one state to another is added in the automaton. <br>
	 * @param input the input symbol to be process which allows the automaton to change from one state to another
	 * @param source the current state of the automaton before the input symbol is processed.
	 * @param destination the following state of the automaton after the input symbol is processed.
	 */
	public void addTransition(String input, State source, State destination) {
		Transition transition = new Transition(input, source, destination);
		transitions.add(transition);
		destination.setPred(source);
		numberOfTransitions++;
	}
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------	
}
//-----------------------------------------------------------------------------------------------------------
