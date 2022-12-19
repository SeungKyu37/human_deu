package prjPr;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PlayerController implements Initializable {
	
	 @FXML
	 private ComboBox<String> teamBox;
	 private static StringProperty teamName;
	 private List<String> teamList = new ArrayList<String>();
	
	 public PlayerController() {
	 }
	 
	 public PlayerController(StringProperty teamName) {
		 PlayerController.teamName = teamName;
	 }
	
	 @Override
		public void initialize(URL location, ResourceBundle resource) {
		 teamList.add(teamName.get());
		 for(int i=0; i<teamList.size(); i++) {
		 ObservableList fxComboNameList = FXCollections.observableArrayList(teamList.get(i));
		 teamBox.setItems(fxComboNameList);
		 }

	}
}
