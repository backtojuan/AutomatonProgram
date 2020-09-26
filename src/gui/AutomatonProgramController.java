package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class AutomatonProgramController {
    
	@FXML
    private BorderPane pane;
	
    @FXML
    private TextField numberOfStates;

    @FXML
    private void exitSystem(MouseEvent event) {
    	System.exit(0);
    }
    

    @FXML
    private void generateConnectedAutomaton(ActionEvent event) {

    }

    @FXML
    private void generateMinimumAutomaton(ActionEvent event) {

    }

    @FXML
    private void listStatesCreation(ActionEvent event) {
    	try {
    		int numberstates = Integer.parseInt(numberOfStates.getText());
    		GridPane gp = new GridPane();
    	}
    	catch (NumberFormatException nfe){
    		
    	}
    }

}