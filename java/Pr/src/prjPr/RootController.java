package prjPr;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RootController implements Initializable {
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	private Stage primaryStage;	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}	
	
	public void handleTeamAction(ActionEvent e) throws Exception {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("team.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.setTitle("팀 등록");
			stage.show();
		}catch(IOException e1) {
			e1.printStackTrace();;
		}
	}
	public void handlePlayerAction(ActionEvent e) throws Exception {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("player.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.setTitle("선수 등록");
			stage.show();
		}catch(IOException e1) {
			e1.printStackTrace();;
		}
	}
	public void handleMatchAction(ActionEvent e) throws Exception {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("match.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.setTitle("경기 등록");
			stage.show();
		}catch(IOException e1) {
			e1.printStackTrace();;
		}
	}
	public void handleRecordsAction(ActionEvent e) throws Exception {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("record.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.setTitle("선수 기록");
			stage.show();
		}catch(IOException e1) {
			e1.printStackTrace();;
		}
	}
	public void handleExitAction(ActionEvent event) {
		Platform.exit();
	}
}
	