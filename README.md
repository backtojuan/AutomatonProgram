### Scope

__________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

This application allows you to create a finite automaton of different types (Mealy and Moore) and from them calculate its connected or minimum automaton.

_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

### Instructions

_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

1. Clone this repository into your eclipse work-space.

2. Import this repository into your eclipse IDE.

3. Run program from main

4. Once it is open, the GUI will be shown with the following elements:

   ![generalView(1)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/generalview(1).jpg)

   ![generalView(2)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/generalview(2).jpg)

   ![generalView(3)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/generalview(3).jpg)

   On screen you can see different tabs. The "Automaton" tab presents an interactive form where it is listed all necessary fields to create an automaton, add states and add transitions. The "Connected resume" tab presents the resultant connected automaton given the one it was created previously on the "Automaton" tab. The "Minimum resume" tab presents the resultant minimum automaton given the one it was created previously on the "Automaton" tab.

5. Let's start by creating an automaton:

   ![createAutomaton(1)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/createAutomaton(1).jpg)

   ![createAutomaton(2)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/createAutomaton(2).jpg)

   ![createAutomaton(3)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/createAutomaton(3).jpg)

   ![createAutomaton(4)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/createAutomaton(4).jpg)

   In the first section, you must need to select if your automaton is either a "Mealy" or "Moore" one. Then you need to specify the alphabet set for the automaton, on the alphabet field you need to enter each symbol of the alphabet separated with a comma. Then you need to specify how many states and how many transitions the automaton contains. If everything is right you can press the button "start" to start adding states.

6. To add states:

   ![addState(1)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/addState(1).jpg)

   ![addState(2)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/addState(2).jpg)

   ![addState(3)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/addState(3).jpg)

   In the second section, you must need to enter the name or identifier of the state and if the case that your automaton is a moore one you will have to enter the ouput symbol associated with that state. Once you have entered all your states you will not have the opportunity to enter more than the number that you specified In the automaton section.

7. To add transitions:

   ![addTransition(1)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/addTransition(1).jpg)

   ![addTransition(2)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/addTransition(2).jpg)

   In the third section, you must need to enter the input of the transition, and specify from which state the transition goes and to which one it ends after processing the input symbol. In the case that the automaton is a mealy one you will need to specify the output symbol associated with that transition. Once you have entered all your transitions you will not have the opportunity to enter more than the number that you specified In the automaton section.

8. To generate the connected automaton:

   To generate the connected automaton, you just need to press the button "Generate Connected Automaton" once done, on the connected tab you will see the resume of the automaton.

9. To generate the minimum automaton:

   To generate the minimum automaton, you just need to press the button "Generate Minimum Automaton" once done, on the connected tab you will see the resume of the automaton.

10. To start with a new automaton:

    ![addNewAutomaton(1)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/addNewAutomaton(1).jpg)

    ![addNewAutomaton(1)](https://github.com/backtojuan/AutomatonProgram/blob/master/overview/addNewAutomaton(2).jpg)

    Once you added you have created your automaton, added your states, added your transitions and obtained either the connected automaton or the minimum one you can choose if you want to add a new automaton, the "Add a new automaton" button will help you with this, resetting the form to repeat the process again starting with step 5.

    