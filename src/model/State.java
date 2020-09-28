//-----------------------------------------------------------------------------------------------------------
package model;

import java.util.ArrayList;
import java.util.List;

//-----------------------------------------------------------------------------------------------------------
/**
 * This class manage the necessary attributes, constansts and methods to create states for an existing finite automaton.
 * @author Juan José Valencia Jaramillo
 * @version 1.0
 */
public class State {
//-----------------------------------------------------------------------------------------------------------
	/*
	 * Main attributes for this class.
	 * This attributes are related to the state of a finite automaton.
	 */
	private String name;
	private String output;
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
	
	//list of all the edges(transitions) that are adjacent to this vertex(state)
	private List<Transition> adjList;
//-----------------------------------------------------------------------------------------------------------
	/**
	 * <b>Class constructor</b>
	 * @param name name or identifier of the state.
	 */
	public State(String name) {
		this.name = name;
		this.output = null;
		pred = null;
		color = WHITE;
		adjList = new ArrayList<Transition>();
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
	 * This method returns the associated output for this state of an automaton only if it's a moore one
	 * otherwise this value must be null
	 * <b>Pre:</b> the state exists. 
	 * <b>Pre:</b> the automaton is a moore one. <br>
	 * <b>Pos:</b> the attribute obtained is indeed, the output. <br>  
	 * @return output the output of this state.
	 */
	public String getOutput() {
		return output;
	}
//-----------------------------------------------------------------------------------------------------------	
	/**
	 * This method sets the output value changing it to a new one.
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the value is indeed, changed properly. <br>
	 * @param newOutput the new output for this state.
	 */
	public void setOutput(String newOutput) {
		this.output = newOutput;
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
	public int getColor() {
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
	 * This method returns the adjacency list of a vertex(state)
	 * <b>Pre:</b> the state exists. <br>
	 * <b>Pos:</b> the object obtained is indeed, the adjacency list of this state. <br>
	 * @return the adjacency list for this state.
	 */
	public List<Transition> getAdjList(){
		return adjList;
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
	 /**
	 * This method specifies if a state is adjacent to this one
	 * <b>Pre:</b> the state exists. <br>
	 * @param state the state to verify if its adjacent
	 * @return a boolean value that specifies if either this state is adjacent to the one of the parameter
	 */
	public boolean isAdjacent(State state) {
		for (int i = 0; i < adjList.size(); i++) {
			if(adjList.get(i).getDestination().equals(state)) {
				return true;
			}
		}
		return false;
	}
//-----------------------------------------------------------------------------------------------------------
	/**
	 * This method finds an edge inside the adjacency list.
	 * <b>Pre:</b> the state exists. <br>
	 * @param state the state that is connected to the edge that it needs to be found.
	 * @return the edge that connects this state with the one of the parameter.
	 */
	public Transition findEdge(State state) {
		for (int i = 0; i < adjList.size(); i++) {
			if(adjList.get(i).getDestination().equals(state)) {
				return adjList.get(i);
			}
		}
		return null;
	}
//-----------------------------------------------------------------------------------------------------------
	@Override
	/**
	 * This method returns a String report with information of the state
	 */
	public String toString() {
		String mssg;
		if(this.getOutput() == null) {
			mssg = "Name: " + name + "\n";
		}
		else {
			mssg = "Name: " + name + "\n" + "Output: " + output + "\n"; 
		}
		return mssg;
	}
//-----------------------------------------------------------------------------------------------------------
}