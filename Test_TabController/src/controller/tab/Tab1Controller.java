package controller.tab;

import controller.MainController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Tab1Controller {
	private MainController maincon;
	
	@FXML private Label label1;
	@FXML private TextField txt1;
	@FXML private Button btn1save;
	@FXML private Button btn1send;

	@FXML private void btn1SaveClicked(ActionEvent event) {
		System.out.println("Save clicked");
		label1.setText(txt1.getText());
		System.out.println(label1.getText());
	}

	@FXML private void btn1SendClicked(ActionEvent event) {
		System.out.println("Send clicked");
		maincon.setTab2LabelText(txt1.getText());
	}

	public void init(MainController mainController) {
		this.maincon = mainController;
	}

	public Label getLabel1() {
		return this.label1;
	}
	
	
}
