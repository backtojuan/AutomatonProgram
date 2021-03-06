//__________________________________________________________________________________________________________________________________
package gui;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//__________________________________________________________________________________________________________________________________
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.*;
//__________________________________________________________________________________________________________________________________
/**
 * This class manage the necessary attributes and methods to manage and use the automaton program gui. 
 * @author Juan Jos� Valencia Jaramillo
 * @version 1.0
 */
public class AutomatonProgramController {
    
	@FXML
    private Button conectedButton;

    @FXML
    private Button minimumButton;

    @FXML
    private Button transitionButton;
    
    @FXML
    private Button stateButton;
    
    @FXML
    private Button startButton;
    
	@FXML
    private TextField symbolsOfAlphabet;

    @FXML
    private TextField numberOfStates;

    @FXML
    private TextField numberOfTransitions;

    @FXML
    private TextField inputSymbol;

    @FXML
    private TextField sourceStateName;

    @FXML
    private TextField destinationStateName;

    @FXML
    private TextField stateName;
    
    @FXML
    private TextField outputTransitionName;
    
    @FXML
    private TextField outputStateName;
    
    @FXML
    private ComboBox<String> automatonType;
    
    @FXML
    private Label listOfUnaccesibleStates;

    @FXML
    private Label listOfConnectedStates;

    @FXML
    private Label listOfOriginalStates;

    @FXML
    private Label listOfGroupedStates;

    @FXML
    private Label listOfMinimumStates;
    
    @FXML
    private Alert alert;
    
    private Automaton automaton;
    
    private int totalstates;
    private int totaltransitions;
    
//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method initializes the elements before the stage is load.
     */
    private void initialize() {
    	alert = new Alert(AlertType.NONE);
    	ObservableList<String> options = FXCollections.observableArrayList(Automaton.MEALY,Automaton.MOORE);
    	automatonType.setItems(options);
    	disableStates();
    	disableTransitions();
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method takes all controls related with automaton information and put them into disable mode for avoiding the user to
     * try to override the information already entered.
     */
    public void disableAutomaton() {
    	automatonType.setDisable(true);
    	symbolsOfAlphabet.setDisable(true);    	
    	numberOfStates.setDisable(true);    	
    	numberOfTransitions.setDisable(true);
    	startButton.setDisable(true);
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method takes all controls related with transition information and put them into disable mode for avoiding the user to 
     * enter information without specifying the information of the automaton first, or to avoid the user entering more transitions
     * that the automaton specifies. 
     */
    private void disableStates() {
    	stateName.setDisable(true);    	
    	outputStateName.setDisable(true);    	
    	stateButton.setDisable(true);
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method takes all controls related with transition information and put them into disable mode for avoiding the user to 
     * enter information without specifying the information of the automaton first, or to avoid the user entering more transitions
     * that the automaton specifies.
     */
    private void disableTransitions() {
    	inputSymbol.setDisable(true);    	
    	outputTransitionName.setDisable(true);
    	sourceStateName.setDisable(true);
    	destinationStateName.setDisable(true);
    	transitionButton.setDisable(true);
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method clears all controls related with automaton information.
     */
    private void clearAutomaton() {
    	automatonType.getSelectionModel().clearSelection();
    	symbolsOfAlphabet.clear();
    	numberOfStates.clear();
    	numberOfTransitions.clear();
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method clears all controls related with states information.
     */
    private void clearStates() {
    	stateName.clear();
    	stateName.clear();
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method clears all controls related with transitions information.
     */
    private void clearTransitions() {
    	inputSymbol.clear();
    	outputTransitionName.clear();
    	sourceStateName.clear();
    	destinationStateName.clear();
    }
//__________________________________________________________________________________________________________________________________
    private void enableAutomaton() {
    	automatonType.setDisable(false);
    	symbolsOfAlphabet.setDisable(false);    	
    	numberOfStates.setDisable(false);    	
    	numberOfTransitions.setDisable(false);
    	startButton.setDisable(false);
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method takes all controls related with state information and put them into enable mode so the user can start adding
     * states.
     */
    private void enableStates(String type) {
    	stateName.setDisable(false);
    	if(type.equals(Automaton.MOORE)) {
    		outputStateName.setDisable(false);
    	}
    	stateButton.setDisable(false);
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method takes all controls related with transition information and put them into enable mode so the user can start adding
     * states.
     */
    private void enableTransitions(String type) {
    	inputSymbol.setDisable(false);
    	if(type.equals(Automaton.MEALY)) {
    		outputTransitionName.setDisable(false);
    	}
    	sourceStateName.setDisable(false);
    	destinationStateName.setDisable(false);
    	transitionButton.setDisable(false);
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method clears all information already entered and restart the controls to enter clean information
     */
    @FXML
    private void clearForm(ActionEvent event) {
    	if(automaton != null && (automaton.getNumberOfStates() > 0) && (automaton.getNumberOfTransitions() > 0)) {
	    	clearAutomaton();
	    	clearStates();
	    	clearTransitions(); 
	    	enableAutomaton();
	      	stateName.setDisable(false);
	      	outputStateName.setDisable(false);	    	
	    	inputSymbol.setDisable(false);
	    	outputTransitionName.setDisable(false);
	    	sourceStateName.setDisable(false);
	    	destinationStateName.setDisable(false);
	    	conectedButton.setDisable(false);
	    	minimumButton.setDisable(false);
	    	listOfUnaccesibleStates.setText("---");
	    	listOfConnectedStates.setText("---");
	    	listOfOriginalStates.setText("---");
	    	listOfGroupedStates.setText("---");
	    	listOfMinimumStates.setText("---");	    	
    	}
    	else {
    		showWarning("Before you start adding a new automaton you must have"  + "\n" + 
    					"added one before with at least one state and one transition");
    	}
    }
//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method ends the session of the application.
     * @param event the event triggered by the user.
     */
    private void exitSystem(MouseEvent event) {
    	System.exit(0);
    }
//__________________________________________________________________________________________________________________________________    
    /**
     * This method shows a pop up window to notify whenever something in the program went wrong.
     * @param message the message that specifies the cause of the problem.
     */
    private void showError(String message) {
    	alert.setAlertType(AlertType.ERROR);
    	ImageView error = new ImageView("gui/imgs/Fatal Error.png");
    	error.setFitHeight(50);
    	error.setFitWidth(50);
    	alert.setGraphic(error);
    	alert.setContentText(message);
    	alert.show();
    }
//__________________________________________________________________________________________________________________________________  
    /**
     * This method shows a pop up window to notify whenever something may cause some problems in the normal execution of the program
     * @param message the message that specifies the cause of the notification
     */
    private void showWarning(String message) {
    	alert.setAlertType(AlertType.WARNING);
    	ImageView warning = new ImageView("gui/imgs/Something Went Wrong.png");
    	warning.setFitHeight(50);
    	warning.setFitWidth(50);
    	alert.setGraphic(warning);
    	alert.setContentText(message);
    	alert.show();
    }
//__________________________________________________________________________________________________________________________________
    /**
     * This method shows a pop up window to notify whenever something in the program was successfully completed.
     * @param message the message that confirms the execution of the task.
     */
    private void showCorrect(String message) {
    	alert.setAlertType(AlertType.CONFIRMATION);
    	ImageView correct = new ImageView("gui/imgs/Done.png");
    	correct.setFitHeight(50);
    	correct.setFitWidth(50);
    	alert.setGraphic(correct);
    	alert.setContentText(message);
    	alert.show();
    }
//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method adds a new state to an automaton.
     * @param event the event triggered by the user.
     */
    private void addState(ActionEvent event) {    	
    	if(stateName.getText() == "" || outputStateName.getText() == "") {
    		showWarning("You cannot add a state if you have not enter the requested information yet");
    	}
    	else {    		
    		State state = new State(stateName.getText());
        	if(automaton.getType().equals(Automaton.MOORE)) {
        		state.setOutput(outputStateName.getText());
        	}
        	if(automaton.getNumberOfStates()==0) {
        		automaton.addState(state);
        		automaton.setInitialState(state);
        		showCorrect("The state was added successfully" + "\n" + state.toString());    				
        	}
        	else {
        		automaton.addState(state);
        		showCorrect("The state was added successfully" + "\n" + state.toString());

        	}    		
        	if(totalstates-1 <= 0) {        		
        		disableStates();
        		enableTransitions(automaton.getType());
        	}
        	clearStates();
        	totalstates-=1;
    	}
    	
    }
//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method adds a new transition to an automaton.
     * @param event the event triggered by the user.
     */
    private void addTransition(ActionEvent event) { 
    	if(inputSymbol.getText() == " " || outputStateName.getText() == " " || sourceStateName.getText() == " "
    			|| destinationStateName.getText() == " ") {
    		showWarning("You cannot add a state if you have not enter the requested information yet");
    	}
    	else if (automaton.searchState(sourceStateName.getText()) == null || automaton.searchState(destinationStateName.getText()) == null) {
    		showWarning("either one or both of the states are not in this automaton." + "\n" + "Try again");
    	}
    	else {    			
    		Transition transition = new Transition(inputSymbol.getText(),automaton.searchState(sourceStateName.getText()),
    				automaton.searchState(destinationStateName.getText()));
    		if(automaton.getType().equals(Automaton.MEALY)) {
    			transition.setOutput(outputTransitionName.getText());
    		}
    		showCorrect("The transition was added successfully"+ "\n" + transition.toString());
    		System.out.println(transition.toString());
    		if(totaltransitions-1 <= 0){    		
    			disableTransitions();
    		}   
    		clearTransitions();
    		totaltransitions-=1;
    	}
    }
//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method evokes the model and fill the respective tab to show the result to the user.
     * @param event the event triggered by the user.
     */
    private void generateConnectedAutomaton(ActionEvent event) {
    	if(automaton != null && (automaton.getNumberOfStates() > 0) && (automaton.getNumberOfTransitions() > 0)) {
    		automaton.dfs();
    		boolean isConnected = true;
    		String report = "";
    		String report2 = "";
    		for(int i=0;i<automaton.getStates().size();i++) {
    			if(automaton.getStates().get(i).getColor() == State.GRAY) {
    				System.out.println(automaton.getStates().get(i).getName() + " is the problem");
    				isConnected = false;
    				report += automaton.getStates().get(i).getName() + " ";
    			}
    			else {
    				report2 += automaton.getStates().get(i).getName() + " ";
    			}
    		}
    		automaton.setIsConnected(isConnected);
    		listOfUnaccesibleStates.setText(report);
    		listOfConnectedStates.setText(report2);
    		showCorrect("The connected automaton has beeen generated" + "\n" + "Check the results on the resume tab");
    		conectedButton.setDisable(true);
    	}
    	else {
    		showWarning("Before generating this you must have added an"  + "\n" + 
					"automaton before with at least one state and one transition");
    	}
    }
//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method evokes the model and fill the respective tab to show the result to the user.
     * @param event the event triggered by the user.
     */
    private void generateMinimumAutomaton(ActionEvent event) {
    	if(automaton != null && (automaton.getNumberOfStates() > 0) && (automaton.getNumberOfTransitions() > 0)) {
    		String report = "";
    		for(int i=0;i<automaton.getStates().size();i++) {
    			report += automaton.getStates().get(i).getName() + " ";
    		}
    		listOfOriginalStates.setText(report);
    		showCorrect("The minimum automaton has beeen generated" + "\n" + "Check the results on the resume tab");
    		minimumButton.setDisable(true);
    	}
    	else {
    		showWarning("Before generating this you must have added an"  + "\n" + 
					"automaton before with at least one state and one transition");
    	}
    }
//__________________________________________________________________________________________________________________________________
    @FXML
    /**
     * This method allows add states and transitions once the user has enter information of interest for the automaton.
     * @param event the event triggered by the user.
     */
    private void startCreation(ActionEvent event) {
    	try {
    		if(automatonType.getValue()==null || symbolsOfAlphabet.getText() == " " || 
    				numberOfStates.getText() == " " || numberOfTransitions.getText() == " ") {
    			showWarning("You cannot add an automaton if you have" + "\n" + "not enter the requested information yet");
    		}
    		else {
    			String type = automatonType.getValue();
        	   	String line = symbolsOfAlphabet.getText();
            	String[] alphabet = line.split(",");
            	automaton = new Automaton(alphabet,type);
            	this.totalstates = Integer.parseInt(numberOfStates.getText());
            	this.totaltransitions = Integer.parseInt(numberOfTransitions.getText());
            	automaton.setNumberOfStates(this.totalstates);        	
            	automaton.setNumberOfTransitions(this.totaltransitions);
            	disableAutomaton();
            	enableStates(type);
            	showCorrect("The automaton was created successfully" + "\n" + automaton.toString());
    		}
    	}
    	catch(NumberFormatException nfe) {
    		showError("Please, enter integer values for the required number fields");
    	}
    }
//__________________________________________________________________________________________________________________________________
}