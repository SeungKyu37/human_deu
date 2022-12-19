package prjPr;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class TeamController implements Initializable  {
	  @FXML
	  private TableView<Team> myTableView;
	  @FXML
	  public TableColumn<Team, String> nameColumn;
	  @FXML
	  private TableColumn<Team, String> regionColumn;
	  @FXML
	  private TextField teamName;
	  @FXML
	  private TextField regionName;
	  @FXML
	  private Button teamAdd2;
	  
	  ObservableList<Team> teamList = FXCollections.observableArrayList(
			  );
	  
	  @Override
	  public void initialize(URL location, ResourceBundle resources) {
		  nameColumn.setCellValueFactory(cellData -> cellData.getValue().teamNameProperty());
		  regionColumn.setCellValueFactory(cellData -> cellData.getValue().regionNameProperty());
	      myTableView.setItems(teamList);
	 
	      teamAdd2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	            @Override
	            public void handle(MouseEvent event) {
	                myTableView.getItems().add(new Team(new SimpleStringProperty(teamName.getText()), new SimpleStringProperty(regionName.getText())));
	            }
	        });
	  }
}
