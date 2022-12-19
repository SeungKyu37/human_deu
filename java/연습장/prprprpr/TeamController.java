package prprprpr;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import prjPr1.Team;

public class TeamController implements Initializable {
	 @FXML
	 private TableView<Team> teamTable;
	 @FXML
	 private TableColumn<Team, String> nameColumn;
	 @FXML
	 private TableColumn<Team, String> regionColumn;
	 @FXML
	 private TextField teamName;
	 @FXML
	 private TextField regionName;
	 @FXML
	 private Button teamAdd2;
	 @FXML
	 private Button teamDel;
	 
	 
	 
	 ObservableList<Team> observableList = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 nameColumn.setCellValueFactory(cellData -> cellData.getValue().teamName());
		 regionColumn.setCellValueFactory(cellData -> cellData.getValue().teamRegion());
		 teamTable.setItems(observableList);
	
	
		 teamAdd2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent event) {
        	 teamTable.getItems().add(new Team(new SimpleStringProperty(teamName.getText()), new SimpleStringProperty(regionColumn.getText())));
         }
     });
	}
}
