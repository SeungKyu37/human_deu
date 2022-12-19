package pr1;




import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController {
	@FXML private Button btnRegister;
	
	public void initialize(URL location, ResourceBundle resources) {
		btnRegister.setOnAction(event->{
			try {
				handleBtnRegisterAction(event);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	private Stage primaryStage;	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}	
	
	
	public void handleBtnRegisterAction(ActionEvent e) throws Exception {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("회원가입");
		
		Parent parent = FXMLLoader.load(getClass().getResource("register_dialog.fxml"));
		Button btnBack = (Button) parent.lookup("#btnBack");
		btnBack.setOnAction(event->dialog.close());
		
		Button btnReg = (Button) parent.lookup("#btnReg");
		btnReg.setOnAction(event->dialog.close());
		
		
		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}
	
	
}
