//-----------------------------------------------------------------------------------------------------------
package model;
//-----------------------------------------------------------------------------------------------------------
/**
 * This class allows to create states for an existing finite automaton
 * @author Juan José Valencia Jaramillo
 * @version 1.0
 */
public class State {
//-----------------------------------------------------------------------------------------------------------
	/*
	 * Main attributes for this class.
	 * This attributes are related to the finite automaton itself
	 */
	private String name;
	private boolean isFinal;
//-----------------------------------------------------------------------------------------------------------
	/**
	 * Secondary attributes and constants for this class.
	 * This attributes are related mostly to the data structured use to represent a finite automaton, a graph.
	 */
	//Distance or Initial TimeSTamp for DFS
	private double i;
	//Final TimeStamp for DFS
	private int f;
	//Index for this vertex
	private int index;
	//Color identifier for DFS
	private int color;
	//Possible values for color attribute
	public static final int WHITE = 0;
	public static final int GRAY = 1;
	public static final int BLACK = 2;
	
	//allows to identified which state is previous to the current one
	private State pred;
//-----------------------------------------------------------------------------------------------------------
	/**
	 * Class constructor
	 * @param name name or identifier of the state
	 * @param isFinal specifies is the current state is the final state of the automaton
	 */
	public State(String name, boolean isFinal) {
		this.name = name;
		this.isFinal = isFinal;
		pred = null;
		color = WHITE;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the name of the state
	 * <b>Pre:</b> the state exists
	 * <b>Pos:</b> the attribute obtained is indeed, the name
	 * @return the name of the state
	 */
	public String getName() {
		return name;
	}
//-----------------------------------------------------------------------------------------------------------	
	/**
	 * This method returns a boolean value that indicates if either the state is final or not
	 * <b>Pre:</b> the state exists
	 * <b>Pos:</b> the attribute obtained is indeed, the boolean value
	 * @return the boolean value
	 */
	public boolean getIsFinal() {
		return isFinal;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the initial stamp value of a vertex(state)
	 * <b>Pre:</b> the state exists
	 * @return initial stamp
	 */
	public double getInitialStamp() {
		return i;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the final stamp value of a vertex(state)
	 * <b>Pre:</b> the state exists
	 * @return final stamp for this vertex
	 */
	public double getFinalStamp() {
		return f;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the index value of a vertex(state)
	 * <b>Pre:</b> the state exists
	 * @return final stamp for this vertex
	 */
	public int xgetIndex() {
		return index;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the color value of a vertex(state)
	 * <b>Pre:</b> the state exists
	 * @return color of the vertex
	 */
	public int color() {
		return color;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the previous vertex(previous state) of the current vertex(current state)
	 * <b>Pre:</b> the state exists
	 * @return the previous vertex for this vertex
	 */
	public State getPred() {
		return pred;
	}
//-----------------------------------------------------------------------------------------------------------
}
