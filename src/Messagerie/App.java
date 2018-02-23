package Messagerie;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		// Méthode d'instance pour faire le lien avec mon fichier Vue.fxml
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Vue.fxml"));

		// Charge mon noeud root
		Parent root = loader.load();

		// On crée l'objet scene qui contient le groupe root
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);

		// On fait le lien avec fichier css sur mon objet scene
		scene.getStylesheets().add(getClass().getResource("appli.css").toExternalForm());

		primaryStage.show();

	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
