package controller;

import controller.tab.Tab1Controller;
import controller.tab.Tab2Controller;
import javafx.fxml.FXML;

public class MainController {

	@FXML Tab1Controller tab1Controller;
	@FXML Tab2Controller tab2Controller;
	
	@FXML public void initialize(){
		System.out.println("Program initilized");
		tab1Controller.init(this);
		tab2Controller.init(this);
	}
	
	public String getTextloadedfromTab1() { 
		return tab1Controller.getLabel1().getText();
	}

	public void setTab2LabelText(String text) {
		tab2Controller.getLabel2().setText(text);
	}
}
