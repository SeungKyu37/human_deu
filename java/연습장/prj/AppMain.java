package prj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("야구 기록 관리 프로그램");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		Parent root = loader.load();
		RootController controller = loader.getController();
		controller.setPrimaryStage(primaryStage);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
