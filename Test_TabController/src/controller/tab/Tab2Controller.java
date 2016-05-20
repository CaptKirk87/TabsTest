package controller.tab;

import controller.MainController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Tab2Controller {
	private MainController maincon;
	
	@FXML private Label label2;
	@FXML private TextField txt2;
	@FXML private Button btn2save;
	@FXML private Button btn2load;
	
	@FXML private void btn2SaveClicked(ActionEvent event){
		System.out.println("Save 2 clicked");
		label2.setText(txt2.getText());
		System.out.println(label2.getText());
	}
	
	@FXML private void btn2LoadClicked(ActionEvent event){
		System.out.println("Load clicked");
		label2.setText(maincon.getTextloadedfromTab1());
	}

	public void init(MainController mainController) {
		this.maincon = mainController;		
	}

	public Label getLabel2() {
		return this.label2;
	}
	
}
