//-----------------------------------------------------------------------------------------------------------
package model;
//-----------------------------------------------------------------------------------------------------------
/**
 * This class manage the necessary attributes, constansts and methods to create states for an existing finite automaton.
 * @author Juan Jos� Valencia Jaramillo
 * @version 1.0
 */
public class State {
//-----------------------------------------------------------------------------------------------------------
	/*
	 * Main attributes for this class.
	 * This attributes are related to the state of a finite automaton.
	 */
	private String name;
	private boolean isFinal;
	private boolean isAcceptance;
//-----------------------------------------------------------------------------------------------------------
	/**
	 * Secondary attributes and constants for this class.
	 * This attributes are related mostly to the data structured use to represent a finite automaton, a vertex.
	 */
	//Distance or Initial TimeSTamp for DFS.
	private double initialStamp;
	//Final TimeStamp for DFS.
	private int finalStamp;
	//Index for this vertex.
	private int index;
	//Color identifier for DFS.
	private int color;
	//Possible values for color attribute.
	public static final int WHITE = 0;
	public static final int GRAY = 1;
	public static final int BLACK = 2;
	
	//allows to identified which state is previous to the current one.
	private State pred;
//-----------------------------------------------------------------------------------------------------------
	/**
	 * <b>Class constructor</b>
	 * @param name name or identifier of the state.
	 * @param isFinal specifies is the current state is the final state of the automaton.
	 */
	public State(String name, boolean isFinal, boolean isAcceptance) {
		this.name = name;
		this.isFinal = isFinal;
		this.isAcceptance = isAcceptance;
		pred = null;
		color = WHITE;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the name of a state.
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the name. <br>
	 * @return the name of this state.
	 */
	public String getName() {
		return name;
	}
//-----------------------------------------------------------------------------------------------------------	
	/**
	 * This method returns a boolean value that indicates if either a state is final or not.
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the boolean value. <br>
	 * @return the boolean value for this state.
	 */
	public boolean getIsFinal() {
		return isFinal;
	}
//-----------------------------------------------------------------------------------------------------------	
	/**
	 * This method returns a boolean value that indicates if either a state is acceptance or not.
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the boolean value. <br>
	 * @return the boolean value for this state.
	 */
	public boolean getIsAcceptance() {
		return isAcceptance;
	}		
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the initial stamp value of a vertex(state). 
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the initial stamp. <br>
	 * @return initial stamp. 
	 */
	public double getInitialStamp() {
		return initialStamp;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the final stamp value of a vertex(state).
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the final stamp. <br>
	 * @return final stamp for this vertex.
	 */
	public double getFinalStamp() {
		return finalStamp;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the index value of a vertex(state).
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the index. <br>
	 * @return final stamp for this vertex
	 */
	public int getIndex() {
		return index;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the color value of a vertex(state).
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the color. <br>
	 * @return color of the vertex. 
	 */
	public int color() {
		return color;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method returns the previous vertex(previous state) of a current vertex(current state).
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the object obtained is indeed, the predecessor of this state. <br> 
	 * @return the previous vertex for this current vertex.
	 */
	public State getPred() {
		return pred;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method sets the initial stamp value changing it to a new one.
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the value is indeed, changed properly. <br>
	 * @param newInitialStamp the new value for the initial stamp.
	 */
	public void setInitialStamp(int newInitialStamp) {
		this.initialStamp = newInitialStamp;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method sets the final stamp value changing it to a new one.
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the value is indeed, changed properly. <br> 
	 * @param newFinalStamp the new value for the final stamp. 
	 */
	public void setFinalStamp(int newFinalStamp) {
		this.finalStamp = newFinalStamp;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method sets the index value changing it to a new one.
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the value is indeed, changed properly. <br>  
	 * @param newIndex the new value for the index.
	 */
	public void setIndex(int newIndex) {
		this.index = newIndex;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method sets the color value changing it to a new one.
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the value is indeed, changed properly. <br>
	 * @param color the new value for the color.
	 */
	public void setColor(int color) {
		this.color = color;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method sets the pred value changed it to a new one.
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the value is indeed, changed properly. <br>
	 * @param newPred the  new value for the predecessor.
	 */
	public void setPred(State newPred) {
		this.pred = newPred;
	}
//-----------------------------------------------------------------------------------------------------------
}