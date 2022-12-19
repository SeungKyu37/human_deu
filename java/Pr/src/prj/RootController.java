package prj;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController {
	@FXML private Button team;
	@FXML private Button player;
	@FXML private Button match;
	@FXML private Button records;
	@FXML private Button exit;

	public void initialize(URL location, ResourceBundle resources) {
		team.setOnAction(event->{
			try {
				teamAddAction(event);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		player.setOnAction(event->{
			try {
				playerAdd1(event);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		match.setOnAction(event->{
			try {
				matchAdd(event);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		records.setOnAction(event->{
			try {
				playerRecords(event);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
}
	private Stage primaryStage;	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}	
	private void teamAddAction(ActionEvent e) throws Exception{
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("팀 등록");
		
		Parent parent = FXMLLoader.load(getClass().getResource("Team.fxml"));
		Button exitTeam = (Button) parent.lookup("#exitTeam");
		exitTeam.setOnAction(event->dialog.close());
		
		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}
	
	private void playerRecords(ActionEvent event) {
	}
	
	private void matchAdd(ActionEvent event) {
	}
	
	private void playerAdd1(ActionEvent event) {
	}

}