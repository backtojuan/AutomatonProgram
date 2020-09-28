//-----------------------------------------------------------------------------------------------------------
package model;
import java.util.HashMap;
//-----------------------------------------------------------------------------------------------------------
import java.util.LinkedList;
import java.util.List;
//-----------------------------------------------------------------------------------------------------------
/**
 * This class manages the necessary attributes, constants and methods to create finite automatons (Mealy and moore ones)
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
	private State initialState;
	private String type;
	public final static String MEALY = "Mealy";
	public final static String MOORE = "Moore";
//-----------------------------------------------------------------------------------------------------------
	/**
	 * Secondary attributes and constants for this class.
	 * This attributes are related mostly to the data structured use to represent a finite automaton, a vertex.
	 */
	private boolean isConnected;
	private int numberOfStates;
	private int numberOfTransitions;
	private HashMap<String, State> map;
	
//-----------------------------------------------------------------------------------------------------------
	/**
	 * <b>Automaton constructor</b>
	 * @param alphabet contains the valid symbols used to create strings that can be accepted for this automaton.
	 * @param accepStates contains the specific states that lead the automaton to accept the input string.
	 */
	public Automaton(String[] alphabet, String type) {
		this.alphabet = alphabet;
		this.type = type;
		states = new LinkedList<State>();
		transitions = new LinkedList<Transition>();
		map = new HashMap<String, State>();
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the alphabet set of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the alphabet. <br>
	 * @return the alphabet of this automaton.
	 */
	public String[] getAlphabet(){
		return alphabet;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the type of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the type. <br>
	 * @return the type of this automaton.
	 */
	public String getType() {
		return type;
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
		return initialState;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns a boolean value to know if the automaton is connected or not
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the boolean value. <br>
	 * @return the boolean value
	 */
	public boolean getIsConnected() {
		return isConnected;
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
	 * This method returns the map of this graph(automaton).
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the map. <br>
	 * @return the map for this graph(automaton)
	 */
	public HashMap<String, State> getMap(){
		return map;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method sets the is connected boolean value of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the boolean value. <br>
	 * @param newIsConnected the boolean value.
	 */
	public void setIsConnected(Boolean newIsConnected) {
		this.isConnected = newIsConnected;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method sets the number of states of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the number of states is indeed, set properly. <br>
	 * @param newNumberOfStates the number of states for this automaton.
	 */
	public void setNumberOfStates(int newNumberOfStates) {
		this.numberOfStates = newNumberOfStates;
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
	 * This method sets the number of transitions of an automaton.
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the number of transtitions is indeed, set properly. <br>
	 * @param newNumberOfTransitions the number of transitions for this automaton.
	 */
	public void setNumberOfTransitions(int newNumberOfTransitions) {
		this.numberOfTransitions = newNumberOfTransitions;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method sets the initial state of an automaton
	 * <b>Pre:</b> the automaton exists. <br>
	 * <b>Pos:</b> the state is indeed, set properly. <br>
	 * @param initialState the initial state for this automaton
	 */
	public void setInitialState(State initialState) {
		this.initialState = initialState;
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
		map.put(state.getName(), state);
		states.add(state);
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
	public void addTransition(Transition transition) {
		transitions.add(transition);
		transition.getDestination().setPred(transition.getSource());
		transition.getSource().getAdjList().add(transition);
		numberOfTransitions++;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method searchs a state into the states of an automaton 
	 * <b>Pre:</b> the automaton exists.
	 * <b>Pos:</b> if the state with this name exists, the correct state is returned.
	 * @param name the name of the state to be search
	 * @return the State associated with the given name
	 */
	public State searchState(String name) {
		State state = null;
		for(int i=0;i<states.size();i++) {
			if(states.get(i).getName().equals(name)) {
				state = states.get(i);
			}
		}
		return state;
	}
//-----------------------------------------------------------------------------------------------------------
	public void deleteState(State state, int pos) {
		states.remove(pos);		
		if(state.getPred() != null) {
			state.getPred().getAdjList().remove(state.getPred().findEdge(state));
		}
	}

//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method along with the dfsVisit verifies the states that are reachable from every state. 
	 * When finished if all vertex(states) have as color BLACK it can be deduced that the graph is connected.
	 */
	public void dfs() {
		for (State state : states) {
			state.setColor(State.WHITE);
			state.setPred(null);
		}
		int time = 0;
		for (State state : states) {
			if (state.getColor() == State.WHITE)
				time = dfsVisit(state, time);
		}
	}
	
	/**
	 * This auxiliar method allows the dfs main method to discover the ones that are reachable from the state received.
	 * @param state the initial state to start searching inside the graph
	 * @param time the necessary time or steps to find states from the origin state 
	 * @return the time the time value
	 */
	private int dfsVisit(State state, int time) {
		time++;
		state.setInitialStamp(time);
		state.setColor(State.GRAY);
		for (int i = 0; i < state.getAdjList().size(); i++) {
			State state2 = state.getAdjList().get(i).getDestination();
			if (state2.getColor() == State.WHITE) {
				state2.setPred(state);
				time = dfsVisit(state2, time);
			}
		}
		state.setColor(State.BLACK);
		time++;
		state.setFinalStamp(time);
		return time;
	}
//-----------------------------------------------------------------------------------------------------------
		@Override
		/**
		 * This method returns a string report of an automaton
		 */
		public String toString() {
			return "Type: " + type + "\n" + "Total States: " + numberOfStates + "\n" + "Total transitions: " 
					+ numberOfTransitions + "\n" ;
		}
}
//-----------------------------------------------------------------------------------------------------------